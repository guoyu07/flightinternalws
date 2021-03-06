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
 * QTE信息
 */
@DtoDoc("QTE信息")
@JsonAutoDetect(getterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE)
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QTEDetailInfo", propOrder = {
    "ticketType",
    "priceChanged",
    "salePrice",
    "tax"
})
@SuppressWarnings("all")
public class QTEDetailInfo  {

    private static final long serialVersionUID = 1L;

    public QTEDetailInfo(
        GaPassengerType ticketType, 
        int priceChanged, 
        BigDecimal salePrice, 
        BigDecimal tax) {
        this.ticketType = ticketType;
        this.priceChanged = priceChanged;
        this.salePrice = salePrice;
        this.tax = tax;
    }

    public QTEDetailInfo() {
    }

    @FieldDoc("机票类型")
    @JsonProperty("TicketType")
    @XmlElement(name = "TicketType")
    private GaPassengerType ticketType;

    @FieldDoc("0不变，1变价")
    @JsonProperty("PriceChanged")
    @XmlElement(name = "PriceChanged")
    private int priceChanged;

    @FieldDoc("机票价格")
    @JsonProperty("SalePrice")
    @XmlElement(name = "SalePrice")
    private BigDecimal salePrice;

    @FieldDoc("税费")
    @JsonProperty("Tax")
    @XmlElement(name = "Tax")
    private BigDecimal tax;

    /**
     * 机票类型
     */
    public GaPassengerType getTicketType() {
        return this.ticketType;
    }

    public void setTicketType(GaPassengerType ticketType) {
        this.ticketType = ticketType;
    }

    /**
     * 0不变，1变价
     */
    public int getPriceChanged() {
        return this.priceChanged;
    }

    public void setPriceChanged(int priceChanged) {
        this.priceChanged = priceChanged;
    }

    /**
     * 机票价格
     */
    public BigDecimal getSalePrice() {
        return this.salePrice;
    }

    public void setSalePrice(BigDecimal salePrice) {
        this.salePrice = salePrice;
    }

    /**
     * 税费
     */
    public BigDecimal getTax() {
        return this.tax;
    }

    public void setTax(BigDecimal tax) {
        this.tax = tax;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;

        final QTEDetailInfo other = (QTEDetailInfo)obj;
        return
            Objects.equal(this.ticketType, other.ticketType) && 
            Objects.equal(this.priceChanged, other.priceChanged) && 
            Objects.equal(this.salePrice, other.salePrice) && 
            Objects.equal(this.tax, other.tax);
    }

    @Override
    public int hashCode() {
        int result = 1;

        result = 31 * result + Objects.hashCode(this.ticketType);
        result = 31 * result + Objects.hashCode(this.priceChanged);
        result = 31 * result + Objects.hashCode(this.salePrice);
        result = 31 * result + Objects.hashCode(this.tax);

        return result;
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
            .add("ticketType", ticketType)
            .add("priceChanged", priceChanged)
            .add("salePrice", salePrice)
            .add("tax", tax)
            .toString();
    }
}