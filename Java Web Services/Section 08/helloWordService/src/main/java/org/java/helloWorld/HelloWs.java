package org.java.helloWorld;

import jakarta.jws.WebMethod;
import jakarta.jws.WebService;

@WebService
public class HelloWs {

    @WebMethod
    public String hello()
    {
        return "Hello";
    }
}
