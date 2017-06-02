/**
 * Autogenerated by soa-sdk-toolkit
 *
 * DO NOT EDIT DIRECTLY
 */
package com.ctrip.soa.global.api.getmyorderlist.v1;

import com.ctrip.soa.global.api.comm.head.v1.Head;
import com.ctriposs.baiji.rpc.common.apidoc.FieldDoc;
import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.common.base.MoreObjects;
import com.google.common.base.Objects;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@JsonAutoDetect(getterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE)
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "GaGetMyOrderListRequest", namespace = "http://soa.ctrip.com/Global/API/GetMyOrderList/v1")
@XmlType(name = "GaGetMyOrderListRequest", propOrder = {
    "head",
    "actualOrderStatus",
    "bookingDateBegin",
    "bookingDateEnd",
    "filterStatus",
    "mobilePhone",
    "orderID",
    "orderOutStatus",
    "pageIndex",
    "pageSize",
    "passengerName",
    "searchScope",
    "uid"
})
@SuppressWarnings("all")
public class GaGetMyOrderListRequest  {

    private static final long serialVersionUID = 1L;

    public GaGetMyOrderListRequest(
        Head head, 
        String actualOrderStatus, 
        long bookingDateBegin, 
        long bookingDateEnd, 
        int filterStatus, 
        String mobilePhone, 
        int orderID, 
        OrderOutStatus orderOutStatus, 
        int pageIndex, 
        int pageSize, 
        String passengerName, 
        int searchScope, 
        String uid) {
        this.head = head;
        this.actualOrderStatus = actualOrderStatus;
        this.bookingDateBegin = bookingDateBegin;
        this.bookingDateEnd = bookingDateEnd;
        this.filterStatus = filterStatus;
        this.mobilePhone = mobilePhone;
        this.orderID = orderID;
        this.orderOutStatus = orderOutStatus;
        this.pageIndex = pageIndex;
        this.pageSize = pageSize;
        this.passengerName = passengerName;
        this.searchScope = searchScope;
        this.uid = uid;
    }

    public GaGetMyOrderListRequest() {
    }

    @JsonProperty("Head")
    @XmlElement(name = "Head")
    private Head head;

    @FieldDoc("真实订单状态")
    @JsonProperty("ActualOrderStatus")
    @XmlElement(name = "ActualOrderStatus")
    private String actualOrderStatus;

    @FieldDoc("查询预订开始时")
    @JsonProperty("BookingDateBegin")
    @XmlElement(name = "BookingDateBegin")
    private long bookingDateBegin;

    @FieldDoc("查询预订结束时间")
    @JsonProperty("BookingDateEnd")
    @XmlElement(name = "BookingDateEnd")
    private long bookingDateEnd;

    @FieldDoc("订单过滤状态" +
					"0--全部" +
					"1--待完成" +
					"2--待完成" +
					"3--暂缓" +
					"4--已完成" +
					"5--已取消" +
					"6--未出行" +
					"7--退/改" +
					"8--逾期未用")
    @JsonProperty("FilterStatus")
    @XmlElement(name = "FilterStatus")
    private int filterStatus;

    @FieldDoc("电话号码")
    @JsonProperty("MobilePhone")
    @XmlElement(name = "MobilePhone")
    private String mobilePhone;

    @JsonProperty("OrderID")
    @XmlElement(name = "OrderID")
    private int orderID;

    @FieldDoc("订单状态" +
"0--全部" +
"1--未提交" +
"2--处理中" +
"3--暂缓出票" +
"4--已出票未付款" +
"5--已出票已付款" +
"6--已成交" +
"7--部分退票" +
"8--全部退票" +
"9--已取消")
    @JsonProperty("OrderOutStatus")
    @XmlElement(name = "OrderOutStatus")
    private OrderOutStatus orderOutStatus;

    @JsonProperty("PageIndex")
    @XmlElement(name = "PageIndex")
    private int pageIndex;

    @JsonProperty("PageSize")
    @XmlElement(name = "PageSize")
    private int pageSize;

    @JsonProperty("PassengerName")
    @XmlElement(name = "PassengerName")
    private String passengerName;

    @FieldDoc("查询范围" +
"0--全部" +
"1--国际机票" +
"2--国内机票")
    @JsonProperty("SearchScope")
    @XmlElement(name = "SearchScope")
    private int searchScope;

    @JsonProperty("UID")
    @XmlElement(name = "UID")
    private String uid;

    public Head getHead() {
        return this.head;
    }

    public void setHead(Head head) {
        this.head = head;
    }

    /**
     * 真实订单状态
     */
    public String getActualOrderStatus() {
        return this.actualOrderStatus;
    }

    public void setActualOrderStatus(String actualOrderStatus) {
        this.actualOrderStatus = actualOrderStatus;
    }

    /**
     * 查询预订开始时
     */
    public long getBookingDateBegin() {
        return this.bookingDateBegin;
    }

    public void setBookingDateBegin(long bookingDateBegin) {
        this.bookingDateBegin = bookingDateBegin;
    }

    /**
     * 查询预订结束时间
     */
    public long getBookingDateEnd() {
        return this.bookingDateEnd;
    }

    public void setBookingDateEnd(long bookingDateEnd) {
        this.bookingDateEnd = bookingDateEnd;
    }

    /**
     * 订单过滤状态
     * 0--全部
     * 1--待完成
     * 2--待完成
     * 3--暂缓
     * 4--已完成
     * 5--已取消
     * 6--未出行
     * 7--退/改
     * 8--逾期未用
     */
    public int getFilterStatus() {
        return this.filterStatus;
    }

    public void setFilterStatus(int filterStatus) {
        this.filterStatus = filterStatus;
    }

    /**
     * 电话号码
     */
    public String getMobilePhone() {
        return this.mobilePhone;
    }

    public void setMobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone;
    }

    public int getOrderID() {
        return this.orderID;
    }

    public void setOrderID(int orderID) {
        this.orderID = orderID;
    }

    /**
     * 订单状态
     * 0--全部
     * 1--未提交
     * 2--处理中
     * 3--暂缓出票
     * 4--已出票未付款
     * 5--已出票已付款
     * 6--已成交
     * 7--部分退票
     * 8--全部退票
     * 9--已取消
     */
    public OrderOutStatus getOrderOutStatus() {
        return this.orderOutStatus;
    }

    public void setOrderOutStatus(OrderOutStatus orderOutStatus) {
        this.orderOutStatus = orderOutStatus;
    }

    public int getPageIndex() {
        return this.pageIndex;
    }

    public void setPageIndex(int pageIndex) {
        this.pageIndex = pageIndex;
    }

    public int getPageSize() {
        return this.pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public String getPassengerName() {
        return this.passengerName;
    }

    public void setPassengerName(String passengerName) {
        this.passengerName = passengerName;
    }

    /**
     * 查询范围
     * 0--全部
     * 1--国际机票
     * 2--国内机票
     */
    public int getSearchScope() {
        return this.searchScope;
    }

    public void setSearchScope(int searchScope) {
        this.searchScope = searchScope;
    }

    public String getUid() {
        return this.uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;

        final GaGetMyOrderListRequest other = (GaGetMyOrderListRequest)obj;
        return
            Objects.equal(this.head, other.head) && 
            Objects.equal(this.actualOrderStatus, other.actualOrderStatus) && 
            Objects.equal(this.bookingDateBegin, other.bookingDateBegin) && 
            Objects.equal(this.bookingDateEnd, other.bookingDateEnd) && 
            Objects.equal(this.filterStatus, other.filterStatus) && 
            Objects.equal(this.mobilePhone, other.mobilePhone) && 
            Objects.equal(this.orderID, other.orderID) && 
            Objects.equal(this.orderOutStatus, other.orderOutStatus) && 
            Objects.equal(this.pageIndex, other.pageIndex) && 
            Objects.equal(this.pageSize, other.pageSize) && 
            Objects.equal(this.passengerName, other.passengerName) && 
            Objects.equal(this.searchScope, other.searchScope) && 
            Objects.equal(this.uid, other.uid);
    }

    @Override
    public int hashCode() {
        int result = 1;

        result = 31 * result + Objects.hashCode(this.head);
        result = 31 * result + Objects.hashCode(this.actualOrderStatus);
        result = 31 * result + Objects.hashCode(this.bookingDateBegin);
        result = 31 * result + Objects.hashCode(this.bookingDateEnd);
        result = 31 * result + Objects.hashCode(this.filterStatus);
        result = 31 * result + Objects.hashCode(this.mobilePhone);
        result = 31 * result + Objects.hashCode(this.orderID);
        result = 31 * result + Objects.hashCode(this.orderOutStatus);
        result = 31 * result + Objects.hashCode(this.pageIndex);
        result = 31 * result + Objects.hashCode(this.pageSize);
        result = 31 * result + Objects.hashCode(this.passengerName);
        result = 31 * result + Objects.hashCode(this.searchScope);
        result = 31 * result + Objects.hashCode(this.uid);

        return result;
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
            .add("head", head)
            .add("actualOrderStatus", actualOrderStatus)
            .add("bookingDateBegin", bookingDateBegin)
            .add("bookingDateEnd", bookingDateEnd)
            .add("filterStatus", filterStatus)
            .add("mobilePhone", mobilePhone)
            .add("orderID", orderID)
            .add("orderOutStatus", orderOutStatus)
            .add("pageIndex", pageIndex)
            .add("pageSize", pageSize)
            .add("passengerName", passengerName)
            .add("searchScope", searchScope)
            .add("uid", uid)
            .toString();
    }
}