package com.example.demo.repository;



import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Produit;

public interface ProduitReposity extends JpaRepository<Produit, Long> {

}
