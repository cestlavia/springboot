
package com.springboot.study.service.saws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>bookOrderBookSubCabinBean complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="bookOrderBookSubCabinBean">
 *   &lt;complexContent>
 *     &lt;extension base="{http://wsinterface.remoteservice.booking.springairlines.com/}bookOrderBookBean">
 *       &lt;sequence>
 *         &lt;element name="firstAdultCabinPrice" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="secondAdultCabinPrice" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="thirdAdultCabinPrice" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "bookOrderBookSubCabinBean", propOrder = {
    "firstAdultCabinPrice",
    "secondAdultCabinPrice",
    "thirdAdultCabinPrice"
})
public class BookOrderBookSubCabinBean
    extends BookOrderBookBean
{

    protected Double firstAdultCabinPrice;
    protected Double secondAdultCabinPrice;
    protected Double thirdAdultCabinPrice;

    /**
     * 获取firstAdultCabinPrice属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getFirstAdultCabinPrice() {
        return firstAdultCabinPrice;
    }

    /**
     * 设置firstAdultCabinPrice属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setFirstAdultCabinPrice(Double value) {
        this.firstAdultCabinPrice = value;
    }

    /**
     * 获取secondAdultCabinPrice属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getSecondAdultCabinPrice() {
        return secondAdultCabinPrice;
    }

    /**
     * 设置secondAdultCabinPrice属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setSecondAdultCabinPrice(Double value) {
        this.secondAdultCabinPrice = value;
    }

    /**
     * 获取thirdAdultCabinPrice属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getThirdAdultCabinPrice() {
        return thirdAdultCabinPrice;
    }

    /**
     * 设置thirdAdultCabinPrice属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setThirdAdultCabinPrice(Double value) {
        this.thirdAdultCabinPrice = value;
    }

}
