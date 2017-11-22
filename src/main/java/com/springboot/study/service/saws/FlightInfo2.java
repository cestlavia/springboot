
package com.springboot.study.service.saws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>flightInfo2 complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="flightInfo2">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="flightBasicInfo" type="{http://wsinterface.remoteservice.booking.springairlines.com/}flightBasicInfo" minOccurs="0"/>
 *         &lt;element name="normSeatPriceList" type="{http://wsinterface.remoteservice.booking.springairlines.com/}normSeatPriceInfo2" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="superSeatPriceList" type="{http://wsinterface.remoteservice.booking.springairlines.com/}superSeatPriceInfo2" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "flightInfo2", propOrder = {
    "flightBasicInfo",
    "normSeatPriceList",
    "superSeatPriceList"
})
public class FlightInfo2 {

    protected FlightBasicInfo flightBasicInfo;
    @XmlElement(nillable = true)
    protected List<NormSeatPriceInfo2> normSeatPriceList;
    @XmlElement(nillable = true)
    protected List<SuperSeatPriceInfo2> superSeatPriceList;

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
     * {@link NormSeatPriceInfo2 }
     * 
     * 
     */
    public List<NormSeatPriceInfo2> getNormSeatPriceList() {
        if (normSeatPriceList == null) {
            normSeatPriceList = new ArrayList<NormSeatPriceInfo2>();
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
     * {@link SuperSeatPriceInfo2 }
     * 
     * 
     */
    public List<SuperSeatPriceInfo2> getSuperSeatPriceList() {
        if (superSeatPriceList == null) {
            superSeatPriceList = new ArrayList<SuperSeatPriceInfo2>();
        }
        return this.superSeatPriceList;
    }

}
