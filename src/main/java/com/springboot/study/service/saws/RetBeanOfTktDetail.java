
package com.springboot.study.service.saws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>retBeanOfTktDetail complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="retBeanOfTktDetail">
 *   &lt;complexContent>
 *     &lt;extension base="{http://wsinterface.remoteservice.booking.springairlines.com/}commonOutParameter">
 *       &lt;sequence>
 *         &lt;element name="invoiceList" type="{http://wsinterface.remoteservice.booking.springairlines.com/}invoiceInfo" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="linkMan" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="linkTel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tktDetailInfoList" type="{http://wsinterface.remoteservice.booking.springairlines.com/}tktDetailInfo" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="eMail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "retBeanOfTktDetail", propOrder = {
    "invoiceList",
    "linkMan",
    "linkTel",
    "tktDetailInfoList",
    "eMail"
})
public class RetBeanOfTktDetail
    extends CommonOutParameter
{

    @XmlElement(nillable = true)
    protected List<InvoiceInfo> invoiceList;
    protected String linkMan;
    protected String linkTel;
    @XmlElement(nillable = true)
    protected List<TktDetailInfo> tktDetailInfoList;
    protected String eMail;

    /**
     * Gets the value of the invoiceList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the invoiceList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInvoiceList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InvoiceInfo }
     * 
     * 
     */
    public List<InvoiceInfo> getInvoiceList() {
        if (invoiceList == null) {
            invoiceList = new ArrayList<InvoiceInfo>();
        }
        return this.invoiceList;
    }

    /**
     * 获取linkMan属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLinkMan() {
        return linkMan;
    }

    /**
     * 设置linkMan属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLinkMan(String value) {
        this.linkMan = value;
    }

    /**
     * 获取linkTel属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLinkTel() {
        return linkTel;
    }

    /**
     * 设置linkTel属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLinkTel(String value) {
        this.linkTel = value;
    }

    /**
     * Gets the value of the tktDetailInfoList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tktDetailInfoList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTktDetailInfoList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TktDetailInfo }
     * 
     * 
     */
    public List<TktDetailInfo> getTktDetailInfoList() {
        if (tktDetailInfoList == null) {
            tktDetailInfoList = new ArrayList<TktDetailInfo>();
        }
        return this.tktDetailInfoList;
    }

    /**
     * 获取eMail属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEMail() {
        return eMail;
    }

    /**
     * 设置eMail属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEMail(String value) {
        this.eMail = value;
    }

}
