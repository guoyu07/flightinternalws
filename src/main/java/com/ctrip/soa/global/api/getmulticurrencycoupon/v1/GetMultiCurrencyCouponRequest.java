/**
 * Autogenerated by soa-sdk-toolkit
 *
 * DO NOT EDIT DIRECTLY
 */
package com.ctrip.soa.global.api.getmulticurrencycoupon.v1;

import com.ctrip.soa.global.api.comm.head.v1.Head;
import com.ctrip.soa.global.api.flightcommon.v1.FlightCouponRoute;
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
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@JsonAutoDetect(getterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE)
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "GetMultiCurrencyCouponRequest", namespace = "http://soa.ctrip.com/Global/API/GetMultiCurrencyCoupon/v1")
@XmlType(name = "GetMultiCurrencyCouponRequest", propOrder = {
    "head",
    "flightCouponRouteList",
    "userID",
    "flightWay",
    "flightRegion",
    "bookingTime",
    "saleChannel",
    "currency"
})
@SuppressWarnings("all")
public class GetMultiCurrencyCouponRequest  {

    private static final long serialVersionUID = 1L;

    public GetMultiCurrencyCouponRequest(
        Head head, 
        List<FlightCouponRoute> flightCouponRouteList, 
        String userID, 
        String flightWay, 
        short flightRegion, 
        long bookingTime, 
        String saleChannel, 
        String currency) {
        this.head = head;
        this.flightCouponRouteList = flightCouponRouteList;
        this.userID = userID;
        this.flightWay = flightWay;
        this.flightRegion = flightRegion;
        this.bookingTime = bookingTime;
        this.saleChannel = saleChannel;
        this.currency = currency;
    }

    public GetMultiCurrencyCouponRequest() {
    }

    @JsonProperty("Head")
    @XmlElement(name = "Head")
    private Head head;

    @FieldDoc("航程信息")
    @JsonProperty("FlightCouponRouteList")
    @XmlElement(name = "FlightCouponRouteList")
    private List<FlightCouponRoute> flightCouponRouteList;

    @FieldDoc("UserID")
    @JsonProperty("UserID")
    @XmlElement(name = "UserID")
    private String userID;

    @FieldDoc("航程 S/D/M")
    @JsonProperty("FlightWay")
    @XmlElement(name = "FlightWay")
    private String flightWay;

    @FieldDoc("机票区域类型 0:NA-未知,1:Domestic-国内,2:International-国际")
    @JsonProperty("FlightRegion")
    @XmlElement(name = "FlightRegion")
    private short flightRegion;

    @FieldDoc("预订时间")
    @JsonProperty("BookingTime")
    @XmlElement(name = "BookingTime")
    private long bookingTime;

    @FieldDoc("渠道 EnglishSite...(App不传值时,api兼容)")
    @JsonProperty("SaleChannel")
    @XmlElement(name = "SaleChannel")
    private String saleChannel;

    @FieldDoc("币种")
    @JsonProperty("Currency")
    @XmlElement(name = "Currency")
    private String currency;

    public Head getHead() {
        return this.head;
    }

    public void setHead(Head head) {
        this.head = head;
    }

    /**
     * 航程信息
     */
    public List<FlightCouponRoute> getFlightCouponRouteList() {
        return this.flightCouponRouteList;
    }

    public void setFlightCouponRouteList(List<FlightCouponRoute> flightCouponRouteList) {
        this.flightCouponRouteList = flightCouponRouteList;
    }

    /**
     * UserID
     */
    public String getUserID() {
        return this.userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    /**
     * 航程 S/D/M
     */
    public String getFlightWay() {
        return this.flightWay;
    }

    public void setFlightWay(String flightWay) {
        this.flightWay = flightWay;
    }

    /**
     * 机票区域类型 0:NA-未知,1:Domestic-国内,2:International-国际
     */
    public short getFlightRegion() {
        return this.flightRegion;
    }

    public void setFlightRegion(short flightRegion) {
        this.flightRegion = flightRegion;
    }

    /**
     * 预订时间
     */
    public long getBookingTime() {
        return this.bookingTime;
    }

    public void setBookingTime(long bookingTime) {
        this.bookingTime = bookingTime;
    }

    /**
     * 渠道 EnglishSite...(App不传值时,api兼容)
     */
    public String getSaleChannel() {
        return this.saleChannel;
    }

    public void setSaleChannel(String saleChannel) {
        this.saleChannel = saleChannel;
    }

    /**
     * 币种
     */
    public String getCurrency() {
        return this.currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;

        final GetMultiCurrencyCouponRequest other = (GetMultiCurrencyCouponRequest)obj;
        return
            Objects.equal(this.head, other.head) && 
            Objects.equal(this.flightCouponRouteList, other.flightCouponRouteList) && 
            Objects.equal(this.userID, other.userID) && 
            Objects.equal(this.flightWay, other.flightWay) && 
            Objects.equal(this.flightRegion, other.flightRegion) && 
            Objects.equal(this.bookingTime, other.bookingTime) && 
            Objects.equal(this.saleChannel, other.saleChannel) && 
            Objects.equal(this.currency, other.currency);
    }

    @Override
    public int hashCode() {
        int result = 1;

        result = 31 * result + Objects.hashCode(this.head);
        result = 31 * result + Objects.hashCode(this.flightCouponRouteList);
        result = 31 * result + Objects.hashCode(this.userID);
        result = 31 * result + Objects.hashCode(this.flightWay);
        result = 31 * result + Objects.hashCode(this.flightRegion);
        result = 31 * result + Objects.hashCode(this.bookingTime);
        result = 31 * result + Objects.hashCode(this.saleChannel);
        result = 31 * result + Objects.hashCode(this.currency);

        return result;
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
            .add("head", head)
            .add("flightCouponRouteList", flightCouponRouteList)
            .add("userID", userID)
            .add("flightWay", flightWay)
            .add("flightRegion", flightRegion)
            .add("bookingTime", bookingTime)
            .add("saleChannel", saleChannel)
            .add("currency", currency)
            .toString();
    }
}