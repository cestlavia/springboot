
package com.springboot.study.service.saws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>flightBasicInfo complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="flightBasicInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="acType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="destEndPoint" type="{http://wsinterface.remoteservice.booking.springairlines.com/}flightEndPointInfo" minOccurs="0"/>
 *         &lt;element name="firstStopover" type="{http://wsinterface.remoteservice.booking.springairlines.com/}flightEndPointInfo" minOccurs="0"/>
 *         &lt;element name="flightNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="flightStatus" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="fuelFee" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="oriEndPoint" type="{http://wsinterface.remoteservice.booking.springairlines.com/}flightEndPointInfo" minOccurs="0"/>
 *         &lt;element name="portPay" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="pubPrice" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="routeAreaFlag" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="secondStopover" type="{http://wsinterface.remoteservice.booking.springairlines.com/}flightEndPointInfo" minOccurs="0"/>
 *         &lt;element name="segHeadId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "flightBasicInfo", propOrder = {
    "acType",
    "destEndPoint",
    "firstStopover",
    "flightNo",
    "flightStatus",
    "fuelFee",
    "oriEndPoint",
    "portPay",
    "pubPrice",
    "routeAreaFlag",
    "secondStopover",
    "segHeadId"
})
public class FlightBasicInfo {

    protected String acType;
    protected FlightEndPointInfo destEndPoint;
    protected FlightEndPointInfo firstStopover;
    protected String flightNo;
    protected Integer flightStatus;
    protected Double fuelFee;
    protected FlightEndPointInfo oriEndPoint;
    protected Double portPay;
    protected Double pubPrice;
    protected Integer routeAreaFlag;
    protected FlightEndPointInfo secondStopover;
    protected Long segHeadId;

    /**
     * 获取acType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcType() {
        return acType;
    }

    /**
     * 设置acType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcType(String value) {
        this.acType = value;
    }

    /**
     * 获取destEndPoint属性的值。
     * 
     * @return
     *     possible object is
     *     {@link FlightEndPointInfo }
     *     
     */
    public FlightEndPointInfo getDestEndPoint() {
        return destEndPoint;
    }

    /**
     * 设置destEndPoint属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link FlightEndPointInfo }
     *     
     */
    public void setDestEndPoint(FlightEndPointInfo value) {
        this.destEndPoint = value;
    }

    /**
     * 获取firstStopover属性的值。
     * 
     * @return
     *     possible object is
     *     {@link FlightEndPointInfo }
     *     
     */
    public FlightEndPointInfo getFirstStopover() {
        return firstStopover;
    }

    /**
     * 设置firstStopover属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link FlightEndPointInfo }
     *     
     */
    public void setFirstStopover(FlightEndPointInfo value) {
        this.firstStopover = value;
    }

    /**
     * 获取flightNo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFlightNo() {
        return flightNo;
    }

    /**
     * 设置flightNo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFlightNo(String value) {
        this.flightNo = value;
    }

    /**
     * 获取flightStatus属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getFlightStatus() {
        return flightStatus;
    }

    /**
     * 设置flightStatus属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setFlightStatus(Integer value) {
        this.flightStatus = value;
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
     * 获取oriEndPoint属性的值。
     * 
     * @return
     *     possible object is
     *     {@link FlightEndPointInfo }
     *     
     */
    public FlightEndPointInfo getOriEndPoint() {
        return oriEndPoint;
    }

    /**
     * 设置oriEndPoint属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link FlightEndPointInfo }
     *     
     */
    public void setOriEndPoint(FlightEndPointInfo value) {
        this.oriEndPoint = value;
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
     * 获取pubPrice属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getPubPrice() {
        return pubPrice;
    }

    /**
     * 设置pubPrice属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setPubPrice(Double value) {
        this.pubPrice = value;
    }

    /**
     * 获取routeAreaFlag属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRouteAreaFlag() {
        return routeAreaFlag;
    }

    /**
     * 设置routeAreaFlag属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRouteAreaFlag(Integer value) {
        this.routeAreaFlag = value;
    }

    /**
     * 获取secondStopover属性的值。
     * 
     * @return
     *     possible object is
     *     {@link FlightEndPointInfo }
     *     
     */
    public FlightEndPointInfo getSecondStopover() {
        return secondStopover;
    }

    /**
     * 设置secondStopover属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link FlightEndPointInfo }
     *     
     */
    public void setSecondStopover(FlightEndPointInfo value) {
        this.secondStopover = value;
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

}
