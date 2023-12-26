package com.example.SpringBoot3.services;

import com.example.SpringBoot3.dto.ProduitDTO;
import com.example.SpringBoot3.entities.Categorie;
import com.example.SpringBoot3.entities.Produit;
import com.example.SpringBoot3.repository.ProduitRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProduitServiceImpl implements ProduitService{
    @Autowired
    ProduitRepository produitRepository;
    @Override
    public ProduitDTO saveProduit(ProduitDTO p) {
        return convertEntityToDto(produitRepository.save(convertDtoToEntity(p)));
    }
    @Override
    public ProduitDTO getProduit(Long id) {
        return convertEntityToDto(produitRepository.findById(id).get());
    }
    @Override
    public List<ProduitDTO> getAllProduits() {
        //OU BIEN return produitRepository.findAll().stream().map(this::convertEntityToDto).collect(Collectors.toList());
        List<Produit> prods = produitRepository.findAll();
        List<ProduitDTO> listprodDto = new ArrayList<>(prods.size());
        for (Produit p : prods)
            listprodDto.add(convertEntityToDto(p));
        return listprodDto;
    }

    @Override
    public ProduitDTO updateProduit(ProduitDTO p) {
        return convertEntityToDto(produitRepository.save(convertDtoToEntity(p)));
    }

    @Override
    public void deleteProduit(Produit p) {
        produitRepository.delete(p);

    }

    @Override
    public void deleteProduitById(Long id) {
        produitRepository.deleteById(id);

    }
    @Override
    public List<Produit> findByNomProduit(String nom) {
        return produitRepository.findByNomProduit(nom);
    }

    @Override
    public List<Produit> findByNomProduitContains(String nom) {
        return produitRepository.findByNomProduitContains(nom);
    }

    @Override
    public List<Produit> findByNomPrix(String nom, Double prix) {
        return produitRepository.findByNomPrix(nom, prix);
    }

    @Override
    public List<Produit> findByCategorie(Categorie categorie) {
        return produitRepository.findByCategorie(categorie);
    }

    @Override
    public List<Produit> findByCategorieIdCat(Long id) {
        return produitRepository.findByCategorieIdCat(id);
    }

    @Override
    public List<Produit> findByOrderByNomProduitAsc() {
        return produitRepository.findByOrderByNomProduitAsc();
    }

    @Override
    public List<Produit> trierProduitsNomsPrix() {
        return produitRepository.trierProduitsNomsPrix();
    }
    @Override
    public ProduitDTO convertEntityToDto(Produit produit) {
        return ProduitDTO.builder()
                .idProduit(produit.getIdProduit())
                .nomProduit(produit.getNomProduit())
                //.prixProduit(produit.getPrixProduit())
                .dateCreation(produit.getDateCréation())
                //.categorie(produit.getCategorie())
                .nomCat(produit.getCategorie().getNomCat())
                .build();
    }
    @Override
    public Produit convertDtoToEntity(ProduitDTO produitDto) {
        Produit produit = new Produit();
        produit.setIdProduit(produitDto.getIdProduit());
        produit.setNomProduit(produitDto.getNomProduit());
        produit.setPrixProduit(produitDto.getPrixProduit());
        produit.setDateCréation(produitDto.getDateCreation());
        produit.setCategorie(produitDto.getCategorie());
        return produit;
    }
}
