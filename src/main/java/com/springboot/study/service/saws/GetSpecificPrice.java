
package com.springboot.study.service.saws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>getSpecificPrice complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="getSpecificPrice">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="inputInfo" type="{http://wsinterface.remoteservice.booking.springairlines.com/}getSpecificPriceInputBean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getSpecificPrice", propOrder = {
    "inputInfo"
})
public class GetSpecificPrice {

    protected GetSpecificPriceInputBean inputInfo;

    /**
     * 获取inputInfo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link GetSpecificPriceInputBean }
     *     
     */
    public GetSpecificPriceInputBean getInputInfo() {
        return inputInfo;
    }

    /**
     * 设置inputInfo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link GetSpecificPriceInputBean }
     *     
     */
    public void setInputInfo(GetSpecificPriceInputBean value) {
        this.inputInfo = value;
    }

}
