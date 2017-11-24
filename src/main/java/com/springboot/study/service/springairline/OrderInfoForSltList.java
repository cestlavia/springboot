
package com.springboot.study.service.springairline;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>orderInfoForSltList complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="orderInfoForSltList"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="orderInfoForSltlist" type="{http://wsinterface.remoteservice.booking.springairlines.com/}orderInfoForSlt" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "orderInfoForSltList", propOrder = {
    "orderInfoForSltlist"
})
public class OrderInfoForSltList {

    @XmlElement(nillable = true)
    protected List<OrderInfoForSlt> orderInfoForSltlist;

    /**
     * Gets the value of the orderInfoForSltlist property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the orderInfoForSltlist property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOrderInfoForSltlist().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OrderInfoForSlt }
     * 
     * 
     */
    public List<OrderInfoForSlt> getOrderInfoForSltlist() {
        if (orderInfoForSltlist == null) {
            orderInfoForSltlist = new ArrayList<OrderInfoForSlt>();
        }
        return this.orderInfoForSltlist;
    }

}
