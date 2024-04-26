
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
 *         <element name="sIp" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "sIp"
})
@XmlRootElement(name = "GetIpLocation_2_0")
public class GetIpLocation20 {

    protected String sIp;

    /**
     * Gets the value of the sIp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSIp() {
        return sIp;
    }

    /**
     * Sets the value of the sIp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSIp(String value) {
        this.sIp = value;
    }

}
