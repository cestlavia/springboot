
package com.springboot.study.service.springairline;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>getSubProdBySeg complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="getSubProdBySeg"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="searchInfo" type="{http://wsinterface.remoteservice.booking.springairlines.com/}getSubProdBySegInputBean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getSubProdBySeg", propOrder = {
    "searchInfo"
})
public class GetSubProdBySeg {

    protected GetSubProdBySegInputBean searchInfo;

    /**
     * 获取searchInfo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link GetSubProdBySegInputBean }
     *     
     */
    public GetSubProdBySegInputBean getSearchInfo() {
        return searchInfo;
    }

    /**
     * 设置searchInfo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link GetSubProdBySegInputBean }
     *     
     */
    public void setSearchInfo(GetSubProdBySegInputBean value) {
        this.searchInfo = value;
    }

}
