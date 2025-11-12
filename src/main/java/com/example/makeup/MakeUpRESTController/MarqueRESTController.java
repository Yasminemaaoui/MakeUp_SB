package com.example.makeup.MakeUpRESTController;

import com.example.makeup.entities.Marque;
import com.example.makeup.repository.MarqueRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/Marque")

@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
public class MarqueRESTController {

    @Autowired
    MarqueRepository marqueRepository;

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<Map<String, Object>> getAllCategories() {
        List<Marque> marques = marqueRepository.findAll();

        // Créer la structure _embedded
        Map<String, Object> response = new HashMap<>();
        Map<String, Object> embedded = new HashMap<>();

        embedded.put("marques", marques);
        response.put("_embedded", embedded);

        return ResponseEntity.ok(response);
    }

    @RequestMapping(value="/{id}", method = RequestMethod.GET)
    public ResponseEntity<Marque> getCategorieById(@PathVariable("id") Long id) {
        return marqueRepository.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @RequestMapping(method = RequestMethod.POST)
    public Marque createMarque(@RequestBody Marque marque) {
        return marqueRepository.save(marque);
    }


}