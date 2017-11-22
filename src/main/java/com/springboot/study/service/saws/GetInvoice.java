
package com.springboot.study.service.saws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>GetInvoice complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="GetInvoice">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="reqBean" type="{http://wsinterface.remoteservice.booking.springairlines.com/}reqBeanOfGetInvoice" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetInvoice", propOrder = {
    "reqBean"
})
public class GetInvoice {

    protected ReqBeanOfGetInvoice reqBean;

    /**
     * 获取reqBean属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ReqBeanOfGetInvoice }
     *     
     */
    public ReqBeanOfGetInvoice getReqBean() {
        return reqBean;
    }

    /**
     * 设置reqBean属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ReqBeanOfGetInvoice }
     *     
     */
    public void setReqBean(ReqBeanOfGetInvoice value) {
        this.reqBean = value;
    }

}
