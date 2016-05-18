//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-257 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.04.07 at 07:27:56 AM EDT 
//


package com.cisco.dvbu.ps.deploytool.modules;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				Regression Security Query Type: A regression security query consists a list of queries that are used to execute security privileges.
 * 			
 * 
 * <p>Java class for RegressionSecurityQueryType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RegressionSecurityQueryType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="datasource" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="queryType">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="QUERY"/>
 *               &lt;enumeration value="PROCEDURE"/>
 *               &lt;enumeration value="WEB_SERVICE"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="query" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="procOutTypes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="wsPath" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="wsAction" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="wsEncrypt" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="yes"/>
 *               &lt;enumeration value="no"/>
 *               &lt;enumeration value="true"/>
 *               &lt;enumeration value="false"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="wsContentType" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="text/xml;charset=UTF-8"/>
 *               &lt;enumeration value="application/soap+xml;charset=UTF-8"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="resourcePath" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="resourceType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RegressionSecurityQueryType", propOrder = {
    "id",
    "datasource",
    "queryType",
    "query",
    "procOutTypes",
    "wsPath",
    "wsAction",
    "wsEncrypt",
    "wsContentType",
    "resourcePath",
    "resourceType"
})
public class RegressionSecurityQueryType {

    @XmlElement(required = true)
    protected String id;
    @XmlElement(required = true)
    protected String datasource;
    @XmlElement(required = true)
    protected String queryType;
    @XmlElement(required = true)
    protected String query;
    protected String procOutTypes;
    protected String wsPath;
    protected String wsAction;
    protected String wsEncrypt;
    protected String wsContentType;
    protected String resourcePath;
    protected String resourceType;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the datasource property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDatasource() {
        return datasource;
    }

    /**
     * Sets the value of the datasource property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDatasource(String value) {
        this.datasource = value;
    }

    /**
     * Gets the value of the queryType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQueryType() {
        return queryType;
    }

    /**
     * Sets the value of the queryType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQueryType(String value) {
        this.queryType = value;
    }

    /**
     * Gets the value of the query property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQuery() {
        return query;
    }

    /**
     * Sets the value of the query property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQuery(String value) {
        this.query = value;
    }

    /**
     * Gets the value of the procOutTypes property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProcOutTypes() {
        return procOutTypes;
    }

    /**
     * Sets the value of the procOutTypes property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProcOutTypes(String value) {
        this.procOutTypes = value;
    }

    /**
     * Gets the value of the wsPath property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWsPath() {
        return wsPath;
    }

    /**
     * Sets the value of the wsPath property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWsPath(String value) {
        this.wsPath = value;
    }

    /**
     * Gets the value of the wsAction property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWsAction() {
        return wsAction;
    }

    /**
     * Sets the value of the wsAction property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWsAction(String value) {
        this.wsAction = value;
    }

    /**
     * Gets the value of the wsEncrypt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWsEncrypt() {
        return wsEncrypt;
    }

    /**
     * Sets the value of the wsEncrypt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWsEncrypt(String value) {
        this.wsEncrypt = value;
    }

    /**
     * Gets the value of the wsContentType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWsContentType() {
        return wsContentType;
    }

    /**
     * Sets the value of the wsContentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWsContentType(String value) {
        this.wsContentType = value;
    }

    /**
     * Gets the value of the resourcePath property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResourcePath() {
        return resourcePath;
    }

    /**
     * Sets the value of the resourcePath property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResourcePath(String value) {
        this.resourcePath = value;
    }

    /**
     * Gets the value of the resourceType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResourceType() {
        return resourceType;
    }

    /**
     * Sets the value of the resourceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResourceType(String value) {
        this.resourceType = value;
    }

}
