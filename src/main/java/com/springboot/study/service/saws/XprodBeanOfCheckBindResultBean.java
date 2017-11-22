
package com.springboot.study.service.saws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>xprodBeanOfCheckBindResultBean complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="xprodBeanOfCheckBindResultBean">
 *   &lt;complexContent>
 *     &lt;extension base="{http://wsinterface.remoteservice.booking.springairlines.com/}commonOutParameter">
 *       &lt;sequence>
 *         &lt;element name="xprodBean" type="{http://wsinterface.remoteservice.booking.springairlines.com/}xprodBeanOfCheckBind" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "xprodBeanOfCheckBindResultBean", propOrder = {
    "xprodBean"
})
public class XprodBeanOfCheckBindResultBean
    extends CommonOutParameter
{

    @XmlElement(nillable = true)
    protected List<XprodBeanOfCheckBind> xprodBean;

    /**
     * Gets the value of the xprodBean property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the xprodBean property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getXprodBean().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link XprodBeanOfCheckBind }
     * 
     * 
     */
    public List<XprodBeanOfCheckBind> getXprodBean() {
        if (xprodBean == null) {
            xprodBean = new ArrayList<XprodBeanOfCheckBind>();
        }
        return this.xprodBean;
    }

}
