package com.MarcRG.SoapWebService.services.ServiceImpl;

import com.MarcRG.SoapWebService.model.Condiment;
import com.MarcRG.SoapWebService.repository.CondimentRepository;
import com.MarcRG.SoapWebService.services.CondimentServices;
import com.MarcRG.SoapWebService.validators.CondimentValidator;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Slf4j
public class CondimentServiceImpl implements CondimentServices {
    private CondimentRepository condimentRepository;
    @Autowired
    public CondimentServiceImpl(CondimentRepository condimentRepository) {
        this.condimentRepository=condimentRepository;
    }

    @Override
    public void addCondiment(Condiment condiment) {
        List<String> errors= CondimentValidator.validate(condiment);
        if(!errors.isEmpty()){
            log.error("voila erreur lors de l'envoi des données");
            log.error(errors.toString());
        }
        condimentRepository.save(condiment);
    }

    @Override
    public Condiment getCondimentById(Integer id) {
        Optional<Condiment> condiment= condimentRepository.findCondimentById(id);
        return condiment.get();
    }

    @Override
    public Condiment getCondimentByNom(String nom) {
        Optional<Condiment> condiment= condimentRepository.findCondimentByNomCondiment(nom);
        return condiment.get();
    }

    @Override
    public void updateCondiment(Condiment condiment) {
        List<String> errors= CondimentValidator.validate(condiment);
        if(!errors.isEmpty()){
            log.error("voila erreur lors de l'envoi des données");
            log.error(errors.toString());
        }
        condimentRepository.save(condiment);
    }

    @Override
    public void deleteCondimentById(Integer id) {
        if(id==null){
            log.error("vous devez fournir l'id du condiment");
        }
        condimentRepository.deleteById(id);
    }
}
