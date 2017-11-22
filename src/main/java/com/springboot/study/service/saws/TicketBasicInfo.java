
package com.springboot.study.service.saws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ticketBasicInfo complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="ticketBasicInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="fuelPrice" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="insFee" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="lcHeadId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="orderHeadId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="orderNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="otherFy" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="payGateFy" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="portPay" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="seatName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="segHeadId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="tktFlag" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="tktNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tktPrice" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="tktType" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="wfHeadId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="xprodFee" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ticketBasicInfo", propOrder = {
    "fuelPrice",
    "insFee",
    "lcHeadId",
    "orderHeadId",
    "orderNo",
    "otherFy",
    "payGateFy",
    "portPay",
    "seatName",
    "segHeadId",
    "tktFlag",
    "tktNo",
    "tktPrice",
    "tktType",
    "wfHeadId",
    "xprodFee"
})
public class TicketBasicInfo {

    protected Double fuelPrice;
    protected Double insFee;
    protected Long lcHeadId;
    protected Long orderHeadId;
    protected String orderNo;
    protected Double otherFy;
    protected Double payGateFy;
    protected Double portPay;
    protected String seatName;
    protected Long segHeadId;
    protected Integer tktFlag;
    protected String tktNo;
    protected Double tktPrice;
    protected Integer tktType;
    protected Long wfHeadId;
    protected Double xprodFee;

    /**
     * 获取fuelPrice属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getFuelPrice() {
        return fuelPrice;
    }

    /**
     * 设置fuelPrice属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setFuelPrice(Double value) {
        this.fuelPrice = value;
    }

    /**
     * 获取insFee属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getInsFee() {
        return insFee;
    }

    /**
     * 设置insFee属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setInsFee(Double value) {
        this.insFee = value;
    }

    /**
     * 获取lcHeadId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getLcHeadId() {
        return lcHeadId;
    }

    /**
     * 设置lcHeadId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setLcHeadId(Long value) {
        this.lcHeadId = value;
    }

    /**
     * 获取orderHeadId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getOrderHeadId() {
        return orderHeadId;
    }

    /**
     * 设置orderHeadId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setOrderHeadId(Long value) {
        this.orderHeadId = value;
    }

    /**
     * 获取orderNo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderNo() {
        return orderNo;
    }

    /**
     * 设置orderNo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderNo(String value) {
        this.orderNo = value;
    }

    /**
     * 获取otherFy属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getOtherFy() {
        return otherFy;
    }

    /**
     * 设置otherFy属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setOtherFy(Double value) {
        this.otherFy = value;
    }

    /**
     * 获取payGateFy属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getPayGateFy() {
        return payGateFy;
    }

    /**
     * 设置payGateFy属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setPayGateFy(Double value) {
        this.payGateFy = value;
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

    /**
     * 获取seatName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSeatName() {
        return seatName;
    }

    /**
     * 设置seatName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSeatName(String value) {
        this.seatName = value;
    }

    /**
     * 获取segHeadId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSegHeadId() {
        return segHeadId;
    }

    /**
     * 设置segHeadId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSegHeadId(Long value) {
        this.segHeadId = value;
    }

    /**
     * 获取tktFlag属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTktFlag() {
        return tktFlag;
    }

    /**
     * 设置tktFlag属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTktFlag(Integer value) {
        this.tktFlag = value;
    }

    /**
     * 获取tktNo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTktNo() {
        return tktNo;
    }

    /**
     * 设置tktNo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTktNo(String value) {
        this.tktNo = value;
    }

    /**
     * 获取tktPrice属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTktPrice() {
        return tktPrice;
    }

    /**
     * 设置tktPrice属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTktPrice(Double value) {
        this.tktPrice = value;
    }

    /**
     * 获取tktType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTktType() {
        return tktType;
    }

    /**
     * 设置tktType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTktType(Integer value) {
        this.tktType = value;
    }

    /**
     * 获取wfHeadId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getWfHeadId() {
        return wfHeadId;
    }

    /**
     * 设置wfHeadId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setWfHeadId(Long value) {
        this.wfHeadId = value;
    }

    /**
     * 获取xprodFee属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getXprodFee() {
        return xprodFee;
    }

    /**
     * 设置xprodFee属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setXprodFee(Double value) {
        this.xprodFee = value;
    }

}
