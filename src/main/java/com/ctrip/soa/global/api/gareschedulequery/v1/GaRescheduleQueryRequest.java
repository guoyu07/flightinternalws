/**
 * Autogenerated by soa-sdk-toolkit
 *
 * DO NOT EDIT DIRECTLY
 */
package com.ctrip.soa.global.api.gareschedulequery.v1;

import com.ctrip.soa.global.api.comm.head.v1.Head;
import com.ctrip.soa.global.api.flightcommon.v1.DatetimeSpan;
import com.ctrip.soa.global.api.flightcommon.v1.ProductKeyInfo;
import com.ctrip.soa.global.api.flightcommon.v1.RQPassengerInfo;
import com.ctrip.soa.global.api.flightcommon.v1.RescheduleSegment;
import com.ctrip.soa.global.api.searhflightporduct.v1.SequenceInfo;
import com.ctriposs.baiji.rpc.common.apidoc.DtoDoc;
import com.ctriposs.baiji.rpc.common.apidoc.FieldDoc;
import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.common.base.MoreObjects;
import com.google.common.base.Objects;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * 机票改签航班查询请求
 */
@DtoDoc("机票改签航班查询请求")
@JsonAutoDetect(getterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE)
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "GaRescheduleQueryRequest", namespace = "http://soa.ctrip.com/Global/API/GaRescheduleQuery/v1")
@XmlType(name = "GaRescheduleQueryRequest", propOrder = {
    "head",
    "orderID",
    "flightOrderClass",
    "passengerInfoList",
    "rescheduleSegmentList",
    "filterInfo",
    "productKeyInfo",
    "sequenceInfo"
})
@SuppressWarnings("all")
public class GaRescheduleQueryRequest  {

    private static final long serialVersionUID = 1L;

    public GaRescheduleQueryRequest(
        Head head, 
        long orderID, 
        String flightOrderClass, 
        List<RQPassengerInfo> passengerInfoList, 
        List<RescheduleSegment> rescheduleSegmentList, 
        List<DatetimeSpan> filterInfo, 
        ProductKeyInfo productKeyInfo, 
        SequenceInfo sequenceInfo) {
        this.head = head;
        this.orderID = orderID;
        this.flightOrderClass = flightOrderClass;
        this.passengerInfoList = passengerInfoList;
        this.rescheduleSegmentList = rescheduleSegmentList;
        this.filterInfo = filterInfo;
        this.productKeyInfo = productKeyInfo;
        this.sequenceInfo = sequenceInfo;
    }

    public GaRescheduleQueryRequest() {
    }

    @FieldDoc("SOA2.0请求头部信息")
    @JsonProperty("Head")
    @XmlElement(name = "Head")
    private Head head;

    @FieldDoc("订单ID")
    @JsonProperty("OrderID")
    @XmlElement(name = "OrderID")
    private long orderID;

    @FieldDoc("机票国内国际订单标识  国际I，国内N")
    @JsonProperty("FlightOrderClass")
    @XmlElement(name = "FlightOrderClass")
    private String flightOrderClass;

    @FieldDoc("改签人")
    @JsonProperty("PassengerInfoList")
    @XmlElement(name = "PassengerInfoList")
    private List<RQPassengerInfo> passengerInfoList;

    @FieldDoc("改签航班列表")
    @JsonProperty("RescheduleSegmentList")
    @XmlElement(name = "RescheduleSegmentList")
    private List<RescheduleSegment> rescheduleSegmentList;

    @FieldDoc("过滤航变")
    @JsonProperty("FilterInfo")
    @XmlElement(name = "DDateSpan")
    @XmlElementWrapper(name = "FilterInfo")
    private List<DatetimeSpan> filterInfo;

    @FieldDoc("过滤航变")
    @JsonProperty("ProductKeyInfo")
    @XmlElement(name = "ProductKeyInfo")
    private ProductKeyInfo productKeyInfo;

    @FieldDoc("排序信息")
    @JsonProperty("SequenceInfo")
    @XmlElement(name = "SequenceInfo")
    private SequenceInfo sequenceInfo;

    /**
     * SOA2.0请求头部信息
     */
    public Head getHead() {
        return this.head;
    }

    public void setHead(Head head) {
        this.head = head;
    }

    /**
     * 订单ID
     */
    public long getOrderID() {
        return this.orderID;
    }

    public void setOrderID(long orderID) {
        this.orderID = orderID;
    }

    /**
     * 机票国内国际订单标识  国际I，国内N
     */
    public String getFlightOrderClass() {
        return this.flightOrderClass;
    }

    public void setFlightOrderClass(String flightOrderClass) {
        this.flightOrderClass = flightOrderClass;
    }

    /**
     * 改签人
     */
    public List<RQPassengerInfo> getPassengerInfoList() {
        return this.passengerInfoList;
    }

    public void setPassengerInfoList(List<RQPassengerInfo> passengerInfoList) {
        this.passengerInfoList = passengerInfoList;
    }

    /**
     * 改签航班列表
     */
    public List<RescheduleSegment> getRescheduleSegmentList() {
        return this.rescheduleSegmentList;
    }

    public void setRescheduleSegmentList(List<RescheduleSegment> rescheduleSegmentList) {
        this.rescheduleSegmentList = rescheduleSegmentList;
    }

    /**
     * 过滤航变
     */
    public List<DatetimeSpan> getFilterInfo() {
        return this.filterInfo;
    }

    public void setFilterInfo(List<DatetimeSpan> filterInfo) {
        this.filterInfo = filterInfo;
    }

    /**
     * 过滤航变
     */
    public ProductKeyInfo getProductKeyInfo() {
        return this.productKeyInfo;
    }

    public void setProductKeyInfo(ProductKeyInfo productKeyInfo) {
        this.productKeyInfo = productKeyInfo;
    }

    /**
     * 排序信息
     */
    public SequenceInfo getSequenceInfo() {
        return this.sequenceInfo;
    }

    public void setSequenceInfo(SequenceInfo sequenceInfo) {
        this.sequenceInfo = sequenceInfo;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;

        final GaRescheduleQueryRequest other = (GaRescheduleQueryRequest)obj;
        return
            Objects.equal(this.head, other.head) && 
            Objects.equal(this.orderID, other.orderID) && 
            Objects.equal(this.flightOrderClass, other.flightOrderClass) && 
            Objects.equal(this.passengerInfoList, other.passengerInfoList) && 
            Objects.equal(this.rescheduleSegmentList, other.rescheduleSegmentList) && 
            Objects.equal(this.filterInfo, other.filterInfo) && 
            Objects.equal(this.productKeyInfo, other.productKeyInfo) && 
            Objects.equal(this.sequenceInfo, other.sequenceInfo);
    }

    @Override
    public int hashCode() {
        int result = 1;

        result = 31 * result + Objects.hashCode(this.head);
        result = 31 * result + Objects.hashCode(this.orderID);
        result = 31 * result + Objects.hashCode(this.flightOrderClass);
        result = 31 * result + Objects.hashCode(this.passengerInfoList);
        result = 31 * result + Objects.hashCode(this.rescheduleSegmentList);
        result = 31 * result + Objects.hashCode(this.filterInfo);
        result = 31 * result + Objects.hashCode(this.productKeyInfo);
        result = 31 * result + Objects.hashCode(this.sequenceInfo);

        return result;
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
            .add("head", head)
            .add("orderID", orderID)
            .add("flightOrderClass", flightOrderClass)
            .add("passengerInfoList", passengerInfoList)
            .add("rescheduleSegmentList", rescheduleSegmentList)
            .add("filterInfo", filterInfo)
            .add("productKeyInfo", productKeyInfo)
            .add("sequenceInfo", sequenceInfo)
            .toString();
    }
}