# Section 03 - REST API Architectural Constraints

# What I Learned

# 12. Introduction to REST Architecture Constraints

<img src="restFullAppllication.JPG" alt="alt text" width="500"/>

- Just because you add HTTP and JSON together, you don't necessarily have RESTful architecture.
    - It can be **REST like** or **RESTish**.

- **What makes Architecture RESTful?**
    - It must follow **6** Design Rules. 
        - These rules are called **REST Architecture Constraints**.
        - This paper was written in **2000** by **Roy Fielding**.

- In summary these are.

<img src="REST6Constraints.JPG" alt="alt text" width="500"/>

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

<img src="restOverHttp.JPG" alt="alt text" width="500"/>

- Rest API are not restricted to HTTP. This can be said `REST over HTTP`.

<img src="MaturityModel.JPG" alt="alt text" width="500"/>

1. Measurement for **measuring** RESTfullness **->** Richardson Maturity Model(**RMM**).
    - This model was when **Richard analyzed** over 100 API:s.

- RESTfullness of API implementation.

<img src="summary.JPG" alt="alt text" width="500"/>

# 13. REST API Architectural Constraint - Client Server

### 1. Client - Server constraint explained 

- Client request **resource**.
- Server responses with **resource**.
    - Server may serve multiple resources.
    - Serves multiple clients.
- Client and Server **NOT** run in same process.

<img src="clientServerCommunicaiton.JPG" alt="alt text" width="500"/>

- Over network, client and server can change independently.
    - As long **Uniform Interface** is.

<img src="clientServer.JPG" alt="alt text" width="500"/>

- These marks are fully taken care of as long **Uniform Interface** is maintained!

<img src="ClientServerIndependently.JPG" alt="alt text" width="500"/>

- Client and Server can evolve independently.

2. At first Servers provided resource as **XML** format.
1. Then came need for support **JSON**.
3. In future came **CSV file format**. 
    - THIS IS POSSIBLE ONLY IF **Uniform Interface** is being valued!

<img src="summaryClientAndServer.JPG" alt="alt text" width="500"/>

# 14. REST API Architectural Constraint - Uniform Interface

### 2. Uniform Interface constraint explained 

<img src="uniformInterface.JPG" alt="uniform" width="500"/>

1. There shall not be any business logic.
2. There needs to be contract between client and server. 

<img src="uniformInterfaceRuleNumber1.JPG" alt="uniform" width="500"/>

1. **Individual Resources** are identified in request.

<img src="uniformInterfaceRuleNumber2first.JPG" alt="uniform" width="500"/>

- Resource can use that object, to manipulate data. ie **DELETE**.

<img src="uniformInterfaceRuleNumber2.JPG" alt="uniform" width="500"/>

- Client can ask in different file format.

<img src="uniformInterfaceRuleNumber2Third.JPG" alt="uniform" width="500"/>

- Client and server exchanges **metadata** request and responses.

1. Example `Accepts` header with `application/json` for accepted file formats.

<img src="uniformInterfaceRuleNumber2fourth.JPG" alt="uniform" width="500"/>

- Server back **Hypermedia**.

1. **Links for discovery** = data + actions.

<img src="summaryUniformItnerface.JPG" alt="uniform" width="500"/>

# 15. REST API Architectural Constraint - Statelessness

### 3. Statelessness constraint explained

<img src="stateless.JPG" alt="Statelessness" width="500"/>

<br>

<img src="stateless1.JPG" alt="Statelessness" width="500"/>

1. **Web Application** creates **state** to manage clients state of application. Some kind of **session** store.

2. For every application **Web Application** manages state independently. **2.1** This approach where **Web application** manages state in server **IS NOT**  best practices for building REST:full API:s.

<img src="stateless2.JPG" alt="Statelessness" width="500"/>

<img src="stateless3.JPG" alt="Statelessness" width="500"/>

1. REST client manages its own state!. This is left **CLIENT**.
    
2. Easier api implementation, easier to scale and needs less resources.

<img src="stateless4.JPG" alt="Statelessness" width="500"/>

1. In REST client sends necessary information.

<img src="summary2.JPG" alt="Statelessness" width="500"/>

# 16. REST API Architectural Constraint - Caching

### 4. Client - Server constraint explained 

<img src="stateness.JPG" alt="cache" width="500"/>

1. Such problems occur when using REST with session management.

<img src="cache.JPG" alt="cache" width="500"/>

<br>

<img src="cache2.JPG" alt="cache" width="500"/>

1. There is other many places to insert cache.

<img src="cache3.JPG" alt="cache" width="500"/>

1. Caching can be done using `Cache-Control Directives`.

- Not all data can be cached. Example, **stock prices**.

<img src="cache3.JPG" alt="cache" width="500"/>

# 17. REST API Architectural Constraint - Layered System

### 5. Layered System explained

<img src="applicationTiers.JPG" alt="cache" width="500"/>

1. These tears are dependable of each others.

<br>

<img src="multipleLayersUnsopportedAction.JPG" alt="cache" width="500"/>

1. Gateway cannot by pass **2.** load balancer. Technically can, but its not recommended. 

2. Load balancer.


<img src="layeredArchitecture.JPG" alt="layered" width="500"/>

<br>

<img src="summary4.JPG" alt="cache" width="500"/>

# 18. REST API Architectural Constraint - Code On Demand

### 6. Code On Demand - REST API Architectural Constraint

- Server can send code to client.

<img src="CodeOnDemand.JPG" alt="alt text" width="600"/>

- When client asks server `hmtl` its returned from `server`. In REST context `<Response>` is sent back instead of `<html>`
    - This can be other `.filetypes`.

2. Client can execute this in their machine.

- `HATEOAS` is something as **Code on demand**.

<img src="hateoes.JPG" alt="alt text" width="600"/>

2. REST client can take action on links coming from **1.** `<Response>` and apply them on **resources** manged on **Rest Server**.

<img src="exampleCodeOnDemand.JPG" alt="alt text" width="600"/>

1. Repose is returned with different **links**, client can **Invoke** these links, which in return get executed in server side. Hence, **server** can manage content of Vacation.

2. Let's say, requested resource is booked out. Server can manage response(Link) given in returned resource.

<img src="BenefitsHATEOAS.JPG" alt="alt text" width="500"/>

- PayPal implements HATEOES as such [PayPal HATEOES](https://developer.paypal.com/api/rest/responses/#link-hateoaslinks).

<img src="PaypalImplemetsHATEOAasSuch.JPG" alt="alt text" width="600"/>

<img src="PaypalUsesHateoa.JPG" alt="alt text" width="600"/>

1. Link 1, link about this payment transaction.
2. Link 2, Carrying refund of trans action.
3. Link 3, Get parent transaction of this transaction.

# 19. Richardson Maturity Model for REST API

<img src="rmm.JPG" alt="alt text" width="500"/>

- You can measure **Restfulness**.

- **Level 0**
    - Typically, company ahs acquired **RPC** and using **XML** for request and responses.
    - Mostly use **HTT GET** or **POST**.
    - Api endpoints looks like verbs.

<img src="level0.JPG" alt="acme" width="500"/>

<br>

<img src="useCaseAcme.JPG" alt="acme" width="500"/>

- Analysis of **ACME** case.

1. **Acme** uses **RPC**.
    - Data format is **XML** over **HTTP**.  
    - Other endpoint are **GET** over **HTTP**.
2. Safe to say, case ACME is @ **Level 0**. At least.

<img src="level1.JPG" alt="acme" width="500"/>

1. Rather than thinking web is collections of **URL**, think like its collection of **Resources**.
2. **RPC** is used to manipulate, state of **resource**.

<img src="level1Second.JPG" alt="acme" width="500"/>

1. **ACME** perspective. These are resources.

<img src="level2.JPG" alt="acme" width="500"/>

1. If **GET** and **POST** to manipulate resources. It is not yet **Level 2 Maturity Level**.

<img src="level2Second.JPG" alt="acme" width="500"/>

- Every **request** has different actions.

<img src="level3.JPG" alt="acme" width="500"/>

<br>

<img src="summaryArchi.JPG" alt="acme" width="500"/>

# 20. WebApp versus REST API Architecture

<img src="webAppVersusRESTapi.JPG" alt="acme" width="500"/>

1. www can be thought massively scalable distributed application.

<br>

<img src="comparingUniformInterface.JPG" alt="acme" width="500"/>

1. Rules and Best practices.

<img src="comparingStatelesness.JPG" alt="acme" width="500"/>

1. In **Web Application** state can be manged or not managed by server. **Application Servers** can manage state internally.

- In REST client manages state.

<img src="httpMethods.JPG" alt="acme" width="500"/>
