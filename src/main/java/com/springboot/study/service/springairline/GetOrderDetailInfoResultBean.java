
package com.springboot.study.service.springairline;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>getOrderDetailInfoResultBean complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="getOrderDetailInfoResultBean"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://wsinterface.remoteservice.booking.springairlines.com/}commonOutParameter"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="orderSumInfo" type="{http://wsinterface.remoteservice.booking.springairlines.com/}orderSumInfo" minOccurs="0"/&gt;
 *         &lt;element name="ticketList" type="{http://wsinterface.remoteservice.booking.springairlines.com/}ticketInfo" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getOrderDetailInfoResultBean", propOrder = {
    "orderSumInfo",
    "ticketList"
})
public class GetOrderDetailInfoResultBean
    extends CommonOutParameter
{

    protected OrderSumInfo orderSumInfo;
    @XmlElement(nillable = true)
    protected List<TicketInfo> ticketList;

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

    /**
     * Gets the value of the ticketList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ticketList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTicketList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TicketInfo }
     * 
     * 
     */
    public List<TicketInfo> getTicketList() {
        if (ticketList == null) {
            ticketList = new ArrayList<TicketInfo>();
        }
        return this.ticketList;
    }

}
