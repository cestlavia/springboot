
package com.springboot.study.service.saws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>otherFyDetailInfo complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="otherFyDetailInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="fyMoney" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="fyName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fyPolicyId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "otherFyDetailInfo", propOrder = {
    "fyMoney",
    "fyName",
    "fyPolicyId"
})
public class OtherFyDetailInfo {

    protected Double fyMoney;
    protected String fyName;
    protected Long fyPolicyId;

    /**
     * 获取fyMoney属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getFyMoney() {
        return fyMoney;
    }

    /**
     * 设置fyMoney属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setFyMoney(Double value) {
        this.fyMoney = value;
    }

    /**
     * 获取fyName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFyName() {
        return fyName;
    }

    /**
     * 设置fyName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFyName(String value) {
        this.fyName = value;
    }

    /**
     * 获取fyPolicyId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getFyPolicyId() {
        return fyPolicyId;
    }

    /**
     * 设置fyPolicyId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setFyPolicyId(Long value) {
        this.fyPolicyId = value;
    }

}
