
package com.springboot.study.service.springairline;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>getRetFlightSeatsBean complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="getRetFlightSeatsBean"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://wsinterface.remoteservice.booking.springairlines.com/}commonOutParameter"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="flightSeatsList" type="{http://wsinterface.remoteservice.booking.springairlines.com/}retFlightSeatsBean" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getRetFlightSeatsBean", propOrder = {
    "flightSeatsList"
})
public class GetRetFlightSeatsBean
    extends CommonOutParameter
{

    @XmlElement(nillable = true)
    protected List<RetFlightSeatsBean> flightSeatsList;

    /**
     * Gets the value of the flightSeatsList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the flightSeatsList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFlightSeatsList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RetFlightSeatsBean }
     * 
     * 
     */
    public List<RetFlightSeatsBean> getFlightSeatsList() {
        if (flightSeatsList == null) {
            flightSeatsList = new ArrayList<RetFlightSeatsBean>();
        }
        return this.flightSeatsList;
    }

}
