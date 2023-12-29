package com.example.SpringBoot3.repository;

import com.example.SpringBoot3.entities.Categorie;
import com.example.SpringBoot3.entities.Produit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;
@RepositoryRestResource(path = "cat")
@CrossOrigin("http://localhost:4200/") //pour autoriser le serveur angular
public interface CategorieRepository extends JpaRepository<Categorie, Long> {
}
