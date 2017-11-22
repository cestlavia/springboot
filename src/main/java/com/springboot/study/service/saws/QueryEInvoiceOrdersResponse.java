
package com.springboot.study.service.saws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>queryEInvoiceOrdersResponse complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="queryEInvoiceOrdersResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="return" type="{http://wsinterface.remoteservice.booking.springairlines.com/}retBeanOfTktDetail" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "queryEInvoiceOrdersResponse", propOrder = {
    "_return"
})
public class QueryEInvoiceOrdersResponse {

    @XmlElement(name = "return")
    protected RetBeanOfTktDetail _return;

    /**
     * 获取return属性的值。
     * 
     * @return
     *     possible object is
     *     {@link RetBeanOfTktDetail }
     *     
     */
    public RetBeanOfTktDetail getReturn() {
        return _return;
    }

    /**
     * 设置return属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link RetBeanOfTktDetail }
     *     
     */
    public void setReturn(RetBeanOfTktDetail value) {
        this._return = value;
    }

}
