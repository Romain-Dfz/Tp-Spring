package org.example.connexion;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CustomErrorController implements ErrorController, org.example.connexion.ErrorController {

    @GetMapping("/error")
    public String handleError() {
        // Gérer l'erreur ici, par exemple rediriger vers une page d'erreur personnalisée
        return "error";
    }

    @Override
    public String getErrorPath() {
        return "/error";
    }
}
