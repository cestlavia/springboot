
package com.springboot.study.service.springairline;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>getTravelBaoJiDetailInfo1 complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="getTravelBaoJiDetailInfo1"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="queryInfo" type="{http://wsinterface.remoteservice.booking.springairlines.com/}getTravelBaoJiDetailInfoQueryBean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getTravelBaoJiDetailInfo1", propOrder = {
    "queryInfo"
})
public class GetTravelBaoJiDetailInfo1 {

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
