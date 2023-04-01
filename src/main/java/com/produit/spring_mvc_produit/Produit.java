package com.produit.spring_mvc_produit;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.Valid;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "produit")
public class Produit implements Serializable {

    @Id
    @GeneratedValue
    private Long id;
    @NotNull
    @Size(min = 4, max = 15)
    private String designation;
    @DecimalMin("100")
    private double prix;
    @NotNull
    private int quantite;

    public Produit() {
        super();
    }

    public Produit(String designation, double prix, int quantite) {

        super();
        this.designation = designation;
        this.prix = prix;
        this.quantite = quantite;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(Double prix) {
        this.prix = prix;
    }

    public int getQuantite() {
        return quantite;
    }

    public void setQuantite(int quantite) {
        this.quantite = quantite;
    }

}
