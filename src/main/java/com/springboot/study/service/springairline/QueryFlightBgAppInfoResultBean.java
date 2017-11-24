
package com.springboot.study.service.springairline;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>queryFlightBgAppInfoResultBean complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="queryFlightBgAppInfoResultBean"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://wsinterface.remoteservice.booking.springairlines.com/}commonOutParameter"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="flightBgApps" type="{http://wsinterface.remoteservice.booking.springairlines.com/}flightBgAppInfo" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "queryFlightBgAppInfoResultBean", propOrder = {
    "flightBgApps"
})
public class QueryFlightBgAppInfoResultBean
    extends CommonOutParameter
{

    @XmlElement(nillable = true)
    protected List<FlightBgAppInfo> flightBgApps;

    /**
     * Gets the value of the flightBgApps property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the flightBgApps property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFlightBgApps().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FlightBgAppInfo }
     * 
     * 
     */
    public List<FlightBgAppInfo> getFlightBgApps() {
        if (flightBgApps == null) {
            flightBgApps = new ArrayList<FlightBgAppInfo>();
        }
        return this.flightBgApps;
    }

}
