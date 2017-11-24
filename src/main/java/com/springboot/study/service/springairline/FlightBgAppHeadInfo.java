
package com.springboot.study.service.springairline;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>flightBgAppHeadInfo complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="flightBgAppHeadInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="cardNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="cardTypeId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="familyName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="flightBgAppHeadId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="flightBgAppId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="flightBgFy" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="newFlightInfo" type="{http://wsinterface.remoteservice.booking.springairlines.com/}flightBasicInfo" minOccurs="0"/&gt;
 *         &lt;element name="newSeatName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="newSeatNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="newSegHeadId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="oldFlightInfo" type="{http://wsinterface.remoteservice.booking.springairlines.com/}flightBasicInfo" minOccurs="0"/&gt;
 *         &lt;element name="oldSeatName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="oldSeatNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="oldSegHeadId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="oldTicketPrice" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="orderHeadId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="payGateFy" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="personalName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="seatSelectFlag" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="shengcangMoney" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="travellerType" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "flightBgAppHeadInfo", propOrder = {
    "cardNo",
    "cardTypeId",
    "familyName",
    "flightBgAppHeadId",
    "flightBgAppId",
    "flightBgFy",
    "newFlightInfo",
    "newSeatName",
    "newSeatNo",
    "newSegHeadId",
    "oldFlightInfo",
    "oldSeatName",
    "oldSeatNo",
    "oldSegHeadId",
    "oldTicketPrice",
    "orderHeadId",
    "payGateFy",
    "personalName",
    "seatSelectFlag",
    "shengcangMoney",
    "travellerType"
})
public class FlightBgAppHeadInfo {

    protected String cardNo;
    protected Integer cardTypeId;
    protected String familyName;
    protected Long flightBgAppHeadId;
    protected Long flightBgAppId;
    protected Double flightBgFy;
    protected FlightBasicInfo newFlightInfo;
    protected String newSeatName;
    protected String newSeatNo;
    protected Long newSegHeadId;
    protected FlightBasicInfo oldFlightInfo;
    protected String oldSeatName;
    protected String oldSeatNo;
    protected Long oldSegHeadId;
    protected Double oldTicketPrice;
    protected Long orderHeadId;
    protected Double payGateFy;
    protected String personalName;
    protected Integer seatSelectFlag;
    protected Double shengcangMoney;
    protected Integer travellerType;

    /**
     * 获取cardNo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardNo() {
        return cardNo;
    }

    /**
     * 设置cardNo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardNo(String value) {
        this.cardNo = value;
    }

    /**
     * 获取cardTypeId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCardTypeId() {
        return cardTypeId;
    }

    /**
     * 设置cardTypeId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCardTypeId(Integer value) {
        this.cardTypeId = value;
    }

    /**
     * 获取familyName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFamilyName() {
        return familyName;
    }

    /**
     * 设置familyName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFamilyName(String value) {
        this.familyName = value;
    }

    /**
     * 获取flightBgAppHeadId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getFlightBgAppHeadId() {
        return flightBgAppHeadId;
    }

    /**
     * 设置flightBgAppHeadId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setFlightBgAppHeadId(Long value) {
        this.flightBgAppHeadId = value;
    }

    /**
     * 获取flightBgAppId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getFlightBgAppId() {
        return flightBgAppId;
    }

    /**
     * 设置flightBgAppId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setFlightBgAppId(Long value) {
        this.flightBgAppId = value;
    }

    /**
     * 获取flightBgFy属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getFlightBgFy() {
        return flightBgFy;
    }

    /**
     * 设置flightBgFy属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setFlightBgFy(Double value) {
        this.flightBgFy = value;
    }

    /**
     * 获取newFlightInfo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link FlightBasicInfo }
     *     
     */
    public FlightBasicInfo getNewFlightInfo() {
        return newFlightInfo;
    }

    /**
     * 设置newFlightInfo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link FlightBasicInfo }
     *     
     */
    public void setNewFlightInfo(FlightBasicInfo value) {
        this.newFlightInfo = value;
    }

    /**
     * 获取newSeatName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNewSeatName() {
        return newSeatName;
    }

    /**
     * 设置newSeatName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNewSeatName(String value) {
        this.newSeatName = value;
    }

    /**
     * 获取newSeatNo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNewSeatNo() {
        return newSeatNo;
    }

    /**
     * 设置newSeatNo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNewSeatNo(String value) {
        this.newSeatNo = value;
    }

    /**
     * 获取newSegHeadId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getNewSegHeadId() {
        return newSegHeadId;
    }

    /**
     * 设置newSegHeadId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setNewSegHeadId(Long value) {
        this.newSegHeadId = value;
    }

    /**
     * 获取oldFlightInfo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link FlightBasicInfo }
     *     
     */
    public FlightBasicInfo getOldFlightInfo() {
        return oldFlightInfo;
    }

    /**
     * 设置oldFlightInfo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link FlightBasicInfo }
     *     
     */
    public void setOldFlightInfo(FlightBasicInfo value) {
        this.oldFlightInfo = value;
    }

    /**
     * 获取oldSeatName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOldSeatName() {
        return oldSeatName;
    }

    /**
     * 设置oldSeatName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOldSeatName(String value) {
        this.oldSeatName = value;
    }

    /**
     * 获取oldSeatNo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOldSeatNo() {
        return oldSeatNo;
    }

    /**
     * 设置oldSeatNo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOldSeatNo(String value) {
        this.oldSeatNo = value;
    }

    /**
     * 获取oldSegHeadId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getOldSegHeadId() {
        return oldSegHeadId;
    }

    /**
     * 设置oldSegHeadId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setOldSegHeadId(Long value) {
        this.oldSegHeadId = value;
    }

    /**
     * 获取oldTicketPrice属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getOldTicketPrice() {
        return oldTicketPrice;
    }

    /**
     * 设置oldTicketPrice属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setOldTicketPrice(Double value) {
        this.oldTicketPrice = value;
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
     * 获取personalName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersonalName() {
        return personalName;
    }

    /**
     * 设置personalName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonalName(String value) {
        this.personalName = value;
    }

    /**
     * 获取seatSelectFlag属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSeatSelectFlag() {
        return seatSelectFlag;
    }

    /**
     * 设置seatSelectFlag属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSeatSelectFlag(Integer value) {
        this.seatSelectFlag = value;
    }

    /**
     * 获取shengcangMoney属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getShengcangMoney() {
        return shengcangMoney;
    }

    /**
     * 设置shengcangMoney属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setShengcangMoney(Double value) {
        this.shengcangMoney = value;
    }

    /**
     * 获取travellerType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTravellerType() {
        return travellerType;
    }

    /**
     * 设置travellerType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTravellerType(Integer value) {
        this.travellerType = value;
    }

}
