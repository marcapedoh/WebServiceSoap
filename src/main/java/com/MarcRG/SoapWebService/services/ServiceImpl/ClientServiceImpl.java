package com.MarcRG.SoapWebService.services.ServiceImpl;

import com.MarcRG.SoapWebService.model.Client;
import com.MarcRG.SoapWebService.repository.ClientRepository;
import com.MarcRG.SoapWebService.services.ClientServices;
import com.MarcRG.SoapWebService.validators.ClientValidator;
import com.MarcRG.SoapWebService.validators.PlatValidator;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Slf4j
public class ClientServiceImpl implements ClientServices {
    private ClientRepository clientRepository;
    @Autowired
    public ClientServiceImpl(ClientRepository clientRepository) {
        this.clientRepository=clientRepository;
    }

    @Override
    public void addClient(Client client) {
        List<String> errors= ClientValidator.validate(client);
        if(!errors.isEmpty()){
            log.error(errors.toString());
        }
        clientRepository.save(client);
    }

    @Override
    public Client getClientById(Integer id) {
        Optional<Client> client= clientRepository.findById(id);
        return client.get();
    }

    @Override
    public Client getClientByNom(String nom) {
        Optional<Client> client= clientRepository.findClientByNom(nom);
        return client.get();
    }

    @Override
    public void updateClient(Client client) {
        List<String> errors= ClientValidator.validate(client);
        if(!errors.isEmpty()){
            log.error(errors.toString());
        }
        if(client.getPlatList()==null){
            log.error("vous devez remplir les Plats commander sinon ça ne marchera pas");
        }
        clientRepository.save(client);
    }

    @Override
    public void deleteClientById(Integer id) {
        if(id==null){
            log.error("l'id est null");
        }
        clientRepository.deleteById(id);
    }
}
