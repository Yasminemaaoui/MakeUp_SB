package com.example.makeup;

import com.example.makeup.entities.MakeUp;
import com.example.makeup.repository.MakeUpRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;

@SpringBootApplication
public class MakeUpApplication implements CommandLineRunner {

    @Autowired //injection de dépendance
    private RepositoryRestConfiguration repositoryRestConfiguration;
    @Override
    public void run(String... args) throws Exception {
        repositoryRestConfiguration.exposeIdsFor(MakeUp.class);
    }

    public static void main(String[] args) {
        SpringApplication.run(MakeUpApplication.class, args);
    }

}
