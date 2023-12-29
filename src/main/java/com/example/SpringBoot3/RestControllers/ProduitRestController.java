package com.example.SpringBoot3.RestControllers;

import com.example.SpringBoot3.dto.ProduitDTO;
import com.example.SpringBoot3.entities.Produit;
import com.example.SpringBoot3.services.ProduitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin
public class ProduitRestController {
    @Autowired
    ProduitService produitService;
    @RequestMapping(method=RequestMethod.GET)
    public List<ProduitDTO> getAllProduits(){
        return produitService.getAllProduits();
    }
    @RequestMapping(value="/{id}",method = RequestMethod.GET)
    public ProduitDTO getProduitById(@PathVariable("id") Long id) {
        return produitService.getProduit(id);
    }
    @RequestMapping(method = RequestMethod.POST)
    public ProduitDTO createProduit(@RequestBody ProduitDTO produit) {
        return produitService.saveProduit(produit);
    }
    @RequestMapping(method = RequestMethod.PUT)
    public ProduitDTO updateProduit(@RequestBody ProduitDTO produit) {
        return produitService.updateProduit(produit);
    }
    @RequestMapping(value="/{id}",method = RequestMethod.DELETE)
    public void deleteProduit(@PathVariable("id") Long id)
    {
        produitService.deleteProduitById(id);
    }
    @RequestMapping(value="/prodscat/{idCat}",method = RequestMethod.GET)
    public List<Produit> getProduitsByCatId(@PathVariable("idCat") Long idCat) {
        return produitService.findByCategorieIdCat(idCat);
    }
    @RequestMapping(value="/prodsByName/{nom}",method = RequestMethod.GET)
    public List<Produit> findByNomProduitContains(@PathVariable("nom") String nom) {
        return produitService.findByNomProduitContains(nom);
    }
}
