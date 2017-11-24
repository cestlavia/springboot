
package com.springboot.study.service.springairline;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>CreateInvoice complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="CreateInvoice"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="reqBean" type="{http://wsinterface.remoteservice.booking.springairlines.com/}reqBeanOfCreateInvoice" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreateInvoice", propOrder = {
    "reqBean"
})
public class CreateInvoice {

    protected ReqBeanOfCreateInvoice reqBean;

    /**
     * 获取reqBean属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ReqBeanOfCreateInvoice }
     *     
     */
    public ReqBeanOfCreateInvoice getReqBean() {
        return reqBean;
    }

    /**
     * 设置reqBean属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ReqBeanOfCreateInvoice }
     *     
     */
    public void setReqBean(ReqBeanOfCreateInvoice value) {
        this.reqBean = value;
    }

}
