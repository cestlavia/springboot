
package com.springboot.study.service.springairline;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>calcRetTktFeeResultBean complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="calcRetTktFeeResultBean"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://wsinterface.remoteservice.booking.springairlines.com/}commonOutParameter"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="allRetMoney" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="moneyClassId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="notRefundOtherFy" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="payGateFy" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="payGateFyRate" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="qxxFy" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="retFuelMoney" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="retInsMoney" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="retNetMoney" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="retOtherFy" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="retPortMoney" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="retRealMoney" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="retTktFy" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="retTktMoney" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="retXFee" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="returnFy" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "calcRetTktFeeResultBean", propOrder = {
    "allRetMoney",
    "moneyClassId",
    "notRefundOtherFy",
    "payGateFy",
    "payGateFyRate",
    "qxxFy",
    "retFuelMoney",
    "retInsMoney",
    "retNetMoney",
    "retOtherFy",
    "retPortMoney",
    "retRealMoney",
    "retTktFy",
    "retTktMoney",
    "retXFee",
    "returnFy"
})
public class CalcRetTktFeeResultBean
    extends CommonOutParameter
{

    protected Double allRetMoney;
    protected Integer moneyClassId;
    protected Double notRefundOtherFy;
    protected Double payGateFy;
    protected Double payGateFyRate;
    protected Double qxxFy;
    protected Double retFuelMoney;
    protected Double retInsMoney;
    protected Double retNetMoney;
    protected Double retOtherFy;
    protected Double retPortMoney;
    protected Double retRealMoney;
    protected Double retTktFy;
    protected Double retTktMoney;
    protected Double retXFee;
    protected Double returnFy;

    /**
     * 获取allRetMoney属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getAllRetMoney() {
        return allRetMoney;
    }

    /**
     * 设置allRetMoney属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setAllRetMoney(Double value) {
        this.allRetMoney = value;
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
     * 获取notRefundOtherFy属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getNotRefundOtherFy() {
        return notRefundOtherFy;
    }

    /**
     * 设置notRefundOtherFy属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setNotRefundOtherFy(Double value) {
        this.notRefundOtherFy = value;
    }

    /**
     * 获取payGateFy属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getPayGateFy() {
        return payGateFy;
    }

    /**
     * 设置payGateFy属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setPayGateFy(Double value) {
        this.payGateFy = value;
    }

    /**
     * 获取payGateFyRate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getPayGateFyRate() {
        return payGateFyRate;
    }

    /**
     * 设置payGateFyRate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setPayGateFyRate(Double value) {
        this.payGateFyRate = value;
    }

    /**
     * 获取qxxFy属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getQxxFy() {
        return qxxFy;
    }

    /**
     * 设置qxxFy属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setQxxFy(Double value) {
        this.qxxFy = value;
    }

    /**
     * 获取retFuelMoney属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getRetFuelMoney() {
        return retFuelMoney;
    }

    /**
     * 设置retFuelMoney属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setRetFuelMoney(Double value) {
        this.retFuelMoney = value;
    }

    /**
     * 获取retInsMoney属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getRetInsMoney() {
        return retInsMoney;
    }

    /**
     * 设置retInsMoney属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setRetInsMoney(Double value) {
        this.retInsMoney = value;
    }

    /**
     * 获取retNetMoney属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getRetNetMoney() {
        return retNetMoney;
    }

    /**
     * 设置retNetMoney属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setRetNetMoney(Double value) {
        this.retNetMoney = value;
    }

    /**
     * 获取retOtherFy属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getRetOtherFy() {
        return retOtherFy;
    }

    /**
     * 设置retOtherFy属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setRetOtherFy(Double value) {
        this.retOtherFy = value;
    }

    /**
     * 获取retPortMoney属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getRetPortMoney() {
        return retPortMoney;
    }

    /**
     * 设置retPortMoney属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setRetPortMoney(Double value) {
        this.retPortMoney = value;
    }

    /**
     * 获取retRealMoney属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getRetRealMoney() {
        return retRealMoney;
    }

    /**
     * 设置retRealMoney属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setRetRealMoney(Double value) {
        this.retRealMoney = value;
    }

    /**
     * 获取retTktFy属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getRetTktFy() {
        return retTktFy;
    }

    /**
     * 设置retTktFy属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setRetTktFy(Double value) {
        this.retTktFy = value;
    }

    /**
     * 获取retTktMoney属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getRetTktMoney() {
        return retTktMoney;
    }

    /**
     * 设置retTktMoney属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setRetTktMoney(Double value) {
        this.retTktMoney = value;
    }

    /**
     * 获取retXFee属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getRetXFee() {
        return retXFee;
    }

    /**
     * 设置retXFee属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setRetXFee(Double value) {
        this.retXFee = value;
    }

    /**
     * 获取returnFy属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getReturnFy() {
        return returnFy;
    }

    /**
     * 设置returnFy属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setReturnFy(Double value) {
        this.returnFy = value;
    }

}
