package com.example.SpringBoot3;

import com.example.SpringBoot3.entities.Categorie;
import com.example.SpringBoot3.entities.Produit;
import com.example.SpringBoot3.repository.ProduitRepository;
import jakarta.transaction.Transactional;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import java.util.List;

@SpringBootTest
class SpringBoot3ApplicationTests {
	@Autowired
	private ProduitRepository produitRepository;
	@Test
	public void testFindProduit()
	{
		Produit p = produitRepository.findById(2L).get();
		System.out.println(p);
	}
	@Test
	public void testUpdateProduit()
	{
		Produit p = produitRepository.findById(1L).get();
		p.setPrixProduit(1000.0);
		produitRepository.save(p);
	}
	@Test
	public void testDeleteProduit()
	{
		produitRepository.deleteById(1L);;

	}
	@Test
	public void testListerTousProduits()
	{
		List<Produit> prods = produitRepository.findAll();
		for (Produit p : prods)
		{
			System.out.println(p);
		}
	}
	@Test
	public void testFindByNomProduit()
	{
		List<Produit> prods = produitRepository.findByNomProduit("PC Dell3");
		for (Produit p : prods)
		{
			System.out.println(p);
		}
	}

	@Test
	public void testFindByNomProduitContains()
	{
		List<Produit> prods = produitRepository.findByNomProduitContains("P");
		for (Produit p : prods)
		{
			System.out.println(p);
		}
	}
	@Test
	public void testFindByNomPrix()
	{
		List<Produit> prods = produitRepository.findByNomPrix("X",34.0);
		for (Produit p : prods)
		{
			System.out.println(p);
		}
	}

	@Test
	public void testfindByCategorie()
	{
		Categorie cat = new Categorie();
		cat.setIdCat(1L);
		List<Produit>  prods = produitRepository.findByCategorie(cat);
		for (Produit p : prods)
		{
			System.out.println(p);
		}
	}

	@Test
	public void findByCategorieIdCat()
	{
		List<Produit>  prods = produitRepository.findByCategorieIdCat(1L);
		for (Produit p : prods)
		{
			System.out.println(p);
		}
	}

	@Test
	public void testfindByOrderByNomProduitAsc()
	{
		List<Produit>  prods =    produitRepository.findByOrderByNomProduitAsc();
		for (Produit p : prods)
		{
			System.out.println(p);
		}
	}

	@Test
	public void testTrierProduitsNomsPrix()
	{
		List<Produit>  prods = produitRepository.trierProduitsNomsPrix();
		for (Produit p : prods)
		{
			System.out.println(p);
		}
	}





}
