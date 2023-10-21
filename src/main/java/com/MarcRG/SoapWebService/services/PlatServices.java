package com.MarcRG.SoapWebService.services;

import com.MarcRG.SoapWebService.model.Plat;

public interface PlatServices {
    void addPlat(Plat plat);
    Plat getPlatById(Integer id);
    Plat getPlatByNom(String nom);
    void updatePlat(Plat plat);
    void deletePlatById(Integer id);
}
