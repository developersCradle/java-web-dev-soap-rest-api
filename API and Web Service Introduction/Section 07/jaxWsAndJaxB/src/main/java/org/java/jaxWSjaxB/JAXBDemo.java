package org.java.jaxWSjaxB;

import javax.xml.bind.JAXBContext;

public class JAXBDemo {

    public static void main(String[] args)
    {
        JAXBContext context = JAXBContext.newInstance(Patient.class);

    }
}
