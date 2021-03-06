/**
 * Autogenerated by soa-sdk-toolkit
 *
 * DO NOT EDIT DIRECTLY
 */
package com.ctrip.soa.global.api.validationcoupon.v1;

import com.ctrip.soa.global.api.comm.head.v1.RequestHead;
import com.ctriposs.baiji.rpc.common.apidoc.DtoDoc;
import com.ctriposs.baiji.rpc.common.apidoc.FieldDoc;
import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.common.base.MoreObjects;
import com.google.common.base.Objects;
import java.math.BigDecimal;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * 优惠券验证请求
 */
@DtoDoc("优惠券验证请求")
@JsonAutoDetect(getterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE)
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "GaValidationCouponRequest", namespace = "http://soa.ctrip.com/Global/API/ValidationCoupon/v1")
@XmlType(name = "GaValidationCouponRequest", propOrder = {
    "couponCode",
    "useStation",
    "orderPrice",
    "promotionIDs",
    "orderCurrency",
    "couponID",
    "productLineID",
    "orderUserCount",
    "orderCount",
    "roomNightsCount",
    "segmentCount",
    "cabinCount"
})
@SuppressWarnings("all")
public class GaValidationCouponRequest extends RequestHead  {

    private static final long serialVersionUID = 1L;

    public GaValidationCouponRequest(
        String couponCode, 
        String useStation, 
        BigDecimal orderPrice, 
        List<Integer> promotionIDs, 
        String orderCurrency, 
        Integer couponID, 
        Integer productLineID, 
        Integer orderUserCount, 
        Integer orderCount, 
        Integer roomNightsCount, 
        Integer segmentCount, 
        Integer cabinCount) {
        this.couponCode = couponCode;
        this.useStation = useStation;
        this.orderPrice = orderPrice;
        this.promotionIDs = promotionIDs;
        this.orderCurrency = orderCurrency;
        this.couponID = couponID;
        this.productLineID = productLineID;
        this.orderUserCount = orderUserCount;
        this.orderCount = orderCount;
        this.roomNightsCount = roomNightsCount;
        this.segmentCount = segmentCount;
        this.cabinCount = cabinCount;
    }

    public GaValidationCouponRequest() {
    }

    @FieldDoc("优惠券唯一标识")
    @JsonProperty("CouponCode")
    @XmlElement(name = "CouponCode")
    private String couponCode;

    @FieldDoc("适用站点(若不填默认为10）" +
"主站Ctrip.com : 10" +
"香港站Ctrip.com.hk: 20" +
"韩国站Ctrip.co.kr:30")
    @JsonProperty("UseStation")
    @XmlElement(name = "UseStation")
    private String useStation;

    @FieldDoc("当前酒店支持的币种订单金额")
    @JsonProperty("OrderPrice")
    @XmlElement(name = "OrderPrice")
    private BigDecimal orderPrice;

    @FieldDoc("支持的优惠策略")
    @JsonProperty("PromotionIDs")
    @XmlElement(name = "PromotionIDs")
    private List<Integer> promotionIDs;

    @FieldDoc("当前酒店支持的币种，同Currency即可")
    @JsonProperty("OrderCurrency")
    @XmlElement(name = "OrderCurrency", nillable = true)
    private String orderCurrency;

    @FieldDoc("优惠券ID 跟CouponCode二选一传入")
    @JsonProperty("CouponID")
    @XmlElement(name = "CouponID", nillable = true)
    private Integer couponID;

    @FieldDoc("产品线ID 默认2" +
"机票	1" +
"酒店	2" +
"旅游	3" +
"团购	4" +
"外文	5" +
"市场	6" +
"财务	7" +
"服务营销	8" +
"机加酒	9" +
"商旅	10" +
"电话营销	11" +
"无线事业部	12" +
"火车票	13" +
"金融事业部	14" +
"地面业务事业单位	15" +
"网络市场部	16" +
"套餐业务事业单位	17" +
"用车事业单位	18" +
"平台业务	19" +
"门票	20" +
"邮轮	21" +
"当地玩乐 	22" +
"高端美食 	23" +
"汽车票 	24")
    @JsonProperty("ProductLineID")
    @XmlElement(name = "ProductLineID", nillable = true)
    private Integer productLineID;

    @FieldDoc("订单人数(DataType:1)")
    @JsonProperty("OrderUserCount")
    @XmlElement(name = "OrderUserCount", nillable = true)
    private Integer orderUserCount;

    @FieldDoc("订单数量(DataType:2)")
    @JsonProperty("OrderCount")
    @XmlElement(name = "OrderCount", nillable = true)
    private Integer orderCount;

    @FieldDoc("酒店间夜数(DataType:3)")
    @JsonProperty("RoomNightsCount")
    @XmlElement(name = "RoomNightsCount", nillable = true)
    private Integer roomNightsCount;

    @FieldDoc("航段数(DataType:4)")
    @JsonProperty("SegmentCount")
    @XmlElement(name = "SegmentCount", nillable = true)
    private Integer segmentCount;

    @FieldDoc("舱房数(DataType:5)")
    @JsonProperty("CabinCount")
    @XmlElement(name = "CabinCount", nillable = true)
    private Integer cabinCount;

    /**
     * 优惠券唯一标识
     */
    public String getCouponCode() {
        return this.couponCode;
    }

    public void setCouponCode(String couponCode) {
        this.couponCode = couponCode;
    }

    /**
     * 适用站点(若不填默认为10）
     * 主站Ctrip.com : 10
     * 香港站Ctrip.com.hk: 20
     * 韩国站Ctrip.co.kr:30
     */
    public String getUseStation() {
        return this.useStation;
    }

    public void setUseStation(String useStation) {
        this.useStation = useStation;
    }

    /**
     * 当前酒店支持的币种订单金额
     */
    public BigDecimal getOrderPrice() {
        return this.orderPrice;
    }

    public void setOrderPrice(BigDecimal orderPrice) {
        this.orderPrice = orderPrice;
    }

    /**
     * 支持的优惠策略
     */
    public List<Integer> getPromotionIDs() {
        return this.promotionIDs;
    }

    public void setPromotionIDs(List<Integer> promotionIDs) {
        this.promotionIDs = promotionIDs;
    }

    /**
     * 当前酒店支持的币种，同Currency即可
     */
    public String getOrderCurrency() {
        return this.orderCurrency;
    }

    public void setOrderCurrency(String orderCurrency) {
        this.orderCurrency = orderCurrency;
    }

    /**
     * 优惠券ID 跟CouponCode二选一传入
     */
    public Integer getCouponID() {
        return this.couponID;
    }

    public void setCouponID(Integer couponID) {
        this.couponID = couponID;
    }

    /**
     * 产品线ID 默认2
     * 机票1
     * 酒店2
     * 旅游3
     * 团购4
     * 外文5
     * 市场6
     * 财务7
     * 服务营销8
     * 机加酒9
     * 商旅10
     * 电话营销11
     * 无线事业部12
     * 火车票13
     * 金融事业部14
     * 地面业务事业单位15
     * 网络市场部16
     * 套餐业务事业单位17
     * 用车事业单位18
     * 平台业务19
     * 门票20
     * 邮轮21
     * 当地玩乐 22
     * 高端美食 23
     * 汽车票 24
     */
    public Integer getProductLineID() {
        return this.productLineID;
    }

    public void setProductLineID(Integer productLineID) {
        this.productLineID = productLineID;
    }

    /**
     * 订单人数(DataType:1)
     */
    public Integer getOrderUserCount() {
        return this.orderUserCount;
    }

    public void setOrderUserCount(Integer orderUserCount) {
        this.orderUserCount = orderUserCount;
    }

    /**
     * 订单数量(DataType:2)
     */
    public Integer getOrderCount() {
        return this.orderCount;
    }

    public void setOrderCount(Integer orderCount) {
        this.orderCount = orderCount;
    }

    /**
     * 酒店间夜数(DataType:3)
     */
    public Integer getRoomNightsCount() {
        return this.roomNightsCount;
    }

    public void setRoomNightsCount(Integer roomNightsCount) {
        this.roomNightsCount = roomNightsCount;
    }

    /**
     * 航段数(DataType:4)
     */
    public Integer getSegmentCount() {
        return this.segmentCount;
    }

    public void setSegmentCount(Integer segmentCount) {
        this.segmentCount = segmentCount;
    }

    /**
     * 舱房数(DataType:5)
     */
    public Integer getCabinCount() {
        return this.cabinCount;
    }

    public void setCabinCount(Integer cabinCount) {
        this.cabinCount = cabinCount;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;

        final GaValidationCouponRequest other = (GaValidationCouponRequest)obj;
        return
            Objects.equal(this.couponCode, other.couponCode) && 
            Objects.equal(this.useStation, other.useStation) && 
            Objects.equal(this.orderPrice, other.orderPrice) && 
            Objects.equal(this.promotionIDs, other.promotionIDs) && 
            Objects.equal(this.orderCurrency, other.orderCurrency) && 
            Objects.equal(this.couponID, other.couponID) && 
            Objects.equal(this.productLineID, other.productLineID) && 
            Objects.equal(this.orderUserCount, other.orderUserCount) && 
            Objects.equal(this.orderCount, other.orderCount) && 
            Objects.equal(this.roomNightsCount, other.roomNightsCount) && 
            Objects.equal(this.segmentCount, other.segmentCount) && 
            Objects.equal(this.cabinCount, other.cabinCount);
    }

    @Override
    public int hashCode() {
        int result = 1;

        result = 31 * result + Objects.hashCode(this.couponCode);
        result = 31 * result + Objects.hashCode(this.useStation);
        result = 31 * result + Objects.hashCode(this.orderPrice);
        result = 31 * result + Objects.hashCode(this.promotionIDs);
        result = 31 * result + Objects.hashCode(this.orderCurrency);
        result = 31 * result + Objects.hashCode(this.couponID);
        result = 31 * result + Objects.hashCode(this.productLineID);
        result = 31 * result + Objects.hashCode(this.orderUserCount);
        result = 31 * result + Objects.hashCode(this.orderCount);
        result = 31 * result + Objects.hashCode(this.roomNightsCount);
        result = 31 * result + Objects.hashCode(this.segmentCount);
        result = 31 * result + Objects.hashCode(this.cabinCount);

        return result;
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
            .add("couponCode", couponCode)
            .add("useStation", useStation)
            .add("orderPrice", orderPrice)
            .add("promotionIDs", promotionIDs)
            .add("orderCurrency", orderCurrency)
            .add("couponID", couponID)
            .add("productLineID", productLineID)
            .add("orderUserCount", orderUserCount)
            .add("orderCount", orderCount)
            .add("roomNightsCount", roomNightsCount)
            .add("segmentCount", segmentCount)
            .add("cabinCount", cabinCount)
            .toString();
    }
}