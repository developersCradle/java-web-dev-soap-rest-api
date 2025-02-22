# SOAP Web Services 19 - Using Endpoint

- One good way to test **Web Service** in development environment, whiteout deploying server.

- We can deploy using Endpoint.

```
package org.javabrains;
import org.javabrains.ProductCatalog;

import jakarta.xml.ws.Endpoint;

public class TestMartPublisher {

	public static void main(String[] args) {
		//URL where Endpoint is published
		Endpoint.publish("http://localhost:1234/productcatalog", new ProductCatalog());
		
		
	}

}
```

- Then we can URL `http://localhost:1234/productcatalog`

- There is **standard** for writing **Web Services** → **JAX-WS**

- There is **standard** for publish **Web Services** → In this example **Metro**, **reference implementation**. You can publish your code. **GlassFish** bundled with the class. **Metro** comes with JDK, so we can just run it!
    - Single threaded, not for production! ❌