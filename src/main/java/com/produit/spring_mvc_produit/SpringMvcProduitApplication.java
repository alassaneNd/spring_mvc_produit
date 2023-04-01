package com.produit.spring_mvc_produit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringMvcProduitApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(SpringMvcProduitApplication.class, args);
		ProduitRepository produitRepository = ctx.getBean(ProduitRepository.class);
		produitRepository.save(new Produit("LX 4352", 670, 90));
		produitRepository.save(new Produit("Ord HP 432", 2000000, 50));
		produitRepository.save(new Produit("Imp Epson", 67000, 90));
		produitRepository.save(new Produit("Ord Del 352", 250000, 90));
		produitRepository.save(new Produit("Imp HP 433", 670, 90));
		produitRepository.save(new Produit("Odr Max OS,", 600000, 90));

		produitRepository.findAll().forEach(p -> System.out.println(p.getDesignation()));
	}

}
