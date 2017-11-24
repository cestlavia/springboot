
package com.springboot.study.service.springairline;

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
 * &lt;complexType name="commonInParameter"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="usernameToken" type="{http://wsinterface.remoteservice.booking.springairlines.com/}usernameToken" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "commonInParameter", propOrder = {
    "usernameToken"
})
@XmlSeeAlso({
    GetKeguiTotalDescriptionInputBean.class,
    GetCountryAreaCodeSearchBean.class,
    SearchFlightsBySegIdBean.class,
    GetSubProdBySegInputBean.class,
    CancelOrderInputBean.class,
    QueryFlightBgAppInfoInputBean.class,
    GetFlightBgAppInputBean.class,
    SubmitFlightBgAppInputBean.class,
    ReqBeanOfCreateInvoice.class,
    GetTravelBaoJiDetailInfoQueryBean.class,
    GetOrderDetailInfoQueryBean.class,
    SearchBeanOfSearchFlightsSP.class,
    InfoBeanOfGetSubProdByTkt.class,
    SearchFlightsBatchSearchBean.class,
    SearchTicketDetailBean.class,
    SearchTicketDetailResultBean.class,
    BookSubProdBatchInputBean.class,
    ApplyReturnTicketInputBean.class,
    QueryOrderInfoForSltQueryBean.class,
    GetMoneyClassSearchBean.class,
    FlightSeatNoBean.class,
    ReqBeanOfTktDetail.class,
    CancelFlightBgAppInputBean.class,
    BookOrderBookBean.class,
    GetOtherFyDetailInputBean.class,
    GetFlightsCanBgInputBean.class,
    FlightSeatsInfoBean.class,
    GetSpecificPriceInputBean.class,
    XprodBeanOfCheckBindInputBean.class,
    ReqBeanOfGetInvoice.class,
    InfoBeanOfGetSubProdBooked.class,
    GetOrderSumInfoQueryBean.class,
    CalcRetTktFeeInputBean.class,
    SearchBeanOfReceptionFlights.class
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
