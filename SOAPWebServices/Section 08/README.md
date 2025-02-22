# SOAP Web Services 08 - Adding Input Arguments

- We want to transfer logic to other place. Different scenarios are taking place:
    - Web Services, so application can send SOAP message.
    - MVC layer, user can use application as website.

- **So**, one place to have Business logic.
    -  Some kind of **Service** should be made.

- Example of where logic is inside **Service**.

```
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
	
	@WebMethod //This is optional
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
```

- Every Web Service is initialized once.

