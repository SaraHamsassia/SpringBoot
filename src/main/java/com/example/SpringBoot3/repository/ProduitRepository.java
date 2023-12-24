package com.example.SpringBoot3.repository;

import com.example.SpringBoot3.entities.Produit;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProduitRepository extends JpaRepository<Produit, Long> {
}
