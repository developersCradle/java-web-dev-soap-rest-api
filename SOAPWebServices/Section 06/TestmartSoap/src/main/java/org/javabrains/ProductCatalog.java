package org.javabrains;

import java.util.ArrayList;
import java.util.List;

import jakarta.jws.WebMethod;
import jakarta.jws.WebService;

@WebService
public class ProductCatalog {
	
	ProductServiceImpl productService = new ProductServiceImpl();
	
	@WebMethod //This is optional
	public List<String> getProductCategories() {
		System.out.println("Get Product Categories");
		return productService.getProductCategories(); 				
	}
	
	@WebMethod(exclude = true) //This is optional
	public List<String> getProducts(String category)
	{
		System.out.println("Get Products");
		return productService.getProducts(category);
	}
	
	@WebMethod //This is optional
	public List<String> addProduct(String category, String product) {
		System.out.println("Add Product");
		return productService.addProduct(category, product);
	}
		
}