package org.example.blog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

@Controller
@RequestMapping("/upload")
public class UploadController {

    private String location = "src/main/resources/upload-dir"; // Chemin absolu

    @GetMapping("/form")
    public String showForm() {
        return "upload-form";
    }

    @PostMapping("/submitform")
    public String submitForm(@RequestParam("image") MultipartFile image, Model model) throws IOException {
        // Vérifiez si un fichier a été sélectionné
        if (!image.isEmpty()) {
            // Déplacez le fichier vers l'emplacement spécifié
            Path destinationFile = Paths.get(location).resolve(Paths.get(image.getOriginalFilename())).toAbsolutePath();
            InputStream stream = image.getInputStream();
            Files.copy(stream, destinationFile, StandardCopyOption.REPLACE_EXISTING);
            System.out.println(image.getOriginalFilename());

            // Ajoutez le chemin du fichier téléchargé au modèle pour l'afficher sur la page
            model.addAttribute("filePath", "upload-dir/" + image.getOriginalFilename());
        }
        return "redirect:/"; // Redirigez vers la page d'accueil après le traitement du fichier
    }
}
