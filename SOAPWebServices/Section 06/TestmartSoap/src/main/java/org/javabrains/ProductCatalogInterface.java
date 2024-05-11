package org.javabrains;

import java.util.List;

import org.javabrains.model.Product;

import jakarta.jws.WebMethod;
import jakarta.jws.WebResult;
import jakarta.jws.WebService;


@WebService(name = "TestMartCatalog")
public interface ProductCatalogInterface {

	@WebMethod(action="fetch_categories", operationName = "fetchCatogories") //This is optional
	List<String> getProductCategories();
	@WebMethod
	List<String> getProducts(String category);
	@WebMethod
	@WebResult(name="Product")
	List<Product> getProducts2(String category);
	@WebMethod
	List<String> addProduct(String category, String product);

}