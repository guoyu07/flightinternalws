/**
 * Autogenerated by soa-sdk-toolkit
 *
 * DO NOT EDIT DIRECTLY
 */
package com.ctrip.soa.global.api.gareschedulecondition.v1;

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
@XmlType(name = "RCXProductDesc", propOrder = {
    "xProductType",
    "amount",
    "desc",
    "productName"
})
@SuppressWarnings("all")
public class RCXProductDesc  {

    private static final long serialVersionUID = 1L;

    public RCXProductDesc(
        int xProductType, 
        int amount, 
        String desc, 
        String productName) {
        this.xProductType = xProductType;
        this.amount = amount;
        this.desc = desc;
        this.productName = productName;
    }

    public RCXProductDesc() {
    }

    @FieldDoc("X产品类型" +
            "1-航意险" +
            "2-旅行险" +
            "3-休息室" +
            "4-优惠券" +
            "5-行李额")
    @JsonProperty("XProductType")
    @XmlElement(name = "XProductType")
    private int xProductType;

    @FieldDoc("份数")
    @JsonProperty("Amount")
    @XmlElement(name = "Amount")
    private int amount;

    @FieldDoc("改签处理说明")
    @JsonProperty("Desc")
    @XmlElement(name = "Desc")
    private String desc;

    @FieldDoc("X产品名称（多语言）")
    @JsonProperty("ProductName")
    @XmlElement(name = "ProductName")
    private String productName;

    /**
     * X产品类型
     *             1-航意险
     *             2-旅行险
     *             3-休息室
     *             4-优惠券
     *             5-行李额
     */
    public int getXProductType() {
        return this.xProductType;
    }

    public void setXProductType(int xProductType) {
        this.xProductType = xProductType;
    }

    /**
     * 份数
     */
    public int getAmount() {
        return this.amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    /**
     * 改签处理说明
     */
    public String getDesc() {
        return this.desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    /**
     * X产品名称（多语言）
     */
    public String getProductName() {
        return this.productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;

        final RCXProductDesc other = (RCXProductDesc)obj;
        return
            Objects.equal(this.xProductType, other.xProductType) && 
            Objects.equal(this.amount, other.amount) && 
            Objects.equal(this.desc, other.desc) && 
            Objects.equal(this.productName, other.productName);
    }

    @Override
    public int hashCode() {
        int result = 1;

        result = 31 * result + Objects.hashCode(this.xProductType);
        result = 31 * result + Objects.hashCode(this.amount);
        result = 31 * result + Objects.hashCode(this.desc);
        result = 31 * result + Objects.hashCode(this.productName);

        return result;
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
            .add("xProductType", xProductType)
            .add("amount", amount)
            .add("desc", desc)
            .add("productName", productName)
            .toString();
    }
}