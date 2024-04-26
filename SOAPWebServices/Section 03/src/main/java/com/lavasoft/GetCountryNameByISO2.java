
package com.lavasoft;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType>
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="iso2Code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "iso2Code"
})
@XmlRootElement(name = "GetCountryNameByISO2")
public class GetCountryNameByISO2 {

    protected String iso2Code;

    /**
     * Gets the value of the iso2Code property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIso2Code() {
        return iso2Code;
    }

    /**
     * Sets the value of the iso2Code property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIso2Code(String value) {
        this.iso2Code = value;
    }

}
