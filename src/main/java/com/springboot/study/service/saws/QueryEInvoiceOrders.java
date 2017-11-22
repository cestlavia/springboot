
package com.springboot.study.service.saws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>queryEInvoiceOrders complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="queryEInvoiceOrders">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="reqBean" type="{http://wsinterface.remoteservice.booking.springairlines.com/}reqBeanOfTktDetail" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "queryEInvoiceOrders", propOrder = {
    "reqBean"
})
public class QueryEInvoiceOrders {

    protected ReqBeanOfTktDetail reqBean;

    /**
     * 获取reqBean属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ReqBeanOfTktDetail }
     *     
     */
    public ReqBeanOfTktDetail getReqBean() {
        return reqBean;
    }

    /**
     * 设置reqBean属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ReqBeanOfTktDetail }
     *     
     */
    public void setReqBean(ReqBeanOfTktDetail value) {
        this.reqBean = value;
    }

}
