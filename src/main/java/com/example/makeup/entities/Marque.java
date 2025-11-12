package com.example.makeup.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;


import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Marque {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JsonProperty("id_marque")
    private Long idMarque;
    @JsonProperty("nom_marque")
    private String nomMarque;
    @JsonProperty("pays_origine")
    private String paysOrigine;

    @OneToMany(mappedBy ="marque")
    @JsonIgnore //évite les boucles infinies lors de la sérialisation JSON
    private List<MakeUp> prodMakeUp;

}
