
package com.springboot.study.service.springairline;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>getSpecificPriceResultBean complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="getSpecificPriceResultBean"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://wsinterface.remoteservice.booking.springairlines.com/}commonOutParameter"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="adultTravPriceForSeg" type="{http://wsinterface.remoteservice.booking.springairlines.com/}priceCalcResult" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="childTravPriceForSeg" type="{http://wsinterface.remoteservice.booking.springairlines.com/}priceCalcResult" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="infantTravPriceForSeg" type="{http://wsinterface.remoteservice.booking.springairlines.com/}priceCalcResult" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getSpecificPriceResultBean", propOrder = {
    "adultTravPriceForSeg",
    "childTravPriceForSeg",
    "infantTravPriceForSeg"
})
public class GetSpecificPriceResultBean
    extends CommonOutParameter
{

    @XmlElement(nillable = true)
    protected List<PriceCalcResult> adultTravPriceForSeg;
    @XmlElement(nillable = true)
    protected List<PriceCalcResult> childTravPriceForSeg;
    @XmlElement(nillable = true)
    protected List<PriceCalcResult> infantTravPriceForSeg;

    /**
     * Gets the value of the adultTravPriceForSeg property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the adultTravPriceForSeg property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdultTravPriceForSeg().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PriceCalcResult }
     * 
     * 
     */
    public List<PriceCalcResult> getAdultTravPriceForSeg() {
        if (adultTravPriceForSeg == null) {
            adultTravPriceForSeg = new ArrayList<PriceCalcResult>();
        }
        return this.adultTravPriceForSeg;
    }

    /**
     * Gets the value of the childTravPriceForSeg property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the childTravPriceForSeg property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getChildTravPriceForSeg().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PriceCalcResult }
     * 
     * 
     */
    public List<PriceCalcResult> getChildTravPriceForSeg() {
        if (childTravPriceForSeg == null) {
            childTravPriceForSeg = new ArrayList<PriceCalcResult>();
        }
        return this.childTravPriceForSeg;
    }

    /**
     * Gets the value of the infantTravPriceForSeg property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the infantTravPriceForSeg property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInfantTravPriceForSeg().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PriceCalcResult }
     * 
     * 
     */
    public List<PriceCalcResult> getInfantTravPriceForSeg() {
        if (infantTravPriceForSeg == null) {
            infantTravPriceForSeg = new ArrayList<PriceCalcResult>();
        }
        return this.infantTravPriceForSeg;
    }

}
