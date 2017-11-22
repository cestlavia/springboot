
package com.springboot.study.service.saws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>flightSeatsInfoBean complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="flightSeatsInfoBean">
 *   &lt;complexContent>
 *     &lt;extension base="{http://wsinterface.remoteservice.booking.springairlines.com/}commonInParameter">
 *       &lt;sequence>
 *         &lt;element name="lang" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="moneyClassId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="saleType" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="saleTypeDetail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="seatType" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="segmentHeadId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="xproPkg" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "flightSeatsInfoBean", propOrder = {
    "lang",
    "moneyClassId",
    "saleType",
    "saleTypeDetail",
    "seatType",
    "segmentHeadId",
    "xproPkg"
})
public class FlightSeatsInfoBean
    extends CommonInParameter
{

    protected String lang;
    protected Integer moneyClassId;
    protected Integer saleType;
    protected String saleTypeDetail;
    protected Integer seatType;
    protected Long segmentHeadId;
    protected Integer xproPkg;

    /**
     * 获取lang属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLang() {
        return lang;
    }

    /**
     * 设置lang属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLang(String value) {
        this.lang = value;
    }

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
     * 获取saleType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSaleType() {
        return saleType;
    }

    /**
     * 设置saleType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSaleType(Integer value) {
        this.saleType = value;
    }

    /**
     * 获取saleTypeDetail属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSaleTypeDetail() {
        return saleTypeDetail;
    }

    /**
     * 设置saleTypeDetail属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSaleTypeDetail(String value) {
        this.saleTypeDetail = value;
    }

    /**
     * 获取seatType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSeatType() {
        return seatType;
    }

    /**
     * 设置seatType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSeatType(Integer value) {
        this.seatType = value;
    }

    /**
     * 获取segmentHeadId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSegmentHeadId() {
        return segmentHeadId;
    }

    /**
     * 设置segmentHeadId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSegmentHeadId(Long value) {
        this.segmentHeadId = value;
    }

    /**
     * 获取xproPkg属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getXproPkg() {
        return xproPkg;
    }

    /**
     * 设置xproPkg属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setXproPkg(Integer value) {
        this.xproPkg = value;
    }

}
