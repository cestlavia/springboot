
package com.springboot.study.service.saws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>getTravelBaoJiDetailInfoResultBean1 complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="getTravelBaoJiDetailInfoResultBean1">
 *   &lt;complexContent>
 *     &lt;extension base="{http://wsinterface.remoteservice.booking.springairlines.com/}commonOutParameter">
 *       &lt;sequence>
 *         &lt;element name="ticketList" type="{http://wsinterface.remoteservice.booking.springairlines.com/}travelBaoJiInfo1" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getTravelBaoJiDetailInfoResultBean1", propOrder = {
    "ticketList"
})
public class GetTravelBaoJiDetailInfoResultBean1
    extends CommonOutParameter
{

    @XmlElement(nillable = true)
    protected List<TravelBaoJiInfo1> ticketList;

    /**
     * Gets the value of the ticketList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ticketList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTicketList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TravelBaoJiInfo1 }
     * 
     * 
     */
    public List<TravelBaoJiInfo1> getTicketList() {
        if (ticketList == null) {
            ticketList = new ArrayList<TravelBaoJiInfo1>();
        }
        return this.ticketList;
    }

}
