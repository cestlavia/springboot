
package com.springboot.study.service.saws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>searchTicketDetail complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="searchTicketDetail">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="searchInfo" type="{http://wsinterface.remoteservice.booking.springairlines.com/}searchTicketDetailBean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "searchTicketDetail", propOrder = {
    "searchInfo"
})
public class SearchTicketDetail {

    protected SearchTicketDetailBean searchInfo;

    /**
     * 获取searchInfo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchTicketDetailBean }
     *     
     */
    public SearchTicketDetailBean getSearchInfo() {
        return searchInfo;
    }

    /**
     * 设置searchInfo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchTicketDetailBean }
     *     
     */
    public void setSearchInfo(SearchTicketDetailBean value) {
        this.searchInfo = value;
    }

}
