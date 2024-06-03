# Section 5: REST API Error Handling Patterns

# What I Learned

# 29. REST API Error Handling Practices

<img src="application erros.JPG" alt="alt text" width="400"/>

1. Client can have own error code format.
2. This code format needs to be **Standardized** across API.

<img src="APIerror.JPG" alt="alt text" width="400"/>

1. Client send request to server.
2. Gets back response.
3. API implementation how error is sended to back to REST client.

- This one option to implement **Header** information.

<img src="errorResponses.JPG" alt="alt text" width="400"/>

2. This can have **Custom Header** information about error.

<br>

<img src="exampleCanBeSeenHere.JPG" alt="alt text" width="400"/>

1. Example API using additional field to store error message. 

<img src="errorResponsesSecond.JPG" alt="alt text" width="400"/>

1. Older version of fb used to use this.

- This one does not ailing HTTP standard so well. Should not be used!

<img src="thirdWay.JPG" alt="third way" width="400"/>

1. Error information is in **Header + Body**.
2. Error code is key factor here, is the **message in body** or is the **error**.

- This is preferred approach of most nowadays!

<img src="allHTTPcodes.JPG" alt="third way" width="400"/>

<br>

<img src="whyShouldIlimit.JPG" alt="third way" width="400"/>

1. Development team should use API codes **consistently!**

- Here high end example. 

<img src="expedia.JPG" alt="expedia" width="400"/>

- Here low end example.

<img src="tomcat.JPG" alt="expedia" width="400"/>

<br>

<img src="summary.JPG" alt="summary" width="400"/>

# 30. Application Error Handling Patterns

<img src="errorLogs.JPG" alt="error logs" width="400"/>

- You could want to save error logs into db.
    - This common practice.

<img src="errorDesign.JPG" alt="error logs" width="400"/>

1. Developers needs to see what is wrong? **"Actionable"**. 
    - Example. API return **required field.** So developer can take action on it!
2. If you uses **ERROR**, use consistent style.

- Some way to make error meaningful.

<img src="hintsForErrorMessages.JPG" alt="summary" width="400"/>

<br>

<img src="apiStatusCode.JPG" alt="summary" width="400"/>

- Like **HTTP status code**, API:s should have their **own status codes**!
    - These can be used by API clients.

- User case for Error.

<img src="erroSturctureInOurCase.JPG" alt="summary" width="400"/>

- Error List, in our case.

<img src="errorList.JPG" alt="summary" width="400"/>

- Some errors here.

<img src="errorListExample.JPG" alt="summary" width="400"/>

- Example case from PayPal.

<img src="examplePayPal.JPG" alt="summary" width="400"/>

- **Response Envelope** is schema for error messages.

<img src="responseEnvlope.JPG" alt="summary" width="400"/>

- In this there is **two** parts.

- If **Status** is Error
    - There is no payload.

- Expedia uses this.

<img src="summaryError.JPG" alt="summary" width="400"/>
