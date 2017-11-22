
package com.springboot.study.service.saws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>superSeatPriceInfo complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="superSeatPriceInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="moneyClassId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="saleSegId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="seatName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="seatPrice" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="subProdId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="subProdName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="subProdPrice" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "superSeatPriceInfo", propOrder = {
    "moneyClassId",
    "saleSegId",
    "seatName",
    "seatPrice",
    "subProdId",
    "subProdName",
    "subProdPrice"
})
public class SuperSeatPriceInfo {

    protected Integer moneyClassId;
    protected Long saleSegId;
    protected String seatName;
    protected Double seatPrice;
    protected Long subProdId;
    protected String subProdName;
    protected Double subProdPrice;

    /**
     * 获取moneyClassId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMoneyClassId() {
        return moneyClassId;
    }

    /**
     * 设置moneyClassId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMoneyClassId(Integer value) {
        this.moneyClassId = value;
    }

    /**
     * 获取saleSegId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSaleSegId() {
        return saleSegId;
    }

    /**
     * 设置saleSegId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSaleSegId(Long value) {
        this.saleSegId = value;
    }

    /**
     * 获取seatName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSeatName() {
        return seatName;
    }

    /**
     * 设置seatName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSeatName(String value) {
        this.seatName = value;
    }

    /**
     * 获取seatPrice属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getSeatPrice() {
        return seatPrice;
    }

    /**
     * 设置seatPrice属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setSeatPrice(Double value) {
        this.seatPrice = value;
    }

    /**
     * 获取subProdId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSubProdId() {
        return subProdId;
    }

    /**
     * 设置subProdId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSubProdId(Long value) {
        this.subProdId = value;
    }

    /**
     * 获取subProdName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubProdName() {
        return subProdName;
    }

    /**
     * 设置subProdName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubProdName(String value) {
        this.subProdName = value;
    }

    /**
     * 获取subProdPrice属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getSubProdPrice() {
        return subProdPrice;
    }

    /**
     * 设置subProdPrice属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setSubProdPrice(Double value) {
        this.subProdPrice = value;
    }

}
