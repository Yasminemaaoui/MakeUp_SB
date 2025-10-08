package com.example.makeup.service;

import com.example.makeup.entities.MakeUp;
import com.example.makeup.entities.Marque;
import com.example.makeup.repository.MakeUpRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MakeUpServiceImpl implements MakeUpService{

    @Autowired
    MakeUpRepository makeUpRepository;

    @Override
    public MakeUp saveMakeUp(MakeUp m) {
        return makeUpRepository.save(m);
    }

    @Override
    public MakeUp updateMakeUp(MakeUp m) {
        return makeUpRepository.save(m);
    }

    @Override
    public void deleteMakeUp(MakeUp m) {
        makeUpRepository.delete(m);
    }

    @Override
    public void deleteMakeUpById(Long id) {
        makeUpRepository.deleteById(id);
    }

    @Override
    public MakeUp getMakeUp(Long id) {
        return makeUpRepository.findById(id).get();
    }

    @Override
    public List<MakeUp> getAllMakeUp() {
        return makeUpRepository.findAll();
    }




    @Override
    public List<MakeUp> testFindByDesignation(String nom) {
        return makeUpRepository.findByDesignation(nom);
    }

    @Override
    public List<MakeUp> findByDesignationContains(String nom) {
        return makeUpRepository.findByDesignationContains(nom);
    }

    @Override
    public List<MakeUp> findByTarif(String nom, Double prix) {
        return makeUpRepository.findByTarif(nom,prix);
    }

    @Override
    public List<MakeUp> findByMarque(Marque marque) {
        return makeUpRepository.findByMarque(marque);
    }

    @Override
    public List<MakeUp> findByMarqueIdMarque(Long id) {
        return makeUpRepository.findByMarqueIdMarque(id);
    }

    @Override
    public List<MakeUp> findByOrderByDesignationAsc() {
        return makeUpRepository.findByOrderByDesignationAsc();
    }

    @Override
    public List<MakeUp> trierMakeUpDesignationTarif() {
        return makeUpRepository.trierMakeUpDesignationTarif();
    }
}
