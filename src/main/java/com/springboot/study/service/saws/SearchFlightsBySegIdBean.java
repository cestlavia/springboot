
package com.springboot.study.service.saws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>searchFlightsBySegIdBean complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="searchFlightsBySegIdBean">
 *   &lt;complexContent>
 *     &lt;extension base="{http://wsinterface.remoteservice.booking.springairlines.com/}commonInParameter">
 *       &lt;sequence>
 *         &lt;element name="lang" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="moneyClassId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="segment_head_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "searchFlightsBySegIdBean", propOrder = {
    "lang",
    "moneyClassId",
    "segmentHeadId"
})
public class SearchFlightsBySegIdBean
    extends CommonInParameter
{

    protected String lang;
    protected Integer moneyClassId;
    @XmlElement(name = "segment_head_id")
    protected String segmentHeadId;

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
     * 获取moneyClassId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMoneyClassId() {
        return moneyClassId;
    }

    /**
     * 设置moneyClassId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMoneyClassId(Integer value) {
        this.moneyClassId = value;
    }

    /**
     * 获取segmentHeadId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSegmentHeadId() {
        return segmentHeadId;
    }

    /**
     * 设置segmentHeadId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSegmentHeadId(String value) {
        this.segmentHeadId = value;
    }

}
