# SOAP Web Services 11 - Customizing the WSDL

- To start writing, we write basic **Java implementation** which helps us generate dummy skeleton for **WSDL**, after this one we can start adjusting **WSDL**.

- We are modifying different fields in **WSDL**.

- These can be given to different annotations like `@WebService` or `@WebMethod`

```
@WebService(name = "TestMartCatalog", portName = "TestMartCatalogPort", serviceName="TestMartCatalogService")
```

- **TargetNamespace** in XML is like **Namespace** in Java world.
    - You want to isolate all this time into package `targetNamespace = ""`

- One example modifying **WebMethod** `@WebMethod(operationName = "fetchCatogories")`.