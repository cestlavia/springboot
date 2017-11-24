
package com.springboot.study.service.springairline;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>travelBaoJiInfo complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="travelBaoJiInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ad_fy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="codeno" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="codetype" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="company_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="dest_airport" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="dest_airport_n" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="dest_cfd1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="dest_cfd1_n" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="dest_city" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="dest_city_n" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ex_cfd1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ex_cfd1_n" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="flights_date" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="flights_no" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="flights_order_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="lot_no" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="origin_airport" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="origin_airport_n" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="origin_city" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="origin_city_n" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="origin_std" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="other_fy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="port_pay" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="seats_name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="segment_head_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="sex" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="terminal_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ticket_no" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ticket_price" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "travelBaoJiInfo", propOrder = {
    "adFy",
    "codeno",
    "codetype",
    "companyId",
    "destAirport",
    "destAirportN",
    "destCfd1",
    "destCfd1N",
    "destCity",
    "destCityN",
    "exCfd1",
    "exCfd1N",
    "flightsDate",
    "flightsNo",
    "flightsOrderId",
    "lotNo",
    "name",
    "originAirport",
    "originAirportN",
    "originCity",
    "originCityN",
    "originStd",
    "otherFy",
    "portPay",
    "seatsName",
    "segmentHeadId",
    "sex",
    "status",
    "terminalId",
    "ticketNo",
    "ticketPrice"
})
@XmlSeeAlso({
    TravelBaoJiInfo1 .class
})
public class TravelBaoJiInfo {

    @XmlElement(name = "ad_fy")
    protected String adFy;
    protected String codeno;
    protected String codetype;
    @XmlElement(name = "company_id")
    protected String companyId;
    @XmlElement(name = "dest_airport")
    protected String destAirport;
    @XmlElement(name = "dest_airport_n")
    protected String destAirportN;
    @XmlElement(name = "dest_cfd1")
    protected String destCfd1;
    @XmlElement(name = "dest_cfd1_n")
    protected String destCfd1N;
    @XmlElement(name = "dest_city")
    protected String destCity;
    @XmlElement(name = "dest_city_n")
    protected String destCityN;
    @XmlElement(name = "ex_cfd1")
    protected String exCfd1;
    @XmlElement(name = "ex_cfd1_n")
    protected String exCfd1N;
    @XmlElement(name = "flights_date")
    protected String flightsDate;
    @XmlElement(name = "flights_no")
    protected String flightsNo;
    @XmlElement(name = "flights_order_id")
    protected String flightsOrderId;
    @XmlElement(name = "lot_no")
    protected String lotNo;
    protected String name;
    @XmlElement(name = "origin_airport")
    protected String originAirport;
    @XmlElement(name = "origin_airport_n")
    protected String originAirportN;
    @XmlElement(name = "origin_city")
    protected String originCity;
    @XmlElement(name = "origin_city_n")
    protected String originCityN;
    @XmlElement(name = "origin_std")
    protected String originStd;
    @XmlElement(name = "other_fy")
    protected String otherFy;
    @XmlElement(name = "port_pay")
    protected String portPay;
    @XmlElement(name = "seats_name")
    protected String seatsName;
    @XmlElement(name = "segment_head_id")
    protected String segmentHeadId;
    protected String sex;
    protected String status;
    @XmlElement(name = "terminal_id")
    protected String terminalId;
    @XmlElement(name = "ticket_no")
    protected String ticketNo;
    @XmlElement(name = "ticket_price")
    protected String ticketPrice;

    /**
     * 获取adFy属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdFy() {
        return adFy;
    }

    /**
     * 设置adFy属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdFy(String value) {
        this.adFy = value;
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
     * 获取codetype属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodetype() {
        return codetype;
    }

    /**
     * 设置codetype属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodetype(String value) {
        this.codetype = value;
    }

    /**
     * 获取companyId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompanyId() {
        return companyId;
    }

    /**
     * 设置companyId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompanyId(String value) {
        this.companyId = value;
    }

    /**
     * 获取destAirport属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestAirport() {
        return destAirport;
    }

    /**
     * 设置destAirport属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDestAirport(String value) {
        this.destAirport = value;
    }

    /**
     * 获取destAirportN属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestAirportN() {
        return destAirportN;
    }

    /**
     * 设置destAirportN属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDestAirportN(String value) {
        this.destAirportN = value;
    }

    /**
     * 获取destCfd1属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestCfd1() {
        return destCfd1;
    }

    /**
     * 设置destCfd1属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDestCfd1(String value) {
        this.destCfd1 = value;
    }

    /**
     * 获取destCfd1N属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestCfd1N() {
        return destCfd1N;
    }

    /**
     * 设置destCfd1N属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDestCfd1N(String value) {
        this.destCfd1N = value;
    }

    /**
     * 获取destCity属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestCity() {
        return destCity;
    }

    /**
     * 设置destCity属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDestCity(String value) {
        this.destCity = value;
    }

    /**
     * 获取destCityN属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestCityN() {
        return destCityN;
    }

    /**
     * 设置destCityN属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDestCityN(String value) {
        this.destCityN = value;
    }

    /**
     * 获取exCfd1属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExCfd1() {
        return exCfd1;
    }

    /**
     * 设置exCfd1属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExCfd1(String value) {
        this.exCfd1 = value;
    }

    /**
     * 获取exCfd1N属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExCfd1N() {
        return exCfd1N;
    }

    /**
     * 设置exCfd1N属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExCfd1N(String value) {
        this.exCfd1N = value;
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
     * 获取lotNo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLotNo() {
        return lotNo;
    }

    /**
     * 设置lotNo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLotNo(String value) {
        this.lotNo = value;
    }

    /**
     * 获取name属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * 设置name属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * 获取originAirport属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOriginAirport() {
        return originAirport;
    }

    /**
     * 设置originAirport属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOriginAirport(String value) {
        this.originAirport = value;
    }

    /**
     * 获取originAirportN属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOriginAirportN() {
        return originAirportN;
    }

    /**
     * 设置originAirportN属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOriginAirportN(String value) {
        this.originAirportN = value;
    }

    /**
     * 获取originCity属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOriginCity() {
        return originCity;
    }

    /**
     * 设置originCity属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOriginCity(String value) {
        this.originCity = value;
    }

    /**
     * 获取originCityN属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOriginCityN() {
        return originCityN;
    }

    /**
     * 设置originCityN属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOriginCityN(String value) {
        this.originCityN = value;
    }

    /**
     * 获取originStd属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOriginStd() {
        return originStd;
    }

    /**
     * 设置originStd属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOriginStd(String value) {
        this.originStd = value;
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
     * 获取portPay属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPortPay() {
        return portPay;
    }

    /**
     * 设置portPay属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPortPay(String value) {
        this.portPay = value;
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
     * 获取segmentHeadId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSegmentHeadId() {
        return segmentHeadId;
    }

    /**
     * 设置segmentHeadId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSegmentHeadId(String value) {
        this.segmentHeadId = value;
    }

    /**
     * 获取sex属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSex() {
        return sex;
    }

    /**
     * 设置sex属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSex(String value) {
        this.sex = value;
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
     * 获取terminalId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTerminalId() {
        return terminalId;
    }

    /**
     * 设置terminalId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTerminalId(String value) {
        this.terminalId = value;
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
     * 获取ticketPrice属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTicketPrice() {
        return ticketPrice;
    }

    /**
     * 设置ticketPrice属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTicketPrice(String value) {
        this.ticketPrice = value;
    }

}
