package org.java.jaxWSjaxB;

import com.bharatthippireddy.patient.Patient;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;

public class JAXBDemo {

    public static void main(String[] args) throws JAXBException {
        JAXBContext context = JAXBContext.newInstance(Patient.class);

    }
}
