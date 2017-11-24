
package com.springboot.study.service.springairline;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>calcRetTktFee complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="calcRetTktFee"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="calcInfo" type="{http://wsinterface.remoteservice.booking.springairlines.com/}calcRetTktFeeInputBean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "calcRetTktFee", propOrder = {
    "calcInfo"
})
public class CalcRetTktFee {

    protected CalcRetTktFeeInputBean calcInfo;

    /**
     * 获取calcInfo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link CalcRetTktFeeInputBean }
     *     
     */
    public CalcRetTktFeeInputBean getCalcInfo() {
        return calcInfo;
    }

    /**
     * 设置calcInfo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CalcRetTktFeeInputBean }
     *     
     */
    public void setCalcInfo(CalcRetTktFeeInputBean value) {
        this.calcInfo = value;
    }

}
