package com.example.base_spring.model;

import java.util.List;

public interface LapinService {
    <Lapin> void ajouterLapin(Lapin lapin);
    void supprimerLapin(String nom);
    <Lapin> void mettreAJourLapin(String nom, Lapin lapin);
    <Lapin> List<Lapin> getAllLapins();
}
