
package com.springboot.study.service.saws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>getTravelBaoJiDetailInfo complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="getTravelBaoJiDetailInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="queryInfo" type="{http://wsinterface.remoteservice.booking.springairlines.com/}getTravelBaoJiDetailInfoQueryBean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getTravelBaoJiDetailInfo", propOrder = {
    "queryInfo"
})
public class GetTravelBaoJiDetailInfo {

    protected GetTravelBaoJiDetailInfoQueryBean queryInfo;

    /**
     * 获取queryInfo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link GetTravelBaoJiDetailInfoQueryBean }
     *     
     */
    public GetTravelBaoJiDetailInfoQueryBean getQueryInfo() {
        return queryInfo;
    }

    /**
     * 设置queryInfo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link GetTravelBaoJiDetailInfoQueryBean }
     *     
     */
    public void setQueryInfo(GetTravelBaoJiDetailInfoQueryBean value) {
        this.queryInfo = value;
    }

}
