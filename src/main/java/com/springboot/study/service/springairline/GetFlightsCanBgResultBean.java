
package com.springboot.study.service.springairline;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>getFlightsCanBgResultBean complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="getFlightsCanBgResultBean"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://wsinterface.remoteservice.booking.springairlines.com/}commonOutParameter"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="flightsCanBg" type="{http://wsinterface.remoteservice.booking.springairlines.com/}bgFlightInfo" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getFlightsCanBgResultBean", propOrder = {
    "flightsCanBg"
})
public class GetFlightsCanBgResultBean
    extends CommonOutParameter
{

    @XmlElement(nillable = true)
    protected List<BgFlightInfo> flightsCanBg;

    /**
     * Gets the value of the flightsCanBg property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the flightsCanBg property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFlightsCanBg().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BgFlightInfo }
     * 
     * 
     */
    public List<BgFlightInfo> getFlightsCanBg() {
        if (flightsCanBg == null) {
            flightsCanBg = new ArrayList<BgFlightInfo>();
        }
        return this.flightsCanBg;
    }

}
