
package com.springboot.study.service.springairline;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>priceCalcResult complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="priceCalcResult"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="cabinName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="cabinPrice" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="fuelFee" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="otherFeePolicy" type="{http://wsinterface.remoteservice.booking.springairlines.com/}otherFeePolicy" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="otherFeeSum" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="portPay" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "priceCalcResult", propOrder = {
    "cabinName",
    "cabinPrice",
    "fuelFee",
    "otherFeePolicy",
    "otherFeeSum",
    "portPay"
})
public class PriceCalcResult {

    protected String cabinName;
    protected Double cabinPrice;
    protected Double fuelFee;
    @XmlElement(nillable = true)
    protected List<OtherFeePolicy> otherFeePolicy;
    protected Double otherFeeSum;
    protected Double portPay;

    /**
     * 获取cabinName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCabinName() {
        return cabinName;
    }

    /**
     * 设置cabinName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCabinName(String value) {
        this.cabinName = value;
    }

    /**
     * 获取cabinPrice属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCabinPrice() {
        return cabinPrice;
    }

    /**
     * 设置cabinPrice属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCabinPrice(Double value) {
        this.cabinPrice = value;
    }

    /**
     * 获取fuelFee属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getFuelFee() {
        return fuelFee;
    }

    /**
     * 设置fuelFee属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setFuelFee(Double value) {
        this.fuelFee = value;
    }

    /**
     * Gets the value of the otherFeePolicy property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the otherFeePolicy property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOtherFeePolicy().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OtherFeePolicy }
     * 
     * 
     */
    public List<OtherFeePolicy> getOtherFeePolicy() {
        if (otherFeePolicy == null) {
            otherFeePolicy = new ArrayList<OtherFeePolicy>();
        }
        return this.otherFeePolicy;
    }

    /**
     * 获取otherFeeSum属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getOtherFeeSum() {
        return otherFeeSum;
    }

    /**
     * 设置otherFeeSum属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setOtherFeeSum(Double value) {
        this.otherFeeSum = value;
    }

    /**
     * 获取portPay属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getPortPay() {
        return portPay;
    }

    /**
     * 设置portPay属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setPortPay(Double value) {
        this.portPay = value;
    }

}
