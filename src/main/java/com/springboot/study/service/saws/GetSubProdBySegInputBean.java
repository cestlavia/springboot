
package com.springboot.study.service.saws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>getSubProdBySegInputBean complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="getSubProdBySegInputBean">
 *   &lt;complexContent>
 *     &lt;extension base="{http://wsinterface.remoteservice.booking.springairlines.com/}commonInParameter">
 *       &lt;sequence>
 *         &lt;element name="adultCabinName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="adultTktPrice" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="lang" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="moneyClassId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="otherSegHeadId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="queryXtypeRange" type="{http://www.w3.org/2001/XMLSchema}long" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="thisSegHeadId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="thisSegHeadType" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="tktType" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="userType" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getSubProdBySegInputBean", propOrder = {
    "adultCabinName",
    "adultTktPrice",
    "lang",
    "moneyClassId",
    "otherSegHeadId",
    "queryXtypeRange",
    "thisSegHeadId",
    "thisSegHeadType",
    "tktType",
    "userType"
})
public class GetSubProdBySegInputBean
    extends CommonInParameter
{

    protected String adultCabinName;
    protected Double adultTktPrice;
    protected String lang;
    protected Long moneyClassId;
    protected Long otherSegHeadId;
    @XmlElement(nillable = true)
    protected List<Long> queryXtypeRange;
    protected Long thisSegHeadId;
    protected Integer thisSegHeadType;
    protected Integer tktType;
    protected Integer userType;

    /**
     * 获取adultCabinName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdultCabinName() {
        return adultCabinName;
    }

    /**
     * 设置adultCabinName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdultCabinName(String value) {
        this.adultCabinName = value;
    }

    /**
     * 获取adultTktPrice属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getAdultTktPrice() {
        return adultTktPrice;
    }

    /**
     * 设置adultTktPrice属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setAdultTktPrice(Double value) {
        this.adultTktPrice = value;
    }

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
     *     {@link Long }
     *     
     */
    public Long getMoneyClassId() {
        return moneyClassId;
    }

    /**
     * 设置moneyClassId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMoneyClassId(Long value) {
        this.moneyClassId = value;
    }

    /**
     * 获取otherSegHeadId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getOtherSegHeadId() {
        return otherSegHeadId;
    }

    /**
     * 设置otherSegHeadId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setOtherSegHeadId(Long value) {
        this.otherSegHeadId = value;
    }

    /**
     * Gets the value of the queryXtypeRange property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the queryXtypeRange property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getQueryXtypeRange().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Long }
     * 
     * 
     */
    public List<Long> getQueryXtypeRange() {
        if (queryXtypeRange == null) {
            queryXtypeRange = new ArrayList<Long>();
        }
        return this.queryXtypeRange;
    }

    /**
     * 获取thisSegHeadId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getThisSegHeadId() {
        return thisSegHeadId;
    }

    /**
     * 设置thisSegHeadId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setThisSegHeadId(Long value) {
        this.thisSegHeadId = value;
    }

    /**
     * 获取thisSegHeadType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getThisSegHeadType() {
        return thisSegHeadType;
    }

    /**
     * 设置thisSegHeadType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setThisSegHeadType(Integer value) {
        this.thisSegHeadType = value;
    }

    /**
     * 获取tktType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTktType() {
        return tktType;
    }

    /**
     * 设置tktType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTktType(Integer value) {
        this.tktType = value;
    }

    /**
     * 获取userType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getUserType() {
        return userType;
    }

    /**
     * 设置userType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setUserType(Integer value) {
        this.userType = value;
    }

}
