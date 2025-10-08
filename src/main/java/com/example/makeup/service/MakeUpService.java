package com.example.makeup.service;

import com.example.makeup.entities.MakeUp;
import com.example.makeup.entities.Marque;

import java.util.List;

public interface MakeUpService {
    MakeUp saveMakeUp(MakeUp m);
    MakeUp updateMakeUp(MakeUp m);
    void deleteMakeUp(MakeUp m);
    void deleteMakeUpById(Long id);
    MakeUp getMakeUp(Long id);
    List<MakeUp> getAllMakeUp();

    List<MakeUp> testFindByDesignation(String nom);
    List<MakeUp> findByDesignationContains(String nom);
    List<MakeUp> findByTarif (String nom, Double prix);
    List<MakeUp> findByMarque (Marque marque);
    List<MakeUp> findByMarqueIdMarque(Long id);
    List<MakeUp> findByOrderByDesignationAsc();
    List<MakeUp> trierMakeUpDesignationTarif();
}
