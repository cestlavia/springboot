
package com.springboot.study.service.saws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>getSubProdBookedResultBean complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="getSubProdBookedResultBean">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="errCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ifSuccess" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="xprodList" type="{http://wsinterface.remoteservice.booking.springairlines.com/}xprodBeanOfGetSubProdBooked" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getSubProdBookedResultBean", propOrder = {
    "errCode",
    "ifSuccess",
    "xprodList"
})
public class GetSubProdBookedResultBean {

    protected String errCode;
    protected String ifSuccess;
    @XmlElement(nillable = true)
    protected List<XprodBeanOfGetSubProdBooked> xprodList;

    /**
     * 获取errCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrCode() {
        return errCode;
    }

    /**
     * 设置errCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrCode(String value) {
        this.errCode = value;
    }

    /**
     * 获取ifSuccess属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIfSuccess() {
        return ifSuccess;
    }

    /**
     * 设置ifSuccess属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIfSuccess(String value) {
        this.ifSuccess = value;
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
     * {@link XprodBeanOfGetSubProdBooked }
     * 
     * 
     */
    public List<XprodBeanOfGetSubProdBooked> getXprodList() {
        if (xprodList == null) {
            xprodList = new ArrayList<XprodBeanOfGetSubProdBooked>();
        }
        return this.xprodList;
    }

}
