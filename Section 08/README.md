# Section 08 - REST API Response Data Handling Patterns

# What I Learned

<img src="endPointChallange.JPG" alt="alt text" width="400"/>

1. Exposing REST API, same can be accessed thought website or mobile application 
2. Same data will have different amount space to show 

<img src="BestPractice.JPG" alt="alt text" width="400"/>

1. **REST client** is in control of **granularity** of the data.    
    - **x, y, z** will be returned form REST Server API 

## Partial response

Partial Responses gives benefits: (**Example mobile applications**)
    - Better performance
    - Optimal use of CPU/Memory
    - Low battery usage
- We can make **common endpoint** for all REST clients


- In API implantation, It's needed to support **partial responses**

<img src="supportPartialResponses.JPG" alt="alt text" width="400"/>

1. One way is to write **Partial Response Support**

2. Or use external things like **GraphQL**

<img src="fieldSpesification.JPG" alt="alt text" width="400"/>

- When making call to API   
    - There are two ways to call them. With **Projections** or with **Filters**

<img src="fieldProjections.JPG" alt="alt text" width="400"/>


1. LinkedIn API consumer requires for **Field Projections**
2. Only **firstname** and **lastname** will be returned to API consumer

- There special rules for these **Projections**

[LinkedIn Projections](https://learn.microsoft.com/en-us/linkedin/shared/api-guide/concepts/projections)

<img src="exampleOfFieldProjection.JPG" alt="alt text" width="400"/>

1. Example in fields Field Projections.
    - Return me **id** and **beeb** of object **baz** fields

<img src="fieldFilters.JPG" alt="alt text" width="400"/>

- Example MeetUp service

- Depending on resource **expression** based query work for you or whether **field filters** based query work for you!

### Summary

- API usually return full response to client

- If supports partial responses
    - API return only interested fields for **API consumer**
    - Better performance for Mobile Applications
- This can be achieved by using **Field Projections** and **Filters**

<hr>

<img src="caseStudyPartialResponses.JPG" alt="alt text" width="400"/>

1. Case study has quite big data
2. Query parameters will be used for mobile application

<hr>

<img src="whyPagination.JPG" alt="alt text" width="400"/>

1. **Pagination** gives control of responses, like **partial responses**. If API supports **pagination** app developers gets decide how many rows it will receive.
2. Website has more screen to view, it will want to get more rows.
3. Mobile in other hand has less space, it will only want what is needed.

<img src="pagination.JPG" alt="alt text" width="400"/>

1. App developer decides to return all **pages**
2. App developer decides to **return only page 2** 
    - Number of rows are restricted to page.

- Benefits for using pagination.
    - CPU, Memory, Bandwidth
    - Common API version for all consumers
        - Multiple user cases, devices

<img src="designOptions.JPG" alt="alt text" width="400"/>

- **Three** Common ways REST API:s implements pagination

 1. Most popular nowadays pagination way
 2. The Least popular nowadays pagination way
 
 ## Cursors for pagination

 - If you want to go thought, in more detail. Check documentation from Facebook. 

<img src="cursorDefination.JPG" alt="alt text" width="400"/>

1. Cursor pagination is considered to e **most efficient**

2. Cursor is random string pointing to one record

<img src="cursorPaginationReturned.JPG" alt="alt text" width="400"/>

1. **Page data**, page 2
2. Some **metadata** which points to next and previous page 
3. HTTP Header can also hold metadata

<img src="offsetBasedPagination.JPG" alt="alt text" width="400"/>

3. Most common for pagination

- Typical query example `GET /../hotels?offset=6&limit=5` 

1. From **Offset** of 6 
2. **Limit** of 5 will be returned, therefore from rows **6 - 10** will be returned 

<img src="usageOfPagination.JPG" alt="alt text" width="400"/>

1. Semantics can be little different
    - Idea is the same

<img src="httpLinkHeader.JPG" alt="alt text" width="400"/>

- If you want read more read `RFC5988`

- **Paginated data** will be returned with **HTTP Header** is having such fields

1. Link to next page
2. Link to the last page

<img src="summary.JPG" alt="alt text" width="400"/>
