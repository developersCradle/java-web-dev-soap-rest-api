# Section 11 - API Management

# What I Learned

# 53. Introduction to API Management

<img src="apiManagement.JPG" alt="alt text" width="600"/>

<br>

<img src="apiManagement2.JPG" alt="alt text" width="600"/>

1. These are manged by API Management.
2. Different API management platform.

<img src="agentBased.JPG" alt="alt text" width="600"/>

1. There is many different servers running environment. API **polices** are applied to to API itself, trough some kind of **agent**.

<img src="proxy.JPG" alt="alt text" width="600"/>

1. Proxies are defined on the proxies. Calls routed to proxy are directed into API implementations.
2. **Policies** are implemented into proxy not to the **API**:S.
    - Security policies and traffic management policies. 
3. App developers can access **dev portals**

# 54. API Lifecycle & Developer Productivity

### Different stages of API

<img src="lifeSycle.JPG" alt="alt text" width="600"/>

1. **Build** stage. API is created.
2.  After testing and validation, it goes **Publish** stage. App developer can get access to API.
3. **Published** version of API is marked as **Deprecated**. New developers are not granted **request access** to API.
4. API get **Retired** and code can be removed.
5. Example. When API is to Publish -> Public stage, is the documentation needed for developer to be made?
6. Roadmap is provided in advance. Even more crucial if app developers are external.
7. Keeping application developer community informed about lifecycle stage transitions.
8. Tools can be used as well.

<img src="IBM.JPG" alt="alt text" width="600"/>

1. API **Lifecycle** is not standard feature on API:m platform.

- Example here. IBM API Connect does support **Lifecycle** management. This whole process is supported by **API manager**.

<img src="productivity.JPG" alt="alt text" width="600"/>

1. These should be easily accessible trough **Developer Portal** 

<img src="productivity2.JPG" alt="alt text" width="600"/>

1. There is different specification for creating API:s(Swagger) or for example **.RAML**.
2. We want write policies not to code itself, rather to the **.XML** or **JSON** or some other language.
3. If these wont be enough, there is extensible languages.

<img src="exampleMuleSoft.JPG" alt="alt text" width="600"/>

1. Paste **.RAML**  for creating API in **2.**.

<img src="apiGeeExample.JPG" alt="alt text" width="600"/>

- Demo about applying policies. We are going add **Basic Authentication** policy.

<img src="apiGeeAplyingBasicAuth.JPG" alt="alt text" width="600"/>

- You can add authentication in platform easily. 

<img src="summary.JPG" alt="alt text" width="600"/>

# 55. API Developer Portal

<img src="devloperPortal.JPG" alt="alt text" width="600"/>

- Developer portals are one stop for developer.

<img src="apiDocumentation.JPG" alt="alt text" width="600"/>

1. For external document you need link to **external** element.

- You can try out the Swagger API inside documentation.

<img src="manualProviosing.JPG" alt="alt text" width="600"/>

1. Asking for access for **API** trough some mean.
2. API owned checks the policy. 

- This works on small or private team!

<img src="selfProvisioning.JPG" alt="alt text" width="600"/>

1. App developer logs in dev portal.
2. App developer makes request for access.
3. Key/Secret is auto generated and its shared with app developer at portal.
4. Other way is trough manual also. This is check **trough policy**.

- **Best approach** is to use **Self Service** + Auto approved.

<img src="provisioningPractives.JPG" alt="alt text" width="600"/>

- Registering to web page for API registration.

- API Management Platform gives access for **provisioning** for API. Like **apigee**.
    - You can set manual or automatic provisioning.
- Benefits for API Management Platform. Runtime and Dev portals are integrated.

- Below example from **apigee**.

<img src="apigee.JPG" alt="alt text" width="600"/>

1. Approval will be automatic or Manual.
2. Visible to.

<img src="suppport.JPG" alt="alt text" width="600"/>

1. You may need some ticketing system.
2. For API that are outside of organization, you may need provide these.

<img src="summary2.JPG" alt="alt text" width="600"/>

# 56. API Security Management

- Public data.

<img src="keySecretManagement.JPG" alt="alt text" width="600"/>

1. All data should have minimal security.
2. For using minimal security comes with benefit. Easier to add logging.

<br>

<img src="keySecretManagement2.JPG" alt="alt text" width="600"/>

- **Key/Secret** management is not trivial implement.

<img src="Oatuth2.JPG" alt="alt text" width="600"/>

1. **You** should implement **OAuth2.0** in you API CODE!
    - Instead you should get **off the shelve OAuth2**.
2. This will be connected to LDAP and this server will take care of all of this.

- These are most popular which is targeted to API.

<img src="functionalAttacks.JPG" alt="alt text" width="600"/>

1. Create scenario which mimics functional attacks.
    - Functional attacks on API.

<img src="apigeeHasProxyProtection.JPG" alt="alt text" width="600"/>

1. In **Apigee** you can add following proxy protections.

<br>

<img src="APIinfraStructure.JPG" alt="alt text" width="600"/>

1. Define proxy that connects to API implantation.
2. Polices are applied to proxy.

#### Some practices for secure API

<img src="APIsecurityPractice.JPG" alt="alt text" width="600"/>

<br>

<img src="summary3.JPG" alt="alt text" width="600"/>

# 57. API Traffic Management

<br>

<img src="TrafficManagement.JPG" alt="alt text" width="600"/>

1. Three main reason why API provider should **manage the traffic**.

<img src="trafficManagementExplained.JPG" alt="alt text" width="600"/>

1. Response time from database.
2. There will be bug in application.
3. End user response time for another customer will suffer to **5 secs**.

- We need to prevent from such happening for other our customer. Application should not suffer from **one misbehaving application**.
    - Use **Response time consistency**.

<img src="trafficManagementExplained2.JPG" alt="alt text" width="600"/>

1. Is API response under 1 seconds
2. How check if client is making 10,00 per day.

<img src="trafficManagementExplained3.JPG" alt="alt text" width="600"/>

1. Traffic management call, should be implement on edge of network. If not done this can be affecting internal usage of **API**. 
    - In case of DDOS attack.

2. This can be done using throttling or blocking requests.

<img src="TrafficManagementPolicyes.JPG" alt="alt text" width="600"/>

1. Traffic policies can be applied to the proxy.
    - These can be **Quata**, **Rate Limiting** and **Spike Arrest**.

<img src="quota.JPG" alt="alt text" width="600"/>

1. Maximum number of calls per unit time. Application can make to **API**. 
    - All public API today defines maximum calls.
2. There is no **Quata** in internal usage.
3. Externals **Quatfa** is 350 calls/Hour.

<img src="quataPerDay.JPG" alt="alt text" width="600"/>

1. You can see for this account **Quata** 5000 per day.

- [Quata example](https://github.com/acloudfan/REST-API-Course-API-Management)

- Example setting **Quata** in Apigee. 

<img src="settingQuataForApigee.JPG" alt="alt text" width="600"/>

<br>

- With **Rate Limiting** we can limit **concurrent** connections to API.

<img src="rateLimiting.JPG" alt="alt text" width="600"/>

1. To network we can make 100 concurrent calls/sec. Se we need to rate limit this on to "**20 concurrent calls/sec**" to each of these applications.

- Example in **Walmart Open API**.

<img src="callsPerSecond.JPG" alt="alt text" width="600"/>

1. Calls per second is limited to 5.

- **Spike Arrest** prevents calls from some mark reaching backend.

<img src="SpikeArrest.JPG" alt="alt text" width="600"/>

1. **Spike Arrest** policy configured

<img src="SpikeArrestConfiguredInApigee.JPG" alt="alt text" width="600"/>

<br>

<img src="summar4.JPG" alt="alt text" width="600"/>

# 58. API Analytics

<img src="whyApiAnalytics.JPG" alt="alt text" width="500"/>

1. You see uses of API:s
2. You can catch errors from you API:s
3. You can understand threads/attacks better for preventing these kind of faults.
4. **Proxies** can catch interning data from API.

<img src="analytics.JPG" alt="alt text" width="500"/>

- Two categories for Analytics.

1. Metrics, error rate, response rate ... etc.
2. Visibility.
    - Into usage of API.
    - Into Transactions.

<img src="metrics.JPG" alt="alt text" width="500"/>

1. You can get following metrics form your api from this category. Example **average response time**.
2. Error rates. **API errors**.
3. **SLA** If you are **achieving promised SLA rates**.

<img src="visibility.JPG" alt="alt text" width="500"/>

1. Who is the the most poplar developer using your API.
2. **Region based** analytics from which region API is going invoked.
3. From **which device** the API is invoked.
4. This is very specific feature, not all are supporting this one.
    - These analytics need to build into **proxy**.

- All platform support analytics, but its different how they implement their analytics.

<img src="summary4.JPG" alt="alt text" width="500"/>

# 59. API Product and API Monetization

<img src="apiProduct.JPG" alt="alt text" width="500"/>

- You need to treat API like product, to sell it as product.

- There is two ways to get revenue from API. **API Monetization**.

<img src="revenue.JPG" alt="alt text" width="500"/>

1. They charges directly for using their API:s.s
2. Revenue is collected when their product is advertised or sold in their platform.

- Different monetization models.

<img src="monotization.JPG" alt="alt text" width="500"/>

<br>

<img src="monotizationMenu.JPG" alt="alt text" width="500"/>

<br>

<img src="summary5.JPG" alt="alt text" width="500"/>
