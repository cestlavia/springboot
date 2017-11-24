
package com.springboot.study.service.springairline;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>getOrderSumInfoResultBean complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="getOrderSumInfoResultBean"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://wsinterface.remoteservice.booking.springairlines.com/}commonOutParameter"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="orderSumInfo" type="{http://wsinterface.remoteservice.booking.springairlines.com/}orderSumInfo" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getOrderSumInfoResultBean", propOrder = {
    "orderSumInfo"
})
public class GetOrderSumInfoResultBean
    extends CommonOutParameter
{

    protected OrderSumInfo orderSumInfo;

    /**
     * 获取orderSumInfo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link OrderSumInfo }
     *     
     */
    public OrderSumInfo getOrderSumInfo() {
        return orderSumInfo;
    }

    /**
     * 设置orderSumInfo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link OrderSumInfo }
     *     
     */
    public void setOrderSumInfo(OrderSumInfo value) {
        this.orderSumInfo = value;
    }

}
