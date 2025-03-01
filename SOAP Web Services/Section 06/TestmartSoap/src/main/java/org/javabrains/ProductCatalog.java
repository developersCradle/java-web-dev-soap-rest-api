package org.javabrains;

import java.util.ArrayList;
import java.util.List;

import org.javabrains.business.ProductServiceImpl;
import org.javabrains.model.Product;

import jakarta.jws.WebMethod;
import jakarta.jws.WebService;

@WebService(endpointInterface = "org.javabrains.ProductCatalogInterface" , portName = "TestMartCatalogPort", serviceName="TestMartCatalogService", targetNamespace = "http://www.testmart.com")
public class ProductCatalog implements ProductCatalogInterface {
	
	ProductServiceImpl productService = new ProductServiceImpl();
	
	@Override
	public List<String> getProductCategories() {
		System.out.println("Get Product Categories");
		return productService.getProductCategories(); 				
	}
	
	@Override
	public List<String> getProducts(String category)
	{
		System.out.println("Get Products");
		return productService.getProducts(category);
	}
	
	@Override
	public List<Product> getProducts2(String category)
	{
		System.out.println("Get Products 2");
		return productService.getProducts2(category);
	}
	
	@Override
	public List<String> addProduct(String category, String product) {
		System.out.println("Add Product");
		return productService.addProduct(category, product);
	}
		
}