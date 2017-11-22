
package com.springboot.study.service.saws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>bookSubProdBatch complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="bookSubProdBatch">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="bookInfo" type="{http://wsinterface.remoteservice.booking.springairlines.com/}bookSubProdBatchInputBean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "bookSubProdBatch", propOrder = {
    "bookInfo"
})
public class BookSubProdBatch {

    protected BookSubProdBatchInputBean bookInfo;

    /**
     * 获取bookInfo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BookSubProdBatchInputBean }
     *     
     */
    public BookSubProdBatchInputBean getBookInfo() {
        return bookInfo;
    }

    /**
     * 设置bookInfo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BookSubProdBatchInputBean }
     *     
     */
    public void setBookInfo(BookSubProdBatchInputBean value) {
        this.bookInfo = value;
    }

}
