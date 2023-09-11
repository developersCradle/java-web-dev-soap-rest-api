# Section 04 - Designing REST API

# What I Learned

<img src="APIendPoint.JPG" alt="alt text" width="500"/>

- 1. Base URL 
- 2. Grouping Name (optional)
- 3. Version of API
- 4. REST resource ID (Action is operated to here)

- Example of Base URL for API’s

<img src="baseHTTPurl.JPG" alt="alt text" width="500"/>

- **DO NOT** user your WWW subdomain for API

- For example **ticket master** uses sub-domain for API:s `developer.ticketmaster.com` [TicketMasterAPI](https://developer.ticketmaster.com/). While ticket master **WWW** [website](https://www.ticketmaster.com/) is `https://www.ticketmaster.com/`

<img src="apiDomain.JPG" alt="alt text" width="500"/>

- **if option** go for dedicated domain  

<img src="producstsINrest.JPG" alt="alt text" width="500"/>

- Product is also called `packages`

- Multiple API in big companies with multiple teams.

<img src="producstsINrest.JPG" alt="alt text" width="500"/>

- 1. If you work for smaller organization you were you don't have many teams -> package is not required! 

- Example Ticket Master Grouping

<img src="ticketMasterGroupping.JPG" alt="alt text" width="500"/>

- Version of API

<img src="versionApis.JPG" alt="alt text" width="500"/>

- 1. Your API can have many versions of the API’s
- 2. Customer can take use of API at their own time schedule.
- 3. Version it the past was optional, because there were other ways to manage versioning. 

<img src="resourceUrlPath.JPG" alt="alt text" width="500"/>

1. If you don't provide ID. It can be operated on **Array of resources**
    - **If** in other hand `{id}` is specified. I can be operated in **specific resource**

2. If you **GET** on specific ID you will get specific property

<img src="resourceUrlPathMultiple.JPG" alt="alt text" width="500"/>

- If you **GET** here **multiple properties** are returned

<img src="RootURL.JPG" alt="alt text" width="500"/>

- 1. This domain represents root URL

<img src="summary.JPG" alt="alt text" width="500"/>

<img src="resourcingNaming.JPG" alt="alt text" width="500"/>

- Naming of API of different companies
    - 1. Multiple resources
    - 2. Single resource
    - 3. To identify resources we use **nouns**
        - We could say `getNames` or `getPeople`, but this does not follow REST practices. 
    - 4. Use plurals not singulars. Idea is follow patters, which many companies are following -> **Plural**

<img src="operationAsResources.PNG" alt="alt text" width="500"/>

- What if action is not CRUD operation action `search`

- API exposes action

<img src="spotifyExposesAction.JPG" alt="alt text" width="500"/>

- 1. Spotify exposes 

<img src="ActionAsPart.JPG" alt="alt text" width="500"/>

- Some companies exposing action in Resource

<img src="ActionAsPart.JPG" alt="alt text" width="500"/>

<img src="resourceAssosation.JPG" alt="alt text" width="500"/>

1. **Resources** can have relationships like normal things have. Order has Items
2. Find exact person with specific **ID** and get specific flower with **ID**

- Example of **E trade** portal

<img src="spesificAccoutId.JPG" alt="alt text" width="500"/>

- 1. List transactions of this `accountID`

<img src="subQuery.PNG" alt="alt text" width="500"/>

1. Avoid deep nesting, you could make sub-query

<img src="summary2.PNG" alt="alt text" width="500"/>


## User case: ACME API

<img src="userCasePlan.PNG" alt="alt text" width="500"/>

- 1. End user experience brings most customer value. 

- Domain will be `https://api.acme.com`
- `https://domain/`<del>`product`</del>`/version`
    - No need for **product path**, since it does not have too many resources
- Version since its first version, it will be `/v1`
- Root URL of our user case will be `https://api.acme.com/v1`

<img src="userCaseResources.PNG" alt="alt text" width="500"/>

- 1. For getting many resources
- 2. for getting specific resource

<img src="userCaseSearchAcions.PNG" alt="alt text" width="500"/>

- 1. Exposing destination as endpoint. This is not only case, to book travel **Destination** **Price** **Number of Day** are expected as well 
- 2. We will expose prove an **Action** on search. Parameters are provided in query parameters

<img src="acme API Assosation.PNG" alt="alt text" width="500"/>

- 1. Customer can upload pictures
- 2. Customer can review the travel package from ACME travels
- 3. Get single picture form specific
- 4. Get all photographs from specific vacation package 
- 5. Delete review from specific vacation and specific review ID

<img src="summary3.PNG" alt="alt text" width="500"/>


<img src="RESTAPIflow.PNG" alt="alt text" width="500"/>

<img src="requestResponsePayload.PNG" alt="alt text" width="500"/>

- HTTP methods need to define request body and header

<img src="UniformInterfaceContract.PNG" alt="alt text" width="500"/>

- Contract between client and server

- 1. Request header needs to defined when making request
- 2. In response Header also needs to be defined. HTTP status code is also returned

<img src="serverAnswers.PNG" alt="alt text" width="500"/>


<img src="summary4.PNG" alt="alt text" width="500"/>

- When planning HTTP Verbs for CRUD, here is some which you should be aware of

<img src="httpVerbsWhenPlanningCRUD.PNG" alt="alt text" width="500"/>

### POST, Request

- What kind of information is needed for `HTTP POST` from `Requestor` perspective

<img src="createResourceByPost.PNG" alt="alt text" width="500"/>

1. Endpoint, meaning 
2. If you want vacation package. This will be the URL 
3. If Resource is sub-resource for example review the URL will look like this
4. Request Body will have the data of Resource

### POST, Response

<img src="createResourceByPostResponse.PNG" alt="alt text" width="500"/>

1. Request CODE must return in **header**
2. API implementation can do either one of two things 

### GET, Request

<img src="retrieveResosourceByGetRequest.PNG" alt="alt text" width="500"/>

- 1. If client is asking is many or one resource

- Query Parameters are optional
- Headers are optional
- Request body is optional


### GET, Response


<img src="retrieveResosourceByGetResponse.PNG" alt="alt text" width="500"/>


### HTTP PUT/PATCH, Request, For Updating the Resource

- You could use **PUT** or **PATCH**
    - **PUT** When all attributes are updated
    - **PATCH** When **SOME** attributes of the resource are updated.
        - Patch may be more performant for large size objects
    - Both are good to have!


<img src="updatingTheResosourceByPutOrPatchRequest.PNG" alt="alt text" width="500"/>

### HTTP PUT/PATCH, Response, For Updating the Resource

- This can be implemented in many ways

<img src="updatingTheResosourceByPutOrPatchResponse.PNG" alt="alt text" width="500"/>



### HTTP DELETE, Request, For Deleting the Resource


<img src="deletingTheResosourceByDeleteRequest.PNG" alt="alt text" width="500"/>

- Body is not needed

### HTTP DELETE, Response, For Deleting the Resource


<img src="deletingTheResosourceByDeleteResponse.PNG" alt="alt text" width="500"/>

- Can I use POST for updating?
    - Yes you can. For example twitter use GET & POST for all their API!!!
- **These are some guidelines, which are commonly adopted** 

<img src="twitterApis.PNG" alt="alt text" width="500"/>

- 1. Twitter API uses **POST** for updating partially their resources. **PATCH** would be here the best, but twitter.
    - They own way, no harm done if you follow this consistently


- For supporting multiple Data Formats API needs to decide what kind of output is given. This can be done in multiple ways. 

- 1. Example using **Query Parameters**
    - Example using MSNBC API

<img src="queryParametersInAPI.PNG" alt="alt text" width="200"/>

- Example from API is asking for **Query String**

<img src="settingInQueryString.PNG" alt="alt text" width="500"/>

- 2. Second example using **HTTP Headers**
    - Example PayPal is using

<img src="httpHeader.PNG" alt="alt text" width="300"/>

- Example below from PayPal. Setting data in header

<img src="httpHeaderExamplePayPal.PNG" alt="alt text" width="500"/>


- 3. Third example using **Resource format suffix**
    - Example is using **The Weather Chanel**

<img src="resourceFormatSuffixThirdWay.PNG" alt="alt text" width="400"/>


- Example below from The Weather Channel API

<img src="exampleUsingResourceFormat.PNG" alt="alt text" width="500"/>



### API codes for returning query status

<img src="APIdeveloperResponseCodes.PNG" alt="alt text" width="500"/>

- 1. Return 200 if API request was fine, and you could process request successfully

- 2. Return 415 if requestor gave unsupported type in request

- 3. If errors return 5xx

- 4. Always set `Content-Type: application/json`

<img src="summary5.PNG" alt="alt text" width="500"/>

<img src="clusterConnection.PNG" alt="alt text" width="500"/>

- To connect cluster db
    - 1. Protocol of usage
    - 2. Cluster name

- API which returns **non resource** and follows by REST rules, is **not** defined as 

- Example project from [GitHubRestAPICourseV2](https://github.com/acloudfan/REST-API-Course-V2)