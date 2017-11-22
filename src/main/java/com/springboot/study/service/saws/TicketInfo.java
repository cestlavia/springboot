
package com.springboot.study.service.saws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ticketInfo complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="ticketInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="flightBasicInfo" type="{http://wsinterface.remoteservice.booking.springairlines.com/}flightBasicInfo" minOccurs="0"/>
 *         &lt;element name="passengerDetailInfo" type="{http://wsinterface.remoteservice.booking.springairlines.com/}passengerDetailInfo" minOccurs="0"/>
 *         &lt;element name="ticketBasicInfo" type="{http://wsinterface.remoteservice.booking.springairlines.com/}ticketBasicInfo" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ticketInfo", propOrder = {
    "flightBasicInfo",
    "passengerDetailInfo",
    "ticketBasicInfo"
})
public class TicketInfo {

    protected FlightBasicInfo flightBasicInfo;
    protected PassengerDetailInfo passengerDetailInfo;
    protected TicketBasicInfo ticketBasicInfo;

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
     * 获取ticketBasicInfo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link TicketBasicInfo }
     *     
     */
    public TicketBasicInfo getTicketBasicInfo() {
        return ticketBasicInfo;
    }

    /**
     * 设置ticketBasicInfo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link TicketBasicInfo }
     *     
     */
    public void setTicketBasicInfo(TicketBasicInfo value) {
        this.ticketBasicInfo = value;
    }

}
