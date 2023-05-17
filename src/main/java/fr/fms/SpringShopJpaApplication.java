package fr.fms;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import fr.fms.dao.ArticleRepository;
import fr.fms.dao.CategoryRepository;
import fr.fms.entities.Article;
import fr.fms.entities.Category;

@SpringBootApplication
public class SpringShopJpaApplication implements CommandLineRunner {

	@Autowired
	private CategoryRepository categoryRepository;
	
	@Autowired
	private ArticleRepository articleRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(SpringShopJpaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
//		Category smartphone = categoryRepository.save(new Category("Smartphone"));
//		Category tablet = categoryRepository.save(new Category("Tablet"));
//		Category pc = categoryRepository.save(new Category("PC"));
		
//		articleRepository.save(new Article("I10", "Apple", 250, smartphone));
//		articleRepository.save(new Article("I11", "Apple", 250, smartphone));
//		articleRepository.save(new Article("I12", "Apple", 350, smartphone));
//		articleRepository.save(new Article("S9", "Samsung", 250, smartphone));
//		articleRepository.save(new Article("S10", "Samsung", 350, smartphone));
//		
//		articleRepository.save(new Article("GalaxyTab", "Samsung", 450, tablet));
//		articleRepository.save(new Article("Ipad", "Apple", 350, tablet));
//		
//		articleRepository.save(new Article("R510", "Asus", 500, pc));
//		
//		System.out.println("find by brand (Apple)");
//		System.out.println();
//		for(Article article : articleRepository.findByBrand("Apple")) {
//			System.out.println(article);
//		}
//		
//		System.out.println("find by brand (Samsung)");
//		System.out.println();
//		for(Article article : articleRepository.findByBrand("Samsung")) {
//			System.out.println(article);
//		}
//		System.out.println("findByBrandContains");
//		System.out.println();
//		for(Article article : articleRepository.findByBrandContains("ung")) {
//			System.out.println(article);
//		}
//		
//		
//		System.out.println("findByBrandAndPrice");
//		System.out.println();
//		for(Article article : articleRepository.findByBrandAndPrice("Samsung",250)) {
//			System.out.println(article);
//		}
//		System.out.println("searchArticles");
//		System.out.println();
//		for(Article article : articleRepository.searchArticles("p",349)) {
//			System.out.println(article);
//		}
//		System.out.println("findByBrandLikeAndPriceGreaterThan");
//		System.out.println();
//		for(Article article : articleRepository.findByBrandContainingAndPriceGreaterThan("p",349)) {
//			System.out.println(article);
//		}
//		System.out.println("findAllArticles");
//		System.out.println();
//		for(Article article : articleRepository.findAll()) {
//			System.out.println(article);
//		}
//		System.out.println("findByCategoryId");
//		System.out.println();
//		for(Article article : articleRepository.findByCategoryId((long)3)) {
//			System.out.println(article);
//		}
		System.out.println("findByCategory");
		System.out.println();
		for(Article article : articleRepository.findByCategory("pc")) {
			System.out.println(article);
		}
	}
}
