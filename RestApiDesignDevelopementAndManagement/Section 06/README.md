# Section 06 - REST API Handling Change - Versioning 

# What I Learned

# 32. Handling changes to API

<img src="apiChanges.JPG" alt="alt text" width="500"/>

1. Changing API will **impact external** user as well as **internal users**. 

<img src="originalAPI.JPG" alt="alt text" width="500"/>

1. When calling original API `/deals` user get back array of results.

<img src="nonBearkingChange.JPG" alt="alt text" width="500"/>

1. Since this is changed, this will not brake API. **Non Breaking Change**.

<img src="breakingChange.JPG" alt="alt text" width="500"/>

- This code change will break the API. **Breaking Change**.

1. We need to change code with this change.

<img src="commonAPIchanges.JPG" alt="alt text" width="500"/>

1. These changes will not changes application.
2. These changes will make **Breaking Change**. 

<img src="backEndChallange.JPG" alt="alt text" width="500"/>

1. Back end tech also can also be **Breaking** or **Non-breaking**.
2. If database field **length** changes to more higher characters. API developer can just change restrictions to return from db.
3. Application will need to add extra variable.

<img src="versioningAPI.JPG" alt="alt text" width="500"/>

1.  API should be changed once per 6 month if needed.

<img src="summary.JPG" alt="alt text" width="500"/>

# 33. Versioning the API

<img src="restAPIversioning.JPG" alt="alt text" width="500"/>

1. This is different than source versioning.

<img src="consuming.JPG" alt="alt text" width="500"/>

2. API designer needs to decide on these aspects.

- Consumer should able to connect any version of these API:s.
    - There is **three ways** to do these.
    - **HTTP Header**, **Query parameter** and **Url Path**

<img src="versioningSpesify.JPG" alt="alt text" width="500"/>

1. This the most popular way to specify versioning!

- There is other versioning formats.

<img src="versioExample.JPG" alt="alt text" width="500"/>

- In here we specify with **URL Path** with **Date**.

<img src="versioExample2.JPG" alt="alt text" width="500"/>

- In here we specify with **Query Parameter** and **Date**.

<br>

- When doing query we provide **Date** as **Query Parameter**. 

<img src="versioExample2second.JPG" alt="alt text" width="500"/>

<br>

<img src="urlVersion.JPG" alt="alt text" width="500"/>

1. You can see the versioning.

- **URL Path** and **Number** with The Movie Db.

- Other example.

<img src="versionExample.JPG" alt="alt text" width="500"/>

<br>

<img src="summary2.JPG" alt="alt text" width="500"/>

# 34. Walk through : ACME API Versioning

<br>

<img src="apiVersioning1.JPG" alt="alt text" width="500"/>

1. **v1** and **v2** versioning is being used.

<img src="apiChangeStrategy.JPG" alt="alt text" width="500"/>

1.  When new version of API is released, old one is marked as **deprecated**.
    - No more **new subscription** to te deprecated one by new developers.
    - New users are given access to new version only.
2. in **Q3** version-1 is deprecated.
3. Developer can choose multiple version of API.

<img src="keypoints.JPG" alt="alt text" width="500"/>

<br>

<img src="summary3.JPG" alt="alt text" width="500"/>
