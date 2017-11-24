
package com.springboot.study.service.springairline;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>orderInfoForSlt complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="orderInfoForSlt"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="arrive_place" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="arrive_time" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="codeno" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="flights_date" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="flights_no" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="flights_order_head_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="flights_order_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="flights_segment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="leave_place" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="leave_time" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MAC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MAD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MAE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="nation_flag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="order_date" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="other_fee" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="other_fy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="out_ticket_date" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="sale_price" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="seats_name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="segment_price" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ticket_no" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ticket_status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="username" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "orderInfoForSlt", propOrder = {
    "arrivePlace",
    "arriveTime",
    "codeno",
    "flightsDate",
    "flightsNo",
    "flightsOrderHeadId",
    "flightsOrderId",
    "flightsSegment",
    "leavePlace",
    "leaveTime",
    "mac",
    "mad",
    "mae",
    "nationFlag",
    "orderDate",
    "otherFee",
    "otherFy",
    "outTicketDate",
    "salePrice",
    "seatsName",
    "segmentPrice",
    "ticketNo",
    "ticketStatus",
    "username"
})
public class OrderInfoForSlt {

    @XmlElement(name = "arrive_place")
    protected String arrivePlace;
    @XmlElement(name = "arrive_time")
    protected String arriveTime;
    protected String codeno;
    @XmlElement(name = "flights_date")
    protected String flightsDate;
    @XmlElement(name = "flights_no")
    protected String flightsNo;
    @XmlElement(name = "flights_order_head_id")
    protected String flightsOrderHeadId;
    @XmlElement(name = "flights_order_id")
    protected String flightsOrderId;
    @XmlElement(name = "flights_segment")
    protected String flightsSegment;
    @XmlElement(name = "leave_place")
    protected String leavePlace;
    @XmlElement(name = "leave_time")
    protected String leaveTime;
    @XmlElement(name = "MAC")
    protected String mac;
    @XmlElement(name = "MAD")
    protected String mad;
    @XmlElement(name = "MAE")
    protected String mae;
    @XmlElement(name = "nation_flag")
    protected String nationFlag;
    @XmlElement(name = "order_date")
    protected String orderDate;
    @XmlElement(name = "other_fee")
    protected String otherFee;
    @XmlElement(name = "other_fy")
    protected String otherFy;
    @XmlElement(name = "out_ticket_date")
    protected String outTicketDate;
    @XmlElement(name = "sale_price")
    protected String salePrice;
    @XmlElement(name = "seats_name")
    protected String seatsName;
    @XmlElement(name = "segment_price")
    protected String segmentPrice;
    @XmlElement(name = "ticket_no")
    protected String ticketNo;
    @XmlElement(name = "ticket_status")
    protected String ticketStatus;
    protected String username;

    /**
     * 获取arrivePlace属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArrivePlace() {
        return arrivePlace;
    }

    /**
     * 设置arrivePlace属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArrivePlace(String value) {
        this.arrivePlace = value;
    }

    /**
     * 获取arriveTime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArriveTime() {
        return arriveTime;
    }

    /**
     * 设置arriveTime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArriveTime(String value) {
        this.arriveTime = value;
    }

    /**
     * 获取codeno属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodeno() {
        return codeno;
    }

    /**
     * 设置codeno属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodeno(String value) {
        this.codeno = value;
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
     * 获取flightsOrderHeadId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFlightsOrderHeadId() {
        return flightsOrderHeadId;
    }

    /**
     * 设置flightsOrderHeadId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFlightsOrderHeadId(String value) {
        this.flightsOrderHeadId = value;
    }

    /**
     * 获取flightsOrderId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFlightsOrderId() {
        return flightsOrderId;
    }

    /**
     * 设置flightsOrderId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFlightsOrderId(String value) {
        this.flightsOrderId = value;
    }

    /**
     * 获取flightsSegment属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFlightsSegment() {
        return flightsSegment;
    }

    /**
     * 设置flightsSegment属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFlightsSegment(String value) {
        this.flightsSegment = value;
    }

    /**
     * 获取leavePlace属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLeavePlace() {
        return leavePlace;
    }

    /**
     * 设置leavePlace属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLeavePlace(String value) {
        this.leavePlace = value;
    }

    /**
     * 获取leaveTime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLeaveTime() {
        return leaveTime;
    }

    /**
     * 设置leaveTime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLeaveTime(String value) {
        this.leaveTime = value;
    }

    /**
     * 获取mac属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMAC() {
        return mac;
    }

    /**
     * 设置mac属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMAC(String value) {
        this.mac = value;
    }

    /**
     * 获取mad属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMAD() {
        return mad;
    }

    /**
     * 设置mad属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMAD(String value) {
        this.mad = value;
    }

    /**
     * 获取mae属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMAE() {
        return mae;
    }

    /**
     * 设置mae属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMAE(String value) {
        this.mae = value;
    }

    /**
     * 获取nationFlag属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNationFlag() {
        return nationFlag;
    }

    /**
     * 设置nationFlag属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNationFlag(String value) {
        this.nationFlag = value;
    }

    /**
     * 获取orderDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderDate() {
        return orderDate;
    }

    /**
     * 设置orderDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderDate(String value) {
        this.orderDate = value;
    }

    /**
     * 获取otherFee属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOtherFee() {
        return otherFee;
    }

    /**
     * 设置otherFee属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOtherFee(String value) {
        this.otherFee = value;
    }

    /**
     * 获取otherFy属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOtherFy() {
        return otherFy;
    }

    /**
     * 设置otherFy属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOtherFy(String value) {
        this.otherFy = value;
    }

    /**
     * 获取outTicketDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutTicketDate() {
        return outTicketDate;
    }

    /**
     * 设置outTicketDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutTicketDate(String value) {
        this.outTicketDate = value;
    }

    /**
     * 获取salePrice属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSalePrice() {
        return salePrice;
    }

    /**
     * 设置salePrice属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSalePrice(String value) {
        this.salePrice = value;
    }

    /**
     * 获取seatsName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSeatsName() {
        return seatsName;
    }

    /**
     * 设置seatsName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSeatsName(String value) {
        this.seatsName = value;
    }

    /**
     * 获取segmentPrice属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSegmentPrice() {
        return segmentPrice;
    }

    /**
     * 设置segmentPrice属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSegmentPrice(String value) {
        this.segmentPrice = value;
    }

    /**
     * 获取ticketNo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTicketNo() {
        return ticketNo;
    }

    /**
     * 设置ticketNo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTicketNo(String value) {
        this.ticketNo = value;
    }

    /**
     * 获取ticketStatus属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTicketStatus() {
        return ticketStatus;
    }

    /**
     * 设置ticketStatus属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTicketStatus(String value) {
        this.ticketStatus = value;
    }

    /**
     * 获取username属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsername() {
        return username;
    }

    /**
     * 设置username属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsername(String value) {
        this.username = value;
    }

}
