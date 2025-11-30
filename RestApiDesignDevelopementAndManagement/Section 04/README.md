# Section 04 - Designing REST API.

Designing REST API.

# What I Learned.

# API Endpoint URL.

<p align="center">
    <img src="APIendPoint.JPG" alt="alt text" width="500"/>
</p>

1. Base URL. 
2. Grouping Name (optional).
3. Version of API.
4. REST resource ID (Action is operated to here).

- Example of Base URL for API’s.

<p align="center">
    <img src="baseHTTPurl.JPG" alt="alt text" width="500"/>
</p>

- **DO NOT** user your WWW subdomain for API.

- For example **ticket master** uses sub-domain for API:s `developer.ticketmaster.com` [TicketMasterAPI](https://developer.ticketmaster.com/). While ticket master **WWW** [website](https://www.ticketmaster.com/) is `https://www.ticketmaster.com/`.

<p align="center">
    <img src="apiDomain.JPG" alt="alt text" width="500"/>
</p>

- **if option** go for dedicated domain.  

<p align="center">
    <img src="producstsINrest.JPG" alt="alt text" width="500"/>
</p>

- Product is also called `packages`.

- Multiple API in big companies with multiple teams.

<p align="center">
    <img src="producstsINrest.JPG" alt="alt text" width="500"/>
</p>

-  You can logically group **API:s** under resources. 

1. If you work for smaller organization you were you don't have many teams → package is not required! 

- Example Ticket Master Grouping.

<p align="center">
    <img src="ticketMasterGroupping.JPG" alt="alt text" width="500"/>
</p>

- **Version** of API.

<p align="center">
    <img src="versionApis.JPG" alt="alt text" width="500"/>
</p>

1. Your API can have many versions of the API’s
2. Customer can take use of API at their own time schedule.
3. Version it the past was optional, because there were other ways to manage versioning. 

<p align="center">
    <img src="resourceUrlPath.JPG" alt="alt text" width="500"/>
</p>

1. If you don't provide ID. It can be operated on **Array of resources**.
    - **If** in other hand `{id}` is specified. I can be operated in **specific resource**.

2. If you **GET** on specific ID you will get specific property.

<p align="center">
    <img src="resourceUrlPathMultiple.JPG" alt="alt text" width="500"/>
</p>

- If you **GET** here **multiple properties** are returned.

<p align="center">
    <img src="RootURL.JPG" alt="alt text" width="500"/>
</p>

1. This domain represents root URL.

<p align="center">
    <img src="summary.JPG" alt="alt text" width="500"/>
</p>

# Practices for Resource Names, Actions & Associations.

<p align="center">
    <img src="resourcingNaming.JPG" alt="alt text" width="500"/>
</p>

- Naming of API of different companies.

1. Multiple resources.
2. Single resource.
3. To identify resources we use **nouns**.
    - We could say `getNames` or `getPeople`, but this does not follow REST practices. 
4. Use plurals not singulars. Idea is follow patters, which many companies are following → **Plural**.

<p align="center">
    <img src="operationAsResources.PNG" alt="alt text" width="500"/>
</p>

- What if action is not CRUD operation action `search`.

- API exposes **action**.

<p align="center">
    <img src="spotifyExposesAction.JPG" alt="alt text" width="500"/>
</p>

1. Spotify exposes.

<p align="center">
    <img src="ActionAsPart.JPG" alt="alt text" width="500"/>
</p>

- Some companies exposing action in Resource.

<p align="center">
    <img src="ActionAsPart.JPG" alt="alt text" width="500"/>
</p>

<p align="center">
    <img src="resourceAssosation.JPG" alt="alt text" width="500"/>
</p>

1. **Resources** can have relationships like normal things have. Order has Items.
2. Find exact person with specific **ID** and get specific flower with **ID**.

- Example of **E trade** portal.

<p align="center">
    <img src="spesificAccoutId.JPG" alt="alt text" width="500"/>
</p>

1. List transactions of this `accountID`.

<p align="center">
    <img src="subQuery.PNG" alt="alt text" width="500"/>
</p>

1. Avoid deep nesting, you could make sub-query.

<p align="center">
    <img src="summary2.PNG" alt="alt text" width="500"/>
</p>

# Walk through: Setup the API URI for ACME API.

# User case: ACME API.

<p align="center">
    <img src="userCasePlan.PNG" alt="alt text" width="500"/>
</p>

1. End user experience brings most customer value. 

- Domain will be `https://api.acme.com`
- `https://domain/`<del>`product`</del>`/version`.
    - No need for **product path**, since it does not have too many resources.
- Version since its first version, it will be `/v1`.
- Root URL of our user case will be `https://api.acme.com/v1`.

<p align="center">
    <img src="userCaseResources.PNG" alt="alt text" width="500"/>
</p>

1. For getting many resources.
2. For getting specific resource.

<p align="center">
    <img src="userCaseSearchAcions.PNG" alt="alt text" width="500"/>
</p>

1. Exposing destination as endpoint. This is not only case, to book travel **Destination** **Price** **Number of Day** are expected as well. 
2. We will expose prove an **Action** on search. Parameters are provided in query parameters.

<p align="center">
    <img src="acme API Assosation.PNG" alt="alt text" width="500"/>
</p>

1. Customer can upload pictures.
2. Customer can review the travel package from ACME travels.
3. Get single picture form specific.
4. Get all photographs from specific vacation package. 
5. Delete review from specific vacation and specific review ID.

<p align="center">
    <img src="summary3.PNG" alt="alt text" width="500"/>
</p>

# HTTP API Request flow and HTTP Status Code.

- API call flow.

<p align="center">
    <img src="RESTAPIflow.PNG" alt="alt text" width="500"/>
</p>

<p align="center">
    <img src="requestResponsePayload.PNG" alt="alt text" width="500"/>
</p>

- HTTP methods need to define request body and header.

<p align="center">
    <img src="UniformInterfaceContract.PNG" alt="alt text" width="500"/>
</p>

- Contract between client and server.

1. Request header needs to defined when making request.
2. In response Header also needs to be defined. HTTP status code is also returned.

<p align="center">
    <img src="serverAnswers.PNG" alt="alt text" width="500"/>
</p>

<br>

<p align="center">
    <img src="statusCode.JPG" alt="alt text" width="500"/>
</p>

<p align="center">
    <img src="summary4.PNG" alt="alt text" width="500"/>
</p>

# Implementing REST API CRUD operations.

- When planning **HTTP Verbs** for CRUD, here is some which you should be aware of.

<p align="center">
    <img src="httpVerbsWhenPlanningCRUD.PNG" alt="alt text" width="500"/>
</p>

# POST, Request.

- What kind of information is needed for `HTTP POST` from `Requestor` perspective.

<p align="center">
    <img src="createResourceByPost.PNG" alt="alt text" width="500"/>
</p>

1. Endpoint, meaning.
2. If you want vacation package. This will be the URL. 
3. If Resource is sub-resource for example review the URL will look like this.
4. Request Body will have the data of Resource.

# POST, Response.

<p align="center">
    <img src="createResourceByPostResponse.PNG" alt="alt text" width="500"/>
</p>

1. Request CODE must return in **header**.
2. API implementation can do either one of two things.

# GET, Request.

<p align="center">
    <img src="retrieveResosourceByGetRequest.PNG" alt="alt text" width="500"/>
</p>

1. If client is asking is many or one resource.

- Query Parameters are optional.
- Headers are optional.
- Request body is optional.

# GET, Response.

<p align="center">
    <img src="retrieveResosourceByGetResponse.PNG" alt="alt text" width="500"/>
</p>

# HTTP PUT/PATCH, Request, For Updating the Resource.

- You could use **PUT** or **PATCH**.
    - **PUT** When all attributes are updated.
    - **PATCH** When **SOME** attributes of the resource are updated.
        - Patch may be more performant for large size objects.
    - Both are good to have!

<p align="center">
    <img src="updatingTheResosourceByPutOrPatchRequest.PNG" alt="alt text" width="500"/>
</p>

# HTTP PUT/PATCH, Response, For Updating the Resource.

- This can be implemented in many ways.

<p align="center">
    <img src="updatingTheResosourceByPutOrPatchResponse.PNG" alt="alt text" width="500"/>
</p>

# HTTP DELETE, Request, For Deleting the Resource.

<p align="center">
    <img src="deletingTheResosourceByDeleteRequest.PNG" alt="alt text" width="500"/>
</p>

- Body is not needed.

# HTTP DELETE, Response, For Deleting the Resource.

<p align="center">
    <img src="deletingTheResosourceByDeleteResponse.PNG" alt="alt text" width="500"/>
</p>

- Can I use POST for updating?
    - Yes you can. For example twitter use GET & POST for all their API!!!
- **These are some guidelines, which are commonly adopted** 

<p align="center">
    <img src="twitterApis.PNG" alt="alt text" width="500"/>
</p>

1. Twitter API uses **POST** for updating partially their resources. **PATCH** would be here the best, but twitter.
    - They own way, no harm done if you follow this consistently.

# API Data Format Setup.

- For supporting multiple Data Formats API needs to decide what kind of output is given. This can be done in multiple ways. 

1. Example using **Query Parameters**
    - Example using MSNBC API.

<p align="center">
    <img src="queryParametersInAPI.PNG" alt="alt text" width="150"/>
</p>

- Example from API is asking for **Query String**.

<p align="center">
    <img src="settingInQueryString.PNG" alt="alt text" width="500"/>
</p>

2. Second example using **HTTP Headers**.
    - Example PayPal is using.

<p align="center">
    <img src="httpHeader.PNG" alt="alt text" width="300"/>
</p>

- Example below from PayPal. Setting data in header.

<p align="center">
    <img src="httpHeaderExamplePayPal.PNG" alt="alt text" width="500"/>
</p>

3. Third example using **Resource format suffix**.
    - Example is using **The Weather Chanel**.

<p align="center">
    <img src="resourceFormatSuffixThirdWay.PNG" alt="alt text" width="400"/>
</p>

- Example below from The Weather Channel API.

<p align="center">
    <img src="exampleUsingResourceFormat.PNG" alt="alt text" width="500"/>
</p>

# API codes for returning query status.

<p align="center">
    <img src="APIdeveloperResponseCodes.PNG" alt="alt text" width="500"/>
</p>

1. Return 200 if API request was fine, and you could process request successfully.

2. Return 415 if requestor gave unsupported type in request.

3. If errors return 5xx.

4. Always set `Content-Type: application/json`.

<p align="center">
    <img src="summary5.PNG" alt="alt text" width="500"/>
</p>

# Setup the Demo/Test environment.

<p align="center">
    <img src="clusterConnection.PNG" alt="alt text" width="500"/>
</p>

- To connect cluster db.
1. Protocol of usage.
2. Cluster name.

- API which returns **non resource** and follows by REST rules, is **not** defined as.

- Example project from [GitHubRestAPICourseV2](https://github.com/acloudfan/REST-API-Course-V2).