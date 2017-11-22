
package com.springboot.study.service.saws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>bgSeatInfo complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="bgSeatInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="bgSeatName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="bgShengcangMoney" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "bgSeatInfo", propOrder = {
    "bgSeatName",
    "bgShengcangMoney"
})
public class BgSeatInfo {

    protected String bgSeatName;
    protected Double bgShengcangMoney;

    /**
     * 获取bgSeatName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBgSeatName() {
        return bgSeatName;
    }

    /**
     * 设置bgSeatName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBgSeatName(String value) {
        this.bgSeatName = value;
    }

    /**
     * 获取bgShengcangMoney属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getBgShengcangMoney() {
        return bgShengcangMoney;
    }

    /**
     * 设置bgShengcangMoney属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setBgShengcangMoney(Double value) {
        this.bgShengcangMoney = value;
    }

}
