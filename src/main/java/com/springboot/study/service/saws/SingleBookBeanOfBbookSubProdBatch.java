
package com.springboot.study.service.saws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>singleBookBeanOfBbookSubProdBatch complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="singleBookBeanOfBbookSubProdBatch">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="insurList" type="{http://wsinterface.remoteservice.booking.springairlines.com/}insuranceBookInfo" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="orderHeadId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="xprodList" type="{http://wsinterface.remoteservice.booking.springairlines.com/}xprodBookInfo" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "singleBookBeanOfBbookSubProdBatch", propOrder = {
    "insurList",
    "orderHeadId",
    "xprodList"
})
public class SingleBookBeanOfBbookSubProdBatch {

    @XmlElement(nillable = true)
    protected List<InsuranceBookInfo> insurList;
    protected Long orderHeadId;
    @XmlElement(nillable = true)
    protected List<XprodBookInfo> xprodList;

    /**
     * Gets the value of the insurList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the insurList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInsurList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InsuranceBookInfo }
     * 
     * 
     */
    public List<InsuranceBookInfo> getInsurList() {
        if (insurList == null) {
            insurList = new ArrayList<InsuranceBookInfo>();
        }
        return this.insurList;
    }

    /**
     * 获取orderHeadId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getOrderHeadId() {
        return orderHeadId;
    }

    /**
     * 设置orderHeadId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setOrderHeadId(Long value) {
        this.orderHeadId = value;
    }

    /**
     * Gets the value of the xprodList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the xprodList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getXprodList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link XprodBookInfo }
     * 
     * 
     */
    public List<XprodBookInfo> getXprodList() {
        if (xprodList == null) {
            xprodList = new ArrayList<XprodBookInfo>();
        }
        return this.xprodList;
    }

}
