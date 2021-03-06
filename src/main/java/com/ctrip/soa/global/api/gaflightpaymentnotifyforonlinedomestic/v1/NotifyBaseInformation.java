/**
 * Autogenerated by soa-sdk-toolkit
 *
 * DO NOT EDIT DIRECTLY
 */
package com.ctrip.soa.global.api.gaflightpaymentnotifyforonlinedomestic.v1;

import com.ctriposs.baiji.rpc.common.apidoc.DtoDoc;
import com.ctriposs.baiji.rpc.common.apidoc.FieldDoc;
import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.common.base.MoreObjects;
import com.google.common.base.Objects;
import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * 通知请求基本信息
 */
@DtoDoc("通知请求基本信息")
@JsonAutoDetect(getterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE)
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NotifyBaseInformation", propOrder = {
    "orderID",
    "currency",
    "amount",
    "userID",
    "merchantID",
    "billNo",
    "externalNo"
})
@SuppressWarnings("all")
public class NotifyBaseInformation  {

    private static final long serialVersionUID = 1L;

    public NotifyBaseInformation(
        long orderID, 
        String currency, 
        BigDecimal amount, 
        String userID, 
        int merchantID, 
        long billNo, 
        String externalNo) {
        this.orderID = orderID;
        this.currency = currency;
        this.amount = amount;
        this.userID = userID;
        this.merchantID = merchantID;
        this.billNo = billNo;
        this.externalNo = externalNo;
    }

    public NotifyBaseInformation() {
    }

    @FieldDoc("订单号")
    @JsonProperty("OrderID")
    @XmlElement(name = "OrderID")
    private long orderID;

    @FieldDoc("币种String(3)")
    @JsonProperty("Currency")
    @XmlElement(name = "Currency")
    private String currency;

    @FieldDoc("订单总金额，业务进入支付平台时提供")
    @JsonProperty("Amount")
    @XmlElement(name = "Amount")
    private BigDecimal amount;

    @FieldDoc("用户的账户IDString(20)")
    @JsonProperty("UserID")
    @XmlElement(name = "UserID")
    private String userID;

    @FieldDoc("商户号")
    @JsonProperty("MerchantID")
    @XmlElement(name = "MerchantID")
    private int merchantID;

    @FieldDoc("Bill单号")
    @JsonProperty("BillNo")
    @XmlElement(name = "BillNo")
    private long billNo;

    @FieldDoc("LTP模式绑定号，商户进入支付平台时提供")
    @JsonProperty("ExternalNo")
    @XmlElement(name = "ExternalNo")
    private String externalNo;

    /**
     * 订单号
     */
    public long getOrderID() {
        return this.orderID;
    }

    public void setOrderID(long orderID) {
        this.orderID = orderID;
    }

    /**
     * 币种String(3)
     */
    public String getCurrency() {
        return this.currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    /**
     * 订单总金额，业务进入支付平台时提供
     */
    public BigDecimal getAmount() {
        return this.amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    /**
     * 用户的账户IDString(20)
     */
    public String getUserID() {
        return this.userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    /**
     * 商户号
     */
    public int getMerchantID() {
        return this.merchantID;
    }

    public void setMerchantID(int merchantID) {
        this.merchantID = merchantID;
    }

    /**
     * Bill单号
     */
    public long getBillNo() {
        return this.billNo;
    }

    public void setBillNo(long billNo) {
        this.billNo = billNo;
    }

    /**
     * LTP模式绑定号，商户进入支付平台时提供
     */
    public String getExternalNo() {
        return this.externalNo;
    }

    public void setExternalNo(String externalNo) {
        this.externalNo = externalNo;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;

        final NotifyBaseInformation other = (NotifyBaseInformation)obj;
        return
            Objects.equal(this.orderID, other.orderID) && 
            Objects.equal(this.currency, other.currency) && 
            Objects.equal(this.amount, other.amount) && 
            Objects.equal(this.userID, other.userID) && 
            Objects.equal(this.merchantID, other.merchantID) && 
            Objects.equal(this.billNo, other.billNo) && 
            Objects.equal(this.externalNo, other.externalNo);
    }

    @Override
    public int hashCode() {
        int result = 1;

        result = 31 * result + Objects.hashCode(this.orderID);
        result = 31 * result + Objects.hashCode(this.currency);
        result = 31 * result + Objects.hashCode(this.amount);
        result = 31 * result + Objects.hashCode(this.userID);
        result = 31 * result + Objects.hashCode(this.merchantID);
        result = 31 * result + Objects.hashCode(this.billNo);
        result = 31 * result + Objects.hashCode(this.externalNo);

        return result;
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
            .add("orderID", orderID)
            .add("currency", currency)
            .add("amount", amount)
            .add("userID", userID)
            .add("merchantID", merchantID)
            .add("billNo", billNo)
            .add("externalNo", externalNo)
            .toString();
    }
}