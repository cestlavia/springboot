
package com.springboot.study.service.saws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>cancelOrderResponse complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="cancelOrderResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="return" type="{http://wsinterface.remoteservice.booking.springairlines.com/}cancelOrderResultBean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "cancelOrderResponse", propOrder = {
    "_return"
})
public class CancelOrderResponse {

    @XmlElement(name = "return")
    protected CancelOrderResultBean _return;

    /**
     * 获取return属性的值。
     * 
     * @return
     *     possible object is
     *     {@link CancelOrderResultBean }
     *     
     */
    public CancelOrderResultBean getReturn() {
        return _return;
    }

    /**
     * 设置return属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CancelOrderResultBean }
     *     
     */
    public void setReturn(CancelOrderResultBean value) {
        this._return = value;
    }

}
