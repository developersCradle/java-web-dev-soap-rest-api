package org.java.jaxWSjaxB;

import com.bharatthippireddy.patient.Patient;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.StringWriter;

public class JAXBDemo {

    public static void main(String[] args){

        // We need to tell JAXB entry point.
        try {
            JAXBContext context = JAXBContext.newInstance(Patient.class);
            Marshaller marshaller = context.createMarshaller();

            Patient patient = new Patient();
            patient.setId(123);
            patient.setName("Some random name.");

            StringWriter writer = new StringWriter();
            marshaller.marshal(patient, writer);

            
            System.out.println(writer.toString());


        } catch (JAXBException e) {
            throw new RuntimeException(e);
        }


    }
}
