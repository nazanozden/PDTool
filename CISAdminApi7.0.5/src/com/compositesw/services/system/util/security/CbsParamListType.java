
package com.compositesw.services.system.util.security;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for cbsParamListType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="cbsParamListType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cbsParam" type="{http://www.compositesw.com/services/system/util/security}cbsParamType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "cbsParamListType", propOrder = {
    "cbsParam"
})
public class CbsParamListType {

    protected List<CbsParamType> cbsParam;

    /**
     * Gets the value of the cbsParam property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cbsParam property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCbsParam().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CbsParamType }
     * 
     * 
     */
    public List<CbsParamType> getCbsParam() {
        if (cbsParam == null) {
            cbsParam = new ArrayList<CbsParamType>();
        }
        return this.cbsParam;
    }

}
