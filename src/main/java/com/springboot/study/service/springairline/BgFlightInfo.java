
package com.springboot.study.service.springairline;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>bgFlightInfo complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="bgFlightInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="flightBasicInfo" type="{http://wsinterface.remoteservice.booking.springairlines.com/}flightBasicInfo" minOccurs="0"/&gt;
 *         &lt;element name="seatInfo" type="{http://wsinterface.remoteservice.booking.springairlines.com/}bgSeatInfo" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "bgFlightInfo", propOrder = {
    "flightBasicInfo",
    "seatInfo"
})
public class BgFlightInfo {

    protected FlightBasicInfo flightBasicInfo;
    protected BgSeatInfo seatInfo;

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
     * 获取seatInfo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BgSeatInfo }
     *     
     */
    public BgSeatInfo getSeatInfo() {
        return seatInfo;
    }

    /**
     * 设置seatInfo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BgSeatInfo }
     *     
     */
    public void setSeatInfo(BgSeatInfo value) {
        this.seatInfo = value;
    }

}
