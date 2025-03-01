package org.javabrains;
import org.javabrains.ProductCatalog;

import jakarta.xml.ws.Endpoint;

public class TestMartPublisher {

	public static void main(String[] args) {
		//URL where Endpoint is published
		Endpoint.publish("http://localhost:1234/productcatalog", new ProductCatalog());
		
		
	}

}
