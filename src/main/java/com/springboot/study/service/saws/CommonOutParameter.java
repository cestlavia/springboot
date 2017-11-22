
package com.springboot.study.service.saws;

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
 * &lt;complexType name="commonOutParameter">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="errCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ifSuccess" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
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
    CalcRetTktFeeResultBean.class,
    SearchFlightsBatchResultBean.class,
    GetOtherFyDetailResultBean.class,
    XprodBeanOfCheckBindResultBean.class,
    BookSubProdBatchResultBean.class,
    SearchFlightsBatchResultBean2 .class,
    GetFlightsCanBgResultBean.class,
    RetBeanOfTktDetail.class,
    CancelOrderResultBean.class,
    GetMoneyClassResultBean.class,
    GetOrderDetailInfoResultBean.class,
    QueryOrderInfoForSltResultBean.class,
    QueryFlightBgAppInfoResultBean.class,
    GetTravelBaoJiDetailInfoResultBean.class,
    ApplyReturnTicketResultBean.class,
    RetBeanofGetInvoice.class,
    SubmitFlightBgAppResultBean.class,
    GetRetBeanOfQueryFlightSeatNo.class,
    GetSpecificPriceResultBean.class,
    BookOrderResultBean.class,
    CancelFlightBgAppResultBean.class,
    GetTravelBaoJiDetailInfoResultBean1 .class,
    GetRetFlightSeatsBean.class,
    RetBeanofCreateInvoice.class,
    ApplyReturnTicketResultBean2 .class,
    GetBeanOfReceptionFlights.class,
    GetOrderSumInfoResultBean.class,
    GetSubProdBySegResultBean.class,
    GetKeguiTotalDescriptionResultBean.class,
    GetCountryAreaCodeResultBean.class,
    GetFlightBgAppResultBean.class
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
