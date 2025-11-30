# Section 02: Evolution of RESTful services.

Evolution of RESTful services.

# What I Learned.

# What is an API.

# Evolving movie database(IMDB).

<p align="center">
    <img src="imdb.PNG" alt="alt text" width="500"/>
</p>

- Old days used to just browse into webpage and look for information.

- Later FedEx released web tracking feature with ID, at the time this was super cool!

<p align="center">
    <img src="spesificRequirements.PNG" alt="alt text" width="500"/>
</p>

- **Web Scraping** was used since it could parse `<html>` and later save it to database.
    - **FYI** Many developers were using this technique! Web Scraping.

<p align="center">
    <img src="implemented.PNG" alt="alt text" width="500"/>
</p>

1. `PHP` based website will receive HTTP request to website.
2. After receiving request, Web Scraper was **invoked()**.
3. HTTP `GET` was invoked form Web Scraper.
4. Response had tracking information about the movie.

- This case was not end of trouble. There were many problems head.

<p align="center">
    <img src="problemsAhead.PNG" alt="alt text" width="500"/>
</p>

- It shows **Web Scraping** is not easy to maintain! Different stuff can be easily changed!

- Later FedEx released HTTP/XML RPC for tracking!
    - XML based.

- This introduced API to developers!

<p align="center">
    <img src="apiMeaning.PNG" alt="alt text" width="500"/>
</p>

- API has well-defined Contract between consumer & provider. Meaning this case **Contract = XML Request/Response structure**.
    - Meaning our case stuff will not change randomly like in our `<html>` scrapper example.

- APIs are expected to use by machine.

<p align="center">
    <img src="JSON.PNG" alt="alt text" width="500"/>
</p>


- After 2013 JSON have grown popularity. Nowadays, it's the first choice for API developers.

# Evolution of REST/JSON API.

<p align="center">
    <img src="localProcedureCall.PNG" alt="alt text" width="500"/>
</p>

- Code here creates process when executed.
    - No network activity.

<p align="center">
    <img src="rpc.PNG" alt="alt text" width="500"/>
</p>

1. On the **servers** side there is function that client can **invoke()**.

2. Using **RPC** mechanism, client can invoke method as it was in local.

- API is **RPC** mechanism.

<p align="center">
    <img src="rpcHistory.PNG" alt="alt text" width="500"/>
</p>

1. 1991 **CORBA** was first practical RPC mechanic.
2. 1998 **SOAP** was introduced.
- These both were heavily dependent on message format and hard to use. These RPC mechanics were build for enterprise solutions **not** for internet.

<p align="center">
    <img src="webServicesHistory.JPG" alt="alt text" width="500"/>
</p>

- Today HTTP REST is **De-facto** standard for API.

<p align="center">
    <img src="whyRest.PNG" alt="alt text" width="500"/>
</p>

1. REST API are not locked to any specific type.
    - For example like **SOAP** is locked into using **XML** format.
- Almost **all** modern API use **REST/JSON**.

<p align="center">
    <img src="whySoapWasHard.PNG" alt="alt text" width="500"/>
</p>

1. XML was ment for computer consumption. 
2. **SOAP** standards was always changing, meaning API needed to implement new version often.

- [REST](https://fi.wikipedia.org/wiki/REST). 

<p align="center">
    <img src="whySoapWasHard.PNG" alt="alt text" width="500"/>
</p>

# Introduction to RESTful API.

<p align="center">
    <img src="representationState.PNG" alt="alt text" width="500"/>
</p>

1. Each of instance have their own values.
2. Query happening to database.
3. Representational State is returned.

- This is called **REST**.

<p align="center">
    <img src="dataFormat.PNG" alt="alt text" width="500"/>
</p>

1. This Representational State can be in any format.
2. This can be converted to **ANY** format.
    - For example HTML for browsers.
3. Now if you convert this node to REST API point, this will represent RESTful API from data point perspective.

> REST API not tied to **any specific Data Format** ~ Rajeev

<p align="center">
    <img src="exampleOfRESTfulAPI.PNG" alt="alt text" width="500"/>
</p>

1. Client asks form RESTful API Job resource as **XML**.
2. Returned as **XML** resource.

<p align="center">
    <img src="example2OfRESTfulAPI.PNG" alt="alt text" width="500"/>
</p>

- REST client can also ask it as **JSON** format.
    - Point here is, many formats can be returned.

<p align="center">
    <img src="spefyingType.PNG" alt="alt text" width="500"/>
</p>

- As you can see RESTful API provides are providing parameter to specify the format. 

<p align="center">
    <img src="restAPIStyle.PNG" alt="alt text" width="500"/>
</p>

- All modern API use HTTP:// Protocol for RESTful communication.
    - We call such `HTTP REST API`.

- **REST** style communication is not tied to **HTTP**. You could use other protocols as well.

# Private, Public and Partner API.

<p align="center">
    <img src="3typesOfApi.PNG" alt="alt text" width="500"/>
</p>

1. Private or Internal consumer. From same organization.
    - Used by development team, inside organization.
2. Outside of organization.
    - Public domain application users.
    - **Not trusted** users, some security is needed for these APIs’s.
3. Partner, trusted by provider.
    - Only trusted users.

- ! There is no difference how these APIs are **implemented**.
    - Only difference how these are **managed**.

<p align="center">
    <img src="howImplementedOtherTypes.PNG" alt="alt text" width="500"/>
</p>

- How API security are implemented.

<p align="center">
    <img src="security.PNG" alt="alt text" width="500"/>
</p>

1. With trusted Developers trust is not too much needed. Basic Auth and Proprietary schemes are common to use. 

2. For these users. Security is main concern. Key/Secret and OAuth are often used.

- How carry out API documentation for public.

<p align="center">
    <img src="documentation.PNG" alt="alt text" width="500"/>
</p>

- How access requests are managed.

<p align="center">
    <img src="accessRequest.PNG" alt="alt text" width="500"/>
</p>

1. Requesting access to these APIs’s with emails and tickets are commonly used by partners and internal developers.

2. For public developers It's common to have some Developer portal process. It's recommended to expose API provisioning workflow in **Developer portal**.

- How SLA are taken care of (SLA= **S**ervice **L**evel **A**greement).
- Example from API perspective.

<p align="center">
    <img src="sla.PNG" alt="alt text" width="500"/>
</p>

1. SLA promises API to be up and working for 99.99% of the time.
2. Promises maximum 20 call/sec for API consumer.
3. Provides email support for consumer.
4. Different levels for API’s.
5. Provider needs to monitor the API.performance to keep up promise what SLA promised in first place. 

# Example REST API Walkthrough.

- Examples used from this link [Ticketmaster](https://developer.ticketmaster.com/partners/).

<p align="center">
    <img src="publicAPI.PNG" alt="alt text" width="500"/>
</p>

- Here is example of **Public API** in **Ticketmaster**.

<p align="center">
    <img src="partner.PNG" alt="alt text" width="500"/>
</p>

- Here is example of **partner contract** API in **Ticketmaster**.

<p align="center">
    <img src="slaManagement.PNG" alt="alt text" width="500"/>
</p>

- Here is example of **SLA management** in **Ticketmaster**.
    - Rate Limit, 5 request per second.

# API Value Chain.

- API makes **value** by exposing data to outside and inside organization.

<p align="center">
    <img src="assetOfValue.PNG" alt="alt text" width="500"/>
</p>

1. **TheWeatherCompany** holds a lot of weather data **FedEx** provides a lot of packages information.
2. **NetFlix** exposes movies services to TV manufacturers.  
3. **FaceBook** data from users.

- So what value company gets for exposing this data to outside world.

<p align="center">
    <img src="whatIsValueForComppanyes.PNG" alt="alt text" width="500"/>
</p>

- There is two main ways companies benefits from exposing data.

<p align="center">
    <img src="diffrentRevenueModels.PNG" alt="alt text" width="500"/>
</p>

1. From Direct Value.
2. Indirect Benefits, for competitive edge.

- These assets are exposed to:

<p align="center">
    <img src="endCustomerValue.JPG" alt="alt text" width="500"/>
</p>

<br>

<p align="center">
    <img src="apiValueChain.JPG" alt="alt text" width="500"/>
</p>

1. **Asset** or **Data** which is going to provide.
2. Data is provided thought **Applications**.
3. Makes asset easy access to developers.
4. Make delightful experience for asset for end customer.
5. For things to app developer.
6. For making the best API, we need to follow these rules!


