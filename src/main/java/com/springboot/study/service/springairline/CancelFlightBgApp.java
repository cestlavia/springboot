
package com.springboot.study.service.springairline;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>cancelFlightBgApp complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="cancelFlightBgApp"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="cancelInfo" type="{http://wsinterface.remoteservice.booking.springairlines.com/}cancelFlightBgAppInputBean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "cancelFlightBgApp", propOrder = {
    "cancelInfo"
})
public class CancelFlightBgApp {

    protected CancelFlightBgAppInputBean cancelInfo;

    /**
     * 获取cancelInfo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link CancelFlightBgAppInputBean }
     *     
     */
    public CancelFlightBgAppInputBean getCancelInfo() {
        return cancelInfo;
    }

    /**
     * 设置cancelInfo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CancelFlightBgAppInputBean }
     *     
     */
    public void setCancelInfo(CancelFlightBgAppInputBean value) {
        this.cancelInfo = value;
    }

}
