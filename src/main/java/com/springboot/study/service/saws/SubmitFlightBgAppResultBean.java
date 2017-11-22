
package com.springboot.study.service.saws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>submitFlightBgAppResultBean complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="submitFlightBgAppResultBean">
 *   &lt;complexContent>
 *     &lt;extension base="{http://wsinterface.remoteservice.booking.springairlines.com/}commonOutParameter">
 *       &lt;sequence>
 *         &lt;element name="failedOrderHeadId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="flightBgAppInfo" type="{http://wsinterface.remoteservice.booking.springairlines.com/}flightBgAppInfo" minOccurs="0"/>
 *         &lt;element name="payFlag" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="resubmitFlag" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "submitFlightBgAppResultBean", propOrder = {
    "failedOrderHeadId",
    "flightBgAppInfo",
    "payFlag",
    "resubmitFlag"
})
public class SubmitFlightBgAppResultBean
    extends CommonOutParameter
{

    protected Long failedOrderHeadId;
    protected FlightBgAppInfo flightBgAppInfo;
    protected Integer payFlag;
    protected Integer resubmitFlag;

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

    /**
     * 获取payFlag属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPayFlag() {
        return payFlag;
    }

    /**
     * 设置payFlag属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPayFlag(Integer value) {
        this.payFlag = value;
    }

    /**
     * 获取resubmitFlag属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getResubmitFlag() {
        return resubmitFlag;
    }

    /**
     * 设置resubmitFlag属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setResubmitFlag(Integer value) {
        this.resubmitFlag = value;
    }

}
