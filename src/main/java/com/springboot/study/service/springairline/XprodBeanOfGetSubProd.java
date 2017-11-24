
package com.springboot.study.service.springairline;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>xprodBeanOfGetSubProd complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="xprodBeanOfGetSubProd"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="canBuyNum" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="insCompId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="otherInfo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="subProdCatId" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="subProdId" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="subProdName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="subProdPrice" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="subProdTypeId" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="subProdUserType" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "xprodBeanOfGetSubProd", propOrder = {
    "canBuyNum",
    "insCompId",
    "otherInfo",
    "subProdCatId",
    "subProdId",
    "subProdName",
    "subProdPrice",
    "subProdTypeId",
    "subProdUserType"
})
public class XprodBeanOfGetSubProd {

    protected Integer canBuyNum;
    protected Long insCompId;
    protected String otherInfo;
    protected int subProdCatId;
    protected long subProdId;
    protected String subProdName;
    protected Double subProdPrice;
    protected long subProdTypeId;
    protected int subProdUserType;

    /**
     * 获取canBuyNum属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCanBuyNum() {
        return canBuyNum;
    }

    /**
     * 设置canBuyNum属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCanBuyNum(Integer value) {
        this.canBuyNum = value;
    }

    /**
     * 获取insCompId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getInsCompId() {
        return insCompId;
    }

    /**
     * 设置insCompId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setInsCompId(Long value) {
        this.insCompId = value;
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
     * 获取subProdCatId属性的值。
     * 
     */
    public int getSubProdCatId() {
        return subProdCatId;
    }

    /**
     * 设置subProdCatId属性的值。
     * 
     */
    public void setSubProdCatId(int value) {
        this.subProdCatId = value;
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
     * 获取subProdUserType属性的值。
     * 
     */
    public int getSubProdUserType() {
        return subProdUserType;
    }

    /**
     * 设置subProdUserType属性的值。
     * 
     */
    public void setSubProdUserType(int value) {
        this.subProdUserType = value;
    }

}
