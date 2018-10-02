//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-257 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.09.30 at 05:10:56 PM EDT 
//


package com.tibco.ps.deploytool.modules;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				A grouping of columns related to the resource owner.
 * 			
 * 
 * <p>Java class for ResourceOwnerType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ResourceOwnerType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="resourceOwnerApply" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="resourceOwnerName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="resourceOwnerDomain" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="resourceOwnerRecurse" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResourceOwnerType", propOrder = {
    "resourceOwnerApply",
    "resourceOwnerName",
    "resourceOwnerDomain",
    "resourceOwnerRecurse"
})
public class ResourceOwnerType {

    @XmlElement(required = true)
    protected String resourceOwnerApply;
    @XmlElement(required = true)
    protected String resourceOwnerName;
    @XmlElement(required = true)
    protected String resourceOwnerDomain;
    protected String resourceOwnerRecurse;

    /**
     * Gets the value of the resourceOwnerApply property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResourceOwnerApply() {
        return resourceOwnerApply;
    }

    /**
     * Sets the value of the resourceOwnerApply property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResourceOwnerApply(String value) {
        this.resourceOwnerApply = value;
    }

    /**
     * Gets the value of the resourceOwnerName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResourceOwnerName() {
        return resourceOwnerName;
    }

    /**
     * Sets the value of the resourceOwnerName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResourceOwnerName(String value) {
        this.resourceOwnerName = value;
    }

    /**
     * Gets the value of the resourceOwnerDomain property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResourceOwnerDomain() {
        return resourceOwnerDomain;
    }

    /**
     * Sets the value of the resourceOwnerDomain property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResourceOwnerDomain(String value) {
        this.resourceOwnerDomain = value;
    }

    /**
     * Gets the value of the resourceOwnerRecurse property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResourceOwnerRecurse() {
        return resourceOwnerRecurse;
    }

    /**
     * Sets the value of the resourceOwnerRecurse property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResourceOwnerRecurse(String value) {
        this.resourceOwnerRecurse = value;
    }

}
