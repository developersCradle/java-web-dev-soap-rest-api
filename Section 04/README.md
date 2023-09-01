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

<img src="ticketMasterGroupping.JPG
" alt="alt text" width="500"/>

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

- API exoposes action

<img src="spotifyExposesAction.JPG" alt="alt text" width="500"/>

- 1. Spotify exposes 

<img src="ActionAsPart.JPG" alt="alt text" width="500"/>

- Some companies exposing action in Recource

<img src="ActionAsPart.JPG" alt="alt text" width="500"/>

<img src="resourceAssosation.JPG" alt="alt text" width="500"/>

- 1. **Resources** can have relationships like normal things have. Order has Items
- 2. Find exact person with spesific **ID** and get spesific folower with **ID**


<img src="spesificAccoutId.JPG" alt="alt text" width="500"/>
