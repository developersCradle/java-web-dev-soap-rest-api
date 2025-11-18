# Section 07: JAX-WS AND JAXB.

JAX-WS AND JAXB.

# What I learned.

# JAXB Introduction.

<p align="center">
        <img id="Java Web Development Under The Hood" src="jaxWs.PNG" height="300px">
</p>

> Yes, **Spring-WS** and **JAX-WS** are **different** approaches to building web services in Java, though both can deal with SOAP messages.

1. `JAX-WS` **J**ava **A**PI for **X**ML **W**eb **S**ervices.
    - Standard is for Web Service for Java XML.
        - **Oracle** has written **rules** and **standards** for web services.
2. **Specifications** are for the **Web Service Engines** to implement their **JAX-WS**.
3. As developers, we mark our **API**, with these **JAX-WS** annotations.

<p align="center">
        <img id="Java Web Development Under The Hood" src="coreAnnotationsFromJaxWs.PNG" height="400px">
</p>

1. Most fundamental annotation of **JAX-WS**.

<p align="center">
        <img id="Java Web Development Under The Hood" src="soapInTheWire.PNG" height="400px">
</p>

1. **Binding** controls **how**, the **SOAP message** goes into wire!
    - Default is `document\literal`, since it allows **validating** the **entire** SOAP message.

- Insert example here:

2. **Wrappers** control how the **Java** objects get converted into SOAP messages.

- Insert examples here:

# JAXB Introduction.

<p align="center">
        <img id="Java Web Development Under The Hood" src="jaxB.PNG" height="400px">
</p>