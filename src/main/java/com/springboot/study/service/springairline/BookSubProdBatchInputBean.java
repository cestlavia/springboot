
package com.springboot.study.service.springairline;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>bookSubProdBatchInputBean complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="bookSubProdBatchInputBean"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://wsinterface.remoteservice.booking.springairlines.com/}commonInParameter"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="bookList" type="{http://wsinterface.remoteservice.booking.springairlines.com/}singleBookBeanOfBbookSubProdBatch" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="bookTimeFlag" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="ifInsWF" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="lang" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="remoteIP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "bookSubProdBatchInputBean", propOrder = {
    "bookList",
    "bookTimeFlag",
    "ifInsWF",
    "lang",
    "remoteIP"
})
public class BookSubProdBatchInputBean
    extends CommonInParameter
{

    @XmlElement(nillable = true)
    protected List<SingleBookBeanOfBbookSubProdBatch> bookList;
    protected Integer bookTimeFlag;
    protected Integer ifInsWF;
    protected String lang;
    protected String remoteIP;

    /**
     * Gets the value of the bookList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bookList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBookList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SingleBookBeanOfBbookSubProdBatch }
     * 
     * 
     */
    public List<SingleBookBeanOfBbookSubProdBatch> getBookList() {
        if (bookList == null) {
            bookList = new ArrayList<SingleBookBeanOfBbookSubProdBatch>();
        }
        return this.bookList;
    }

    /**
     * 获取bookTimeFlag属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getBookTimeFlag() {
        return bookTimeFlag;
    }

    /**
     * 设置bookTimeFlag属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setBookTimeFlag(Integer value) {
        this.bookTimeFlag = value;
    }

    /**
     * 获取ifInsWF属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIfInsWF() {
        return ifInsWF;
    }

    /**
     * 设置ifInsWF属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIfInsWF(Integer value) {
        this.ifInsWF = value;
    }

    /**
     * 获取lang属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLang() {
        return lang;
    }

    /**
     * 设置lang属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLang(String value) {
        this.lang = value;
    }

    /**
     * 获取remoteIP属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRemoteIP() {
        return remoteIP;
    }

    /**
     * 设置remoteIP属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRemoteIP(String value) {
        this.remoteIP = value;
    }

}
