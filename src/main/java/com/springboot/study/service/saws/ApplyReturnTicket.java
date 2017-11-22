
package com.springboot.study.service.saws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>applyReturnTicket complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="applyReturnTicket">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="appInfo" type="{http://wsinterface.remoteservice.booking.springairlines.com/}applyReturnTicketInputBean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "applyReturnTicket", propOrder = {
    "appInfo"
})
public class ApplyReturnTicket {

    protected ApplyReturnTicketInputBean appInfo;

    /**
     * 获取appInfo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ApplyReturnTicketInputBean }
     *     
     */
    public ApplyReturnTicketInputBean getAppInfo() {
        return appInfo;
    }

    /**
     * 设置appInfo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ApplyReturnTicketInputBean }
     *     
     */
    public void setAppInfo(ApplyReturnTicketInputBean value) {
        this.appInfo = value;
    }

}
