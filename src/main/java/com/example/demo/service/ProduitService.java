package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Produit;
import com.example.demo.repository.ProduitReposity;

@Service
public class ProduitService {
	@Autowired
	protected ProduitReposity produitRepo;

	public List<Produit> listProd(){
		return produitRepo.findAll();
		
	}
	public Produit addProd(Produit p) {
		return produitRepo.saveAndFlush(p);
	}
	public Produit deleteProd(long id) {
		return null;
	}

}
