
package com.springboot.study.service.saws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>flightEndPointInfo complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="flightEndPointInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="airportCityInfo" type="{http://wsinterface.remoteservice.booking.springairlines.com/}airportCityInfo" minOccurs="0"/>
 *         &lt;element name="destTimeInfo" type="{http://wsinterface.remoteservice.booking.springairlines.com/}flightTimeInfo" minOccurs="0"/>
 *         &lt;element name="oriTimeInfo" type="{http://wsinterface.remoteservice.booking.springairlines.com/}flightTimeInfo" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "flightEndPointInfo", propOrder = {
    "airportCityInfo",
    "destTimeInfo",
    "oriTimeInfo"
})
public class FlightEndPointInfo {

    protected AirportCityInfo airportCityInfo;
    protected FlightTimeInfo destTimeInfo;
    protected FlightTimeInfo oriTimeInfo;

    /**
     * 获取airportCityInfo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link AirportCityInfo }
     *     
     */
    public AirportCityInfo getAirportCityInfo() {
        return airportCityInfo;
    }

    /**
     * 设置airportCityInfo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link AirportCityInfo }
     *     
     */
    public void setAirportCityInfo(AirportCityInfo value) {
        this.airportCityInfo = value;
    }

    /**
     * 获取destTimeInfo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link FlightTimeInfo }
     *     
     */
    public FlightTimeInfo getDestTimeInfo() {
        return destTimeInfo;
    }

    /**
     * 设置destTimeInfo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link FlightTimeInfo }
     *     
     */
    public void setDestTimeInfo(FlightTimeInfo value) {
        this.destTimeInfo = value;
    }

    /**
     * 获取oriTimeInfo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link FlightTimeInfo }
     *     
     */
    public FlightTimeInfo getOriTimeInfo() {
        return oriTimeInfo;
    }

    /**
     * 设置oriTimeInfo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link FlightTimeInfo }
     *     
     */
    public void setOriTimeInfo(FlightTimeInfo value) {
        this.oriTimeInfo = value;
    }

}
