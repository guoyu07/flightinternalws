/**
 * Autogenerated by soa-sdk-toolkit
 *
 * DO NOT EDIT DIRECTLY
 */
package com.ctrip.soa.global.api.gacreateflightorder.v1;

import com.ctrip.soa.global.api.comm.responsehead.v1.ResponseHead;
import com.ctrip.soa.global.api.flightcommon.v1.FlightPriceDetail;
import com.ctrip.soa.global.api.flightcommon.v1.FlightRealTimePay;
import com.ctrip.soa.global.api.flightcommon.v1.GaCreateOrderStatus;
import com.ctrip.soa.global.api.flightcommon.v1.GaSaveOrderDetailInfo;
import com.ctrip.soa.global.api.flightcommon.v1.OrderExchangeInfo;
import com.ctrip.soa.global.api.flightcommon.v1.RepeatOrderInfo;
import com.ctriposs.baiji.rpc.common.HasResponseStatus;
import com.ctriposs.baiji.rpc.common.apidoc.DtoDoc;
import com.ctriposs.baiji.rpc.common.apidoc.FieldDoc;
import com.ctriposs.baiji.rpc.common.types.ResponseStatusType;
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
 * 国内机票提交订单返回值
 */
@DtoDoc("国内机票提交订单返回值")
@JsonAutoDetect(getterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE)
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "GaCreateFlightOrderResponse", namespace = "http://soa.ctrip.com/Global/API/GaCreateFlightOrder/v1")
@XmlType(name = "GaCreateFlightOrderResponse", propOrder = {
    "responseStatus",
    "responseHead",
    "status",
    "errorMsg",
    "flightOrderIdList",
    "externalNO",
    "mainOrderID",
    "tempOrderID",
    "totalPrice",
    "exchangeInfo",
    "repeatOrderList",
    "repeatOrderInfoList",
    "flightRealTimePay",
    "buzTypeEnum",
    "paymentDetailDescList",
    "orderSplitType"
})
@SuppressWarnings("all")
public class GaCreateFlightOrderResponse implements HasResponseStatus {

    private static final long serialVersionUID = 1L;

    public GaCreateFlightOrderResponse(
        ResponseStatusType responseStatus, 
        ResponseHead responseHead, 
        GaCreateOrderStatus status, 
        String errorMsg, 
        List<GaSaveOrderDetailInfo> flightOrderIdList, 
        String externalNO, 
        long mainOrderID, 
        int tempOrderID, 
        BigDecimal totalPrice, 
        OrderExchangeInfo exchangeInfo, 
        List<Long> repeatOrderList, 
        List<RepeatOrderInfo> repeatOrderInfoList, 
        FlightRealTimePay flightRealTimePay, 
        int buzTypeEnum, 
        List<FlightPriceDetail> paymentDetailDescList, 
        int orderSplitType) {
        this.responseStatus = responseStatus;
        this.responseHead = responseHead;
        this.status = status;
        this.errorMsg = errorMsg;
        this.flightOrderIdList = flightOrderIdList;
        this.externalNO = externalNO;
        this.mainOrderID = mainOrderID;
        this.tempOrderID = tempOrderID;
        this.totalPrice = totalPrice;
        this.exchangeInfo = exchangeInfo;
        this.repeatOrderList = repeatOrderList;
        this.repeatOrderInfoList = repeatOrderInfoList;
        this.flightRealTimePay = flightRealTimePay;
        this.buzTypeEnum = buzTypeEnum;
        this.paymentDetailDescList = paymentDetailDescList;
        this.orderSplitType = orderSplitType;
    }

    public GaCreateFlightOrderResponse() {
    }

    @FieldDoc("SOA2.0返回头部信息")
    @JsonProperty("ResponseStatus")
    @XmlElement(name = "ResponseStatus")
    private ResponseStatusType responseStatus;

    @JsonProperty("ResponseHead")
    @XmlElement(name = "ResponseHead")
    private ResponseHead responseHead;

    @FieldDoc("错误编号")
    @JsonProperty("Status")
    @XmlElement(name = "Status")
    private GaCreateOrderStatus status;

    @FieldDoc("错误消息,正确为空")
    @JsonProperty("ErrorMsg")
    @XmlElement(name = "ErrorMsg")
    private String errorMsg;

    @FieldDoc("真实订单号列表")
    @JsonProperty("FlightOrderIdList")
    @XmlElement(name = "FlightOrderIdList")
    private List<GaSaveOrderDetailInfo> flightOrderIdList;

    @FieldDoc("支付用流水号")
    @JsonProperty("ExternalNO")
    @XmlElement(name = "ExternalNO")
    private String externalNO;

    @FieldDoc("主订单")
    @JsonProperty("MainOrderID")
    @XmlElement(name = "MainOrderID")
    private long mainOrderID;

    @FieldDoc("DB临时订单Id")
    @JsonProperty("TempOrderID")
    @XmlElement(name = "TempOrderID")
    private int tempOrderID;

    @FieldDoc("订单总金额")
    @JsonProperty("TotalPrice")
    @XmlElement(name = "TotalPrice")
    private BigDecimal totalPrice;

    @FieldDoc("多币种支付信息")
    @JsonProperty("ExchangeInfo")
    @XmlElement(name = "ExchangeInfo")
    private OrderExchangeInfo exchangeInfo;

    @FieldDoc("重复订单号列表(为了兼容旧的APP版本暂时保留，确认没有使用可以删除，这部分内容在RepeatOrderInfoList字段可以获取到)")
    @JsonProperty("RepeatOrderList")
    @XmlElement(name = "RepeatOrderList")
    private List<Long> repeatOrderList;

    @FieldDoc("重复订单信息列表")
    @JsonProperty("RepeatOrderInfoList")
    @XmlElement(name = "RepeatOrderInfoList")
    private List<RepeatOrderInfo> repeatOrderInfoList;

    @FieldDoc("允许的扣款方式")
    @JsonProperty("FlightRealTimePay")
    @XmlElement(name = "FlightRealTimePay")
    private FlightRealTimePay flightRealTimePay;

    @FieldDoc("无外卡手续费")
    @JsonProperty("BuzTypeEnum")
    @XmlElement(name = "BuzTypeEnum")
    private int buzTypeEnum;

    @FieldDoc("支付明细列表")
    @JsonProperty("PaymentDetailDescList")
    @XmlElement(name = "PaymentDetailDescList")
    private List<FlightPriceDetail> paymentDetailDescList;

    @FieldDoc("拆单类型" +
            "0 -未知" +
            "1 -往返程拆单" +
            "2 -儿童成人/成人婴儿" +
            "3 -多程 拆单 -1拆4 或非12类型")
    @JsonProperty("OrderSplitType")
    @XmlElement(name = "OrderSplitType")
    private int orderSplitType;

    /**
     * SOA2.0返回头部信息
     */
    public ResponseStatusType getResponseStatus() {
        return this.responseStatus;
    }

    public void setResponseStatus(ResponseStatusType responseStatus) {
        this.responseStatus = responseStatus;
    }

    public ResponseHead getResponseHead() {
        return this.responseHead;
    }

    public void setResponseHead(ResponseHead responseHead) {
        this.responseHead = responseHead;
    }

    /**
     * 错误编号
     */
    public GaCreateOrderStatus getStatus() {
        return this.status;
    }

    public void setStatus(GaCreateOrderStatus status) {
        this.status = status;
    }

    /**
     * 错误消息,正确为空
     */
    public String getErrorMsg() {
        return this.errorMsg;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }

    /**
     * 真实订单号列表
     */
    public List<GaSaveOrderDetailInfo> getFlightOrderIdList() {
        return this.flightOrderIdList;
    }

    public void setFlightOrderIdList(List<GaSaveOrderDetailInfo> flightOrderIdList) {
        this.flightOrderIdList = flightOrderIdList;
    }

    /**
     * 支付用流水号
     */
    public String getExternalNO() {
        return this.externalNO;
    }

    public void setExternalNO(String externalNO) {
        this.externalNO = externalNO;
    }

    /**
     * 主订单
     */
    public long getMainOrderID() {
        return this.mainOrderID;
    }

    public void setMainOrderID(long mainOrderID) {
        this.mainOrderID = mainOrderID;
    }

    /**
     * DB临时订单Id
     */
    public int getTempOrderID() {
        return this.tempOrderID;
    }

    public void setTempOrderID(int tempOrderID) {
        this.tempOrderID = tempOrderID;
    }

    /**
     * 订单总金额
     */
    public BigDecimal getTotalPrice() {
        return this.totalPrice;
    }

    public void setTotalPrice(BigDecimal totalPrice) {
        this.totalPrice = totalPrice;
    }

    /**
     * 多币种支付信息
     */
    public OrderExchangeInfo getExchangeInfo() {
        return this.exchangeInfo;
    }

    public void setExchangeInfo(OrderExchangeInfo exchangeInfo) {
        this.exchangeInfo = exchangeInfo;
    }

    /**
     * 重复订单号列表(为了兼容旧的APP版本暂时保留，确认没有使用可以删除，这部分内容在RepeatOrderInfoList字段可以获取到)
     */
    public List<Long> getRepeatOrderList() {
        return this.repeatOrderList;
    }

    public void setRepeatOrderList(List<Long> repeatOrderList) {
        this.repeatOrderList = repeatOrderList;
    }

    /**
     * 重复订单信息列表
     */
    public List<RepeatOrderInfo> getRepeatOrderInfoList() {
        return this.repeatOrderInfoList;
    }

    public void setRepeatOrderInfoList(List<RepeatOrderInfo> repeatOrderInfoList) {
        this.repeatOrderInfoList = repeatOrderInfoList;
    }

    /**
     * 允许的扣款方式
     */
    public FlightRealTimePay getFlightRealTimePay() {
        return this.flightRealTimePay;
    }

    public void setFlightRealTimePay(FlightRealTimePay flightRealTimePay) {
        this.flightRealTimePay = flightRealTimePay;
    }

    /**
     * 无外卡手续费
     */
    public int getBuzTypeEnum() {
        return this.buzTypeEnum;
    }

    public void setBuzTypeEnum(int buzTypeEnum) {
        this.buzTypeEnum = buzTypeEnum;
    }

    /**
     * 支付明细列表
     */
    public List<FlightPriceDetail> getPaymentDetailDescList() {
        return this.paymentDetailDescList;
    }

    public void setPaymentDetailDescList(List<FlightPriceDetail> paymentDetailDescList) {
        this.paymentDetailDescList = paymentDetailDescList;
    }

    /**
     * 拆单类型
     *             0 -未知
     *             1 -往返程拆单
     *             2 -儿童成人/成人婴儿
     *             3 -多程 拆单 -1拆4 或非12类型
     */
    public int getOrderSplitType() {
        return this.orderSplitType;
    }

    public void setOrderSplitType(int orderSplitType) {
        this.orderSplitType = orderSplitType;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;

        final GaCreateFlightOrderResponse other = (GaCreateFlightOrderResponse)obj;
        return
            Objects.equal(this.responseStatus, other.responseStatus) && 
            Objects.equal(this.responseHead, other.responseHead) && 
            Objects.equal(this.status, other.status) && 
            Objects.equal(this.errorMsg, other.errorMsg) && 
            Objects.equal(this.flightOrderIdList, other.flightOrderIdList) && 
            Objects.equal(this.externalNO, other.externalNO) && 
            Objects.equal(this.mainOrderID, other.mainOrderID) && 
            Objects.equal(this.tempOrderID, other.tempOrderID) && 
            Objects.equal(this.totalPrice, other.totalPrice) && 
            Objects.equal(this.exchangeInfo, other.exchangeInfo) && 
            Objects.equal(this.repeatOrderList, other.repeatOrderList) && 
            Objects.equal(this.repeatOrderInfoList, other.repeatOrderInfoList) && 
            Objects.equal(this.flightRealTimePay, other.flightRealTimePay) && 
            Objects.equal(this.buzTypeEnum, other.buzTypeEnum) && 
            Objects.equal(this.paymentDetailDescList, other.paymentDetailDescList) && 
            Objects.equal(this.orderSplitType, other.orderSplitType);
    }

    @Override
    public int hashCode() {
        int result = 1;

        result = 31 * result + Objects.hashCode(this.responseStatus);
        result = 31 * result + Objects.hashCode(this.responseHead);
        result = 31 * result + Objects.hashCode(this.status);
        result = 31 * result + Objects.hashCode(this.errorMsg);
        result = 31 * result + Objects.hashCode(this.flightOrderIdList);
        result = 31 * result + Objects.hashCode(this.externalNO);
        result = 31 * result + Objects.hashCode(this.mainOrderID);
        result = 31 * result + Objects.hashCode(this.tempOrderID);
        result = 31 * result + Objects.hashCode(this.totalPrice);
        result = 31 * result + Objects.hashCode(this.exchangeInfo);
        result = 31 * result + Objects.hashCode(this.repeatOrderList);
        result = 31 * result + Objects.hashCode(this.repeatOrderInfoList);
        result = 31 * result + Objects.hashCode(this.flightRealTimePay);
        result = 31 * result + Objects.hashCode(this.buzTypeEnum);
        result = 31 * result + Objects.hashCode(this.paymentDetailDescList);
        result = 31 * result + Objects.hashCode(this.orderSplitType);

        return result;
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
            .add("responseStatus", responseStatus)
            .add("responseHead", responseHead)
            .add("status", status)
            .add("errorMsg", errorMsg)
            .add("flightOrderIdList", flightOrderIdList)
            .add("externalNO", externalNO)
            .add("mainOrderID", mainOrderID)
            .add("tempOrderID", tempOrderID)
            .add("totalPrice", totalPrice)
            .add("exchangeInfo", exchangeInfo)
            .add("repeatOrderList", repeatOrderList)
            .add("repeatOrderInfoList", repeatOrderInfoList)
            .add("flightRealTimePay", flightRealTimePay)
            .add("buzTypeEnum", buzTypeEnum)
            .add("paymentDetailDescList", paymentDetailDescList)
            .add("orderSplitType", orderSplitType)
            .toString();
    }
}