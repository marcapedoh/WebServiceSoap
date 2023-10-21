package com.MarcRG.SoapWebService.services.ServiceImpl;

import com.MarcRG.SoapWebService.model.Plat;
import com.MarcRG.SoapWebService.repository.CondimentRepository;
import com.MarcRG.SoapWebService.repository.PlatRepository;
import com.MarcRG.SoapWebService.services.PlatServices;
import com.MarcRG.SoapWebService.validators.PlatValidator;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Slf4j
public class PlatServiceImpl implements PlatServices {
    private PlatRepository platRepository;
    @Autowired
    public PlatServiceImpl(PlatRepository platRepository) {
       this.platRepository=platRepository;
    }

    @Override
    public void addPlat(Plat plat) {
        List<String> errors= PlatValidator.validate(plat);
        if(!errors.isEmpty()){
            log.error(errors.toString());
        }
        if(plat.getCondimentList()==null){
            log.error("vous devez remplir les condiments néccessaire à faire le plat sinon ça ne marchera pas");
        }
        platRepository.save(plat);
    }

    @Override
    public Plat getPlatById(Integer id) {
        Optional<Plat> plat= platRepository.findById(id);
        return plat.get();
    }

    @Override
    public Plat getPlatByNom(String nom) {
        Optional<Plat> plat= platRepository.findPlatByNom(nom);
        return plat.get();
    }

    @Override
    public void updatePlat(Plat plat) {
        List<String> errors= PlatValidator.validate(plat);
        if(!errors.isEmpty()){
            log.error(errors.toString());
        }
        if(plat.getCondimentList()==null){
            log.error("vous devez remplir les condiments néccessaire à faire le plat sinon ça ne marchera pas");
        }
        platRepository.save(plat);
    }

    @Override
    public void deletePlatById(Integer id) {
        if(id==null){
            log.error("id est null");
        }
        platRepository.deleteById(id);
    }
}
