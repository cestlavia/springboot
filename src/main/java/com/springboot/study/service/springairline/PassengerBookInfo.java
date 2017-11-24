
package com.springboot.study.service.springairline;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>passengerBookInfo complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="passengerBookInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="insuranceInfo" type="{http://wsinterface.remoteservice.booking.springairlines.com/}insuranceBookInfo" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="passengerDetailInfo" type="{http://wsinterface.remoteservice.booking.springairlines.com/}passengerDetailInfo" minOccurs="0"/&gt;
 *         &lt;element name="xprodInfo" type="{http://wsinterface.remoteservice.booking.springairlines.com/}xprodBookInfo" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "passengerBookInfo", propOrder = {
    "insuranceInfo",
    "passengerDetailInfo",
    "xprodInfo"
})
public class PassengerBookInfo {

    @XmlElement(nillable = true)
    protected List<InsuranceBookInfo> insuranceInfo;
    protected PassengerDetailInfo passengerDetailInfo;
    @XmlElement(nillable = true)
    protected List<XprodBookInfo> xprodInfo;

    /**
     * Gets the value of the insuranceInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the insuranceInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInsuranceInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InsuranceBookInfo }
     * 
     * 
     */
    public List<InsuranceBookInfo> getInsuranceInfo() {
        if (insuranceInfo == null) {
            insuranceInfo = new ArrayList<InsuranceBookInfo>();
        }
        return this.insuranceInfo;
    }

    /**
     * 获取passengerDetailInfo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link PassengerDetailInfo }
     *     
     */
    public PassengerDetailInfo getPassengerDetailInfo() {
        return passengerDetailInfo;
    }

    /**
     * 设置passengerDetailInfo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link PassengerDetailInfo }
     *     
     */
    public void setPassengerDetailInfo(PassengerDetailInfo value) {
        this.passengerDetailInfo = value;
    }

    /**
     * Gets the value of the xprodInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the xprodInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getXprodInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link XprodBookInfo }
     * 
     * 
     */
    public List<XprodBookInfo> getXprodInfo() {
        if (xprodInfo == null) {
            xprodInfo = new ArrayList<XprodBookInfo>();
        }
        return this.xprodInfo;
    }

}
