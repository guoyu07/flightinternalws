/**
 * Autogenerated by soa-sdk-toolkit
 *
 * DO NOT EDIT DIRECTLY
 */
package com.ctrip.soa.global.api.validationmulticurrencycoupon.v1;

import com.ctriposs.baiji.rpc.common.apidoc.FieldDoc;
import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.common.base.MoreObjects;
import com.google.common.base.Objects;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@JsonAutoDetect(getterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE)
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CouponPaymentInfo", propOrder = {
    "cardSegmentEnd",
    "cardSegmentStart",
    "paymentCatalogID",
    "paymentName",
    "paymentWay",
    "prepayType",
    "times"
})
@SuppressWarnings("all")
public class CouponPaymentInfo  {

    private static final long serialVersionUID = 1L;

    public CouponPaymentInfo(
        String cardSegmentEnd, 
        String cardSegmentStart, 
        int paymentCatalogID, 
        String paymentName, 
        String paymentWay, 
        String prepayType, 
        int times) {
        this.cardSegmentEnd = cardSegmentEnd;
        this.cardSegmentStart = cardSegmentStart;
        this.paymentCatalogID = paymentCatalogID;
        this.paymentName = paymentName;
        this.paymentWay = paymentWay;
        this.prepayType = prepayType;
        this.times = times;
    }

    public CouponPaymentInfo() {
    }

    @FieldDoc("卡号端结尾")
    @JsonProperty("CardSegmentEnd")
    @XmlElement(name = "CardSegmentEnd")
    private String cardSegmentEnd;

    @FieldDoc("卡号段起始")
    @JsonProperty("CardSegmentStart")
    @XmlElement(name = "CardSegmentStart")
    private String cardSegmentStart;

    @FieldDoc("支付大类ID")
    @JsonProperty("PaymentCatalogID")
    @XmlElement(name = "PaymentCatalogID")
    private int paymentCatalogID;

    @FieldDoc("支付方式名称，如CreditCard")
    @JsonProperty("PaymentName")
    @XmlElement(name = "PaymentName")
    private String paymentName;

    @FieldDoc("支付方式,如CC_VISA")
    @JsonProperty("PaymentWay")
    @XmlElement(name = "PaymentWay")
    private String paymentWay;

    @FieldDoc("支付方式")
    @JsonProperty("PrepayType")
    @XmlElement(name = "PrepayType")
    private String prepayType;

    @FieldDoc("Times")
    @JsonProperty("Times")
    @XmlElement(name = "Times")
    private int times;

    /**
     * 卡号端结尾
     */
    public String getCardSegmentEnd() {
        return this.cardSegmentEnd;
    }

    public void setCardSegmentEnd(String cardSegmentEnd) {
        this.cardSegmentEnd = cardSegmentEnd;
    }

    /**
     * 卡号段起始
     */
    public String getCardSegmentStart() {
        return this.cardSegmentStart;
    }

    public void setCardSegmentStart(String cardSegmentStart) {
        this.cardSegmentStart = cardSegmentStart;
    }

    /**
     * 支付大类ID
     */
    public int getPaymentCatalogID() {
        return this.paymentCatalogID;
    }

    public void setPaymentCatalogID(int paymentCatalogID) {
        this.paymentCatalogID = paymentCatalogID;
    }

    /**
     * 支付方式名称，如CreditCard
     */
    public String getPaymentName() {
        return this.paymentName;
    }

    public void setPaymentName(String paymentName) {
        this.paymentName = paymentName;
    }

    /**
     * 支付方式,如CC_VISA
     */
    public String getPaymentWay() {
        return this.paymentWay;
    }

    public void setPaymentWay(String paymentWay) {
        this.paymentWay = paymentWay;
    }

    /**
     * 支付方式
     */
    public String getPrepayType() {
        return this.prepayType;
    }

    public void setPrepayType(String prepayType) {
        this.prepayType = prepayType;
    }

    /**
     * Times
     */
    public int getTimes() {
        return this.times;
    }

    public void setTimes(int times) {
        this.times = times;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;

        final CouponPaymentInfo other = (CouponPaymentInfo)obj;
        return
            Objects.equal(this.cardSegmentEnd, other.cardSegmentEnd) && 
            Objects.equal(this.cardSegmentStart, other.cardSegmentStart) && 
            Objects.equal(this.paymentCatalogID, other.paymentCatalogID) && 
            Objects.equal(this.paymentName, other.paymentName) && 
            Objects.equal(this.paymentWay, other.paymentWay) && 
            Objects.equal(this.prepayType, other.prepayType) && 
            Objects.equal(this.times, other.times);
    }

    @Override
    public int hashCode() {
        int result = 1;

        result = 31 * result + Objects.hashCode(this.cardSegmentEnd);
        result = 31 * result + Objects.hashCode(this.cardSegmentStart);
        result = 31 * result + Objects.hashCode(this.paymentCatalogID);
        result = 31 * result + Objects.hashCode(this.paymentName);
        result = 31 * result + Objects.hashCode(this.paymentWay);
        result = 31 * result + Objects.hashCode(this.prepayType);
        result = 31 * result + Objects.hashCode(this.times);

        return result;
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
            .add("cardSegmentEnd", cardSegmentEnd)
            .add("cardSegmentStart", cardSegmentStart)
            .add("paymentCatalogID", paymentCatalogID)
            .add("paymentName", paymentName)
            .add("paymentWay", paymentWay)
            .add("prepayType", prepayType)
            .add("times", times)
            .toString();
    }
}