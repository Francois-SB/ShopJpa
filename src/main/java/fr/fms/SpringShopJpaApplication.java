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
//		categoryRepository.save(new Category("Smartphone"));
//		articleRepository.save(new Article("I10", "Apple", 250));
//		articleRepository.save(new Article("I11", "Apple", 250));
//		articleRepository.save(new Article("I12", "Apple", 350));
		
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
		System.out.println("searchArticles");
		System.out.println();
		for(Article article : articleRepository.searchArticles("p",349)) {
			System.out.println(article);
		}
		System.out.println("findByBrandLikeAndPriceGreaterThan");
		System.out.println();
		for(Article article : articleRepository.findByBrandContainingAndPriceGreaterThan("p",349)) {
			System.out.println(article);
		}
	}
}
