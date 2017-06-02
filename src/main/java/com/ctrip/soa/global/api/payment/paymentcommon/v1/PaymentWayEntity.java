/**
 * Autogenerated by soa-sdk-toolkit
 *
 * DO NOT EDIT DIRECTLY
 */
package com.ctrip.soa.global.api.payment.paymentcommon.v1;

import com.ctriposs.baiji.rpc.common.apidoc.DtoDoc;
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

/**
 * 支付方式
 */
@DtoDoc("支付方式")
@JsonAutoDetect(getterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE)
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentWayEntity", propOrder = {
    "creditCardType",
    "paymentWayGlobalName",
    "paymentWayID",
    "bCardHolder",
    "bIdNumber",
    "bIdType",
    "bVerifyNo",
    "isNationalCard"
})
@SuppressWarnings("all")
public class PaymentWayEntity  {

    private static final long serialVersionUID = 1L;

    public PaymentWayEntity(
        int creditCardType, 
        String paymentWayGlobalName, 
        String paymentWayID, 
        int bCardHolder, 
        int bIdNumber, 
        int bIdType, 
        int bVerifyNo, 
        int isNationalCard) {
        this.creditCardType = creditCardType;
        this.paymentWayGlobalName = paymentWayGlobalName;
        this.paymentWayID = paymentWayID;
        this.bCardHolder = bCardHolder;
        this.bIdNumber = bIdNumber;
        this.bIdType = bIdType;
        this.bVerifyNo = bVerifyNo;
        this.isNationalCard = isNationalCard;
    }

    public PaymentWayEntity() {
    }

    @FieldDoc("卡种")
    @JsonProperty("CreditCardType")
    @XmlElement(name = "CreditCardType")
    private int creditCardType;

    @FieldDoc("支付方式多语言名称")
    @JsonProperty("PaymentWayGlobalName")
    @XmlElement(name = "PaymentWayGlobalName")
    private String paymentWayGlobalName;

    @FieldDoc("支付方式编码")
    @JsonProperty("PaymentWayID")
    @XmlElement(name = "PaymentWayID")
    private String paymentWayID;

    @FieldDoc("是否需要持卡人 1：需要 0：不要")
    @JsonProperty("BCardHolder")
    @XmlElement(name = "BCardHolder")
    private int bCardHolder;

    @FieldDoc("是否需要证件号 1：需要 0：不要")
    @JsonProperty("BIdNumber")
    @XmlElement(name = "BIdNumber")
    private int bIdNumber;

    @FieldDoc("是否需要证件类型 1：需要 0：不要")
    @JsonProperty("BIdType")
    @XmlElement(name = "BIdType")
    private int bIdType;

    @FieldDoc("是否需要CVV 1：需要 0：不要")
    @JsonProperty("BVerifyNo")
    @XmlElement(name = "BVerifyNo")
    private int bVerifyNo;

    @FieldDoc("是否国际卡 1是 0 否")
    @JsonProperty("IsNationalCard")
    @XmlElement(name = "IsNationalCard")
    private int isNationalCard;

    /**
     * 卡种
     */
    public int getCreditCardType() {
        return this.creditCardType;
    }

    public void setCreditCardType(int creditCardType) {
        this.creditCardType = creditCardType;
    }

    /**
     * 支付方式多语言名称
     */
    public String getPaymentWayGlobalName() {
        return this.paymentWayGlobalName;
    }

    public void setPaymentWayGlobalName(String paymentWayGlobalName) {
        this.paymentWayGlobalName = paymentWayGlobalName;
    }

    /**
     * 支付方式编码
     */
    public String getPaymentWayID() {
        return this.paymentWayID;
    }

    public void setPaymentWayID(String paymentWayID) {
        this.paymentWayID = paymentWayID;
    }

    /**
     * 是否需要持卡人 1：需要 0：不要
     */
    public int getBCardHolder() {
        return this.bCardHolder;
    }

    public void setBCardHolder(int bCardHolder) {
        this.bCardHolder = bCardHolder;
    }

    /**
     * 是否需要证件号 1：需要 0：不要
     */
    public int getBIdNumber() {
        return this.bIdNumber;
    }

    public void setBIdNumber(int bIdNumber) {
        this.bIdNumber = bIdNumber;
    }

    /**
     * 是否需要证件类型 1：需要 0：不要
     */
    public int getBIdType() {
        return this.bIdType;
    }

    public void setBIdType(int bIdType) {
        this.bIdType = bIdType;
    }

    /**
     * 是否需要CVV 1：需要 0：不要
     */
    public int getBVerifyNo() {
        return this.bVerifyNo;
    }

    public void setBVerifyNo(int bVerifyNo) {
        this.bVerifyNo = bVerifyNo;
    }

    /**
     * 是否国际卡 1是 0 否
     */
    public int getIsNationalCard() {
        return this.isNationalCard;
    }

    public void setIsNationalCard(int isNationalCard) {
        this.isNationalCard = isNationalCard;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;

        final PaymentWayEntity other = (PaymentWayEntity)obj;
        return
            Objects.equal(this.creditCardType, other.creditCardType) && 
            Objects.equal(this.paymentWayGlobalName, other.paymentWayGlobalName) && 
            Objects.equal(this.paymentWayID, other.paymentWayID) && 
            Objects.equal(this.bCardHolder, other.bCardHolder) && 
            Objects.equal(this.bIdNumber, other.bIdNumber) && 
            Objects.equal(this.bIdType, other.bIdType) && 
            Objects.equal(this.bVerifyNo, other.bVerifyNo) && 
            Objects.equal(this.isNationalCard, other.isNationalCard);
    }

    @Override
    public int hashCode() {
        int result = 1;

        result = 31 * result + Objects.hashCode(this.creditCardType);
        result = 31 * result + Objects.hashCode(this.paymentWayGlobalName);
        result = 31 * result + Objects.hashCode(this.paymentWayID);
        result = 31 * result + Objects.hashCode(this.bCardHolder);
        result = 31 * result + Objects.hashCode(this.bIdNumber);
        result = 31 * result + Objects.hashCode(this.bIdType);
        result = 31 * result + Objects.hashCode(this.bVerifyNo);
        result = 31 * result + Objects.hashCode(this.isNationalCard);

        return result;
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
            .add("creditCardType", creditCardType)
            .add("paymentWayGlobalName", paymentWayGlobalName)
            .add("paymentWayID", paymentWayID)
            .add("bCardHolder", bCardHolder)
            .add("bIdNumber", bIdNumber)
            .add("bIdType", bIdType)
            .add("bVerifyNo", bVerifyNo)
            .add("isNationalCard", isNationalCard)
            .toString();
    }
}