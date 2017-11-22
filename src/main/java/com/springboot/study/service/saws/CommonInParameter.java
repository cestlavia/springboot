
package com.springboot.study.service.saws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>commonInParameter complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="commonInParameter">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="usernameToken" type="{http://wsinterface.remoteservice.booking.springairlines.com/}usernameToken" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "commonInParameter", propOrder = {
    "usernameToken"
})
@XmlSeeAlso({
    QueryOrderInfoForSltQueryBean.class,
    SearchBeanOfSearchFlightsSP.class,
    CancelFlightBgAppInputBean.class,
    GetOrderDetailInfoQueryBean.class,
    InfoBeanOfGetSubProdBooked.class,
    SearchBeanOfReceptionFlights.class,
    GetFlightsCanBgInputBean.class,
    GetSpecificPriceInputBean.class,
    SearchFlightsBatchSearchBean.class,
    ReqBeanOfTktDetail.class,
    ReqBeanOfCreateInvoice.class,
    BookSubProdBatchInputBean.class,
    XprodBeanOfCheckBindInputBean.class,
    FlightSeatsInfoBean.class,
    GetTravelBaoJiDetailInfoQueryBean.class,
    SearchFlightsBySegIdBean.class,
    QueryFlightBgAppInfoInputBean.class,
    CalcRetTktFeeInputBean.class,
    ApplyReturnTicketInputBean.class,
    GetFlightBgAppInputBean.class,
    GetOtherFyDetailInputBean.class,
    InfoBeanOfGetSubProdByTkt.class,
    GetMoneyClassSearchBean.class,
    SearchTicketDetailResultBean.class,
    BookOrderBookBean.class,
    GetOrderSumInfoQueryBean.class,
    GetCountryAreaCodeSearchBean.class,
    SearchTicketDetailBean.class,
    SubmitFlightBgAppInputBean.class,
    GetKeguiTotalDescriptionInputBean.class,
    CancelOrderInputBean.class,
    ReqBeanOfGetInvoice.class,
    FlightSeatNoBean.class,
    GetSubProdBySegInputBean.class
})
public abstract class CommonInParameter {

    protected UsernameToken usernameToken;

    /**
     * 获取usernameToken属性的值。
     * 
     * @return
     *     possible object is
     *     {@link UsernameToken }
     *     
     */
    public UsernameToken getUsernameToken() {
        return usernameToken;
    }

    /**
     * 设置usernameToken属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link UsernameToken }
     *     
     */
    public void setUsernameToken(UsernameToken value) {
        this.usernameToken = value;
    }

}
