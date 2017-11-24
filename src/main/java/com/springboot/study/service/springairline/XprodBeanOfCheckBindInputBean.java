
package com.springboot.study.service.springairline;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>xprodBeanOfCheckBindInputBean complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="xprodBeanOfCheckBindInputBean"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://wsinterface.remoteservice.booking.springairlines.com/}commonInParameter"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="lang" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="moneyClassId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="seatName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="thisSegHeadId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="thisSegHeadType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="tktType" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "xprodBeanOfCheckBindInputBean", propOrder = {
    "lang",
    "moneyClassId",
    "seatName",
    "thisSegHeadId",
    "thisSegHeadType",
    "tktType"
})
public class XprodBeanOfCheckBindInputBean
    extends CommonInParameter
{

    protected String lang;
    protected Long moneyClassId;
    protected String seatName;
    protected Long thisSegHeadId;
    protected String thisSegHeadType;
    protected Integer tktType;

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
     *     {@link String }
     *     
     */
    public String getThisSegHeadType() {
        return thisSegHeadType;
    }

    /**
     * 设置thisSegHeadType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setThisSegHeadType(String value) {
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

}
