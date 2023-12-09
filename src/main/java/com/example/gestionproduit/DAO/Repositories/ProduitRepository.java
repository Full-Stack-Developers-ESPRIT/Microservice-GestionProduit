package com.example.gestionproduit.DAO.Repositories;

import com.example.gestionproduit.DAO.Entities.Produit;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;
import java.util.Optional;

public interface ProduitRepository extends MongoRepository<Produit, String> {
    List<Produit> findAll();

    Optional<Produit> findById(String id);

    void deleteById(String id);
}
