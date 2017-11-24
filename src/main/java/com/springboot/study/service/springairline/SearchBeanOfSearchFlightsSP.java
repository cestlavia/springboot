
package com.springboot.study.service.springairline;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>searchBeanOfSearchFlightsSP complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="searchBeanOfSearchFlightsSP"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://wsinterface.remoteservice.booking.springairlines.com/}commonInParameter"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="destAirportCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="destCityCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="flightDateBegin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="flightDateEnd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="flightDateGo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="lang" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="moneyClassId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="oriAirportCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="oriCityCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="searchFlag" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "searchBeanOfSearchFlightsSP", propOrder = {
    "destAirportCode",
    "destCityCode",
    "flightDateBegin",
    "flightDateEnd",
    "flightDateGo",
    "lang",
    "moneyClassId",
    "oriAirportCode",
    "oriCityCode",
    "searchFlag"
})
public class SearchBeanOfSearchFlightsSP
    extends CommonInParameter
{

    protected String destAirportCode;
    protected String destCityCode;
    protected String flightDateBegin;
    protected String flightDateEnd;
    protected String flightDateGo;
    protected String lang;
    protected Integer moneyClassId;
    protected String oriAirportCode;
    protected String oriCityCode;
    protected Integer searchFlag;

    /**
     * 获取destAirportCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestAirportCode() {
        return destAirportCode;
    }

    /**
     * 设置destAirportCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDestAirportCode(String value) {
        this.destAirportCode = value;
    }

    /**
     * 获取destCityCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestCityCode() {
        return destCityCode;
    }

    /**
     * 设置destCityCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDestCityCode(String value) {
        this.destCityCode = value;
    }

    /**
     * 获取flightDateBegin属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFlightDateBegin() {
        return flightDateBegin;
    }

    /**
     * 设置flightDateBegin属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFlightDateBegin(String value) {
        this.flightDateBegin = value;
    }

    /**
     * 获取flightDateEnd属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFlightDateEnd() {
        return flightDateEnd;
    }

    /**
     * 设置flightDateEnd属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFlightDateEnd(String value) {
        this.flightDateEnd = value;
    }

    /**
     * 获取flightDateGo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFlightDateGo() {
        return flightDateGo;
    }

    /**
     * 设置flightDateGo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFlightDateGo(String value) {
        this.flightDateGo = value;
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
     * 获取oriAirportCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOriAirportCode() {
        return oriAirportCode;
    }

    /**
     * 设置oriAirportCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOriAirportCode(String value) {
        this.oriAirportCode = value;
    }

    /**
     * 获取oriCityCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOriCityCode() {
        return oriCityCode;
    }

    /**
     * 设置oriCityCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOriCityCode(String value) {
        this.oriCityCode = value;
    }

    /**
     * 获取searchFlag属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSearchFlag() {
        return searchFlag;
    }

    /**
     * 设置searchFlag属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSearchFlag(Integer value) {
        this.searchFlag = value;
    }

}
