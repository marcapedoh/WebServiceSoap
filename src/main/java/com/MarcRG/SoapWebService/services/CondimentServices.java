package com.MarcRG.SoapWebService.services;

import com.MarcRG.SoapWebService.model.Condiment;

public interface CondimentServices {
    void addCondiment(Condiment condiment);
    Condiment getCondimentById(Integer id);
    Condiment getCondimentByNom(String nom);
    void updateCondiment(Condiment condiment);
    void deleteCondimentById(Integer id);
}
