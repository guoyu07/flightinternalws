/**
 * Autogenerated by soa-sdk-toolkit
 *
 * DO NOT EDIT DIRECTLY
 */
package com.ctrip.soa.global.api.distributionsearchflight.v1;

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
 * 产品描述对应的语言货币信息,SubsidyCurCurrency是通过head.currency获取的,此处是通过head.Language获取的
 */
@DtoDoc("产品描述对应的语言货币信息,SubsidyCurCurrency是通过head.currency获取的,此处是通过head.Language获取的")
@JsonAutoDetect(getterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE)
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DistributionProductExchangeInfo", propOrder = {
    "exchangeCurrency",
    "exchangeBundledAmount",
    "exchangeSubsidy",
    "exchangeRate"
})
@SuppressWarnings("all")
public class DistributionProductExchangeInfo  {

    private static final long serialVersionUID = 1L;

    public DistributionProductExchangeInfo(
        String exchangeCurrency, 
        BigDecimal exchangeBundledAmount, 
        BigDecimal exchangeSubsidy, 
        BigDecimal exchangeRate) {
        this.exchangeCurrency = exchangeCurrency;
        this.exchangeBundledAmount = exchangeBundledAmount;
        this.exchangeSubsidy = exchangeSubsidy;
        this.exchangeRate = exchangeRate;
    }

    public DistributionProductExchangeInfo() {
    }

    @FieldDoc("当前查询语言币种")
    @JsonProperty("ExchangeCurrency")
    @XmlElement(name = "ExchangeCurrency")
    private String exchangeCurrency;

    @FieldDoc("捆绑金额")
    @JsonProperty("ExchangeBundledAmount")
    @XmlElement(name = "ExchangeBundledAmount")
    private BigDecimal exchangeBundledAmount;

    @FieldDoc("飞享金")
    @JsonProperty("ExchangeSubsidy")
    @XmlElement(name = "ExchangeSubsidy")
    private BigDecimal exchangeSubsidy;

    @FieldDoc("当前查询语言币种对人民币汇率")
    @JsonProperty("ExchangeRate")
    @XmlElement(name = "ExchangeRate")
    private BigDecimal exchangeRate;

    /**
     * 当前查询语言币种
     */
    public String getExchangeCurrency() {
        return this.exchangeCurrency;
    }

    public void setExchangeCurrency(String exchangeCurrency) {
        this.exchangeCurrency = exchangeCurrency;
    }

    /**
     * 捆绑金额
     */
    public BigDecimal getExchangeBundledAmount() {
        return this.exchangeBundledAmount;
    }

    public void setExchangeBundledAmount(BigDecimal exchangeBundledAmount) {
        this.exchangeBundledAmount = exchangeBundledAmount;
    }

    /**
     * 飞享金
     */
    public BigDecimal getExchangeSubsidy() {
        return this.exchangeSubsidy;
    }

    public void setExchangeSubsidy(BigDecimal exchangeSubsidy) {
        this.exchangeSubsidy = exchangeSubsidy;
    }

    /**
     * 当前查询语言币种对人民币汇率
     */
    public BigDecimal getExchangeRate() {
        return this.exchangeRate;
    }

    public void setExchangeRate(BigDecimal exchangeRate) {
        this.exchangeRate = exchangeRate;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;

        final DistributionProductExchangeInfo other = (DistributionProductExchangeInfo)obj;
        return
            Objects.equal(this.exchangeCurrency, other.exchangeCurrency) && 
            Objects.equal(this.exchangeBundledAmount, other.exchangeBundledAmount) && 
            Objects.equal(this.exchangeSubsidy, other.exchangeSubsidy) && 
            Objects.equal(this.exchangeRate, other.exchangeRate);
    }

    @Override
    public int hashCode() {
        int result = 1;

        result = 31 * result + Objects.hashCode(this.exchangeCurrency);
        result = 31 * result + Objects.hashCode(this.exchangeBundledAmount);
        result = 31 * result + Objects.hashCode(this.exchangeSubsidy);
        result = 31 * result + Objects.hashCode(this.exchangeRate);

        return result;
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
            .add("exchangeCurrency", exchangeCurrency)
            .add("exchangeBundledAmount", exchangeBundledAmount)
            .add("exchangeSubsidy", exchangeSubsidy)
            .add("exchangeRate", exchangeRate)
            .toString();
    }
}