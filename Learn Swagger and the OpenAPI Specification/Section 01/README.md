# Section 1: Introduction.

# What I learned. 

# 1. Introduction.

<img src="Welcome.PNG" alt="alt text" width="400"/>

<img src="apiDefination.PNG" alt="alt text" width="400"/>

1. **Swagger** and **Open API** are definitions for describing **API**.

<img src="whatIsAPi.PNG" alt="alt text" width="500"/>

1. There are many types of **API:s**. We deal in course with **Web API:s**.
    - These are handled with **Swagger** and **OPEN API**.

<img src="WebApis.PNG" alt="alt text" width="500"/>

- Web API:s work with request and response.

<img src="restAPI.PNG" alt="alt text" width="500"/>

<img src="restReqRes.PNG" alt="alt text" width="500"/>

1. With **request** and **response**, the **STATE** is being transferred!
    - Hence, **representational state transfer**.

<img src="pre-requisitive.PNG" alt="alt text" width="500"/>

<img src="whyApiDefination.PNG" alt="alt text" width="500"/>

<img src="roleOfAPIdefinationFIle.PNG" alt="alt text" width="500"/>

<img src="whyApiDefination.PNG" alt="alt text" width="500"/>

1. You can **define API** before making it.
    - This can be share to the other team.
2. We can generate some dummy code before.

<img src="swaggerDefination.PNG" alt="alt text" width="500"/>

1. **Swagger** is nowadays collection of tools that use the API Specification.
2. Many people still use the old name **Swagger** for OAS. 

<img src="OpenAPIInitiative.PNG" alt="alt text" width="500">

1. OPEN API is vendor for neutral the development of the description API format
2. This is **tool natural**.

<img src="swaggerTools.PNG" alt="alt text" width="500">

1. One of interesting tool for **developers** is API code generator called **CodeGen** tool.

<img src="overview.PNG" alt="alt text" width="500"/>

# 2. API Definition.

<img src="whatIsTheAPIdefinationFIle.PNG" alt="alt text" width="500"/>

1. In **API Definition** file has also, authorization and authentication.

<img src="anatomyOfResponse.PNG" alt="alt text" width="500"/>

<img src="url.PNG" alt="alt text" width="500"/>

1. **Host** is the part the **domain part**. Example `api.example.com`.

2. **Base path** is the **URL** which is shared in specific **URL**. 

<img src="metohod.PNG" alt="alt text" width="500"/>

<img src="parameters.PNG" alt="alt text" width="500"/>

<img src="requestBody.PNG" alt="alt text" width="500"/>

1. For **POST** and **PUT**, you can put the schema on the body for describing body structure.

<img src="responseBody.PNG" alt="alt text" width="500"/>

1. **Even** response can also have the **schema** for the response body.

<img src="security.PNG" alt="alt text" width="500"/>

1. In API context, the Security means **authorization** and **authentication**. Some most popular are:
    - None.
    - Basic Auth.
    - API key. [API key in Spring](https://www.baeldung.com/spring-boot-api-key-secret).
        - [API key wiki](https://en.wikipedia.org/wiki/API_key).
    - OAuth.

<img src="documentation.PNG" alt="alt text" width="500"/>

1. We can add **description** for the **API Definition**. [Description with Swagger](https://www.baeldung.com/swagger-set-example-description).

<img src="ProvidingDocumentation.PNG" alt="alt text" width="500"/>

1. One of common scenario is the where get the API documentation.
    - Not just for the **Developers** and also for **documentation writers**.

# 3. YAML.

<img src="yamlSummary.PNG" alt="alt text" width="500"/>

<img src="openApiSpesifcation.PNG" alt="alt text" width="500"/>

- We can use **YAML** or the **JSON** for the structure data.

<img src="yaml.PNG" alt="alt text" width="500"/>

1. Before this was like **HTML**.
    - Later it changed to meaning to the markup language, later this is for **data**.
2. Minimizes character, it uses indentation.

<img src="keyValuePairs.PNG" alt="alt text" width="500"/>

- YAML is having **key:value** pairs.

<img src="levels.PNG" alt="alt text" width="500"/>

1. **Don't** use **tabs** in **YAML** for the indentation. Rather than use **spaces**.
2. You can see the indentation here.
3. The brackets are for the JSON.

<img src="types.PNG" alt="alt text" width="500"/>

1. The **context** is defining the types in **YAML**.

<img src="quates.PNG" alt="alt text" width="500"/>

<img src="list.PNG" alt="alt text" width="500"/>

1. Item called `cart`.
2. **Two** items in the list.

<img src="multiLineStrings.PNG" alt="alt text" width="500"/>

1. **Line breaks** will be preserved.
2. **Line breaks** will **not** be preserved.

<img src="comments.PNG" alt="alt text" width="500"/>

<img src="schem.PNG" alt="alt text" width="500"/>

1. **Schemas** are not part of **YAML**, but **OAS** uses references for **schemas**.
    - We can check [ref](https://swagger.io/docs/specification/v3_0/using-ref/).

<img src="schemaExample.PNG" alt="alt text" width="500"/>

1. You can **point** one point of the file with `$ref`.


# Assignment 1: YAML.

- You can use the [LINT tool](https://www.yamllint.com/).

```
# Two spaces are recomended

title: Wizard's Choice
author: Delight Games

sections:
- id: intro
content:
  - |
    So this is some cool adventure stuff.
    This is for multi-line adventure.
  - Chapter second comes after.

choices:
  - description: This will make you hide behind the rock.
    id: hiding
  - description: This will makes you to run behind the rock.
    id: running
  - description: This  make you to jump top of the rock.
    id: jumping
```

- The teachers answer: [Teachers answer](http://sdkbridge.com/swagger/Exercise1Answer.yaml).