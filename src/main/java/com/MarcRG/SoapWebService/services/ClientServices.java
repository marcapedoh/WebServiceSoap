package com.MarcRG.SoapWebService.services;

import com.MarcRG.SoapWebService.model.Client;

public interface ClientServices {
    void addClient(Client client);
    Client getClientById(Integer id);
    Client getClientByNom(String nom);
    void updateClient(Client client);
    void deleteClientById(Integer id);
}
