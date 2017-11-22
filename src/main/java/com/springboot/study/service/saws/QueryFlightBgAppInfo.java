
package com.springboot.study.service.saws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>queryFlightBgAppInfo complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="queryFlightBgAppInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="searchInfo" type="{http://wsinterface.remoteservice.booking.springairlines.com/}queryFlightBgAppInfoInputBean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "queryFlightBgAppInfo", propOrder = {
    "searchInfo"
})
public class QueryFlightBgAppInfo {

    protected QueryFlightBgAppInfoInputBean searchInfo;

    /**
     * 获取searchInfo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link QueryFlightBgAppInfoInputBean }
     *     
     */
    public QueryFlightBgAppInfoInputBean getSearchInfo() {
        return searchInfo;
    }

    /**
     * 设置searchInfo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link QueryFlightBgAppInfoInputBean }
     *     
     */
    public void setSearchInfo(QueryFlightBgAppInfoInputBean value) {
        this.searchInfo = value;
    }

}
