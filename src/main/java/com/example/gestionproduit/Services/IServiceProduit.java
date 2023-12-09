package com.example.gestionproduit.Services;

import com.example.gestionproduit.DAO.Entities.Produit;

import java.util.List;

public interface IServiceProduit {
    Produit addProduit(Produit produit);

    Produit updateProduit(Produit produit);

    List<Produit> getAllProduits();

    void deleteProduit(String id);

}
