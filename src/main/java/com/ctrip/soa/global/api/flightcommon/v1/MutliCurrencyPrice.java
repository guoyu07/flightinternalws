/**
 * Autogenerated by soa-sdk-toolkit
 *
 * DO NOT EDIT DIRECTLY
 */
package com.ctrip.soa.global.api.flightcommon.v1;

import com.ctrip.soa.global.api.comm.head.v1.Currency;
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
 * 多币种价格组合
 */
@DtoDoc("多币种价格组合")
@JsonAutoDetect(getterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE)
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MutliCurrencyPrice", propOrder = {
    "currency",
    "price"
})
@SuppressWarnings("all")
public class MutliCurrencyPrice  {

    private static final long serialVersionUID = 1L;

    public MutliCurrencyPrice(
        Currency currency, 
        BigDecimal price) {
        this.currency = currency;
        this.price = price;
    }

    public MutliCurrencyPrice() {
    }

    @FieldDoc("币种")
    @JsonProperty("Currency")
    @XmlElement(name = "Currency")
    private Currency currency;

    @FieldDoc("币种价格")
    @JsonProperty("Price")
    @XmlElement(name = "Price")
    private BigDecimal price;

    /**
     * 币种
     */
    public Currency getCurrency() {
        return this.currency;
    }

    public void setCurrency(Currency currency) {
        this.currency = currency;
    }

    /**
     * 币种价格
     */
    public BigDecimal getPrice() {
        return this.price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;

        final MutliCurrencyPrice other = (MutliCurrencyPrice)obj;
        return
            Objects.equal(this.currency, other.currency) && 
            Objects.equal(this.price, other.price);
    }

    @Override
    public int hashCode() {
        int result = 1;

        result = 31 * result + Objects.hashCode(this.currency);
        result = 31 * result + Objects.hashCode(this.price);

        return result;
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
            .add("currency", currency)
            .add("price", price)
            .toString();
    }
}