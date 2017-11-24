
package com.springboot.study.service.springairline;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>getRetBeanOfQueryFlightSeatNo complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="getRetBeanOfQueryFlightSeatNo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://wsinterface.remoteservice.booking.springairlines.com/}commonOutParameter"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="flightSeatNoList" type="{http://wsinterface.remoteservice.booking.springairlines.com/}retBeanOfQueryFlightSeatNo" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getRetBeanOfQueryFlightSeatNo", propOrder = {
    "flightSeatNoList"
})
public class GetRetBeanOfQueryFlightSeatNo
    extends CommonOutParameter
{

    @XmlElement(nillable = true)
    protected List<RetBeanOfQueryFlightSeatNo> flightSeatNoList;

    /**
     * Gets the value of the flightSeatNoList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the flightSeatNoList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFlightSeatNoList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RetBeanOfQueryFlightSeatNo }
     * 
     * 
     */
    public List<RetBeanOfQueryFlightSeatNo> getFlightSeatNoList() {
        if (flightSeatNoList == null) {
            flightSeatNoList = new ArrayList<RetBeanOfQueryFlightSeatNo>();
        }
        return this.flightSeatNoList;
    }

}
