# 02 Open API Specification.

Open API Specification.

# What I learned.

# 4. Notes about OAS 3 and the Swagger editor.

- This is the newer [editor](https://editor.swagger.io/).

# 5. Open API Specification Basics.

<img src="openAPI.PNG" alt="alt text" width="400"/>

<img src="oasFIle.PNG" alt="alt text" width="400"/>

- We are going to make **OAS** file, **O**pen API **S**pecification **F**ile.

<img src="exampelOfSwaggerFile.PNG" alt="alt text" width="400"/>

1. Before it came **OAS** specification this was called **Swagger**. This is also called **Swagger key**.
2. The attributes for documentation file.

<img src="weAreGoingToMakeSuchRequest.PNG" alt="alt text" width="400"/>

<img src="OASfileSecond.PNG" alt="alt text" width="600"/>

1. You define different paths into the file and under this one came all the other operations, such as **GET** **POST** ... etc. 
2. There is **path parameters** specified.

<img src="OASfileThird.PNG" alt="alt text" width="600"/>

1. Request for this address. 
2. Get having such OAS file. Usually **path** variables are required.

<img src="dataTypes.PNG" alt="alt text" width="600"/>

<img src="customHeader.PNG" alt="alt text" width="600"/>

1. **Headers** are part of OAS file and treated as parameters.
    - These are defined here if they are not **non**-standard.
2. `Access-level` is here as example. 

- Documentation is added using **description** key.

- Swagger Editor provided to make **OAS** file.

# Assignment 2: Open API Specification Basics

- Todo.

# 6. Schemas.

<img src="customHeader.PNG" alt="alt text" width="600"/>

- **Scehemas** define **Request** and **Response bodies**.

<img src="requestBody.PNG" alt="alt text" width="600"/>

<img src="whatIsSchema.PNG" alt="alt text" width="600"/>

1. For **OAS** schema is based of **JSON Schema**, this is defined [from](https://json-schema.org/)

2. This defines following structure.

<img src="ref.PNG" alt="alt text" width="600"/>

1. This is referring to the other place on the document.
    - Here you can see the definition and usage to the other file.

<img src="whatIsSchema.PNG" alt="alt text" width="600"/>

<img src="requestBodyDocument.PNG" alt="alt text" width="600"/>

1. You can see the `$ref` for **schema**. 

<img src="requestBodyForOAS.PNG" alt="alt text" width="600"/>

1. Example of using `$ref` for **Request Body**.

<img src="schemaDefiantion.PNG" alt="alt text" width="600"/>

<img src="examapleOfSchemaDefination.PNG" alt="alt text" width="600"/>

- You can also add other than **key-value** pairs.

<img src="NotJustKeyAndValues.PNG" alt="alt text" width="400"/>

1. You can add other objects. 

<img src="schemaWithRef.PNG" alt="alt text" width="500"/>

<img src="schemaArray.PNG" alt="alt text" width="500"/>

<img src="schemaArrayWIthRef.PNG" alt="alt text" width="500"/>

1. Furthermore, you can use **$ref** with the **schema array**.

<img src="required.PNG" alt="alt text" width="500"/>

<img src="requestBodyOAS.PNG" alt="alt text" width="500"/>

1. For **404** and **200** responses, the **schemas** are different.
    - **Success 200** message has array of response.

<img src="exampleOf200Response.PNG" 
alt="alt text" width="500"/>

1. Response for **success 200 message**.
2. You can see **array** of responses.

<img src="allOf.PNG" 
alt="alt text" width="500"/>

1. We can combine multiple object with `allOf`.
    - This can be used for **multiple properties** from **different schemas**.

<img src="headersAndExample.PNG" 
alt="alt text" width="500"/>

- These are not used so often.

1. You can also define **custom headers**.
    - You can include these and responses onto **OAS** file.

- Form data can be also defined.

<img src="formData.PNG" 
alt="alt text" width="500"/>

- With this one we define **form data** for **OAS**.


# Assignment 3: Schemas


