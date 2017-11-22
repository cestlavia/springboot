
package com.springboot.study.service.saws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>retBeanOfQueryFlightSeatNo complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="retBeanOfQueryFlightSeatNo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cabinType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ifCanSaleC" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="moneyClassId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="price" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="seatId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="x" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="xrowNo" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="xrowPos" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="y" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ycolNo" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ycolPos" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="z" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "retBeanOfQueryFlightSeatNo", propOrder = {
    "cabinType",
    "ifCanSaleC",
    "moneyClassId",
    "price",
    "seatId",
    "status",
    "x",
    "xrowNo",
    "xrowPos",
    "y",
    "ycolNo",
    "ycolPos",
    "z"
})
public class RetBeanOfQueryFlightSeatNo {

    protected String cabinType;
    protected Integer ifCanSaleC;
    protected int moneyClassId;
    protected double price;
    protected long seatId;
    protected String status;
    protected int x;
    protected Integer xrowNo;
    protected String xrowPos;
    protected String y;
    protected Integer ycolNo;
    protected String ycolPos;
    protected int z;

    /**
     * 获取cabinType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCabinType() {
        return cabinType;
    }

    /**
     * 设置cabinType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCabinType(String value) {
        this.cabinType = value;
    }

    /**
     * 获取ifCanSaleC属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIfCanSaleC() {
        return ifCanSaleC;
    }

    /**
     * 设置ifCanSaleC属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIfCanSaleC(Integer value) {
        this.ifCanSaleC = value;
    }

    /**
     * 获取moneyClassId属性的值。
     * 
     */
    public int getMoneyClassId() {
        return moneyClassId;
    }

    /**
     * 设置moneyClassId属性的值。
     * 
     */
    public void setMoneyClassId(int value) {
        this.moneyClassId = value;
    }

    /**
     * 获取price属性的值。
     * 
     */
    public double getPrice() {
        return price;
    }

    /**
     * 设置price属性的值。
     * 
     */
    public void setPrice(double value) {
        this.price = value;
    }

    /**
     * 获取seatId属性的值。
     * 
     */
    public long getSeatId() {
        return seatId;
    }

    /**
     * 设置seatId属性的值。
     * 
     */
    public void setSeatId(long value) {
        this.seatId = value;
    }

    /**
     * 获取status属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * 设置status属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

    /**
     * 获取x属性的值。
     * 
     */
    public int getX() {
        return x;
    }

    /**
     * 设置x属性的值。
     * 
     */
    public void setX(int value) {
        this.x = value;
    }

    /**
     * 获取xrowNo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getXrowNo() {
        return xrowNo;
    }

    /**
     * 设置xrowNo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setXrowNo(Integer value) {
        this.xrowNo = value;
    }

    /**
     * 获取xrowPos属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXrowPos() {
        return xrowPos;
    }

    /**
     * 设置xrowPos属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXrowPos(String value) {
        this.xrowPos = value;
    }

    /**
     * 获取y属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getY() {
        return y;
    }

    /**
     * 设置y属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setY(String value) {
        this.y = value;
    }

    /**
     * 获取ycolNo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getYcolNo() {
        return ycolNo;
    }

    /**
     * 设置ycolNo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setYcolNo(Integer value) {
        this.ycolNo = value;
    }

    /**
     * 获取ycolPos属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getYcolPos() {
        return ycolPos;
    }

    /**
     * 设置ycolPos属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setYcolPos(String value) {
        this.ycolPos = value;
    }

    /**
     * 获取z属性的值。
     * 
     */
    public int getZ() {
        return z;
    }

    /**
     * 设置z属性的值。
     * 
     */
    public void setZ(int value) {
        this.z = value;
    }

}
