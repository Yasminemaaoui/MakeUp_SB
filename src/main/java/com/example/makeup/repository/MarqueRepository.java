package com.example.makeup.repository;

import com.example.makeup.entities.Marque;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

@RepositoryRestResource(path = "Marque")
@CrossOrigin(origins = "http://localhost:4200/") //pour autoriser angular
public interface MarqueRepository extends JpaRepository<Marque,Long> {

}
