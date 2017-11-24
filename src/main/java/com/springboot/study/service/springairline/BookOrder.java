
package com.springboot.study.service.springairline;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>bookOrder complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="bookOrder"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="bookInfo" type="{http://wsinterface.remoteservice.booking.springairlines.com/}bookOrderBookBean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "bookOrder", propOrder = {
    "bookInfo"
})
public class BookOrder {

    protected BookOrderBookBean bookInfo;

    /**
     * 获取bookInfo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BookOrderBookBean }
     *     
     */
    public BookOrderBookBean getBookInfo() {
        return bookInfo;
    }

    /**
     * 设置bookInfo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BookOrderBookBean }
     *     
     */
    public void setBookInfo(BookOrderBookBean value) {
        this.bookInfo = value;
    }

}
