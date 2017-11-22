
package com.springboot.study.service.saws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>travelBaoJiInfo1 complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="travelBaoJiInfo1">
 *   &lt;complexContent>
 *     &lt;extension base="{http://wsinterface.remoteservice.booking.springairlines.com/}travelBaoJiInfo">
 *       &lt;sequence>
 *         &lt;element name="baggageInfo" type="{http://wsinterface.remoteservice.booking.springairlines.com/}baggageInfo" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="flights_order_head_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "travelBaoJiInfo1", propOrder = {
    "baggageInfo",
    "flightsOrderHeadId"
})
public class TravelBaoJiInfo1
    extends TravelBaoJiInfo
{

    @XmlElement(nillable = true)
    protected List<BaggageInfo> baggageInfo;
    @XmlElement(name = "flights_order_head_id")
    protected String flightsOrderHeadId;

    /**
     * Gets the value of the baggageInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the baggageInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBaggageInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BaggageInfo }
     * 
     * 
     */
    public List<BaggageInfo> getBaggageInfo() {
        if (baggageInfo == null) {
            baggageInfo = new ArrayList<BaggageInfo>();
        }
        return this.baggageInfo;
    }

    /**
     * 获取flightsOrderHeadId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFlightsOrderHeadId() {
        return flightsOrderHeadId;
    }

    /**
     * 设置flightsOrderHeadId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFlightsOrderHeadId(String value) {
        this.flightsOrderHeadId = value;
    }

}
