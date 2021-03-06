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
 * 价格信息
 */
@DtoDoc("价格信息")
@JsonAutoDetect(getterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE)
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PriceInfo", propOrder = {
    "tax",
    "price",
    "fuelSurCharge"
})
@SuppressWarnings("all")
public class PriceInfo  {

    private static final long serialVersionUID = 1L;

    public PriceInfo(
        BigDecimal tax, 
        BigDecimal price, 
        BigDecimal fuelSurCharge) {
        this.tax = tax;
        this.price = price;
        this.fuelSurCharge = fuelSurCharge;
    }

    public PriceInfo() {
    }

    @FieldDoc("税费")
    @JsonProperty("Tax")
    @XmlElement(name = "Tax")
    private BigDecimal tax;

    @FieldDoc("机票价格")
    @JsonProperty("Price")
    @XmlElement(name = "Price")
    private BigDecimal price;

    @FieldDoc("燃油附加费")
    @JsonProperty("FuelSurCharge")
    @XmlElement(name = "FuelSurCharge")
    private BigDecimal fuelSurCharge;

    /**
     * 税费
     */
    public BigDecimal getTax() {
        return this.tax;
    }

    public void setTax(BigDecimal tax) {
        this.tax = tax;
    }

    /**
     * 机票价格
     */
    public BigDecimal getPrice() {
        return this.price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    /**
     * 燃油附加费
     */
    public BigDecimal getFuelSurCharge() {
        return this.fuelSurCharge;
    }

    public void setFuelSurCharge(BigDecimal fuelSurCharge) {
        this.fuelSurCharge = fuelSurCharge;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;

        final PriceInfo other = (PriceInfo)obj;
        return
            Objects.equal(this.tax, other.tax) && 
            Objects.equal(this.price, other.price) && 
            Objects.equal(this.fuelSurCharge, other.fuelSurCharge);
    }

    @Override
    public int hashCode() {
        int result = 1;

        result = 31 * result + Objects.hashCode(this.tax);
        result = 31 * result + Objects.hashCode(this.price);
        result = 31 * result + Objects.hashCode(this.fuelSurCharge);

        return result;
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
            .add("tax", tax)
            .add("price", price)
            .add("fuelSurCharge", fuelSurCharge)
            .toString();
    }
}