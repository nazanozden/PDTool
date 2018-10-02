//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-257 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.09.30 at 05:10:56 PM EDT 
//


package com.tibco.ps.deploytool.modules;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;


/**
 * <p>Java class for TriggerConditionSystemEventValidationList.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TriggerConditionSystemEventValidationList">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="CacheRefreshFailure"/>
 *     &lt;enumeration value="CacheRefreshSuccess"/>
 *     &lt;enumeration value="DataSourceDown"/>
 *     &lt;enumeration value="DataSourceUp"/>
 *     &lt;enumeration value="RequestFailure"/>
 *     &lt;enumeration value="RequestInactive"/>
 *     &lt;enumeration value="RequestRunForTooLong"/>
 *     &lt;enumeration value="ResourceLock"/>
 *     &lt;enumeration value="ResourceUnlock"/>
 *     &lt;enumeration value="RequestsSpike"/>
 *     &lt;enumeration value="ErrorsSpike"/>
 *     &lt;enumeration value="FailedLoginSpike"/>
 *     &lt;enumeration value="StatisticsGatheringFailure"/>
 *     &lt;enumeration value="ServerStart"/>
 *     &lt;enumeration value="ServerStop"/>
 *     &lt;enumeration value="TransactionFailure"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlEnum
public enum TriggerConditionSystemEventValidationList {

    @XmlEnumValue("CacheRefreshFailure")
    CACHE_REFRESH_FAILURE("CacheRefreshFailure"),
    @XmlEnumValue("CacheRefreshSuccess")
    CACHE_REFRESH_SUCCESS("CacheRefreshSuccess"),
    @XmlEnumValue("DataSourceDown")
    DATA_SOURCE_DOWN("DataSourceDown"),
    @XmlEnumValue("DataSourceUp")
    DATA_SOURCE_UP("DataSourceUp"),
    @XmlEnumValue("RequestFailure")
    REQUEST_FAILURE("RequestFailure"),
    @XmlEnumValue("RequestInactive")
    REQUEST_INACTIVE("RequestInactive"),
    @XmlEnumValue("RequestRunForTooLong")
    REQUEST_RUN_FOR_TOO_LONG("RequestRunForTooLong"),
    @XmlEnumValue("ResourceLock")
    RESOURCE_LOCK("ResourceLock"),
    @XmlEnumValue("ResourceUnlock")
    RESOURCE_UNLOCK("ResourceUnlock"),
    @XmlEnumValue("RequestsSpike")
    REQUESTS_SPIKE("RequestsSpike"),
    @XmlEnumValue("ErrorsSpike")
    ERRORS_SPIKE("ErrorsSpike"),
    @XmlEnumValue("FailedLoginSpike")
    FAILED_LOGIN_SPIKE("FailedLoginSpike"),
    @XmlEnumValue("StatisticsGatheringFailure")
    STATISTICS_GATHERING_FAILURE("StatisticsGatheringFailure"),
    @XmlEnumValue("ServerStart")
    SERVER_START("ServerStart"),
    @XmlEnumValue("ServerStop")
    SERVER_STOP("ServerStop"),
    @XmlEnumValue("TransactionFailure")
    TRANSACTION_FAILURE("TransactionFailure");
    private final String value;

    TriggerConditionSystemEventValidationList(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TriggerConditionSystemEventValidationList fromValue(String v) {
        for (TriggerConditionSystemEventValidationList c: TriggerConditionSystemEventValidationList.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
