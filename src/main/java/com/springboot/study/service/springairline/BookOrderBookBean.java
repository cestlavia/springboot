
package com.springboot.study.service.springairline;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>bookOrderBookBean complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="bookOrderBookBean"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://wsinterface.remoteservice.booking.springairlines.com/}commonInParameter"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="adultNum" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="childNum" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="firstSegAdultCabin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="firstSegId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="firstSegPassengerInfo" type="{http://wsinterface.remoteservice.booking.springairlines.com/}passengerBookInfo" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="infantNum" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="lang" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="lcType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="linkmanAddr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="linkmanEmail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="linkmanMobile" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="linkmanName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="linkmanPrivateTel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="linkmanWorkTel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="linkmanZip" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="moneyClassId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="remoteIp" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="secondSegAdultCabin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="secondSegId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="secondSegPassengerInfo" type="{http://wsinterface.remoteservice.booking.springairlines.com/}passengerBookInfo" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="thirdSegAdultCabin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="thirdSegId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="thirdSegPassengerInfo" type="{http://wsinterface.remoteservice.booking.springairlines.com/}passengerBookInfo" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "bookOrderBookBean", propOrder = {
    "adultNum",
    "childNum",
    "firstSegAdultCabin",
    "firstSegId",
    "firstSegPassengerInfo",
    "infantNum",
    "lang",
    "lcType",
    "linkmanAddr",
    "linkmanEmail",
    "linkmanMobile",
    "linkmanName",
    "linkmanPrivateTel",
    "linkmanWorkTel",
    "linkmanZip",
    "moneyClassId",
    "remoteIp",
    "secondSegAdultCabin",
    "secondSegId",
    "secondSegPassengerInfo",
    "thirdSegAdultCabin",
    "thirdSegId",
    "thirdSegPassengerInfo"
})
@XmlSeeAlso({
    BookOrderBookSubCabinBean.class
})
public class BookOrderBookBean
    extends CommonInParameter
{

    protected Integer adultNum;
    protected Integer childNum;
    protected String firstSegAdultCabin;
    protected Long firstSegId;
    @XmlElement(nillable = true)
    protected List<PassengerBookInfo> firstSegPassengerInfo;
    protected Integer infantNum;
    protected String lang;
    protected String lcType;
    protected String linkmanAddr;
    protected String linkmanEmail;
    protected String linkmanMobile;
    protected String linkmanName;
    protected String linkmanPrivateTel;
    protected String linkmanWorkTel;
    protected String linkmanZip;
    protected Integer moneyClassId;
    protected String remoteIp;
    protected String secondSegAdultCabin;
    protected Long secondSegId;
    @XmlElement(nillable = true)
    protected List<PassengerBookInfo> secondSegPassengerInfo;
    protected String thirdSegAdultCabin;
    protected Long thirdSegId;
    @XmlElement(nillable = true)
    protected List<PassengerBookInfo> thirdSegPassengerInfo;

    /**
     * 获取adultNum属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAdultNum() {
        return adultNum;
    }

    /**
     * 设置adultNum属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAdultNum(Integer value) {
        this.adultNum = value;
    }

    /**
     * 获取childNum属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getChildNum() {
        return childNum;
    }

    /**
     * 设置childNum属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setChildNum(Integer value) {
        this.childNum = value;
    }

    /**
     * 获取firstSegAdultCabin属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirstSegAdultCabin() {
        return firstSegAdultCabin;
    }

    /**
     * 设置firstSegAdultCabin属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirstSegAdultCabin(String value) {
        this.firstSegAdultCabin = value;
    }

    /**
     * 获取firstSegId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getFirstSegId() {
        return firstSegId;
    }

    /**
     * 设置firstSegId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setFirstSegId(Long value) {
        this.firstSegId = value;
    }

    /**
     * Gets the value of the firstSegPassengerInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the firstSegPassengerInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFirstSegPassengerInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PassengerBookInfo }
     * 
     * 
     */
    public List<PassengerBookInfo> getFirstSegPassengerInfo() {
        if (firstSegPassengerInfo == null) {
            firstSegPassengerInfo = new ArrayList<PassengerBookInfo>();
        }
        return this.firstSegPassengerInfo;
    }

    /**
     * 获取infantNum属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getInfantNum() {
        return infantNum;
    }

    /**
     * 设置infantNum属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setInfantNum(Integer value) {
        this.infantNum = value;
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
     * 获取lcType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLcType() {
        return lcType;
    }

    /**
     * 设置lcType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLcType(String value) {
        this.lcType = value;
    }

    /**
     * 获取linkmanAddr属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLinkmanAddr() {
        return linkmanAddr;
    }

    /**
     * 设置linkmanAddr属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLinkmanAddr(String value) {
        this.linkmanAddr = value;
    }

    /**
     * 获取linkmanEmail属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLinkmanEmail() {
        return linkmanEmail;
    }

    /**
     * 设置linkmanEmail属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLinkmanEmail(String value) {
        this.linkmanEmail = value;
    }

    /**
     * 获取linkmanMobile属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLinkmanMobile() {
        return linkmanMobile;
    }

    /**
     * 设置linkmanMobile属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLinkmanMobile(String value) {
        this.linkmanMobile = value;
    }

    /**
     * 获取linkmanName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLinkmanName() {
        return linkmanName;
    }

    /**
     * 设置linkmanName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLinkmanName(String value) {
        this.linkmanName = value;
    }

    /**
     * 获取linkmanPrivateTel属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLinkmanPrivateTel() {
        return linkmanPrivateTel;
    }

    /**
     * 设置linkmanPrivateTel属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLinkmanPrivateTel(String value) {
        this.linkmanPrivateTel = value;
    }

    /**
     * 获取linkmanWorkTel属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLinkmanWorkTel() {
        return linkmanWorkTel;
    }

    /**
     * 设置linkmanWorkTel属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLinkmanWorkTel(String value) {
        this.linkmanWorkTel = value;
    }

    /**
     * 获取linkmanZip属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLinkmanZip() {
        return linkmanZip;
    }

    /**
     * 设置linkmanZip属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLinkmanZip(String value) {
        this.linkmanZip = value;
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
     * 获取remoteIp属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRemoteIp() {
        return remoteIp;
    }

    /**
     * 设置remoteIp属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRemoteIp(String value) {
        this.remoteIp = value;
    }

    /**
     * 获取secondSegAdultCabin属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSecondSegAdultCabin() {
        return secondSegAdultCabin;
    }

    /**
     * 设置secondSegAdultCabin属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSecondSegAdultCabin(String value) {
        this.secondSegAdultCabin = value;
    }

    /**
     * 获取secondSegId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSecondSegId() {
        return secondSegId;
    }

    /**
     * 设置secondSegId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSecondSegId(Long value) {
        this.secondSegId = value;
    }

    /**
     * Gets the value of the secondSegPassengerInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the secondSegPassengerInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSecondSegPassengerInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PassengerBookInfo }
     * 
     * 
     */
    public List<PassengerBookInfo> getSecondSegPassengerInfo() {
        if (secondSegPassengerInfo == null) {
            secondSegPassengerInfo = new ArrayList<PassengerBookInfo>();
        }
        return this.secondSegPassengerInfo;
    }

    /**
     * 获取thirdSegAdultCabin属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getThirdSegAdultCabin() {
        return thirdSegAdultCabin;
    }

    /**
     * 设置thirdSegAdultCabin属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setThirdSegAdultCabin(String value) {
        this.thirdSegAdultCabin = value;
    }

    /**
     * 获取thirdSegId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getThirdSegId() {
        return thirdSegId;
    }

    /**
     * 设置thirdSegId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setThirdSegId(Long value) {
        this.thirdSegId = value;
    }

    /**
     * Gets the value of the thirdSegPassengerInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the thirdSegPassengerInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getThirdSegPassengerInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PassengerBookInfo }
     * 
     * 
     */
    public List<PassengerBookInfo> getThirdSegPassengerInfo() {
        if (thirdSegPassengerInfo == null) {
            thirdSegPassengerInfo = new ArrayList<PassengerBookInfo>();
        }
        return this.thirdSegPassengerInfo;
    }

}
