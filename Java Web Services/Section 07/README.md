# Section 07: JAX-WS AND JAXB.

JAX-WS AND JAXB.

# What I learned.

# JAXB Introduction.

<p align="center">
        <img id="Java Web Services" src="jaxWs.PNG" height="400px">
</p>

> Yes, **Spring-WS** and **JAX-WS** are **different** approaches to building web services in Java, though both can deal with SOAP messages.

1. `JAX-WS` **J**ava **A**PI for **X**ML **W**eb **S**ervices.
    - Standard is for Web Service for Java XML.
        - **Oracle** has written **rules** and **standards** for web services.
2. **Specifications** are for the **Web Service Engines** to implement their **JAX-WS**.
3. As developers, we mark our **API**, with these **JAX-WS** annotations.

<p align="center">
        <img id="Java Web Services" src="coreAnnotationsFromJaxWs.PNG" height="400px">
</p>

1. Most fundamental annotation of **JAX-WS**.

<p align="center">
        <img id="Java Web Services" src="soapInTheWire.PNG" height="400px">
</p>

1. **Binding** controls **how**, the **SOAP message** goes into wire!
    - Default is `document\literal`, since it allows **validating** the **entire** SOAP message.

- Insert example here:

2. **Wrappers** control how the **Java** objects get converted into SOAP messages.

- Insert examples here:

# JAXB Introduction.

<p align="center">
        <img id="Java Web Services" src="jaxB.PNG" height="400px">
</p>

1. **JAXB** stands for **J**ava **A**rchitecture **X**ML **B**inding.
   - It proves the mapping, **XML** schema to **Java** classes.
2. **JAXB** is similar what **Hibernate** is for SQL.
   - Developer will interact with the **Hibernate** rather than the **SQL** itself.

> [!IMPORTANT]
> `JAXB` provides us with **three** main tools.

<p align="center">
        <img id="Java Web Services" src="jaxBmainTools.PNG" height="400px">
</p>

1. **XJC** stands for **X**ML to **J**ava **C**ompiler. 
   - Turns **XSD** to **Java** classes.

- **XML** = data. Example:

```
<Person>
    <Name>John</Name>
    <Age>30</Age>
</Person>
```

- **XSD** = schema (rules). Example:

```
<xs:element name="Person">
    <xs:complexType>
        <xs:sequence>
            <xs:element name="Name" type="xs:string"/>
            <xs:element name="Age" type="xs:int"/>
        </xs:sequence>
    </xs:complexType>
</xs:element>
```

2. **Schemagen** is for generating an XML Schema (XSD) from annotated Java.

3. **Runtime API** refers to the set of classes and interfaces you use at runtime to `marshal`, `unmarshal`, and `manipulate` XML/Java objects, as opposed to the tools like **xjc** or **schemagen** which are **compile-time** utilities.

<p align="center">
        <img id="Java Web Services" src="runtimeAPI.PNG" height="400px">
</p>
