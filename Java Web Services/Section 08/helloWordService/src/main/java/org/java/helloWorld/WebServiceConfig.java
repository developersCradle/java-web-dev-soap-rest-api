package org.java.helloWorld;

import jakarta.xml.ws.Endpoint;
import org.apache.cxf.Bus;
import org.apache.cxf.jaxws.EndpointImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

@Configuration
public class WebServiceConfig {
    //Todo dokumentoi tää
    @Autowired
    private Bus bus;

    public Endpoint endpoint(){
        EndpointImpl endpoint = new EndpointImpl(bus, new HelloWs());
        endpoint.publish("/hello");
        return endpoint;
    }
}
