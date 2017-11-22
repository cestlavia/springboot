
package com.springboot.study.service.saws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>xprodBeanOfGetSubProdBooked complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="xprodBeanOfGetSubProdBooked">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="bookPrice" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="cardNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cardTypeId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="cardTypeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="companyId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="flagId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="flightsNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="inPkgCut" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="inPkgCutAll" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="insDldURL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ips" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="moneyClassId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="moneyClassName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="oriTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="oriTimeSys" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="originalCost" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="otherInfo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="otherOrderHeadId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="otherOrderNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pkgOriginalCost" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="pkgPrice" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="pkgProdName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pkgXproId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="seatName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="segment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="subProdId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="subProdName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="subProdTypeId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="travType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="userFamName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="userPerName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="yhqYouhuiMoney" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "xprodBeanOfGetSubProdBooked", propOrder = {
    "bookPrice",
    "cardNo",
    "cardTypeId",
    "cardTypeName",
    "companyId",
    "flagId",
    "flightsNo",
    "inPkgCut",
    "inPkgCutAll",
    "insDldURL",
    "ips",
    "moneyClassId",
    "moneyClassName",
    "oriTime",
    "oriTimeSys",
    "originalCost",
    "otherInfo",
    "otherOrderHeadId",
    "otherOrderNo",
    "pkgOriginalCost",
    "pkgPrice",
    "pkgProdName",
    "pkgXproId",
    "seatName",
    "segment",
    "subProdId",
    "subProdName",
    "subProdTypeId",
    "travType",
    "userFamName",
    "userPerName",
    "yhqYouhuiMoney"
})
public class XprodBeanOfGetSubProdBooked {

    protected double bookPrice;
    protected String cardNo;
    protected int cardTypeId;
    protected String cardTypeName;
    protected Integer companyId;
    protected int flagId;
    protected String flightsNo;
    protected Double inPkgCut;
    protected Double inPkgCutAll;
    protected String insDldURL;
    protected String ips;
    protected long moneyClassId;
    protected String moneyClassName;
    protected String oriTime;
    protected int oriTimeSys;
    protected Double originalCost;
    protected String otherInfo;
    protected long otherOrderHeadId;
    protected String otherOrderNo;
    protected Double pkgOriginalCost;
    protected Double pkgPrice;
    protected String pkgProdName;
    protected Integer pkgXproId;
    protected String seatName;
    protected String segment;
    protected long subProdId;
    protected String subProdName;
    protected long subProdTypeId;
    protected int travType;
    protected String userFamName;
    protected String userPerName;
    protected Double yhqYouhuiMoney;

    /**
     * 获取bookPrice属性的值。
     * 
     */
    public double getBookPrice() {
        return bookPrice;
    }

    /**
     * 设置bookPrice属性的值。
     * 
     */
    public void setBookPrice(double value) {
        this.bookPrice = value;
    }

    /**
     * 获取cardNo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardNo() {
        return cardNo;
    }

    /**
     * 设置cardNo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardNo(String value) {
        this.cardNo = value;
    }

    /**
     * 获取cardTypeId属性的值。
     * 
     */
    public int getCardTypeId() {
        return cardTypeId;
    }

    /**
     * 设置cardTypeId属性的值。
     * 
     */
    public void setCardTypeId(int value) {
        this.cardTypeId = value;
    }

    /**
     * 获取cardTypeName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardTypeName() {
        return cardTypeName;
    }

    /**
     * 设置cardTypeName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardTypeName(String value) {
        this.cardTypeName = value;
    }

    /**
     * 获取companyId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCompanyId() {
        return companyId;
    }

    /**
     * 设置companyId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCompanyId(Integer value) {
        this.companyId = value;
    }

    /**
     * 获取flagId属性的值。
     * 
     */
    public int getFlagId() {
        return flagId;
    }

    /**
     * 设置flagId属性的值。
     * 
     */
    public void setFlagId(int value) {
        this.flagId = value;
    }

    /**
     * 获取flightsNo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFlightsNo() {
        return flightsNo;
    }

    /**
     * 设置flightsNo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFlightsNo(String value) {
        this.flightsNo = value;
    }

    /**
     * 获取inPkgCut属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getInPkgCut() {
        return inPkgCut;
    }

    /**
     * 设置inPkgCut属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setInPkgCut(Double value) {
        this.inPkgCut = value;
    }

    /**
     * 获取inPkgCutAll属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getInPkgCutAll() {
        return inPkgCutAll;
    }

    /**
     * 设置inPkgCutAll属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setInPkgCutAll(Double value) {
        this.inPkgCutAll = value;
    }

    /**
     * 获取insDldURL属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInsDldURL() {
        return insDldURL;
    }

    /**
     * 设置insDldURL属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInsDldURL(String value) {
        this.insDldURL = value;
    }

    /**
     * 获取ips属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIps() {
        return ips;
    }

    /**
     * 设置ips属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIps(String value) {
        this.ips = value;
    }

    /**
     * 获取moneyClassId属性的值。
     * 
     */
    public long getMoneyClassId() {
        return moneyClassId;
    }

    /**
     * 设置moneyClassId属性的值。
     * 
     */
    public void setMoneyClassId(long value) {
        this.moneyClassId = value;
    }

    /**
     * 获取moneyClassName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMoneyClassName() {
        return moneyClassName;
    }

    /**
     * 设置moneyClassName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMoneyClassName(String value) {
        this.moneyClassName = value;
    }

    /**
     * 获取oriTime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOriTime() {
        return oriTime;
    }

    /**
     * 设置oriTime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOriTime(String value) {
        this.oriTime = value;
    }

    /**
     * 获取oriTimeSys属性的值。
     * 
     */
    public int getOriTimeSys() {
        return oriTimeSys;
    }

    /**
     * 设置oriTimeSys属性的值。
     * 
     */
    public void setOriTimeSys(int value) {
        this.oriTimeSys = value;
    }

    /**
     * 获取originalCost属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getOriginalCost() {
        return originalCost;
    }

    /**
     * 设置originalCost属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setOriginalCost(Double value) {
        this.originalCost = value;
    }

    /**
     * 获取otherInfo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOtherInfo() {
        return otherInfo;
    }

    /**
     * 设置otherInfo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOtherInfo(String value) {
        this.otherInfo = value;
    }

    /**
     * 获取otherOrderHeadId属性的值。
     * 
     */
    public long getOtherOrderHeadId() {
        return otherOrderHeadId;
    }

    /**
     * 设置otherOrderHeadId属性的值。
     * 
     */
    public void setOtherOrderHeadId(long value) {
        this.otherOrderHeadId = value;
    }

    /**
     * 获取otherOrderNo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOtherOrderNo() {
        return otherOrderNo;
    }

    /**
     * 设置otherOrderNo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOtherOrderNo(String value) {
        this.otherOrderNo = value;
    }

    /**
     * 获取pkgOriginalCost属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getPkgOriginalCost() {
        return pkgOriginalCost;
    }

    /**
     * 设置pkgOriginalCost属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setPkgOriginalCost(Double value) {
        this.pkgOriginalCost = value;
    }

    /**
     * 获取pkgPrice属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getPkgPrice() {
        return pkgPrice;
    }

    /**
     * 设置pkgPrice属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setPkgPrice(Double value) {
        this.pkgPrice = value;
    }

    /**
     * 获取pkgProdName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPkgProdName() {
        return pkgProdName;
    }

    /**
     * 设置pkgProdName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPkgProdName(String value) {
        this.pkgProdName = value;
    }

    /**
     * 获取pkgXproId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPkgXproId() {
        return pkgXproId;
    }

    /**
     * 设置pkgXproId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPkgXproId(Integer value) {
        this.pkgXproId = value;
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
     * 获取segment属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSegment() {
        return segment;
    }

    /**
     * 设置segment属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSegment(String value) {
        this.segment = value;
    }

    /**
     * 获取subProdId属性的值。
     * 
     */
    public long getSubProdId() {
        return subProdId;
    }

    /**
     * 设置subProdId属性的值。
     * 
     */
    public void setSubProdId(long value) {
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
     * 获取subProdTypeId属性的值。
     * 
     */
    public long getSubProdTypeId() {
        return subProdTypeId;
    }

    /**
     * 设置subProdTypeId属性的值。
     * 
     */
    public void setSubProdTypeId(long value) {
        this.subProdTypeId = value;
    }

    /**
     * 获取travType属性的值。
     * 
     */
    public int getTravType() {
        return travType;
    }

    /**
     * 设置travType属性的值。
     * 
     */
    public void setTravType(int value) {
        this.travType = value;
    }

    /**
     * 获取userFamName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserFamName() {
        return userFamName;
    }

    /**
     * 设置userFamName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserFamName(String value) {
        this.userFamName = value;
    }

    /**
     * 获取userPerName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserPerName() {
        return userPerName;
    }

    /**
     * 设置userPerName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserPerName(String value) {
        this.userPerName = value;
    }

    /**
     * 获取yhqYouhuiMoney属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getYhqYouhuiMoney() {
        return yhqYouhuiMoney;
    }

    /**
     * 设置yhqYouhuiMoney属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setYhqYouhuiMoney(Double value) {
        this.yhqYouhuiMoney = value;
    }

}
