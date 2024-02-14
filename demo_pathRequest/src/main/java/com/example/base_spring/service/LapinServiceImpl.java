package com.example.base_spring.service;

import com.example.base_spring.model.LapinService;

import java.util.ArrayList;
import java.util.List;

public class LapinServiceImpl implements LapinService {
    private List<Lapin> lapins = new ArrayList<>();

    @Override
    public void ajouterLapin(Lapin lapin) {
        lapins.add(lapin);
    }

    @Override
    public <Lapin> void ajouterLapin(Lapin lapin) {

    }

    @Override
    public void supprimerLapin(String nom) {
        lapins.removeIf(l -> l.getNom().equals(nom));
    }

    @Override
    public <Lapin> void mettreAJourLapin(String nom, Lapin lapin) {

    }

    @Override
    public void mettreAJourLapin(String nom, Lapin lapin) {
        for (int i = 0; i < lapins.size(); i++) {
            if (lapins.get(i).getNom().equals(nom)) {
                lapins.set(i, lapin);
                break;
            }
        }
    }

    @Override
    public List<Lapin> getAllLapins() {
        return lapins;
    }
}
