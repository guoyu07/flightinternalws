/**
 * Autogenerated by soa-sdk-toolkit
 *
 * DO NOT EDIT DIRECTLY
 */
package com.ctrip.soa.global.api.getintlinsurance.v1;

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
@XmlType(name = "IntlLimit", propOrder = {
    "minAge",
    "minType",
    "maxAge",
    "maxAgeType",
    "amount"
})
@SuppressWarnings("all")
public class IntlLimit  {

    private static final long serialVersionUID = 1L;

    public IntlLimit(
        int minAge, 
        String minType, 
        int maxAge, 
        String maxAgeType, 
        int amount) {
        this.minAge = minAge;
        this.minType = minType;
        this.maxAge = maxAge;
        this.maxAgeType = maxAgeType;
        this.amount = amount;
    }

    public IntlLimit() {
    }

    @FieldDoc("可购买的最小年龄, 0表示无限制")
    @JsonProperty("MinAge")
    @XmlElement(name = "MinAge")
    private int minAge;

    @FieldDoc("年龄类型，Y表示年，D表示天，Max表示无限制")
    @JsonProperty("MinType")
    @XmlElement(name = "MinType")
    private String minType;

    @FieldDoc("可购买的最大年龄，0表示无限制")
    @JsonProperty("MaxAge")
    @XmlElement(name = "MaxAge")
    private int maxAge;

    @FieldDoc("年龄类型，Y表示年，D表示天，Max表示无限制")
    @JsonProperty("MaxAgeType")
    @XmlElement(name = "MaxAgeType")
    private String maxAgeType;

    @FieldDoc("单人可购买份数")
    @JsonProperty("Amount")
    @XmlElement(name = "Amount")
    private int amount;

    /**
     * 可购买的最小年龄, 0表示无限制
     */
    public int getMinAge() {
        return this.minAge;
    }

    public void setMinAge(int minAge) {
        this.minAge = minAge;
    }

    /**
     * 年龄类型，Y表示年，D表示天，Max表示无限制
     */
    public String getMinType() {
        return this.minType;
    }

    public void setMinType(String minType) {
        this.minType = minType;
    }

    /**
     * 可购买的最大年龄，0表示无限制
     */
    public int getMaxAge() {
        return this.maxAge;
    }

    public void setMaxAge(int maxAge) {
        this.maxAge = maxAge;
    }

    /**
     * 年龄类型，Y表示年，D表示天，Max表示无限制
     */
    public String getMaxAgeType() {
        return this.maxAgeType;
    }

    public void setMaxAgeType(String maxAgeType) {
        this.maxAgeType = maxAgeType;
    }

    /**
     * 单人可购买份数
     */
    public int getAmount() {
        return this.amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;

        final IntlLimit other = (IntlLimit)obj;
        return
            Objects.equal(this.minAge, other.minAge) && 
            Objects.equal(this.minType, other.minType) && 
            Objects.equal(this.maxAge, other.maxAge) && 
            Objects.equal(this.maxAgeType, other.maxAgeType) && 
            Objects.equal(this.amount, other.amount);
    }

    @Override
    public int hashCode() {
        int result = 1;

        result = 31 * result + Objects.hashCode(this.minAge);
        result = 31 * result + Objects.hashCode(this.minType);
        result = 31 * result + Objects.hashCode(this.maxAge);
        result = 31 * result + Objects.hashCode(this.maxAgeType);
        result = 31 * result + Objects.hashCode(this.amount);

        return result;
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
            .add("minAge", minAge)
            .add("minType", minType)
            .add("maxAge", maxAge)
            .add("maxAgeType", maxAgeType)
            .add("amount", amount)
            .toString();
    }
}