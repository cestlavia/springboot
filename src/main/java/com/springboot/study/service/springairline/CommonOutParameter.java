
package com.springboot.study.service.springairline;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>commonOutParameter complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="commonOutParameter"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="errCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ifSuccess" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "commonOutParameter", propOrder = {
    "errCode",
    "ifSuccess"
})
@XmlSeeAlso({
    GetKeguiTotalDescriptionResultBean.class,
    GetCountryAreaCodeResultBean.class,
    SearchFlightsBatchResultBean2 .class,
    GetSubProdBySegResultBean.class,
    CancelOrderResultBean.class,
    QueryFlightBgAppInfoResultBean.class,
    GetFlightBgAppResultBean.class,
    SubmitFlightBgAppResultBean.class,
    RetBeanofCreateInvoice.class,
    GetTravelBaoJiDetailInfoResultBean1 .class,
    GetOrderDetailInfoResultBean.class,
    SearchFlightsBatchResultBean.class,
    BookSubProdBatchResultBean.class,
    GetTravelBaoJiDetailInfoResultBean.class,
    ApplyReturnTicketResultBean.class,
    QueryOrderInfoForSltResultBean.class,
    GetMoneyClassResultBean.class,
    GetRetBeanOfQueryFlightSeatNo.class,
    RetBeanOfTktDetail.class,
    CancelFlightBgAppResultBean.class,
    BookOrderResultBean.class,
    GetOtherFyDetailResultBean.class,
    GetFlightsCanBgResultBean.class,
    GetRetFlightSeatsBean.class,
    ApplyReturnTicketResultBean2 .class,
    GetSpecificPriceResultBean.class,
    XprodBeanOfCheckBindResultBean.class,
    RetBeanofGetInvoice.class,
    GetOrderSumInfoResultBean.class,
    CalcRetTktFeeResultBean.class,
    GetBeanOfReceptionFlights.class
})
public abstract class CommonOutParameter {

    protected String errCode;
    protected String ifSuccess;

    /**
     * 获取errCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrCode() {
        return errCode;
    }

    /**
     * 设置errCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrCode(String value) {
        this.errCode = value;
    }

    /**
     * 获取ifSuccess属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIfSuccess() {
        return ifSuccess;
    }

    /**
     * 设置ifSuccess属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIfSuccess(String value) {
        this.ifSuccess = value;
    }

}
