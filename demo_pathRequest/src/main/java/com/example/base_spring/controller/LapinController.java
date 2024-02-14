package com.example.base_spring.controller;

import com.example.base_spring.model.LapinService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class LapinController {

    // Injectez le service LapinService pour pouvoir manipuler les lapins
    @Autowired
    private LapinService lapinService;

    // Méthode pour afficher la page B avec la liste des lapins
    @GetMapping("/pageb")
    public String afficherPageB(Model model) {
        List<Lapin> lapins = lapinService.getAllLapins();
        model.addAttribute("rabbits", lapins);
        return "pageb";
    }

    // Méthode pour gérer l'ajout de lapin
    @PostMapping("/ajouterLapin")
    public String ajouterLapin(@RequestParam("nom") String nom,
                               @RequestParam("race") String race) {
        // Créez un nouvel objet Lapin avec les informations fournies
        Lapin nouveauLapin = new Lapin(nom, race);
        // Ajoutez le lapin à votre système via le service LapinService
        lapinService.ajouterLapin(nouveauLapin);
        // Redirigez vers la page B pour afficher la liste mise à jour des lapins
        return "redirect:/pageb";
    }
}
