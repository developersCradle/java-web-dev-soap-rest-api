# Section 06 - REST API Handling Change - Versioning. 

REST API Handling Change - Versioning.

# What I Learned.

# Handling changes to API.

<p align="center">
    <img src="apiChanges.JPG" alt="alt text" width="500"/>
</p>

1. Changing API will **impact external** user as well as **internal users**. 

<p align="center">
    <img src="originalAPI.JPG" alt="alt text" width="500"/>
</p>

1. When calling original API `/deals` user get back array of results.

<p align="center">
    <img src="nonBearkingChange.JPG" alt="alt text" width="500"/>
</p>

1. Since this is changed, this will not brake API. **Non Breaking Change**.

<p align="center">
    <img src="breakingChange.JPG" alt="alt text" width="500"/>
</p>


- This code change will break the API. **Breaking Change**.

1. We need to change code with this change.

<p align="center">
    <img src="commonAPIchanges.JPG" alt="alt text" width="500"/>
</p>

1. These changes will not **break** application.
2. These changes will make **Breaking Change**. 

<p align="center">
    <img src="backEndChallange.JPG" alt="alt text" width="500"/>
</p>

1. Back end tech also can also be **Breaking** or **Non-breaking**.
2. If database field **length** changes to **more characters**. API developer can just change restrictions for API.
3. Application will need to add extra variable.

<p align="center">
    <img src="versioningAPI.JPG" alt="alt text" width="500"/>
</p>

1.  API should be changed once per **6** months, if needed.

<p align="center">
    <img src="summary.JPG" alt="alt text" width="500"/>
</p>

# Versioning the API.

<p align="center">
    <img src="restAPIversioning.JPG" alt="alt text" width="500"/>
</p>

1. This is different than source versioning.

<p align="center">
    <img src="consuming.JPG" alt="alt text" width="500"/>
</p>

2. API designer needs to decide on these aspects.

- Consumer should able to connect any version of these API:s.
    - There is **three ways** to do these.
    - **HTTP Header**, **Query parameter** and **Url Path**

> [!IMPORTANT]
> The **URL** path parameter is far best versioning **at the moment**.

<p align="center">
    <img src="versioningSpesify.JPG" alt="alt text" width="700"/>
</p>

1. This is the **most popular** way to specify versioning!

- There are other versioning formats.

<p align="center">
    <img src="versioExample.JPG" alt="alt text" width="500"/>
</p>

- In here we specify with **URL Path** with **Date**.

<p align="center">
    <img src="versioExample2.JPG" alt="alt text" width="500"/>
</p>

- In here we specify with **Query Parameter** and **Date**.

<br>

- When doing query we provide **Date** as **Query Parameter**. 

<p align="center">
    <img src="versioExample2second.JPG" alt="alt text" width="500"/>
</p>

<br>


<p align="center">
    <img src="urlVersion.JPG" alt="alt text" width="500"/>
</p>

1. You can see the versioning.

- **URL Path** and **Number** with The Movie Db.

- Other example.

<p align="center">
    <img src="versionExample.JPG" alt="alt text" width="500"/>
</p>

<br>

<p align="center">
    <img src="summary2.JPG" alt="alt text" width="500"/>
</p>

# Walk through : ACME API Versioning.

<br>

<p align="center">
    <img src="apiVersioning1.JPG" alt="alt text" width="500"/>
</p>

1. **v1** and **v2** versioning is being used.

<p align="center">
    <img src="apiChangeStrategy.JPG" alt="alt text" width="500"/>
</p>

1.  When new version of API is released, old one is marked as **deprecated**.
    - No more **new subscription** to the deprecated one by new developers.
    - New users are given access to new version only.
2. In **Q3** version-1 is deprecated.
3. Developer can choose multiple version of API.

<p align="center">
    <img src="keypoints.JPG" alt="alt text" width="500"/>
</p>

<br>

<p align="center">
    <img src="summary3.JPG" alt="alt text"  width="500"/>
</p>

