
package com.springboot.study.service.springairline;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>bookOrder_subCabin complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="bookOrder_subCabin"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="bookOrder_subCabin" type="{http://wsinterface.remoteservice.booking.springairlines.com/}bookOrderBookSubCabinBean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "bookOrder_subCabin", propOrder = {
    "bookOrderSubCabin"
})
public class BookOrderSubCabin {

    @XmlElement(name = "bookOrder_subCabin")
    protected BookOrderBookSubCabinBean bookOrderSubCabin;

    /**
     * 获取bookOrderSubCabin属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BookOrderBookSubCabinBean }
     *     
     */
    public BookOrderBookSubCabinBean getBookOrderSubCabin() {
        return bookOrderSubCabin;
    }

    /**
     * 设置bookOrderSubCabin属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BookOrderBookSubCabinBean }
     *     
     */
    public void setBookOrderSubCabin(BookOrderBookSubCabinBean value) {
        this.bookOrderSubCabin = value;
    }

}
