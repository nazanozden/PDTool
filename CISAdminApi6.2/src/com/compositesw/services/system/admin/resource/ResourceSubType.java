
package com.compositesw.services.system.admin.resource;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for resourceSubType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="resourceSubType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NONE"/>
 *     &lt;enumeration value="CATALOG_CONTAINER"/>
 *     &lt;enumeration value="CONNECTOR_CONTAINER"/>
 *     &lt;enumeration value="DIRECTORY_CONTAINER"/>
 *     &lt;enumeration value="FOLDER_CONTAINER"/>
 *     &lt;enumeration value="OPERATIONS_CONTAINER"/>
 *     &lt;enumeration value="PORT_CONTAINER"/>
 *     &lt;enumeration value="SCHEMA_CONTAINER"/>
 *     &lt;enumeration value="SERVICE_CONTAINER"/>
 *     &lt;enumeration value="PS_QUERY_ARCHIVE_CONTAINER"/>
 *     &lt;enumeration value="PS_QUERY_CONTAINER"/>
 *     &lt;enumeration value="PS_QUERY_NORMAL_CONTAINER"/>
 *     &lt;enumeration value="PS_QUERY_NORMAL_GROUP_CONTAINER"/>
 *     &lt;enumeration value="PS_QUERY_PROGRESS_CONTAINER"/>
 *     &lt;enumeration value="PS_QUERY_ROLE_CONTAINER"/>
 *     &lt;enumeration value="PS_QUERY_SEARCH_CONTAINER"/>
 *     &lt;enumeration value="PS_QUERY_VIEW_CONTAINER"/>
 *     &lt;enumeration value="PSOFT_DATASOURCE_CONTAINER"/>
 *     &lt;enumeration value="SAP_AQ_AREA_CONTAINER"/>
 *     &lt;enumeration value="SAP_AQ_CONTAINER"/>
 *     &lt;enumeration value="SAP_BAPI_CONTAINER"/>
 *     &lt;enumeration value="SAP_BAPI_APP_CONTAINER"/>
 *     &lt;enumeration value="SAP_BW_INFOPROVIDER_FOLDER_CONTAINER"/>
 *     &lt;enumeration value="SAP_BW_INFOPROVIDER_OBJECT_FOLDER_CONTAINER"/>
 *     &lt;enumeration value="SAP_BW_HIERARCHIES_FOLDER_CONTAINER"/>
 *     &lt;enumeration value="SAP_IS_CONTAINER"/>
 *     &lt;enumeration value="SAP_RFC_CONTAINER"/>
 *     &lt;enumeration value="SAP_RFC_DEVCLASS_CONTAINER"/>
 *     &lt;enumeration value="SAP_RT_CONTAINER"/>
 *     &lt;enumeration value="SAP_RT_0_CONTAINER"/>
 *     &lt;enumeration value="SIEBEL_BUSOBJ_CONTAINER"/>
 *     &lt;enumeration value="SIEBEL_BUSSVC_CONTAINER"/>
 *     &lt;enumeration value="COMPOSITE_WEB_SERVICE"/>
 *     &lt;enumeration value="FILE_DATA_SOURCE"/>
 *     &lt;enumeration value="RELATIONAL_DATA_SOURCE"/>
 *     &lt;enumeration value="WSDL_DATA_SOURCE"/>
 *     &lt;enumeration value="XML_FILE_DATA_SOURCE"/>
 *     &lt;enumeration value="XML_HTTP_DATA_SOURCE"/>
 *     &lt;enumeration value="REST_DATA_SOURCE"/>
 *     &lt;enumeration value="SQL_DEFINITION_SET"/>
 *     &lt;enumeration value="WSDL_DEFINITION_SET"/>
 *     &lt;enumeration value="XML_SCHEMA_DEFINITION_SET"/>
 *     &lt;enumeration value="SCDL_DEFINITION_SET"/>
 *     &lt;enumeration value="ABSTRACT_WSDL_DEFINITION_SET"/>
 *     &lt;enumeration value="DATABASE_PROCEDURE"/>
 *     &lt;enumeration value="EXTERNAL_SQL_PROCEDURE"/>
 *     &lt;enumeration value="JAVA_PROCEDURE"/>
 *     &lt;enumeration value="NATIVE_FUNCTION"/>
 *     &lt;enumeration value="OPERATION_PROCEDURE"/>
 *     &lt;enumeration value="SQL_SCRIPT_PROCEDURE"/>
 *     &lt;enumeration value="XQUERY_PROCEDURE"/>
 *     &lt;enumeration value="TRANSFORM_PROCEDURE"/>
 *     &lt;enumeration value="BASIC_TRANSFORM_PROCEDURE"/>
 *     &lt;enumeration value="STREAM_TRANSFORM_PROCEDURE"/>
 *     &lt;enumeration value="XQUERY_TRANSFORM_PROCEDURE"/>
 *     &lt;enumeration value="XSLT_TRANSFORM_PROCEDURE"/>
 *     &lt;enumeration value="DATABASE_TABLE"/>
 *     &lt;enumeration value="DELIMITED_FILE_TABLE"/>
 *     &lt;enumeration value="EXCEL_NON_ODBC_POI"/>
 *     &lt;enumeration value="SQL_TABLE"/>
 *     &lt;enumeration value="SYSTEM_TABLE"/>
 *     &lt;enumeration value="SAP_RT_TABLE"/>
 *     &lt;enumeration value="SAP_RFC_TABLE"/>
 *     &lt;enumeration value="SAP_AQ_QUERY_TABLE"/>
 *     &lt;enumeration value="SAP_INFOSET_QUERY_TABLE"/>
 *     &lt;enumeration value="SIEBEL_BUSCOMP_TABLE"/>
 *     &lt;enumeration value="XML_FILE_TREE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "resourceSubType")
@XmlEnum
public enum ResourceSubType {

    NONE,
    CATALOG_CONTAINER,
    CONNECTOR_CONTAINER,
    DIRECTORY_CONTAINER,
    FOLDER_CONTAINER,
    OPERATIONS_CONTAINER,
    PORT_CONTAINER,
    SCHEMA_CONTAINER,
    SERVICE_CONTAINER,
    PS_QUERY_ARCHIVE_CONTAINER,
    PS_QUERY_CONTAINER,
    PS_QUERY_NORMAL_CONTAINER,
    PS_QUERY_NORMAL_GROUP_CONTAINER,
    PS_QUERY_PROGRESS_CONTAINER,
    PS_QUERY_ROLE_CONTAINER,
    PS_QUERY_SEARCH_CONTAINER,
    PS_QUERY_VIEW_CONTAINER,
    PSOFT_DATASOURCE_CONTAINER,
    SAP_AQ_AREA_CONTAINER,
    SAP_AQ_CONTAINER,
    SAP_BAPI_CONTAINER,
    SAP_BAPI_APP_CONTAINER,
    SAP_BW_INFOPROVIDER_FOLDER_CONTAINER,
    SAP_BW_INFOPROVIDER_OBJECT_FOLDER_CONTAINER,
    SAP_BW_HIERARCHIES_FOLDER_CONTAINER,
    SAP_IS_CONTAINER,
    SAP_RFC_CONTAINER,
    SAP_RFC_DEVCLASS_CONTAINER,
    SAP_RT_CONTAINER,
    SAP_RT_0_CONTAINER,
    SIEBEL_BUSOBJ_CONTAINER,
    SIEBEL_BUSSVC_CONTAINER,
    COMPOSITE_WEB_SERVICE,
    FILE_DATA_SOURCE,
    RELATIONAL_DATA_SOURCE,
    WSDL_DATA_SOURCE,
    XML_FILE_DATA_SOURCE,
    XML_HTTP_DATA_SOURCE,
    REST_DATA_SOURCE,
    SQL_DEFINITION_SET,
    WSDL_DEFINITION_SET,
    XML_SCHEMA_DEFINITION_SET,
    SCDL_DEFINITION_SET,
    ABSTRACT_WSDL_DEFINITION_SET,
    DATABASE_PROCEDURE,
    EXTERNAL_SQL_PROCEDURE,
    JAVA_PROCEDURE,
    NATIVE_FUNCTION,
    OPERATION_PROCEDURE,
    SQL_SCRIPT_PROCEDURE,
    XQUERY_PROCEDURE,
    TRANSFORM_PROCEDURE,
    BASIC_TRANSFORM_PROCEDURE,
    STREAM_TRANSFORM_PROCEDURE,
    XQUERY_TRANSFORM_PROCEDURE,
    XSLT_TRANSFORM_PROCEDURE,
    DATABASE_TABLE,
    DELIMITED_FILE_TABLE,
    EXCEL_NON_ODBC_POI,
    SQL_TABLE,
    SYSTEM_TABLE,
    SAP_RT_TABLE,
    SAP_RFC_TABLE,
    SAP_AQ_QUERY_TABLE,
    SAP_INFOSET_QUERY_TABLE,
    SIEBEL_BUSCOMP_TABLE,
    XML_FILE_TREE;

    public String value() {
        return name();
    }

    public static ResourceSubType fromValue(String v) {
        return valueOf(v);
    }

}
