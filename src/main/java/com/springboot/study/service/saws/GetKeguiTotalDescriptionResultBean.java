
package com.springboot.study.service.saws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>getKeguiTotalDescriptionResultBean complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="getKeguiTotalDescriptionResultBean">
 *   &lt;complexContent>
 *     &lt;extension base="{http://wsinterface.remoteservice.booking.springairlines.com/}commonOutParameter">
 *       &lt;sequence>
 *         &lt;element name="keguiDesctiption" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="keguiInfo" type="{http://wsinterface.remoteservice.booking.springairlines.com/}keguiMultInfo" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getKeguiTotalDescriptionResultBean", propOrder = {
    "keguiDesctiption",
    "keguiInfo"
})
public class GetKeguiTotalDescriptionResultBean
    extends CommonOutParameter
{

    protected String keguiDesctiption;
    protected KeguiMultInfo keguiInfo;

    /**
     * 获取keguiDesctiption属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKeguiDesctiption() {
        return keguiDesctiption;
    }

    /**
     * 设置keguiDesctiption属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKeguiDesctiption(String value) {
        this.keguiDesctiption = value;
    }

    /**
     * 获取keguiInfo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link KeguiMultInfo }
     *     
     */
    public KeguiMultInfo getKeguiInfo() {
        return keguiInfo;
    }

    /**
     * 设置keguiInfo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link KeguiMultInfo }
     *     
     */
    public void setKeguiInfo(KeguiMultInfo value) {
        this.keguiInfo = value;
    }

}
