
package com.springboot.study.service.springairline;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>otherFeePolicy complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="otherFeePolicy"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="fyName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="fyPolicyFlag" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="fyPolicyId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="fyVal" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "otherFeePolicy", propOrder = {
    "fyName",
    "fyPolicyFlag",
    "fyPolicyId",
    "fyVal"
})
public class OtherFeePolicy {

    protected String fyName;
    protected Integer fyPolicyFlag;
    protected Long fyPolicyId;
    protected Double fyVal;

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
     * 获取fyPolicyFlag属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getFyPolicyFlag() {
        return fyPolicyFlag;
    }

    /**
     * 设置fyPolicyFlag属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setFyPolicyFlag(Integer value) {
        this.fyPolicyFlag = value;
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

    /**
     * 获取fyVal属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getFyVal() {
        return fyVal;
    }

    /**
     * 设置fyVal属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setFyVal(Double value) {
        this.fyVal = value;
    }

}
