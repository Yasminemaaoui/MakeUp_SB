package com.example.makeup.entities;

import org.springframework.data.rest.core.config.Projection;

@Projection(name = "nomProd", types = {MakeUp.class })
public interface MakeUpProjection {
    public String getDesignation();
}
