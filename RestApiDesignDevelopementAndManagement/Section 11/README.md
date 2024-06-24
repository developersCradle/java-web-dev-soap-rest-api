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
