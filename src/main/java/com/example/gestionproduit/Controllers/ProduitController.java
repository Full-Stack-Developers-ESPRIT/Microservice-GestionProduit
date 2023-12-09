package com.example.gestionproduit.Controllers;

import com.example.gestionproduit.DAO.Entities.Produit;
import com.example.gestionproduit.Services.ProduitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("produits")
public class ProduitController {
    @Autowired
    private ProduitService produitService;

    @PostMapping("/addProduit")
    public Produit addProduit(@RequestBody Produit produit) {

        return produitService.addProduit(produit);
    }

    @PutMapping("/updateProduit")
    public Produit updateProduit(@RequestBody Produit produit) {
        return produitService.updateProduit(produit);
    }

    @GetMapping("/getAllProduits")
    public List<Produit> getAllProduits() {
        return produitService.getAllProduits();
    }


    @DeleteMapping("/deleteProduit/{id}")
    public void deleteProduit(@PathVariable String id) {
        produitService.deleteProduit(id);
    }


}
