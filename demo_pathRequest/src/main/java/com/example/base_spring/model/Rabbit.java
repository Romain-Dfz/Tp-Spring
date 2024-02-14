package com.example.base_spring.model;


import lombok.Builder;
import lombok.Data;

import java.util.UUID;

@Data
@Builder
public class Rabbit {
    private UUID id;
    private String name;
    private String breed;

    public void Lapin(String nom, String race) {
        this.name = nom;
        this.breed = race;
    }

    public String getNom() {
        return name;
    }

    public void setNom(String nom) {
        this.name = nom;
    }

    public String getRace() {
        return breed;
    }

    public void setRace(String race) {
        this.breed = race;
    }
}
