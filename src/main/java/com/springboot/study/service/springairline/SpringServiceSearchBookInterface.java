package com.springboot.study.service.springairline;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 3.2.1
 * 2017-11-23T10:01:49.397+08:00
 * Generated source version: 3.2.1
 * 
 */
@WebService(targetNamespace = "http://wsinterface.remoteservice.booking.springairlines.com/", name = "SpringServiceSearchBookInterface")
@XmlSeeAlso({ObjectFactory.class})
public interface SpringServiceSearchBookInterface {

    @WebMethod(operationName = "GetInvoice")
    @RequestWrapper(localName = "GetInvoice", targetNamespace = "http://wsinterface.remoteservice.booking.springairlines.com/", className = "com.springboot.study.service.springairline.GetInvoice")
    @ResponseWrapper(localName = "GetInvoiceResponse", targetNamespace = "http://wsinterface.remoteservice.booking.springairlines.com/", className = "com.springboot.study.service.springairline.GetInvoiceResponse")
    @WebResult(name = "return", targetNamespace = "")
    public com.springboot.study.service.springairline.RetBeanofGetInvoice getInvoice(
        @WebParam(name = "reqBean", targetNamespace = "")
        com.springboot.study.service.springairline.ReqBeanOfGetInvoice reqBean
    );

    @WebMethod
    @RequestWrapper(localName = "getSubProdBySeg", targetNamespace = "http://wsinterface.remoteservice.booking.springairlines.com/", className = "com.springboot.study.service.springairline.GetSubProdBySeg")
    @ResponseWrapper(localName = "getSubProdBySegResponse", targetNamespace = "http://wsinterface.remoteservice.booking.springairlines.com/", className = "com.springboot.study.service.springairline.GetSubProdBySegResponse")
    @WebResult(name = "return", targetNamespace = "")
    public com.springboot.study.service.springairline.GetSubProdBySegResultBean getSubProdBySeg(
        @WebParam(name = "searchInfo", targetNamespace = "")
        com.springboot.study.service.springairline.GetSubProdBySegInputBean searchInfo
    );

    @WebMethod
    @RequestWrapper(localName = "searchFlightsBatch", targetNamespace = "http://wsinterface.remoteservice.booking.springairlines.com/", className = "com.springboot.study.service.springairline.SearchFlightsBatch")
    @ResponseWrapper(localName = "searchFlightsBatchResponse", targetNamespace = "http://wsinterface.remoteservice.booking.springairlines.com/", className = "com.springboot.study.service.springairline.SearchFlightsBatchResponse")
    @WebResult(name = "return", targetNamespace = "")
    public com.springboot.study.service.springairline.SearchFlightsBatchResultBean searchFlightsBatch(
        @WebParam(name = "searchInfo", targetNamespace = "")
        com.springboot.study.service.springairline.SearchFlightsBatchSearchBean searchInfo
    );

    @WebMethod
    @RequestWrapper(localName = "bookOrder", targetNamespace = "http://wsinterface.remoteservice.booking.springairlines.com/", className = "com.springboot.study.service.springairline.BookOrder")
    @ResponseWrapper(localName = "bookOrderResponse", targetNamespace = "http://wsinterface.remoteservice.booking.springairlines.com/", className = "com.springboot.study.service.springairline.BookOrderResponse")
    @WebResult(name = "return", targetNamespace = "")
    public com.springboot.study.service.springairline.BookOrderResultBean bookOrder(
        @WebParam(name = "bookInfo", targetNamespace = "")
        com.springboot.study.service.springairline.BookOrderBookBean bookInfo
    );

    @WebMethod
    @RequestWrapper(localName = "getMoneyClass", targetNamespace = "http://wsinterface.remoteservice.booking.springairlines.com/", className = "com.springboot.study.service.springairline.GetMoneyClass")
    @ResponseWrapper(localName = "getMoneyClassResponse", targetNamespace = "http://wsinterface.remoteservice.booking.springairlines.com/", className = "com.springboot.study.service.springairline.GetMoneyClassResponse")
    @WebResult(name = "return", targetNamespace = "")
    public com.springboot.study.service.springairline.GetMoneyClassResultBean getMoneyClass(
        @WebParam(name = "searchInfo", targetNamespace = "")
        com.springboot.study.service.springairline.GetMoneyClassSearchBean searchInfo
    );

    @WebMethod
    @RequestWrapper(localName = "getKeguiTotalDescription", targetNamespace = "http://wsinterface.remoteservice.booking.springairlines.com/", className = "com.springboot.study.service.springairline.GetKeguiTotalDescription")
    @ResponseWrapper(localName = "getKeguiTotalDescriptionResponse", targetNamespace = "http://wsinterface.remoteservice.booking.springairlines.com/", className = "com.springboot.study.service.springairline.GetKeguiTotalDescriptionResponse")
    @WebResult(name = "return", targetNamespace = "")
    public com.springboot.study.service.springairline.GetKeguiTotalDescriptionResultBean getKeguiTotalDescription(
        @WebParam(name = "searchInfo", targetNamespace = "")
        com.springboot.study.service.springairline.GetKeguiTotalDescriptionInputBean searchInfo
    );

    @WebMethod
    @RequestWrapper(localName = "submitFlightBgApp2", targetNamespace = "http://wsinterface.remoteservice.booking.springairlines.com/", className = "com.springboot.study.service.springairline.SubmitFlightBgApp2")
    @ResponseWrapper(localName = "submitFlightBgApp2Response", targetNamespace = "http://wsinterface.remoteservice.booking.springairlines.com/", className = "com.springboot.study.service.springairline.SubmitFlightBgApp2Response")
    @WebResult(name = "return", targetNamespace = "")
    public com.springboot.study.service.springairline.SubmitFlightBgAppResultBean submitFlightBgApp2(
        @WebParam(name = "searchInfo", targetNamespace = "")
        com.springboot.study.service.springairline.SubmitFlightBgAppInputBean searchInfo
    );

    @WebMethod(operationName = "CreateInvoice")
    @RequestWrapper(localName = "CreateInvoice", targetNamespace = "http://wsinterface.remoteservice.booking.springairlines.com/", className = "com.springboot.study.service.springairline.CreateInvoice")
    @ResponseWrapper(localName = "CreateInvoiceResponse", targetNamespace = "http://wsinterface.remoteservice.booking.springairlines.com/", className = "com.springboot.study.service.springairline.CreateInvoiceResponse")
    @WebResult(name = "return", targetNamespace = "")
    public com.springboot.study.service.springairline.RetBeanofCreateInvoice createInvoice(
        @WebParam(name = "reqBean", targetNamespace = "")
        com.springboot.study.service.springairline.ReqBeanOfCreateInvoice reqBean
    );

    @WebMethod
    @RequestWrapper(localName = "getFlightsCanBg", targetNamespace = "http://wsinterface.remoteservice.booking.springairlines.com/", className = "com.springboot.study.service.springairline.GetFlightsCanBg")
    @ResponseWrapper(localName = "getFlightsCanBgResponse", targetNamespace = "http://wsinterface.remoteservice.booking.springairlines.com/", className = "com.springboot.study.service.springairline.GetFlightsCanBgResponse")
    @WebResult(name = "return", targetNamespace = "")
    public com.springboot.study.service.springairline.GetFlightsCanBgResultBean getFlightsCanBg(
        @WebParam(name = "searchInfo", targetNamespace = "")
        com.springboot.study.service.springairline.GetFlightsCanBgInputBean searchInfo
    );

    @WebMethod
    @RequestWrapper(localName = "applyReturnTicket2", targetNamespace = "http://wsinterface.remoteservice.booking.springairlines.com/", className = "com.springboot.study.service.springairline.ApplyReturnTicket2")
    @ResponseWrapper(localName = "applyReturnTicket2Response", targetNamespace = "http://wsinterface.remoteservice.booking.springairlines.com/", className = "com.springboot.study.service.springairline.ApplyReturnTicket2Response")
    @WebResult(name = "return", targetNamespace = "")
    public com.springboot.study.service.springairline.ApplyReturnTicketResultBean2 applyReturnTicket2(
        @WebParam(name = "appInfo", targetNamespace = "")
        com.springboot.study.service.springairline.ApplyReturnTicketInputBean appInfo
    );

    @WebMethod
    @RequestWrapper(localName = "getFlightBgApp", targetNamespace = "http://wsinterface.remoteservice.booking.springairlines.com/", className = "com.springboot.study.service.springairline.GetFlightBgApp")
    @ResponseWrapper(localName = "getFlightBgAppResponse", targetNamespace = "http://wsinterface.remoteservice.booking.springairlines.com/", className = "com.springboot.study.service.springairline.GetFlightBgAppResponse")
    @WebResult(name = "return", targetNamespace = "")
    public com.springboot.study.service.springairline.GetFlightBgAppResultBean getFlightBgApp(
        @WebParam(name = "searchInfo", targetNamespace = "")
        com.springboot.study.service.springairline.GetFlightBgAppInputBean searchInfo
    );

    @WebMethod
    @RequestWrapper(localName = "getKeguiTotalDescription2", targetNamespace = "http://wsinterface.remoteservice.booking.springairlines.com/", className = "com.springboot.study.service.springairline.GetKeguiTotalDescription2")
    @ResponseWrapper(localName = "getKeguiTotalDescription2Response", targetNamespace = "http://wsinterface.remoteservice.booking.springairlines.com/", className = "com.springboot.study.service.springairline.GetKeguiTotalDescription2Response")
    @WebResult(name = "return", targetNamespace = "")
    public com.springboot.study.service.springairline.GetKeguiTotalDescriptionResultBean getKeguiTotalDescription2(
        @WebParam(name = "searchInfo", targetNamespace = "")
        com.springboot.study.service.springairline.GetKeguiTotalDescriptionInputBean searchInfo
    );

    @WebMethod
    @RequestWrapper(localName = "queryOrderInfoForSlt", targetNamespace = "http://wsinterface.remoteservice.booking.springairlines.com/", className = "com.springboot.study.service.springairline.QueryOrderInfoForSlt")
    @ResponseWrapper(localName = "queryOrderInfoForSltResponse", targetNamespace = "http://wsinterface.remoteservice.booking.springairlines.com/", className = "com.springboot.study.service.springairline.QueryOrderInfoForSltResponse")
    @WebResult(name = "return", targetNamespace = "")
    public com.springboot.study.service.springairline.QueryOrderInfoForSltResultBean queryOrderInfoForSlt(
        @WebParam(name = "queryInfo", targetNamespace = "")
        com.springboot.study.service.springairline.QueryOrderInfoForSltQueryBean queryInfo
    );

    @WebMethod
    @RequestWrapper(localName = "applyReturnTicket", targetNamespace = "http://wsinterface.remoteservice.booking.springairlines.com/", className = "com.springboot.study.service.springairline.ApplyReturnTicket")
    @ResponseWrapper(localName = "applyReturnTicketResponse", targetNamespace = "http://wsinterface.remoteservice.booking.springairlines.com/", className = "com.springboot.study.service.springairline.ApplyReturnTicketResponse")
    @WebResult(name = "return", targetNamespace = "")
    public com.springboot.study.service.springairline.ApplyReturnTicketResultBean applyReturnTicket(
        @WebParam(name = "appInfo", targetNamespace = "")
        com.springboot.study.service.springairline.ApplyReturnTicketInputBean appInfo
    );

    @WebMethod
    @RequestWrapper(localName = "calcRetTktFee", targetNamespace = "http://wsinterface.remoteservice.booking.springairlines.com/", className = "com.springboot.study.service.springairline.CalcRetTktFee")
    @ResponseWrapper(localName = "calcRetTktFeeResponse", targetNamespace = "http://wsinterface.remoteservice.booking.springairlines.com/", className = "com.springboot.study.service.springairline.CalcRetTktFeeResponse")
    @WebResult(name = "return", targetNamespace = "")
    public com.springboot.study.service.springairline.CalcRetTktFeeResultBean calcRetTktFee(
        @WebParam(name = "calcInfo", targetNamespace = "")
        com.springboot.study.service.springairline.CalcRetTktFeeInputBean calcInfo
    );

    @WebMethod
    @RequestWrapper(localName = "searchFlightsBySegId", targetNamespace = "http://wsinterface.remoteservice.booking.springairlines.com/", className = "com.springboot.study.service.springairline.SearchFlightsBySegId")
    @ResponseWrapper(localName = "searchFlightsBySegIdResponse", targetNamespace = "http://wsinterface.remoteservice.booking.springairlines.com/", className = "com.springboot.study.service.springairline.SearchFlightsBySegIdResponse")
    @WebResult(name = "return", targetNamespace = "")
    public com.springboot.study.service.springairline.SearchFlightsBatchResultBean searchFlightsBySegId(
        @WebParam(name = "searchInfo", targetNamespace = "")
        com.springboot.study.service.springairline.SearchFlightsBySegIdBean searchInfo
    );

    @WebMethod
    @RequestWrapper(localName = "getOrderDetailInfo", targetNamespace = "http://wsinterface.remoteservice.booking.springairlines.com/", className = "com.springboot.study.service.springairline.GetOrderDetailInfo")
    @ResponseWrapper(localName = "getOrderDetailInfoResponse", targetNamespace = "http://wsinterface.remoteservice.booking.springairlines.com/", className = "com.springboot.study.service.springairline.GetOrderDetailInfoResponse")
    @WebResult(name = "return", targetNamespace = "")
    public com.springboot.study.service.springairline.GetOrderDetailInfoResultBean getOrderDetailInfo(
        @WebParam(name = "queryInfo", targetNamespace = "")
        com.springboot.study.service.springairline.GetOrderDetailInfoQueryBean queryInfo
    );

    @WebMethod
    @RequestWrapper(localName = "queryFlightBgAppInfo", targetNamespace = "http://wsinterface.remoteservice.booking.springairlines.com/", className = "com.springboot.study.service.springairline.QueryFlightBgAppInfo")
    @ResponseWrapper(localName = "queryFlightBgAppInfoResponse", targetNamespace = "http://wsinterface.remoteservice.booking.springairlines.com/", className = "com.springboot.study.service.springairline.QueryFlightBgAppInfoResponse")
    @WebResult(name = "return", targetNamespace = "")
    public com.springboot.study.service.springairline.QueryFlightBgAppInfoResultBean queryFlightBgAppInfo(
        @WebParam(name = "searchInfo", targetNamespace = "")
        com.springboot.study.service.springairline.QueryFlightBgAppInfoInputBean searchInfo
    );

    @WebMethod
    @RequestWrapper(localName = "searchFlightsBatchSP", targetNamespace = "http://wsinterface.remoteservice.booking.springairlines.com/", className = "com.springboot.study.service.springairline.SearchFlightsBatchSP")
    @ResponseWrapper(localName = "searchFlightsBatchSPResponse", targetNamespace = "http://wsinterface.remoteservice.booking.springairlines.com/", className = "com.springboot.study.service.springairline.SearchFlightsBatchSPResponse")
    @WebResult(name = "return", targetNamespace = "")
    public com.springboot.study.service.springairline.SearchFlightsBatchResultBean searchFlightsBatchSP(
        @WebParam(name = "searchInfo", targetNamespace = "")
        com.springboot.study.service.springairline.SearchBeanOfSearchFlightsSP searchInfo
    );

    @WebMethod
    @RequestWrapper(localName = "queryEInvoiceOrders", targetNamespace = "http://wsinterface.remoteservice.booking.springairlines.com/", className = "com.springboot.study.service.springairline.QueryEInvoiceOrders")
    @ResponseWrapper(localName = "queryEInvoiceOrdersResponse", targetNamespace = "http://wsinterface.remoteservice.booking.springairlines.com/", className = "com.springboot.study.service.springairline.QueryEInvoiceOrdersResponse")
    @WebResult(name = "return", targetNamespace = "")
    public com.springboot.study.service.springairline.RetBeanOfTktDetail queryEInvoiceOrders(
        @WebParam(name = "reqBean", targetNamespace = "")
        com.springboot.study.service.springairline.ReqBeanOfTktDetail reqBean
    );

    @WebMethod
    @RequestWrapper(localName = "getTravelBaoJiDetailInfo", targetNamespace = "http://wsinterface.remoteservice.booking.springairlines.com/", className = "com.springboot.study.service.springairline.GetTravelBaoJiDetailInfo")
    @ResponseWrapper(localName = "getTravelBaoJiDetailInfoResponse", targetNamespace = "http://wsinterface.remoteservice.booking.springairlines.com/", className = "com.springboot.study.service.springairline.GetTravelBaoJiDetailInfoResponse")
    @WebResult(name = "return", targetNamespace = "")
    public com.springboot.study.service.springairline.GetTravelBaoJiDetailInfoResultBean getTravelBaoJiDetailInfo(
        @WebParam(name = "queryInfo", targetNamespace = "")
        com.springboot.study.service.springairline.GetTravelBaoJiDetailInfoQueryBean queryInfo
    );

    @WebMethod
    @RequestWrapper(localName = "getOtherFyDetail", targetNamespace = "http://wsinterface.remoteservice.booking.springairlines.com/", className = "com.springboot.study.service.springairline.GetOtherFyDetail")
    @ResponseWrapper(localName = "getOtherFyDetailResponse", targetNamespace = "http://wsinterface.remoteservice.booking.springairlines.com/", className = "com.springboot.study.service.springairline.GetOtherFyDetailResponse")
    @WebResult(name = "return", targetNamespace = "")
    public com.springboot.study.service.springairline.GetOtherFyDetailResultBean getOtherFyDetail(
        @WebParam(name = "searchInfo", targetNamespace = "")
        com.springboot.study.service.springairline.GetOtherFyDetailInputBean searchInfo
    );

    @WebMethod
    @RequestWrapper(localName = "cancelOrder", targetNamespace = "http://wsinterface.remoteservice.booking.springairlines.com/", className = "com.springboot.study.service.springairline.CancelOrder")
    @ResponseWrapper(localName = "cancelOrderResponse", targetNamespace = "http://wsinterface.remoteservice.booking.springairlines.com/", className = "com.springboot.study.service.springairline.CancelOrderResponse")
    @WebResult(name = "return", targetNamespace = "")
    public com.springboot.study.service.springairline.CancelOrderResultBean cancelOrder(
        @WebParam(name = "cancelInfo", targetNamespace = "")
        com.springboot.study.service.springairline.CancelOrderInputBean cancelInfo
    );

    @WebMethod
    @RequestWrapper(localName = "searchFlightsBySegId2", targetNamespace = "http://wsinterface.remoteservice.booking.springairlines.com/", className = "com.springboot.study.service.springairline.SearchFlightsBySegId2")
    @ResponseWrapper(localName = "searchFlightsBySegId2Response", targetNamespace = "http://wsinterface.remoteservice.booking.springairlines.com/", className = "com.springboot.study.service.springairline.SearchFlightsBySegId2Response")
    @WebResult(name = "return", targetNamespace = "")
    public com.springboot.study.service.springairline.SearchFlightsBatchResultBean2 searchFlightsBySegId2(
        @WebParam(name = "searchInfo", targetNamespace = "")
        com.springboot.study.service.springairline.SearchFlightsBySegIdBean searchInfo
    );

    @WebMethod
    @RequestWrapper(localName = "submitFlightBgApp", targetNamespace = "http://wsinterface.remoteservice.booking.springairlines.com/", className = "com.springboot.study.service.springairline.SubmitFlightBgApp")
    @ResponseWrapper(localName = "submitFlightBgAppResponse", targetNamespace = "http://wsinterface.remoteservice.booking.springairlines.com/", className = "com.springboot.study.service.springairline.SubmitFlightBgAppResponse")
    @WebResult(name = "return", targetNamespace = "")
    public com.springboot.study.service.springairline.SubmitFlightBgAppResultBean submitFlightBgApp(
        @WebParam(name = "searchInfo", targetNamespace = "")
        com.springboot.study.service.springairline.SubmitFlightBgAppInputBean searchInfo
    );

    @WebMethod
    @RequestWrapper(localName = "getXprodCheckBind", targetNamespace = "http://wsinterface.remoteservice.booking.springairlines.com/", className = "com.springboot.study.service.springairline.GetXprodCheckBind")
    @ResponseWrapper(localName = "getXprodCheckBindResponse", targetNamespace = "http://wsinterface.remoteservice.booking.springairlines.com/", className = "com.springboot.study.service.springairline.GetXprodCheckBindResponse")
    @WebResult(name = "return", targetNamespace = "")
    public com.springboot.study.service.springairline.XprodBeanOfCheckBindResultBean getXprodCheckBind(
        @WebParam(name = "searchInfo", targetNamespace = "")
        com.springboot.study.service.springairline.XprodBeanOfCheckBindInputBean searchInfo
    );

    @WebMethod
    @RequestWrapper(localName = "getSubProdBooked", targetNamespace = "http://wsinterface.remoteservice.booking.springairlines.com/", className = "com.springboot.study.service.springairline.GetSubProdBooked")
    @ResponseWrapper(localName = "getSubProdBookedResponse", targetNamespace = "http://wsinterface.remoteservice.booking.springairlines.com/", className = "com.springboot.study.service.springairline.GetSubProdBookedResponse")
    @WebResult(name = "return", targetNamespace = "")
    public com.springboot.study.service.springairline.GetSubProdBookedResultBean getSubProdBooked(
        @WebParam(name = "searchInfo", targetNamespace = "")
        com.springboot.study.service.springairline.InfoBeanOfGetSubProdBooked searchInfo
    );

    @WebMethod
    @RequestWrapper(localName = "getTravelBaoJiDetailInfo1", targetNamespace = "http://wsinterface.remoteservice.booking.springairlines.com/", className = "com.springboot.study.service.springairline.GetTravelBaoJiDetailInfo1")
    @ResponseWrapper(localName = "getTravelBaoJiDetailInfo1Response", targetNamespace = "http://wsinterface.remoteservice.booking.springairlines.com/", className = "com.springboot.study.service.springairline.GetTravelBaoJiDetailInfo1Response")
    @WebResult(name = "return", targetNamespace = "")
    public com.springboot.study.service.springairline.GetTravelBaoJiDetailInfoResultBean1 getTravelBaoJiDetailInfo1(
        @WebParam(name = "queryInfo", targetNamespace = "")
        com.springboot.study.service.springairline.GetTravelBaoJiDetailInfoQueryBean queryInfo
    );

    @WebMethod
    @RequestWrapper(localName = "cancelFlightBgApp", targetNamespace = "http://wsinterface.remoteservice.booking.springairlines.com/", className = "com.springboot.study.service.springairline.CancelFlightBgApp")
    @ResponseWrapper(localName = "cancelFlightBgAppResponse", targetNamespace = "http://wsinterface.remoteservice.booking.springairlines.com/", className = "com.springboot.study.service.springairline.CancelFlightBgAppResponse")
    @WebResult(name = "return", targetNamespace = "")
    public com.springboot.study.service.springairline.CancelFlightBgAppResultBean cancelFlightBgApp(
        @WebParam(name = "cancelInfo", targetNamespace = "")
        com.springboot.study.service.springairline.CancelFlightBgAppInputBean cancelInfo
    );

    @WebMethod(operationName = "bookOrder_subCabin")
    @RequestWrapper(localName = "bookOrder_subCabin", targetNamespace = "http://wsinterface.remoteservice.booking.springairlines.com/", className = "com.springboot.study.service.springairline.BookOrderSubCabin")
    @ResponseWrapper(localName = "bookOrder_subCabinResponse", targetNamespace = "http://wsinterface.remoteservice.booking.springairlines.com/", className = "com.springboot.study.service.springairline.BookOrderSubCabinResponse")
    @WebResult(name = "return", targetNamespace = "")
    public com.springboot.study.service.springairline.BookOrderResultBean bookOrderSubCabin(
        @WebParam(name = "bookOrder_subCabin", targetNamespace = "")
        com.springboot.study.service.springairline.BookOrderBookSubCabinBean bookOrderSubCabin
    );

    @WebMethod
    @RequestWrapper(localName = "getCountryAreaCode", targetNamespace = "http://wsinterface.remoteservice.booking.springairlines.com/", className = "com.springboot.study.service.springairline.GetCountryAreaCode")
    @ResponseWrapper(localName = "getCountryAreaCodeResponse", targetNamespace = "http://wsinterface.remoteservice.booking.springairlines.com/", className = "com.springboot.study.service.springairline.GetCountryAreaCodeResponse")
    @WebResult(name = "return", targetNamespace = "")
    public com.springboot.study.service.springairline.GetCountryAreaCodeResultBean getCountryAreaCode(
        @WebParam(name = "searchInfo", targetNamespace = "")
        com.springboot.study.service.springairline.GetCountryAreaCodeSearchBean searchInfo
    );

    @WebMethod
    @RequestWrapper(localName = "getOrderSumInfo", targetNamespace = "http://wsinterface.remoteservice.booking.springairlines.com/", className = "com.springboot.study.service.springairline.GetOrderSumInfo")
    @ResponseWrapper(localName = "getOrderSumInfoResponse", targetNamespace = "http://wsinterface.remoteservice.booking.springairlines.com/", className = "com.springboot.study.service.springairline.GetOrderSumInfoResponse")
    @WebResult(name = "return", targetNamespace = "")
    public com.springboot.study.service.springairline.GetOrderSumInfoResultBean getOrderSumInfo(
        @WebParam(name = "queryInfo", targetNamespace = "")
        com.springboot.study.service.springairline.GetOrderSumInfoQueryBean queryInfo
    );

    @WebMethod
    @RequestWrapper(localName = "searchReceptionFlights", targetNamespace = "http://wsinterface.remoteservice.booking.springairlines.com/", className = "com.springboot.study.service.springairline.SearchReceptionFlights")
    @ResponseWrapper(localName = "searchReceptionFlightsResponse", targetNamespace = "http://wsinterface.remoteservice.booking.springairlines.com/", className = "com.springboot.study.service.springairline.SearchReceptionFlightsResponse")
    @WebResult(name = "return", targetNamespace = "")
    public com.springboot.study.service.springairline.GetBeanOfReceptionFlights searchReceptionFlights(
        @WebParam(name = "searchInfo", targetNamespace = "")
        com.springboot.study.service.springairline.SearchBeanOfReceptionFlights searchInfo
    );

    @WebMethod
    @RequestWrapper(localName = "queryFlightSeatNo", targetNamespace = "http://wsinterface.remoteservice.booking.springairlines.com/", className = "com.springboot.study.service.springairline.QueryFlightSeatNo")
    @ResponseWrapper(localName = "queryFlightSeatNoResponse", targetNamespace = "http://wsinterface.remoteservice.booking.springairlines.com/", className = "com.springboot.study.service.springairline.QueryFlightSeatNoResponse")
    @WebResult(name = "return", targetNamespace = "")
    public com.springboot.study.service.springairline.GetRetBeanOfQueryFlightSeatNo queryFlightSeatNo(
        @WebParam(name = "searchInfo", targetNamespace = "")
        com.springboot.study.service.springairline.FlightSeatNoBean searchInfo
    );

    @WebMethod
    @RequestWrapper(localName = "bookSubProdBatch", targetNamespace = "http://wsinterface.remoteservice.booking.springairlines.com/", className = "com.springboot.study.service.springairline.BookSubProdBatch")
    @ResponseWrapper(localName = "bookSubProdBatchResponse", targetNamespace = "http://wsinterface.remoteservice.booking.springairlines.com/", className = "com.springboot.study.service.springairline.BookSubProdBatchResponse")
    @WebResult(name = "return", targetNamespace = "")
    public com.springboot.study.service.springairline.BookSubProdBatchResultBean bookSubProdBatch(
        @WebParam(name = "bookInfo", targetNamespace = "")
        com.springboot.study.service.springairline.BookSubProdBatchInputBean bookInfo
    );

    @WebMethod
    @RequestWrapper(localName = "getSpecificPrice", targetNamespace = "http://wsinterface.remoteservice.booking.springairlines.com/", className = "com.springboot.study.service.springairline.GetSpecificPrice")
    @ResponseWrapper(localName = "getSpecificPriceResponse", targetNamespace = "http://wsinterface.remoteservice.booking.springairlines.com/", className = "com.springboot.study.service.springairline.GetSpecificPriceResponse")
    @WebResult(name = "return", targetNamespace = "")
    public com.springboot.study.service.springairline.GetSpecificPriceResultBean getSpecificPrice(
        @WebParam(name = "inputInfo", targetNamespace = "")
        com.springboot.study.service.springairline.GetSpecificPriceInputBean inputInfo
    );

    @WebMethod
    @RequestWrapper(localName = "getSubProdByTkt", targetNamespace = "http://wsinterface.remoteservice.booking.springairlines.com/", className = "com.springboot.study.service.springairline.GetSubProdByTkt")
    @ResponseWrapper(localName = "getSubProdByTktResponse", targetNamespace = "http://wsinterface.remoteservice.booking.springairlines.com/", className = "com.springboot.study.service.springairline.GetSubProdByTktResponse")
    @WebResult(name = "return", targetNamespace = "")
    public com.springboot.study.service.springairline.GetSubProdBySegResultBean getSubProdByTkt(
        @WebParam(name = "searchInfo", targetNamespace = "")
        com.springboot.study.service.springairline.InfoBeanOfGetSubProdByTkt searchInfo
    );

    @WebMethod
    @RequestWrapper(localName = "searchTicketDetail", targetNamespace = "http://wsinterface.remoteservice.booking.springairlines.com/", className = "com.springboot.study.service.springairline.SearchTicketDetail")
    @ResponseWrapper(localName = "searchTicketDetailResponse", targetNamespace = "http://wsinterface.remoteservice.booking.springairlines.com/", className = "com.springboot.study.service.springairline.SearchTicketDetailResponse")
    @WebResult(name = "return", targetNamespace = "")
    public com.springboot.study.service.springairline.SearchTicketDetailResultBean searchTicketDetail(
        @WebParam(name = "searchInfo", targetNamespace = "")
        com.springboot.study.service.springairline.SearchTicketDetailBean searchInfo
    );

    @WebMethod
    @RequestWrapper(localName = "getFlightSeats", targetNamespace = "http://wsinterface.remoteservice.booking.springairlines.com/", className = "com.springboot.study.service.springairline.GetFlightSeats")
    @ResponseWrapper(localName = "getFlightSeatsResponse", targetNamespace = "http://wsinterface.remoteservice.booking.springairlines.com/", className = "com.springboot.study.service.springairline.GetFlightSeatsResponse")
    @WebResult(name = "return", targetNamespace = "")
    public com.springboot.study.service.springairline.GetRetFlightSeatsBean getFlightSeats(
        @WebParam(name = "searchInfo", targetNamespace = "")
        com.springboot.study.service.springairline.FlightSeatsInfoBean searchInfo
    );
}
