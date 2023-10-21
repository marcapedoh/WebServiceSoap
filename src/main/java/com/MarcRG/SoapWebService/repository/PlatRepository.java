package com.MarcRG.SoapWebService.repository;

import com.MarcRG.SoapWebService.model.Plat;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface PlatRepository extends JpaRepository<Plat,Integer> {
    Optional<Plat> findPlatByNom(String nom);
}
