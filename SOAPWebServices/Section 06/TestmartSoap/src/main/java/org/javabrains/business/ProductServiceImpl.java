package org.javabrains.business;

import java.util.ArrayList;
import java.util.List;

import org.javabrains.model.Product;

public class ProductServiceImpl {

	
	List<String> bookiList = new ArrayList<>();
	List<String> musicList = new ArrayList<>();
	List<String> movieList = new ArrayList<>();
	
	
	
	public ProductServiceImpl() {
		this.bookiList.add("Some book");
		this.musicList.add("Some music");
		this.movieList.add("Some movie");
	}



	public static List<String> getProductCategories() {
		
		List<String> categories = new ArrayList<>();
		
		categories.add("Books");
		categories.add("Music");
		categories.add("Movies");
		categories.add("Cartoon");
		
		return categories;
	}
	
	public List<String> getProducts(String category) {
		
		switch (category.toLowerCase()) {
		case "books":
			return bookiList;
		case "music":
			return musicList;
		case "movies":
			return movieList;
		}
		
		return null;
		
	}

	public List<String> addProduct(String category, String product) {
		
		switch (category.toLowerCase()) {
		case "books":
			bookiList.add(product);
			return bookiList;
		case "music":
			musicList.add(product);
			return musicList;
		case "movies":
			movieList.add(product);
			return movieList;
		}
		
		return null;
		
	}

	public List<Product> getProducts2(String category) {
		List<Product> productList = new ArrayList<>();
		productList.add(new Product("Java Brains Book", 9999.99, "1234"));
		productList.add(new Product("Java Brains Book", 9999.99, "1234"));
		return productList;
	}


}
