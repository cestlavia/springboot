
package com.springboot.study.service.springairline;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>getTravelBaoJiDetailInfo1Response complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="getTravelBaoJiDetailInfo1Response"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="return" type="{http://wsinterface.remoteservice.booking.springairlines.com/}getTravelBaoJiDetailInfoResultBean1" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getTravelBaoJiDetailInfo1Response", propOrder = {
    "_return"
})
public class GetTravelBaoJiDetailInfo1Response {

    @XmlElement(name = "return")
    protected GetTravelBaoJiDetailInfoResultBean1 _return;

    /**
     * 获取return属性的值。
     * 
     * @return
     *     possible object is
     *     {@link GetTravelBaoJiDetailInfoResultBean1 }
     *     
     */
    public GetTravelBaoJiDetailInfoResultBean1 getReturn() {
        return _return;
    }

    /**
     * 设置return属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link GetTravelBaoJiDetailInfoResultBean1 }
     *     
     */
    public void setReturn(GetTravelBaoJiDetailInfoResultBean1 value) {
        this._return = value;
    }

}
