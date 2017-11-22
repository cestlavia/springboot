
package com.springboot.study.service.saws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>insuranceBookInfo complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="insuranceBookInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="insurBeneType" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="insurCompId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="insurNum" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="insurProdId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "insuranceBookInfo", propOrder = {
    "insurBeneType",
    "insurCompId",
    "insurNum",
    "insurProdId"
})
public class InsuranceBookInfo {

    protected Integer insurBeneType;
    protected Long insurCompId;
    protected Integer insurNum;
    protected Long insurProdId;

    /**
     * 获取insurBeneType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getInsurBeneType() {
        return insurBeneType;
    }

    /**
     * 设置insurBeneType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setInsurBeneType(Integer value) {
        this.insurBeneType = value;
    }

    /**
     * 获取insurCompId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getInsurCompId() {
        return insurCompId;
    }

    /**
     * 设置insurCompId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setInsurCompId(Long value) {
        this.insurCompId = value;
    }

    /**
     * 获取insurNum属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getInsurNum() {
        return insurNum;
    }

    /**
     * 设置insurNum属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setInsurNum(Integer value) {
        this.insurNum = value;
    }

    /**
     * 获取insurProdId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getInsurProdId() {
        return insurProdId;
    }

    /**
     * 设置insurProdId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setInsurProdId(Long value) {
        this.insurProdId = value;
    }

}
