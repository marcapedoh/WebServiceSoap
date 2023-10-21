package com.MarcRG.SoapWebService.repository;

import com.MarcRG.SoapWebService.model.Client;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ClientRepository extends JpaRepository<Client,Integer> {
    Optional<Client> findClientByNom(String nom);
}
