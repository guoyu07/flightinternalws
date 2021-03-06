/**
 * Autogenerated by soa-sdk-toolkit
 *
 * DO NOT EDIT DIRECTLY
 */
package com.ctrip.soa.global.api.gaintlxproductsearch.v1;

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
 * 优惠券信息
 */
@DtoDoc("优惠券信息")
@JsonAutoDetect(getterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE)
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FlightXCouponInfo", propOrder = {
    "couponDesc",
    "couponID",
    "couponName",
    "couponPrintPrice",
    "couponProductRule",
    "couponSalePrice",
    "couponCNYSalePrice",
    "couponType",
    "dicountPrice",
    "productType",
    "ruleID",
    "tickRefundInfo"
})
@SuppressWarnings("all")
public class FlightXCouponInfo  {

    private static final long serialVersionUID = 1L;

    public FlightXCouponInfo(
        String couponDesc, 
        long couponID, 
        String couponName, 
        BigDecimal couponPrintPrice, 
        String couponProductRule, 
        BigDecimal couponSalePrice, 
        BigDecimal couponCNYSalePrice, 
        int couponType, 
        BigDecimal dicountPrice, 
        String productType, 
        int ruleID, 
        String tickRefundInfo) {
        this.couponDesc = couponDesc;
        this.couponID = couponID;
        this.couponName = couponName;
        this.couponPrintPrice = couponPrintPrice;
        this.couponProductRule = couponProductRule;
        this.couponSalePrice = couponSalePrice;
        this.couponCNYSalePrice = couponCNYSalePrice;
        this.couponType = couponType;
        this.dicountPrice = dicountPrice;
        this.productType = productType;
        this.ruleID = ruleID;
        this.tickRefundInfo = tickRefundInfo;
    }

    public FlightXCouponInfo() {
    }

    @FieldDoc("优惠券描述")
    @JsonProperty("CouponDesc")
    @XmlElement(name = "CouponDesc")
    private String couponDesc;

    @FieldDoc("优惠券ID")
    @JsonProperty("CouponID")
    @XmlElement(name = "CouponID")
    private long couponID;

    @FieldDoc("优惠券名称")
    @JsonProperty("CouponName")
    @XmlElement(name = "CouponName")
    private String couponName;

    @FieldDoc("优惠券面价")
    @JsonProperty("CouponPrintPrice")
    @XmlElement(name = "CouponPrintPrice")
    private BigDecimal couponPrintPrice;

    @FieldDoc("优惠券详细说明")
    @JsonProperty("CouponProductRule")
    @XmlElement(name = "CouponProductRule")
    private String couponProductRule;

    @FieldDoc("优惠券销售价格")
    @JsonProperty("CouponSalePrice")
    @XmlElement(name = "CouponSalePrice")
    private BigDecimal couponSalePrice;

    @FieldDoc("优惠券人民币销售价格")
    @JsonProperty("CouponCNYSalePrice")
    @XmlElement(name = "CouponCNYSalePrice")
    private BigDecimal couponCNYSalePrice;

    @FieldDoc("优惠券类型")
    @JsonProperty("CouponType")
    @XmlElement(name = "CouponType")
    private int couponType;

    @FieldDoc("折扣价")
    @JsonProperty("DicountPrice")
    @XmlElement(name = "DicountPrice")
    private BigDecimal dicountPrice;

    @FieldDoc("产品类型")
    @JsonProperty("ProductType")
    @XmlElement(name = "ProductType")
    private String productType;

    @FieldDoc("销售规则ID")
    @JsonProperty("RuleID")
    @XmlElement(name = "RuleID")
    private int ruleID;

    @FieldDoc("退改签规则")
    @JsonProperty("TickRefundInfo")
    @XmlElement(name = "TickRefundInfo")
    private String tickRefundInfo;

    /**
     * 优惠券描述
     */
    public String getCouponDesc() {
        return this.couponDesc;
    }

    public void setCouponDesc(String couponDesc) {
        this.couponDesc = couponDesc;
    }

    /**
     * 优惠券ID
     */
    public long getCouponID() {
        return this.couponID;
    }

    public void setCouponID(long couponID) {
        this.couponID = couponID;
    }

    /**
     * 优惠券名称
     */
    public String getCouponName() {
        return this.couponName;
    }

    public void setCouponName(String couponName) {
        this.couponName = couponName;
    }

    /**
     * 优惠券面价
     */
    public BigDecimal getCouponPrintPrice() {
        return this.couponPrintPrice;
    }

    public void setCouponPrintPrice(BigDecimal couponPrintPrice) {
        this.couponPrintPrice = couponPrintPrice;
    }

    /**
     * 优惠券详细说明
     */
    public String getCouponProductRule() {
        return this.couponProductRule;
    }

    public void setCouponProductRule(String couponProductRule) {
        this.couponProductRule = couponProductRule;
    }

    /**
     * 优惠券销售价格
     */
    public BigDecimal getCouponSalePrice() {
        return this.couponSalePrice;
    }

    public void setCouponSalePrice(BigDecimal couponSalePrice) {
        this.couponSalePrice = couponSalePrice;
    }

    /**
     * 优惠券人民币销售价格
     */
    public BigDecimal getCouponCNYSalePrice() {
        return this.couponCNYSalePrice;
    }

    public void setCouponCNYSalePrice(BigDecimal couponCNYSalePrice) {
        this.couponCNYSalePrice = couponCNYSalePrice;
    }

    /**
     * 优惠券类型
     */
    public int getCouponType() {
        return this.couponType;
    }

    public void setCouponType(int couponType) {
        this.couponType = couponType;
    }

    /**
     * 折扣价
     */
    public BigDecimal getDicountPrice() {
        return this.dicountPrice;
    }

    public void setDicountPrice(BigDecimal dicountPrice) {
        this.dicountPrice = dicountPrice;
    }

    /**
     * 产品类型
     */
    public String getProductType() {
        return this.productType;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }

    /**
     * 销售规则ID
     */
    public int getRuleID() {
        return this.ruleID;
    }

    public void setRuleID(int ruleID) {
        this.ruleID = ruleID;
    }

    /**
     * 退改签规则
     */
    public String getTickRefundInfo() {
        return this.tickRefundInfo;
    }

    public void setTickRefundInfo(String tickRefundInfo) {
        this.tickRefundInfo = tickRefundInfo;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;

        final FlightXCouponInfo other = (FlightXCouponInfo)obj;
        return
            Objects.equal(this.couponDesc, other.couponDesc) && 
            Objects.equal(this.couponID, other.couponID) && 
            Objects.equal(this.couponName, other.couponName) && 
            Objects.equal(this.couponPrintPrice, other.couponPrintPrice) && 
            Objects.equal(this.couponProductRule, other.couponProductRule) && 
            Objects.equal(this.couponSalePrice, other.couponSalePrice) && 
            Objects.equal(this.couponCNYSalePrice, other.couponCNYSalePrice) && 
            Objects.equal(this.couponType, other.couponType) && 
            Objects.equal(this.dicountPrice, other.dicountPrice) && 
            Objects.equal(this.productType, other.productType) && 
            Objects.equal(this.ruleID, other.ruleID) && 
            Objects.equal(this.tickRefundInfo, other.tickRefundInfo);
    }

    @Override
    public int hashCode() {
        int result = 1;

        result = 31 * result + Objects.hashCode(this.couponDesc);
        result = 31 * result + Objects.hashCode(this.couponID);
        result = 31 * result + Objects.hashCode(this.couponName);
        result = 31 * result + Objects.hashCode(this.couponPrintPrice);
        result = 31 * result + Objects.hashCode(this.couponProductRule);
        result = 31 * result + Objects.hashCode(this.couponSalePrice);
        result = 31 * result + Objects.hashCode(this.couponCNYSalePrice);
        result = 31 * result + Objects.hashCode(this.couponType);
        result = 31 * result + Objects.hashCode(this.dicountPrice);
        result = 31 * result + Objects.hashCode(this.productType);
        result = 31 * result + Objects.hashCode(this.ruleID);
        result = 31 * result + Objects.hashCode(this.tickRefundInfo);

        return result;
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
            .add("couponDesc", couponDesc)
            .add("couponID", couponID)
            .add("couponName", couponName)
            .add("couponPrintPrice", couponPrintPrice)
            .add("couponProductRule", couponProductRule)
            .add("couponSalePrice", couponSalePrice)
            .add("couponCNYSalePrice", couponCNYSalePrice)
            .add("couponType", couponType)
            .add("dicountPrice", dicountPrice)
            .add("productType", productType)
            .add("ruleID", ruleID)
            .add("tickRefundInfo", tickRefundInfo)
            .toString();
    }
}