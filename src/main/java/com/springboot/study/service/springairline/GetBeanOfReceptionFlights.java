
package com.springboot.study.service.springairline;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>getBeanOfReceptionFlights complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="getBeanOfReceptionFlights"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://wsinterface.remoteservice.booking.springairlines.com/}commonOutParameter"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="receptionFlightsList" type="{http://wsinterface.remoteservice.booking.springairlines.com/}receptionFlightsInfo" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getBeanOfReceptionFlights", propOrder = {
    "receptionFlightsList"
})
public class GetBeanOfReceptionFlights
    extends CommonOutParameter
{

    @XmlElement(nillable = true)
    protected List<ReceptionFlightsInfo> receptionFlightsList;

    /**
     * Gets the value of the receptionFlightsList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the receptionFlightsList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReceptionFlightsList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ReceptionFlightsInfo }
     * 
     * 
     */
    public List<ReceptionFlightsInfo> getReceptionFlightsList() {
        if (receptionFlightsList == null) {
            receptionFlightsList = new ArrayList<ReceptionFlightsInfo>();
        }
        return this.receptionFlightsList;
    }

}
