# Section 5: REST API Error Handling Patterns.

REST API Error Handling Patterns.

# What I Learned

# REST API Error Handling Practices.

<p align="center">
    <img src="application erros.JPG" alt="alt text" width="400"/>
</p>

1. Client can have own error code format.
2. This code format needs to be **Standardized** across API.

<p align="center">
    <img src="APIerror.JPG" alt="alt text" width="400"/>
</p>

1. Client send request to server.
2. Gets back response.
3. API implementation how error is sended to back to REST client.

- This one option to implement **Header** information.

<p align="center">
    <img src="errorResponses.JPG" alt="alt text" width="400"/>
</p>

2. This can have **Custom Header** information about error.

<br>

<p align="center">
    <img src="exampleCanBeSeenHere.JPG" alt="alt text" width="400"/>
</p>

1. Example API using additional field to store error message. 

<p align="center">
    <img src="errorResponsesSecond.JPG" alt="alt text" width="400"/>
</p>

1. Older version of fb used to use this.

- This one does not ailing HTTP standard so well. Should not be used!

<p align="center">
    <img src="thirdWay.JPG" alt="third way" width="400"/>
</p>

1. Error information is in **Header + Body**.
2. Error code is key factor here, is the **message in body** or is the **error**.

- This is preferred approach of most nowadays!

<p align="center">
    <img src="allHTTPcodes.JPG" alt="third way" width="400"/>
</p>

<br>

<p align="center">
    <img src="whyShouldIlimit.JPG" alt="third way" width="400"/>
</p>

1. Development team should use API codes **consistently!**

- Here high-end example. 

<p align="center">
    <img src="expedia.JPG" alt="expedia" width="400"/>
</p>

- Here low-end example.

<p align="center">
    <img src="tomcat.JPG" alt="expedia" width="400"/>
</p>

<br>

<p align="center">
    <img src="summary.JPG" alt="summary" width="400"/>
</p>

# Application Error Handling Patterns.

<p align="center">
    <img src="errorLogs.JPG" alt="error logs" width="400"/>
</p>

- You could want to save error logs into db.
    - This common practice.

<p align="center">
    <img src="errorDesign.JPG" alt="error logs" width="400"/>
</p>

1. Developers needs to see what is wrong? **"Actionable"**. 
    - Example. API return **required field.** So developer can take action on it!
2. If you uses **ERROR**, use consistent style.

- Some way to make error meaningful.

<p align="center">
    <img src="hintsForErrorMessages.JPG" alt="summary" width="400"/>
</p>

<br>

<p align="center">
    <img src="apiStatusCode.JPG" alt="summary" width="400"/>
</p>

- Like **HTTP status code**, API:s should have their **own status codes**!
    - These can be used by API clients.

- User case for Error.

<p align="center">
    <img src="erroSturctureInOurCase.JPG" alt="summary" width="400"/>
</p>

- Error List, in our case.

<p align="center">
    <img src="errorList.JPG" alt="summary" width="400"/>
</p>

- Some errors here.

<p align="center">
    <img src="errorListExample.JPG" alt="summary" width="400"/>
</p>

- Example case from PayPal.

<p align="center">
    <img src="examplePayPal.JPG" alt="summary" width="400"/>
</p>

- **Response Envelope** is schema for error messages.

<p align="center">
    <img src="responseEnvlope.JPG" alt="summary" width="400"/>
</p>

- In this there are **two** parts.

- If **Status** is Error
    - There is no payload.

- Expedia uses this.

<p align="center">
    <img src="summaryError.JPG" alt="summary" width="400"/>
</p>

