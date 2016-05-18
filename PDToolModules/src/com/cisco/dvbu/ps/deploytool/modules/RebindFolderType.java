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
 * 				Rebind Folder Type: The Rebind Folder Type provides an easy to configure interface where the user wants to rebind all 
 * 				procedures or views within the starting folder.  Only views and procedures are supported.  The rebindFromFolder is what
 * 				the resource is currently pointing to.  The rebindToFolder is where you want to rebind the resource to.  Only the target
 * 				resource need be present in the CIS for this operation to be successful.
 * 			
 * 
 * <p>Java class for RebindFolderType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RebindFolderType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="startingFolderPath" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="rebindFromFolder" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="rebindToFolder" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RebindFolderType", propOrder = {
    "id",
    "startingFolderPath",
    "rebindFromFolder",
    "rebindToFolder"
})
public class RebindFolderType {

    @XmlElement(required = true)
    protected String id;
    @XmlElement(required = true)
    protected String startingFolderPath;
    @XmlElement(required = true)
    protected String rebindFromFolder;
    @XmlElement(required = true)
    protected String rebindToFolder;

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
     * Gets the value of the startingFolderPath property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStartingFolderPath() {
        return startingFolderPath;
    }

    /**
     * Sets the value of the startingFolderPath property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStartingFolderPath(String value) {
        this.startingFolderPath = value;
    }

    /**
     * Gets the value of the rebindFromFolder property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRebindFromFolder() {
        return rebindFromFolder;
    }

    /**
     * Sets the value of the rebindFromFolder property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRebindFromFolder(String value) {
        this.rebindFromFolder = value;
    }

    /**
     * Gets the value of the rebindToFolder property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRebindToFolder() {
        return rebindToFolder;
    }

    /**
     * Sets the value of the rebindToFolder property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRebindToFolder(String value) {
        this.rebindToFolder = value;
    }

}
