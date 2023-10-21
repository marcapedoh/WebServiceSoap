package com.MarcRG.SoapWebService.repository;

import com.MarcRG.SoapWebService.model.Condiment;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.swing.text.html.Option;
import java.util.Optional;

public interface CondimentRepository extends JpaRepository<Condiment,Integer> {
    Optional<Condiment> findCondimentById(Integer integer);
    Optional<Condiment> findCondimentByNomCondiment(String nom);
}
