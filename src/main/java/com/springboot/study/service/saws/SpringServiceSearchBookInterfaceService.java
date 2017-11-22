
package com.springboot.study.service.saws;

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
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "SpringServiceSearchBookInterfaceService", targetNamespace = "http://wsinterface.remoteservice.booking.springairlines.com/", wsdlLocation = "http://101.230.218.72:2001/AirSalesService/springairlines/remoteservice/jike?wsdl")
public class SpringServiceSearchBookInterfaceService
    extends Service
{

    private final static URL SPRINGSERVICESEARCHBOOKINTERFACESERVICE_WSDL_LOCATION;
    private final static WebServiceException SPRINGSERVICESEARCHBOOKINTERFACESERVICE_EXCEPTION;
    private final static QName SPRINGSERVICESEARCHBOOKINTERFACESERVICE_QNAME = new QName("http://wsinterface.remoteservice.booking.springairlines.com/", "SpringServiceSearchBookInterfaceService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://101.230.218.72:2001/AirSalesService/springairlines/remoteservice/jike?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        SPRINGSERVICESEARCHBOOKINTERFACESERVICE_WSDL_LOCATION = url;
        SPRINGSERVICESEARCHBOOKINTERFACESERVICE_EXCEPTION = e;
    }

    public SpringServiceSearchBookInterfaceService() {
        super(__getWsdlLocation(), SPRINGSERVICESEARCHBOOKINTERFACESERVICE_QNAME);
    }

    public SpringServiceSearchBookInterfaceService(WebServiceFeature... features) {
        super(__getWsdlLocation(), SPRINGSERVICESEARCHBOOKINTERFACESERVICE_QNAME, features);
    }

    public SpringServiceSearchBookInterfaceService(URL wsdlLocation) {
        super(wsdlLocation, SPRINGSERVICESEARCHBOOKINTERFACESERVICE_QNAME);
    }

    public SpringServiceSearchBookInterfaceService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, SPRINGSERVICESEARCHBOOKINTERFACESERVICE_QNAME, features);
    }

    public SpringServiceSearchBookInterfaceService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public SpringServiceSearchBookInterfaceService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns SpringServiceSearchBookInterface
     */
    @WebEndpoint(name = "SpringServiceSearchBookInterfacePort")
    public SpringServiceSearchBookInterface getSpringServiceSearchBookInterfacePort() {
        return super.getPort(new QName("http://wsinterface.remoteservice.booking.springairlines.com/", "SpringServiceSearchBookInterfacePort"), SpringServiceSearchBookInterface.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns SpringServiceSearchBookInterface
     */
    @WebEndpoint(name = "SpringServiceSearchBookInterfacePort")
    public SpringServiceSearchBookInterface getSpringServiceSearchBookInterfacePort(WebServiceFeature... features) {
        return super.getPort(new QName("http://wsinterface.remoteservice.booking.springairlines.com/", "SpringServiceSearchBookInterfacePort"), SpringServiceSearchBookInterface.class, features);
    }

    private static URL __getWsdlLocation() {
        if (SPRINGSERVICESEARCHBOOKINTERFACESERVICE_EXCEPTION!= null) {
            throw SPRINGSERVICESEARCHBOOKINTERFACESERVICE_EXCEPTION;
        }
        return SPRINGSERVICESEARCHBOOKINTERFACESERVICE_WSDL_LOCATION;
    }

}