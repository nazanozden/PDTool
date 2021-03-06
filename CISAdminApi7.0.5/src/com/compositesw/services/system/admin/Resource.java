
package com.compositesw.services.system.admin;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.1-b01-
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "resource", targetNamespace = "http://www.compositesw.com/services/system/admin", wsdlLocation = "file:/C:/MyFiles/git/ASAssets_GIT_Repo/PDTool/CISAdminApi7.0.5/wsdl/CisAdminApi.wsdl")
public class Resource
    extends Service
{

    private final static URL RESOURCE_WSDL_LOCATION;
    private final static WebServiceException RESOURCE_EXCEPTION;
    private final static QName RESOURCE_QNAME = new QName("http://www.compositesw.com/services/system/admin", "resource");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("file:/C:/MyFiles/git/ASAssets_GIT_Repo/PDTool/CISAdminApi7.0.5/wsdl/CisAdminApi.wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        RESOURCE_WSDL_LOCATION = url;
        RESOURCE_EXCEPTION = e;
    }

    public Resource() {
        super(__getWsdlLocation(), RESOURCE_QNAME);
    }

    public Resource(WebServiceFeature... features) {
        super(__getWsdlLocation(), RESOURCE_QNAME, features);
    }

    public Resource(URL wsdlLocation) {
        super(wsdlLocation, RESOURCE_QNAME);
    }

    public Resource(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, RESOURCE_QNAME, features);
    }

    public Resource(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public Resource(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns ResourcePortType
     */
    @WebEndpoint(name = "resourcePort")
    public ResourcePortType getResourcePort() {
        return super.getPort(new QName("http://www.compositesw.com/services/system/admin", "resourcePort"), ResourcePortType.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ResourcePortType
     */
    @WebEndpoint(name = "resourcePort")
    public ResourcePortType getResourcePort(WebServiceFeature... features) {
        return super.getPort(new QName("http://www.compositesw.com/services/system/admin", "resourcePort"), ResourcePortType.class, features);
    }

    private static URL __getWsdlLocation() {
        if (RESOURCE_EXCEPTION!= null) {
            throw RESOURCE_EXCEPTION;
        }
        return RESOURCE_WSDL_LOCATION;
    }

}
