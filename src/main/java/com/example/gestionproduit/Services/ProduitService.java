package com.example.gestionproduit.Services;

import com.example.gestionproduit.DAO.Entities.Produit;
import com.example.gestionproduit.DAO.Repositories.ProduitRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ProduitService implements  IServiceProduit{
    private ProduitRepository produitRepository;
    @Override
    public Produit addProduit(Produit produit) {
        return produitRepository.save(produit);
    }

    @Override
    public Produit updateProduit(Produit produit) {
        return produitRepository.save(produit);
    }

    @Override
    public List<Produit> getAllProduits() {
        return produitRepository.findAll();
    }

    @Override
    public void deleteProduit(String id) {
        produitRepository.deleteById(id);
    }


}
