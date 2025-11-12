package com.example.makeup.entities;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Data
@Entity
public class MakeUp {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JsonProperty("code_produit")
    private Long codeProduit;
    private String designation;
    private String categorie;
    private double tarif;
    @JsonProperty("date_expiration")
    private Date dateExpiration;
    @ManyToOne
    private Marque marque;



    public long getCodeProduit() {
        return codeProduit;
    }

    public void setCodeProduit(long codeProduit) {
        this.codeProduit = codeProduit;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getCategorie() {
        return categorie;
    }

    public void setCategorie(String categorie) {
        this.categorie = categorie;
    }

    public double getTarif() {
        return tarif;
    }

    public void setTarif(double tarif) {
        this.tarif = tarif;
    }

    public Date getDateExpiration() {
        return dateExpiration;
    }

    public void setDateExpiration(Date dateExpiration) {
        this.dateExpiration = dateExpiration;
    }
    public Marque getMarque() {
        return marque;
    }

    public void setMarque(Marque marque) {
        this.marque = marque;
    }

    public MakeUp(String designation, String categorie, double tarif, Date dateExpiration) {
        this.designation = designation;
        this.categorie = categorie;
        this.tarif = tarif;
        this.dateExpiration = dateExpiration;
    }

    public MakeUp() {
        ;
    }

    @Override
    public String toString() {
        return "MakeUp{" +
                "codeProduit=" + codeProduit +
                ", designation='" + designation + '\'' +
                ", categorie='" + categorie + '\'' +
                ", tarif=" + tarif +
                ", dateExpiration=" + dateExpiration +
                '}';
    }
}
