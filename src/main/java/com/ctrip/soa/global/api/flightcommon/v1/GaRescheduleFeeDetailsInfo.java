/**
 * Autogenerated by soa-sdk-toolkit
 *
 * DO NOT EDIT DIRECTLY
 */
package com.ctrip.soa.global.api.flightcommon.v1;

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
 * 改签费用信息
 */
@DtoDoc("改签费用信息")
@JsonAutoDetect(getterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE)
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GaRescheduleFeeDetailsInfo", propOrder = {
    "dateChangeFee",
    "taxDiff",
    "fareDiff",
    "totalFee",
    "chargeType",
    "upgradeFee",
    "currency"
})
@SuppressWarnings("all")
public class GaRescheduleFeeDetailsInfo  {

    private static final long serialVersionUID = 1L;

    public GaRescheduleFeeDetailsInfo(
        BigDecimal dateChangeFee, 
        BigDecimal taxDiff, 
        BigDecimal fareDiff, 
        BigDecimal totalFee, 
        int chargeType, 
        BigDecimal upgradeFee, 
        String currency) {
        this.dateChangeFee = dateChangeFee;
        this.taxDiff = taxDiff;
        this.fareDiff = fareDiff;
        this.totalFee = totalFee;
        this.chargeType = chargeType;
        this.upgradeFee = upgradeFee;
        this.currency = currency;
    }

    public GaRescheduleFeeDetailsInfo() {
    }

    @FieldDoc("改期费")
    @JsonProperty("DateChangeFee")
    @XmlElement(name = "DateChangeFee")
    private BigDecimal dateChangeFee;

    @FieldDoc("税费差")
    @JsonProperty("TaxDiff")
    @XmlElement(name = "TaxDiff")
    private BigDecimal taxDiff;

    @FieldDoc("票价差")
    @JsonProperty("FareDiff")
    @XmlElement(name = "FareDiff")
    private BigDecimal fareDiff;

    @FieldDoc("总费用")
    @JsonProperty("TotalFee")
    @XmlElement(name = "TotalFee")
    private BigDecimal totalFee;

    @FieldDoc("0:免费; 1:收费 2:费用待确认")
    @JsonProperty("ChargeType")
    @XmlElement(name = "ChargeType")
    private int chargeType;

    @FieldDoc("升舱费(国内专用)")
    @JsonProperty("UpgradeFee")
    @XmlElement(name = "UpgradeFee")
    private BigDecimal upgradeFee;

    @FieldDoc("原订单支付币种")
    @JsonProperty("Currency")
    @XmlElement(name = "Currency")
    private String currency;

    /**
     * 改期费
     */
    public BigDecimal getDateChangeFee() {
        return this.dateChangeFee;
    }

    public void setDateChangeFee(BigDecimal dateChangeFee) {
        this.dateChangeFee = dateChangeFee;
    }

    /**
     * 税费差
     */
    public BigDecimal getTaxDiff() {
        return this.taxDiff;
    }

    public void setTaxDiff(BigDecimal taxDiff) {
        this.taxDiff = taxDiff;
    }

    /**
     * 票价差
     */
    public BigDecimal getFareDiff() {
        return this.fareDiff;
    }

    public void setFareDiff(BigDecimal fareDiff) {
        this.fareDiff = fareDiff;
    }

    /**
     * 总费用
     */
    public BigDecimal getTotalFee() {
        return this.totalFee;
    }

    public void setTotalFee(BigDecimal totalFee) {
        this.totalFee = totalFee;
    }

    /**
     * 0:免费; 1:收费 2:费用待确认
     */
    public int getChargeType() {
        return this.chargeType;
    }

    public void setChargeType(int chargeType) {
        this.chargeType = chargeType;
    }

    /**
     * 升舱费(国内专用)
     */
    public BigDecimal getUpgradeFee() {
        return this.upgradeFee;
    }

    public void setUpgradeFee(BigDecimal upgradeFee) {
        this.upgradeFee = upgradeFee;
    }

    /**
     * 原订单支付币种
     */
    public String getCurrency() {
        return this.currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;

        final GaRescheduleFeeDetailsInfo other = (GaRescheduleFeeDetailsInfo)obj;
        return
            Objects.equal(this.dateChangeFee, other.dateChangeFee) && 
            Objects.equal(this.taxDiff, other.taxDiff) && 
            Objects.equal(this.fareDiff, other.fareDiff) && 
            Objects.equal(this.totalFee, other.totalFee) && 
            Objects.equal(this.chargeType, other.chargeType) && 
            Objects.equal(this.upgradeFee, other.upgradeFee) && 
            Objects.equal(this.currency, other.currency);
    }

    @Override
    public int hashCode() {
        int result = 1;

        result = 31 * result + Objects.hashCode(this.dateChangeFee);
        result = 31 * result + Objects.hashCode(this.taxDiff);
        result = 31 * result + Objects.hashCode(this.fareDiff);
        result = 31 * result + Objects.hashCode(this.totalFee);
        result = 31 * result + Objects.hashCode(this.chargeType);
        result = 31 * result + Objects.hashCode(this.upgradeFee);
        result = 31 * result + Objects.hashCode(this.currency);

        return result;
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
            .add("dateChangeFee", dateChangeFee)
            .add("taxDiff", taxDiff)
            .add("fareDiff", fareDiff)
            .add("totalFee", totalFee)
            .add("chargeType", chargeType)
            .add("upgradeFee", upgradeFee)
            .add("currency", currency)
            .toString();
    }
}