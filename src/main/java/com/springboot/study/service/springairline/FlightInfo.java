
package com.springboot.study.service.springairline;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>flightInfo complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="flightInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="flightBasicInfo" type="{http://wsinterface.remoteservice.booking.springairlines.com/}flightBasicInfo" minOccurs="0"/&gt;
 *         &lt;element name="normSeatPriceList" type="{http://wsinterface.remoteservice.booking.springairlines.com/}normSeatPriceInfo" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="superSeatPriceList" type="{http://wsinterface.remoteservice.booking.springairlines.com/}superSeatPriceInfo" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "flightInfo", propOrder = {
    "flightBasicInfo",
    "normSeatPriceList",
    "superSeatPriceList"
})
public class FlightInfo {

    protected FlightBasicInfo flightBasicInfo;
    @XmlElement(nillable = true)
    protected List<NormSeatPriceInfo> normSeatPriceList;
    @XmlElement(nillable = true)
    protected List<SuperSeatPriceInfo> superSeatPriceList;

    /**
     * 获取flightBasicInfo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link FlightBasicInfo }
     *     
     */
    public FlightBasicInfo getFlightBasicInfo() {
        return flightBasicInfo;
    }

    /**
     * 设置flightBasicInfo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link FlightBasicInfo }
     *     
     */
    public void setFlightBasicInfo(FlightBasicInfo value) {
        this.flightBasicInfo = value;
    }

    /**
     * Gets the value of the normSeatPriceList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the normSeatPriceList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNormSeatPriceList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NormSeatPriceInfo }
     * 
     * 
     */
    public List<NormSeatPriceInfo> getNormSeatPriceList() {
        if (normSeatPriceList == null) {
            normSeatPriceList = new ArrayList<NormSeatPriceInfo>();
        }
        return this.normSeatPriceList;
    }

    /**
     * Gets the value of the superSeatPriceList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the superSeatPriceList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSuperSeatPriceList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SuperSeatPriceInfo }
     * 
     * 
     */
    public List<SuperSeatPriceInfo> getSuperSeatPriceList() {
        if (superSeatPriceList == null) {
            superSeatPriceList = new ArrayList<SuperSeatPriceInfo>();
        }
        return this.superSeatPriceList;
    }

}
