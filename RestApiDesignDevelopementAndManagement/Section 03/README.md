# Section 03 - REST API Architectural Constraints.

REST API Architectural Constraints.

# What I Learned.

# Introduction to REST Architecture Constraints.

<p align="center">
    <img src="restFullAppllication.JPG" alt="alt text" width="500"/>
</p>

- Just because you add HTTP and JSON together, you don't necessarily have RESTful architecture.
    - It can be **REST like** or **RESTish**.

- **What makes Architecture RESTful?**
    - It must follow **6** Design Rules. 
        - These rules are called **REST Architecture Constraints**.
        - This paper was written in **2000** by **Roy Fielding**.

- In summary these are.

<p align="center">
    <img src="REST6Constraints.JPG" alt="alt text" width="500"/>
</p>

1. Client - Server.
    - Use Client/Server design principles.
2. Uniform Interface. 
    - Use of well-defined contracts between **client** and the **server**.
3. Statelessness.
    - Server should not manage state of application.
4. Caching.
    - HTTP Caching header to cache responses to requests.
5. Layers.
    - Architecture should be layered.
6. Code on Demand (optional).
    - Server can send code to client. 

<p align="center">
    <img src="restOverHttp.JPG" alt="alt text" width="500"/>
</p>

- Rest API are not restricted to HTTP. This can be said `REST over HTTP`.

<p align="center">
    <img src="MaturityModel.JPG" alt="alt text" width="500"/>
</p>

1. Measurement for **measuring** RESTfullness **->** Richardson Maturity Model(**RMM**).
    - This model was when **Richard analyzed** over 100 API:s.

- RESTfullness of API implementation.

<p align="center">
    <img src="summary.JPG" alt="alt text" width="500"/>
</p>

# REST API Architectural Constraint - Client Server.

# Client - Server constraint explained.

- Client request **resource**.
- Server responses with **resource**.
    - Server may serve multiple resources.
    - Serves multiple clients.
- Client and Server **NOT** run in same process.

<p align="center">
    <img src="clientServerCommunicaiton.JPG" alt="alt text" width="500"/>
</p>

- Over network, client and server can change independently.
    - As long **Uniform Interface** is.

<p align="center">
    <img src="clientServer.JPG" alt="alt text" width="500"/>
</p>

- These marks are fully taken care of as long **Uniform Interface** is maintained!

<p align="center">
    <img src="ClientServerIndependently.JPG" alt="alt text" width="500"/>
</p>

- Client and Server can evolve independently.

2. At first Servers provided resource as **XML** format.
1. Then came need for support **JSON**.
3. In future came **CSV file format**. 
    - THIS IS POSSIBLE ONLY IF **Uniform Interface** is being valued!

<p align="center">
    <img src="summaryClientAndServer.JPG" alt="alt text" width="500"/>
</p>

# REST API Architectural Constraint - Uniform Interface.

# Uniform Interface constraint explained.

<p align="center">
    <img src="uniformInterface.JPG" alt="uniform" width="500"/>
</p>

1. There shall not be any business logic.
2. There needs to be contract between client and server. 

<p align="center">
    <img src="uniformInterfaceRuleNumber1.JPG" alt="uniform" width="500"/>
</p>

1. **Individual Resources** are identified in request.

<p align="center">
    <img src="uniformInterfaceRuleNumber2first.JPG" alt="uniform" width="500"/>
</p>

- Resource can use that object, to manipulate data. ie **DELETE**.

<p align="center">
    <img src="uniformInterfaceRuleNumber2.JPG" alt="uniform" width="500"/>
</p>

- Client can ask in different file format.

<p align="center">
    <img src="uniformInterfaceRuleNumber2Third.JPG" alt="uniform" width="500"/>
</p>

- Client and server exchanges **metadata** request and responses.

1. Example `Accepts` header with `application/json` for accepted file formats.

<p align="center">
    <img src="uniformInterfaceRuleNumber2fourth.JPG" alt="uniform" width="500"/>
</p>

- Server back **Hypermedia**.

1. **Links for discovery** = data + actions.

<p align="center">
    <img src="summaryUniformItnerface.JPG" alt="uniform" width="500"/>
</p>

# REST API Architectural Constraint - Statelessness.

# Statelessness constraint explained.

<p align="center">
    <img src="stateless.JPG" alt="Statelessness" width="500"/>
</p>

<br>

<p align="center">
    <img src="stateless1.JPG" alt="Statelessness" width="500"/>
</p>

1. **Web Application** creates **state** to manage clients state of application. Some kind of **session** store.

2. For every application **Web Application** manages state independently. **2.1** This approach where **Web application** manages state in server **IS NOT**  best practices for building REST:full API:s.

<p align="center">
    <img src="stateless2.JPG" alt="Statelessness" width="500"/>
</p>

<p align="center">
    <img src="stateless3.JPG" alt="Statelessness" width="500"/>
</p>

1. REST client manages its own state!. This is left **CLIENT**.
    
2. Easier api implementation, easier to scale and needs less resources.

<p align="center">
    <img src="stateless4.JPG" alt="Statelessness" width="500"/>
</p>

1. In REST client sends necessary information.

<p align="center">
    <img src="summary2.JPG" alt="Statelessness" width="500"/>
</p>

# REST API Architectural Constraint - Caching.

# Client - Server constraint explained.

<p align="center">
    <img src="stateness.JPG" alt="cache" width="500"/>
</p>

1. Such problems occur when using REST with session management.

<p align="center">
    <img src="cache.JPG" alt="cache" width="500"/>
</p>

<br>

<p align="center">
    <img src="cache2.JPG" alt="cache" width="500"/>
</p>

1. There is other many places to insert cache.

<p align="center">
    <img src="cache3.JPG" alt="cache" width="500"/>
</p>

1. Caching can be done using `Cache-Control Directives`.

- Not all data can be cached. Example, **stock prices**.

<p align="center">
    <img src="cache3.JPG" alt="cache" width="500"/>
</p>

# REST API Architectural Constraint - Layered System.

# Layered System explained.

<p align="center">
    <img src="applicationTiers.JPG" alt="cache" width="500"/>
</p>

1. These tears are dependable of each others.

<br>

<p align="center">
    <img src="multipleLayersUnsopportedAction.JPG" alt="cache" width="500"/>
</p>

1. Gateway cannot by pass **2.** load balancer. Technically can, but its not recommended. 

2. Load balancer.

<p align="center">
    <img src="layeredArchitecture.JPG" alt="layered" width="500"/>
</p>

<br>

<p align="center">
    <img src="summary4.JPG" alt="cache" width="500"/>
</p>

# REST API Architectural Constraint - Code On Demand.

# Code On Demand - REST API Architectural Constraint.

- Server can send code to client.

<p align="center">
    <img src="CodeOnDemand.JPG" alt="alt text" width="600"/>
</p>

- When client asks server `hmtl` its returned from `server`. In REST context `<Response>` is sent back instead of `<html>`
    - This can be other `.filetypes`.

2. Client can execute this in their machine.

- `HATEOAS` is something as **Code on demand**.

<p align="center">
    <img src="hateoes.JPG" alt="alt text" width="600"/>
</p>

2. REST client can take action on links coming from **1.** `<Response>` and apply them on **resources** manged on **Rest Server**.

<p align="center">
    <img src="exampleCodeOnDemand.JPG" alt="alt text" width="600"/>
</p>

1. Repose is returned with different **links**, client can **Invoke** these links, which in return get executed in server side. Hence, **server** can manage content of Vacation.

2. Let's say, requested resource is booked out. Server can manage response(Link) given in returned resource.

<p align="center">
    <img src="BenefitsHATEOAS.JPG" alt="alt text" width="500"/>
</p>

- PayPal implements HATEOES as such [PayPal HATEOES](https://developer.paypal.com/api/rest/responses/#link-hateoaslinks).

<p align="center">
    <img src="PaypalImplemetsHATEOAasSuch.JPG" alt="alt text" width="600"/>
</p>

<p align="center">
    <img src="PaypalUsesHateoa.JPG" alt="alt text" width="600"/>
</p>

1. Link 1, link about this payment transaction.
2. Link 2, Carrying refund of trans action.
3. Link 3, Get parent transaction of this transaction.

# Richardson Maturity Model for REST API.

<p align="center">
    <img src="rmm.JPG" alt="alt text" width="500"/>
</p>

- You can measure **Restfulness**.

- **Level 0**
    - Typically, company ahs acquired **RPC** and using **XML** for request and responses.
    - Mostly use **HTT GET** or **POST**.
    - Api endpoints looks like verbs.

<p align="center">
    <img src="level0.JPG" alt="acme" width="500"/>
</p>

<br>

<p align="center">
    <img src="useCaseAcme.JPG" alt="acme" width="500"/>
</p>

- Analysis of **ACME** case.

1. **Acme** uses **RPC**.
    - Data format is **XML** over **HTTP**.  
    - Other endpoint are **GET** over **HTTP**.
2. Safe to say, case ACME is @ **Level 0**. At least.

<p align="center">
    <img src="level1.JPG" alt="acme" width="500"/>
</p>

1. Rather than thinking web is collections of **URL**, think like its collection of **Resources**.
2. **RPC** is used to manipulate, state of **resource**.

<p align="center">
    <img src="level1Second.JPG" alt="acme" width="500"/>
</p>

1. **ACME** perspective. These are resources.

<p align="center">
    <img src="level2.JPG" alt="acme" width="500"/>
</p>

1. If **GET** and **POST** to manipulate resources. It is not yet **Level 2 Maturity Level**.

<p align="center">
    <img src="level2Second.JPG" alt="acme" width="500"/>
</p>

- Every **request** has different actions.

<p align="center">
    <img src="level3.JPG" alt="acme" width="500"/>
</p>

<br>

<p align="center">
    <img src="summaryArchi.JPG" alt="acme" width="500"/>
</p>

# WebApp versus REST API Architecture.

<p align="center">
    <img src="webAppVersusRESTapi.JPG" alt="acme" width="500"/>
</p>

1. www can be thought massively scalable distributed application.

<br>

<p align="center">
    <img src="comparingUniformInterface.JPG" alt="acme" width="500"/>
</p>

1. Rules and Best practices.

<p align="center">
    <img src="comparingStatelesness.JPG" alt="acme" width="500"/>
</p>

1. In **Web Application** state can be manged or not managed by server. **Application Servers** can manage state internally.

- In REST client manages state.

<p align="center">
    <img src="httpMethods.JPG" alt="acme" width="500"/>
</p>