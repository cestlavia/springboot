
package com.springboot.study.service.springairline;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>getFlightBgAppResultBean complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="getFlightBgAppResultBean"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://wsinterface.remoteservice.booking.springairlines.com/}commonOutParameter"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="failedOrderHeadId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="flightBgAppInfo" type="{http://wsinterface.remoteservice.booking.springairlines.com/}flightBgAppInfo" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getFlightBgAppResultBean", propOrder = {
    "failedOrderHeadId",
    "flightBgAppInfo"
})
public class GetFlightBgAppResultBean
    extends CommonOutParameter
{

    protected Long failedOrderHeadId;
    protected FlightBgAppInfo flightBgAppInfo;

    /**
     * 获取failedOrderHeadId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getFailedOrderHeadId() {
        return failedOrderHeadId;
    }

    /**
     * 设置failedOrderHeadId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setFailedOrderHeadId(Long value) {
        this.failedOrderHeadId = value;
    }

    /**
     * 获取flightBgAppInfo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link FlightBgAppInfo }
     *     
     */
    public FlightBgAppInfo getFlightBgAppInfo() {
        return flightBgAppInfo;
    }

    /**
     * 设置flightBgAppInfo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link FlightBgAppInfo }
     *     
     */
    public void setFlightBgAppInfo(FlightBgAppInfo value) {
        this.flightBgAppInfo = value;
    }

}
