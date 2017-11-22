
package com.springboot.study.service.saws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>flightBgAppInfo complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="flightBgAppInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="basicInfo" type="{http://wsinterface.remoteservice.booking.springairlines.com/}flightBgAppBasicInfo" minOccurs="0"/>
 *         &lt;element name="flightBgAppHeads" type="{http://wsinterface.remoteservice.booking.springairlines.com/}flightBgAppHeadInfo" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "flightBgAppInfo", propOrder = {
    "basicInfo",
    "flightBgAppHeads"
})
public class FlightBgAppInfo {

    protected FlightBgAppBasicInfo basicInfo;
    @XmlElement(nillable = true)
    protected List<FlightBgAppHeadInfo> flightBgAppHeads;

    /**
     * 获取basicInfo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link FlightBgAppBasicInfo }
     *     
     */
    public FlightBgAppBasicInfo getBasicInfo() {
        return basicInfo;
    }

    /**
     * 设置basicInfo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link FlightBgAppBasicInfo }
     *     
     */
    public void setBasicInfo(FlightBgAppBasicInfo value) {
        this.basicInfo = value;
    }

    /**
     * Gets the value of the flightBgAppHeads property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the flightBgAppHeads property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFlightBgAppHeads().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FlightBgAppHeadInfo }
     * 
     * 
     */
    public List<FlightBgAppHeadInfo> getFlightBgAppHeads() {
        if (flightBgAppHeads == null) {
            flightBgAppHeads = new ArrayList<FlightBgAppHeadInfo>();
        }
        return this.flightBgAppHeads;
    }

}
