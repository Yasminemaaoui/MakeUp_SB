package com.example.makeup.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
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
    private Long idMarque;
    private String nomMarque;
    private String paysOrigine;

    @OneToMany(mappedBy ="marque")
    @JsonIgnore
    private List<MakeUp> prodMakeUp;

}
