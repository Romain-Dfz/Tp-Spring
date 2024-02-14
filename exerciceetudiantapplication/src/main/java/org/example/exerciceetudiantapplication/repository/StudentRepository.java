package org.example.exerciceetudiantapplication.repository;

import org.example.exerciceetudiantapplication.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
    // Vous pouvez ajouter des méthodes supplémentaires spécifiques à votre application ici si nécessaire
}
