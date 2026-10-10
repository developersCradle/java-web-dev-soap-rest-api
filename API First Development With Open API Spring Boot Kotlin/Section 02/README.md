# Section 02: Open API Specification Explained. 

Open API Specification Explained.

# What I learned.

# Setup Spring Boot Kotlin Application. ✅
  
<div 
align="center">
    <img 
    src="We_Need_To_Select_Following_Properties.JPG" 
    alt="API First Development With Open API Spring Boot Kotlin!" 
    width="600"
    />
</div>

1. We are creating the **spring project** as following:

# Starting Spring boot Application and Install JDK and Kotlin Plugin. ✅

<div 
align="center">
    <img 
    src="Kotlin_Plugin.JPG" 
    alt="API First Development With Open API Spring Boot Kotlin!" 
    width="600"
    />
</div>

1. I did not need to install the plugin for the Kotlin! One can check if this is needed!

# Adding General Info of Application Using OpenAPI Yaml. ✅

- We can write our interface:

````Yaml
# What version of Open API we will be using.
openapi: 3.0.1
info:
  title: API Driven development Demo!
  version: 1.0.0
  description: "Tutorial for api first development"

# Servers is array.
servers:
  - url: /api/
    description: base url for dev env.

tags:
  - name: post
    description: Operations about the post.
````

- Key points:
    - `openapi: 3.0.1` — Specifies the **OpenAPI specification** version.
    - `info` — Defines the **API title**, **version**, and **description**.
    - `servers` — lists the **base URL** for the API. The relative URL `/api/` uses the current host.
        > It's called **server** because it refers to the servers (computer systems) that host and run your API!
    - `tags` — defines a `post` category for grouping related API operations in the documentation.

# Explained Paths And Added First EndPoint Using Specification. ✅

# Reuse Model Definition With Components Field.

# Adding Other Http Status For Get Request endpoint.

# Path Variable Declaration With Open API - getByPostId endpoint.

# Http Post Method With Open API.

# Http Delete Method - Open API.

# Refactor - Path Variable - OpenAPI.

# Http Put definition - Open API.

# Request Body Required Validation.