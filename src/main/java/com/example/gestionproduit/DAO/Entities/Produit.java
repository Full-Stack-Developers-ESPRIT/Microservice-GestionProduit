package com.example.gestionproduit.DAO.Entities;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Produit")
public class Produit {

    private String id;
    private String Name;
    private  String description;
    private  String quantite;
    private Number prix;
    private String categorie;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getQuantite() {
        return quantite;
    }

    public void setQuantite(String quantite) {
        this.quantite = quantite;
    }

    public Number getPrix() {
        return prix;
    }

    public void setPrix(Number prix) {
        this.prix = prix;
    }

    public String getCategorie() {
        return categorie;
    }

    public void setCategorie(String categorie) {
        this.categorie = categorie;
    }

    public Produit(String id, String Name, String description, String quantite, Number prix, String categorie) {
        this.id = id;
        this.Name = Name;
        this.description = description;
        this.quantite = quantite;
        this.prix = prix;
        this.categorie = categorie;
    }

}
