//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-257 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.04.07 at 07:27:56 AM EDT 
//


package com.cisco.dvbu.ps.deploytool.modules;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 					resource:conditionType=SYSTEM_EVENT, TIMER, JMS, USER_DEFINED
 * 				
 * 
 * <p>Java class for TriggerConditionChoiceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TriggerConditionChoiceType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="systemEvent" type="{http://www.dvbu.cisco.com/ps/deploytool/modules}TriggerConditionSystemEventType"/>
 *         &lt;element name="timerEvent" type="{http://www.dvbu.cisco.com/ps/deploytool/modules}TriggerConditionTimerEventType"/>
 *         &lt;element name="jmsEvent" type="{http://www.dvbu.cisco.com/ps/deploytool/modules}TriggerConditionJmsEventType"/>
 *         &lt;element name="userDefinedEvent" type="{http://www.dvbu.cisco.com/ps/deploytool/modules}TriggerConditionUserDefinedEventType"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TriggerConditionChoiceType", propOrder = {
    "systemEvent",
    "timerEvent",
    "jmsEvent",
    "userDefinedEvent"
})
public class TriggerConditionChoiceType {

    protected TriggerConditionSystemEventType systemEvent;
    protected TriggerConditionTimerEventType timerEvent;
    protected TriggerConditionJmsEventType jmsEvent;
    protected TriggerConditionUserDefinedEventType userDefinedEvent;

    /**
     * Gets the value of the systemEvent property.
     * 
     * @return
     *     possible object is
     *     {@link TriggerConditionSystemEventType }
     *     
     */
    public TriggerConditionSystemEventType getSystemEvent() {
        return systemEvent;
    }

    /**
     * Sets the value of the systemEvent property.
     * 
     * @param value
     *     allowed object is
     *     {@link TriggerConditionSystemEventType }
     *     
     */
    public void setSystemEvent(TriggerConditionSystemEventType value) {
        this.systemEvent = value;
    }

    /**
     * Gets the value of the timerEvent property.
     * 
     * @return
     *     possible object is
     *     {@link TriggerConditionTimerEventType }
     *     
     */
    public TriggerConditionTimerEventType getTimerEvent() {
        return timerEvent;
    }

    /**
     * Sets the value of the timerEvent property.
     * 
     * @param value
     *     allowed object is
     *     {@link TriggerConditionTimerEventType }
     *     
     */
    public void setTimerEvent(TriggerConditionTimerEventType value) {
        this.timerEvent = value;
    }

    /**
     * Gets the value of the jmsEvent property.
     * 
     * @return
     *     possible object is
     *     {@link TriggerConditionJmsEventType }
     *     
     */
    public TriggerConditionJmsEventType getJmsEvent() {
        return jmsEvent;
    }

    /**
     * Sets the value of the jmsEvent property.
     * 
     * @param value
     *     allowed object is
     *     {@link TriggerConditionJmsEventType }
     *     
     */
    public void setJmsEvent(TriggerConditionJmsEventType value) {
        this.jmsEvent = value;
    }

    /**
     * Gets the value of the userDefinedEvent property.
     * 
     * @return
     *     possible object is
     *     {@link TriggerConditionUserDefinedEventType }
     *     
     */
    public TriggerConditionUserDefinedEventType getUserDefinedEvent() {
        return userDefinedEvent;
    }

    /**
     * Sets the value of the userDefinedEvent property.
     * 
     * @param value
     *     allowed object is
     *     {@link TriggerConditionUserDefinedEventType }
     *     
     */
    public void setUserDefinedEvent(TriggerConditionUserDefinedEventType value) {
        this.userDefinedEvent = value;
    }

}
