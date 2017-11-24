
package com.springboot.study.service.springairline;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>bookSubProdBatchResultBean complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="bookSubProdBatchResultBean"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://wsinterface.remoteservice.booking.springairlines.com/}commonOutParameter"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="failedInsProdId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="failedOrderHeadId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="failedXprodId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="subOrderId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "bookSubProdBatchResultBean", propOrder = {
    "failedInsProdId",
    "failedOrderHeadId",
    "failedXprodId",
    "subOrderId"
})
public class BookSubProdBatchResultBean
    extends CommonOutParameter
{

    protected Long failedInsProdId;
    protected Long failedOrderHeadId;
    protected Long failedXprodId;
    protected String subOrderId;

    /**
     * 获取failedInsProdId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getFailedInsProdId() {
        return failedInsProdId;
    }

    /**
     * 设置failedInsProdId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setFailedInsProdId(Long value) {
        this.failedInsProdId = value;
    }

    /**
     * 获取failedOrderHeadId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getFailedOrderHeadId() {
        return failedOrderHeadId;
    }

    /**
     * 设置failedOrderHeadId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setFailedOrderHeadId(Long value) {
        this.failedOrderHeadId = value;
    }

    /**
     * 获取failedXprodId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getFailedXprodId() {
        return failedXprodId;
    }

    /**
     * 设置failedXprodId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setFailedXprodId(Long value) {
        this.failedXprodId = value;
    }

    /**
     * 获取subOrderId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubOrderId() {
        return subOrderId;
    }

    /**
     * 设置subOrderId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubOrderId(String value) {
        this.subOrderId = value;
    }

}
