/**
 * Autogenerated by soa-sdk-toolkit
 *
 * DO NOT EDIT DIRECTLY
 */
package com.ctrip.soa.global.api.flightcommon.v1;

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

@JsonAutoDetect(getterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE)
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FlightOrderCouponInfo", propOrder = {
    "couponNumber",
    "activityTheme",
    "activityDetails",
    "couponCanUse",
    "tryUse",
    "startDate",
    "disableDate",
    "couponTypeID",
    "promotionMethodID",
    "dataType",
    "promotionID",
    "deductionAmount",
    "unitTypeID",
    "deductionStrategyTypeID",
    "couponID",
    "passengerType",
    "isNewCouponMethod",
    "segmentList",
    "totalDeduction",
    "fDeductionAmount",
    "couponAmount",
    "isNeedCheck",
    "isNeedAPIGetCouponDetail"
})
@SuppressWarnings("all")
public class FlightOrderCouponInfo  {

    private static final long serialVersionUID = 1L;

    public FlightOrderCouponInfo(
        String couponNumber, 
        String activityTheme, 
        String activityDetails, 
        boolean couponCanUse, 
        boolean tryUse, 
        long startDate, 
        long disableDate, 
        int couponTypeID, 
        int promotionMethodID, 
        int dataType, 
        int promotionID, 
        BigDecimal deductionAmount, 
        int unitTypeID, 
        int deductionStrategyTypeID, 
        long couponID, 
        String passengerType, 
        int isNewCouponMethod, 
        String segmentList, 
        BigDecimal totalDeduction, 
        BigDecimal fDeductionAmount, 
        BigDecimal couponAmount, 
        boolean isNeedCheck, 
        boolean isNeedAPIGetCouponDetail) {
        this.couponNumber = couponNumber;
        this.activityTheme = activityTheme;
        this.activityDetails = activityDetails;
        this.couponCanUse = couponCanUse;
        this.tryUse = tryUse;
        this.startDate = startDate;
        this.disableDate = disableDate;
        this.couponTypeID = couponTypeID;
        this.promotionMethodID = promotionMethodID;
        this.dataType = dataType;
        this.promotionID = promotionID;
        this.deductionAmount = deductionAmount;
        this.unitTypeID = unitTypeID;
        this.deductionStrategyTypeID = deductionStrategyTypeID;
        this.couponID = couponID;
        this.passengerType = passengerType;
        this.isNewCouponMethod = isNewCouponMethod;
        this.segmentList = segmentList;
        this.totalDeduction = totalDeduction;
        this.fDeductionAmount = fDeductionAmount;
        this.couponAmount = couponAmount;
        this.isNeedCheck = isNeedCheck;
        this.isNeedAPIGetCouponDetail = isNeedAPIGetCouponDetail;
    }

    public FlightOrderCouponInfo() {
    }

    @FieldDoc("优惠券代码")
    @JsonProperty("CouponNumber")
    @XmlElement(name = "CouponNumber")
    private String couponNumber;

    @FieldDoc("优惠券活动主题")
    @JsonProperty("ActivityTheme")
    @XmlElement(name = "ActivityTheme")
    private String activityTheme;

    @FieldDoc("优惠券活动详情")
    @JsonProperty("ActivityDetails")
    @XmlElement(name = "ActivityDetails")
    private String activityDetails;

    @FieldDoc("该订单是否可以使用优惠券(0为不可用，1为可用)")
    @JsonProperty("CouponCanUse")
    @XmlElement(name = "CouponCanUse")
    private boolean couponCanUse;

    @FieldDoc("用户是否尝试使用（0为否，1为是）")
    @JsonProperty("TryUse")
    @XmlElement(name = "TryUse")
    private boolean tryUse;

    @FieldDoc("有效期开始时间")
    @JsonProperty("StartDate")
    @XmlElement(name = "StartDate")
    private long startDate;

    @FieldDoc("有效期到期时间")
    @JsonProperty("DisableDate")
    @XmlElement(name = "DisableDate")
    private long disableDate;

    @FieldDoc("优惠代码类型(1-公共券 2-私有 3-单次券 4-团购券)")
    @JsonProperty("CouponTypeID")
    @XmlElement(name = "CouponTypeID")
    private int couponTypeID;

    @FieldDoc("优惠模式(1-立减 2-后返)")
    @JsonProperty("PromotionMethodID")
    @XmlElement(name = "PromotionMethodID")
    private int promotionMethodID;

    @FieldDoc("优惠类型(1 为优惠券)")
    @JsonProperty("DataType")
    @XmlElement(name = "DataType")
    private int dataType;

    @FieldDoc("优惠策略编号")
    @JsonProperty("PromotionID")
    @XmlElement(name = "PromotionID")
    private int promotionID;

    @FieldDoc("立减金额")
    @JsonProperty("DeductionAmount")
    @XmlElement(name = "DeductionAmount")
    private BigDecimal deductionAmount;

    @FieldDoc("优惠计算单位(1-按人 2-按订单 4-按航段)")
    @JsonProperty("UnitTypeID")
    @XmlElement(name = "UnitTypeID")
    private int unitTypeID;

    @FieldDoc("优惠折扣方式(1-固定立减" +
            "2-百分比" +
            "3-阶梯)")
    @JsonProperty("DeductionStrategyTypeID")
    @XmlElement(name = "DeductionStrategyTypeID")
    private int deductionStrategyTypeID;

    @FieldDoc("主键")
    @JsonProperty("CouponID")
    @XmlElement(name = "CouponID")
    private long couponID;

    @FieldDoc("优惠乘客类型")
    @JsonProperty("PassengerType")
    @XmlElement(name = "PassengerType")
    private String passengerType;

    @FieldDoc("是否优惠券二期(0为否，1为是)")
    @JsonProperty("IsNewCouponMethod")
    @XmlElement(name = "IsNewCouponMethod")
    private int isNewCouponMethod;

    @FieldDoc("优惠航段")
    @JsonProperty("SegmentList")
    @XmlElement(name = "SegmentList")
    private String segmentList;

    @FieldDoc("优惠总额")
    @JsonProperty("TotalDeduction")
    @XmlElement(name = "TotalDeduction")
    private BigDecimal totalDeduction;

    @FieldDoc("外币立减金额")
    @JsonProperty("FDeductionAmount")
    @XmlElement(name = "FDeductionAmount")
    private BigDecimal fDeductionAmount;

    @FieldDoc("优惠券-优惠总金额")
    @JsonProperty("CouponAmount")
    @XmlElement(name = "CouponAmount")
    private BigDecimal couponAmount;

    @FieldDoc("是否需要API check 优惠券金额")
    @JsonProperty("IsNeedCheck")
    @XmlElement(name = "IsNeedCheck")
    private boolean isNeedCheck;

    @FieldDoc("是否需要API获取优惠券详情以下单落地（仅用于新优惠券接口,仅需要客户端传CouponCode,此字端为true时IsNeedCheck 不再生效）")
    @JsonProperty("IsNeedAPIGetCouponDetail")
    @XmlElement(name = "IsNeedAPIGetCouponDetail")
    private boolean isNeedAPIGetCouponDetail;

    /**
     * 优惠券代码
     */
    public String getCouponNumber() {
        return this.couponNumber;
    }

    public void setCouponNumber(String couponNumber) {
        this.couponNumber = couponNumber;
    }

    /**
     * 优惠券活动主题
     */
    public String getActivityTheme() {
        return this.activityTheme;
    }

    public void setActivityTheme(String activityTheme) {
        this.activityTheme = activityTheme;
    }

    /**
     * 优惠券活动详情
     */
    public String getActivityDetails() {
        return this.activityDetails;
    }

    public void setActivityDetails(String activityDetails) {
        this.activityDetails = activityDetails;
    }

    /**
     * 该订单是否可以使用优惠券(0为不可用，1为可用)
     */
    public boolean getCouponCanUse() {
        return this.couponCanUse;
    }

    public void setCouponCanUse(boolean couponCanUse) {
        this.couponCanUse = couponCanUse;
    }

    /**
     * 用户是否尝试使用（0为否，1为是）
     */
    public boolean getTryUse() {
        return this.tryUse;
    }

    public void setTryUse(boolean tryUse) {
        this.tryUse = tryUse;
    }

    /**
     * 有效期开始时间
     */
    public long getStartDate() {
        return this.startDate;
    }

    public void setStartDate(long startDate) {
        this.startDate = startDate;
    }

    /**
     * 有效期到期时间
     */
    public long getDisableDate() {
        return this.disableDate;
    }

    public void setDisableDate(long disableDate) {
        this.disableDate = disableDate;
    }

    /**
     * 优惠代码类型(1-公共券 2-私有 3-单次券 4-团购券)
     */
    public int getCouponTypeID() {
        return this.couponTypeID;
    }

    public void setCouponTypeID(int couponTypeID) {
        this.couponTypeID = couponTypeID;
    }

    /**
     * 优惠模式(1-立减 2-后返)
     */
    public int getPromotionMethodID() {
        return this.promotionMethodID;
    }

    public void setPromotionMethodID(int promotionMethodID) {
        this.promotionMethodID = promotionMethodID;
    }

    /**
     * 优惠类型(1 为优惠券)
     */
    public int getDataType() {
        return this.dataType;
    }

    public void setDataType(int dataType) {
        this.dataType = dataType;
    }

    /**
     * 优惠策略编号
     */
    public int getPromotionID() {
        return this.promotionID;
    }

    public void setPromotionID(int promotionID) {
        this.promotionID = promotionID;
    }

    /**
     * 立减金额
     */
    public BigDecimal getDeductionAmount() {
        return this.deductionAmount;
    }

    public void setDeductionAmount(BigDecimal deductionAmount) {
        this.deductionAmount = deductionAmount;
    }

    /**
     * 优惠计算单位(1-按人 2-按订单 4-按航段)
     */
    public int getUnitTypeID() {
        return this.unitTypeID;
    }

    public void setUnitTypeID(int unitTypeID) {
        this.unitTypeID = unitTypeID;
    }

    /**
     * 优惠折扣方式(1-固定立减
     *             2-百分比
     *             3-阶梯)
     */
    public int getDeductionStrategyTypeID() {
        return this.deductionStrategyTypeID;
    }

    public void setDeductionStrategyTypeID(int deductionStrategyTypeID) {
        this.deductionStrategyTypeID = deductionStrategyTypeID;
    }

    /**
     * 主键
     */
    public long getCouponID() {
        return this.couponID;
    }

    public void setCouponID(long couponID) {
        this.couponID = couponID;
    }

    /**
     * 优惠乘客类型
     */
    public String getPassengerType() {
        return this.passengerType;
    }

    public void setPassengerType(String passengerType) {
        this.passengerType = passengerType;
    }

    /**
     * 是否优惠券二期(0为否，1为是)
     */
    public int getIsNewCouponMethod() {
        return this.isNewCouponMethod;
    }

    public void setIsNewCouponMethod(int isNewCouponMethod) {
        this.isNewCouponMethod = isNewCouponMethod;
    }

    /**
     * 优惠航段
     */
    public String getSegmentList() {
        return this.segmentList;
    }

    public void setSegmentList(String segmentList) {
        this.segmentList = segmentList;
    }

    /**
     * 优惠总额
     */
    public BigDecimal getTotalDeduction() {
        return this.totalDeduction;
    }

    public void setTotalDeduction(BigDecimal totalDeduction) {
        this.totalDeduction = totalDeduction;
    }

    /**
     * 外币立减金额
     */
    public BigDecimal getFDeductionAmount() {
        return this.fDeductionAmount;
    }

    public void setFDeductionAmount(BigDecimal fDeductionAmount) {
        this.fDeductionAmount = fDeductionAmount;
    }

    /**
     * 优惠券-优惠总金额
     */
    public BigDecimal getCouponAmount() {
        return this.couponAmount;
    }

    public void setCouponAmount(BigDecimal couponAmount) {
        this.couponAmount = couponAmount;
    }

    /**
     * 是否需要API check 优惠券金额
     */
    public boolean getIsNeedCheck() {
        return this.isNeedCheck;
    }

    public void setIsNeedCheck(boolean isNeedCheck) {
        this.isNeedCheck = isNeedCheck;
    }

    /**
     * 是否需要API获取优惠券详情以下单落地（仅用于新优惠券接口,仅需要客户端传CouponCode,此字端为true时IsNeedCheck 不再生效）
     */
    public boolean getIsNeedAPIGetCouponDetail() {
        return this.isNeedAPIGetCouponDetail;
    }

    public void setIsNeedAPIGetCouponDetail(boolean isNeedAPIGetCouponDetail) {
        this.isNeedAPIGetCouponDetail = isNeedAPIGetCouponDetail;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;

        final FlightOrderCouponInfo other = (FlightOrderCouponInfo)obj;
        return
            Objects.equal(this.couponNumber, other.couponNumber) && 
            Objects.equal(this.activityTheme, other.activityTheme) && 
            Objects.equal(this.activityDetails, other.activityDetails) && 
            Objects.equal(this.couponCanUse, other.couponCanUse) && 
            Objects.equal(this.tryUse, other.tryUse) && 
            Objects.equal(this.startDate, other.startDate) && 
            Objects.equal(this.disableDate, other.disableDate) && 
            Objects.equal(this.couponTypeID, other.couponTypeID) && 
            Objects.equal(this.promotionMethodID, other.promotionMethodID) && 
            Objects.equal(this.dataType, other.dataType) && 
            Objects.equal(this.promotionID, other.promotionID) && 
            Objects.equal(this.deductionAmount, other.deductionAmount) && 
            Objects.equal(this.unitTypeID, other.unitTypeID) && 
            Objects.equal(this.deductionStrategyTypeID, other.deductionStrategyTypeID) && 
            Objects.equal(this.couponID, other.couponID) && 
            Objects.equal(this.passengerType, other.passengerType) && 
            Objects.equal(this.isNewCouponMethod, other.isNewCouponMethod) && 
            Objects.equal(this.segmentList, other.segmentList) && 
            Objects.equal(this.totalDeduction, other.totalDeduction) && 
            Objects.equal(this.fDeductionAmount, other.fDeductionAmount) && 
            Objects.equal(this.couponAmount, other.couponAmount) && 
            Objects.equal(this.isNeedCheck, other.isNeedCheck) && 
            Objects.equal(this.isNeedAPIGetCouponDetail, other.isNeedAPIGetCouponDetail);
    }

    @Override
    public int hashCode() {
        int result = 1;

        result = 31 * result + Objects.hashCode(this.couponNumber);
        result = 31 * result + Objects.hashCode(this.activityTheme);
        result = 31 * result + Objects.hashCode(this.activityDetails);
        result = 31 * result + Objects.hashCode(this.couponCanUse);
        result = 31 * result + Objects.hashCode(this.tryUse);
        result = 31 * result + Objects.hashCode(this.startDate);
        result = 31 * result + Objects.hashCode(this.disableDate);
        result = 31 * result + Objects.hashCode(this.couponTypeID);
        result = 31 * result + Objects.hashCode(this.promotionMethodID);
        result = 31 * result + Objects.hashCode(this.dataType);
        result = 31 * result + Objects.hashCode(this.promotionID);
        result = 31 * result + Objects.hashCode(this.deductionAmount);
        result = 31 * result + Objects.hashCode(this.unitTypeID);
        result = 31 * result + Objects.hashCode(this.deductionStrategyTypeID);
        result = 31 * result + Objects.hashCode(this.couponID);
        result = 31 * result + Objects.hashCode(this.passengerType);
        result = 31 * result + Objects.hashCode(this.isNewCouponMethod);
        result = 31 * result + Objects.hashCode(this.segmentList);
        result = 31 * result + Objects.hashCode(this.totalDeduction);
        result = 31 * result + Objects.hashCode(this.fDeductionAmount);
        result = 31 * result + Objects.hashCode(this.couponAmount);
        result = 31 * result + Objects.hashCode(this.isNeedCheck);
        result = 31 * result + Objects.hashCode(this.isNeedAPIGetCouponDetail);

        return result;
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
            .add("couponNumber", couponNumber)
            .add("activityTheme", activityTheme)
            .add("activityDetails", activityDetails)
            .add("couponCanUse", couponCanUse)
            .add("tryUse", tryUse)
            .add("startDate", startDate)
            .add("disableDate", disableDate)
            .add("couponTypeID", couponTypeID)
            .add("promotionMethodID", promotionMethodID)
            .add("dataType", dataType)
            .add("promotionID", promotionID)
            .add("deductionAmount", deductionAmount)
            .add("unitTypeID", unitTypeID)
            .add("deductionStrategyTypeID", deductionStrategyTypeID)
            .add("couponID", couponID)
            .add("passengerType", passengerType)
            .add("isNewCouponMethod", isNewCouponMethod)
            .add("segmentList", segmentList)
            .add("totalDeduction", totalDeduction)
            .add("fDeductionAmount", fDeductionAmount)
            .add("couponAmount", couponAmount)
            .add("isNeedCheck", isNeedCheck)
            .add("isNeedAPIGetCouponDetail", isNeedAPIGetCouponDetail)
            .toString();
    }
}