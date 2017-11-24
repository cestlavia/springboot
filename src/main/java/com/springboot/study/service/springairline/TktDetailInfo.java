
package com.springboot.study.service.springairline;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>tktDetailInfo complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="tktDetailInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="destPort" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="flightsDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="flightsNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ifInvoiceOk" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="invoiceContentInfotList" type="{http://wsinterface.remoteservice.booking.springairlines.com/}invoiceContentInfo" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="invoiceId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="orderHeadId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="oriPort" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="proWay" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="travller" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tktDetailInfo", propOrder = {
    "destPort",
    "flightsDate",
    "flightsNo",
    "ifInvoiceOk",
    "invoiceContentInfotList",
    "invoiceId",
    "orderHeadId",
    "oriPort",
    "proWay",
    "travller"
})
public class TktDetailInfo {

    protected String destPort;
    protected String flightsDate;
    protected String flightsNo;
    protected String ifInvoiceOk;
    @XmlElement(nillable = true)
    protected List<InvoiceContentInfo> invoiceContentInfotList;
    protected String invoiceId;
    protected Long orderHeadId;
    protected String oriPort;
    protected Integer proWay;
    protected String travller;

    /**
     * 获取destPort属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestPort() {
        return destPort;
    }

    /**
     * 设置destPort属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDestPort(String value) {
        this.destPort = value;
    }

    /**
     * 获取flightsDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFlightsDate() {
        return flightsDate;
    }

    /**
     * 设置flightsDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFlightsDate(String value) {
        this.flightsDate = value;
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
     * 获取ifInvoiceOk属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIfInvoiceOk() {
        return ifInvoiceOk;
    }

    /**
     * 设置ifInvoiceOk属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIfInvoiceOk(String value) {
        this.ifInvoiceOk = value;
    }

    /**
     * Gets the value of the invoiceContentInfotList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the invoiceContentInfotList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInvoiceContentInfotList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InvoiceContentInfo }
     * 
     * 
     */
    public List<InvoiceContentInfo> getInvoiceContentInfotList() {
        if (invoiceContentInfotList == null) {
            invoiceContentInfotList = new ArrayList<InvoiceContentInfo>();
        }
        return this.invoiceContentInfotList;
    }

    /**
     * 获取invoiceId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInvoiceId() {
        return invoiceId;
    }

    /**
     * 设置invoiceId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInvoiceId(String value) {
        this.invoiceId = value;
    }

    /**
     * 获取orderHeadId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getOrderHeadId() {
        return orderHeadId;
    }

    /**
     * 设置orderHeadId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setOrderHeadId(Long value) {
        this.orderHeadId = value;
    }

    /**
     * 获取oriPort属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOriPort() {
        return oriPort;
    }

    /**
     * 设置oriPort属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOriPort(String value) {
        this.oriPort = value;
    }

    /**
     * 获取proWay属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getProWay() {
        return proWay;
    }

    /**
     * 设置proWay属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setProWay(Integer value) {
        this.proWay = value;
    }

    /**
     * 获取travller属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTravller() {
        return travller;
    }

    /**
     * 设置travller属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTravller(String value) {
        this.travller = value;
    }

}
