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
 * 			Datasource Keystore Attribute Type: provides the ability to import a certificate keystore [jks|pkcs12] into a datasource keystore attribute.
 * 			If the keystore attribute exists, then this information will replace the existing.
 * 			If the keystore attribute does not exist, then a new keystore attribute will be created.
 * 		
 * 
 * <p>Java class for DatasourceKeystoreAttributeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DatasourceKeystoreAttributeType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="keystoreFilePath" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="keystoreType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="keystorePassword" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DatasourceKeystoreAttributeType", propOrder = {
    "keystoreFilePath",
    "keystoreType",
    "keystorePassword"
})
public class DatasourceKeystoreAttributeType {

    @XmlElement(required = true)
    protected String keystoreFilePath;
    @XmlElement(required = true)
    protected String keystoreType;
    @XmlElement(required = true)
    protected String keystorePassword;

    /**
     * Gets the value of the keystoreFilePath property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKeystoreFilePath() {
        return keystoreFilePath;
    }

    /**
     * Sets the value of the keystoreFilePath property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKeystoreFilePath(String value) {
        this.keystoreFilePath = value;
    }

    /**
     * Gets the value of the keystoreType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKeystoreType() {
        return keystoreType;
    }

    /**
     * Sets the value of the keystoreType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKeystoreType(String value) {
        this.keystoreType = value;
    }

    /**
     * Gets the value of the keystorePassword property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKeystorePassword() {
        return keystorePassword;
    }

    /**
     * Sets the value of the keystorePassword property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKeystorePassword(String value) {
        this.keystorePassword = value;
    }

}
