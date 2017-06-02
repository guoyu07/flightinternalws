/**
 * Autogenerated by soa-sdk-toolkit
 *
 * DO NOT EDIT DIRECTLY
 */
package com.ctrip.soa.global.api.getflightbookinginfo.v1;

import com.ctrip.soa.global.api.comm.head.v1.Head;
import com.ctrip.soa.global.api.flightcommon.v1.FlightSearchInfo;
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
@XmlRootElement(name = "GaGetFlightBookingInfoRequest", namespace = "http://soa.ctrip.com/Global/API/GetFlightBookingInfo/v1")
@XmlType(name = "GaGetFlightBookingInfoRequest", propOrder = {
    "head",
    "cacheKey",
    "flightSearchInfo",
    "verifyOption",
    "orderIDList",
    "priceChanged"
})
@SuppressWarnings("all")
public class GaGetFlightBookingInfoRequest  {

    private static final long serialVersionUID = 1L;

    public GaGetFlightBookingInfoRequest(
        Head head, 
        String cacheKey, 
        FlightSearchInfo flightSearchInfo, 
        VerifyOptionType verifyOption, 
        List<Long> orderIDList, 
        boolean priceChanged) {
        this.head = head;
        this.cacheKey = cacheKey;
        this.flightSearchInfo = flightSearchInfo;
        this.verifyOption = verifyOption;
        this.orderIDList = orderIDList;
        this.priceChanged = priceChanged;
    }

    public GaGetFlightBookingInfoRequest() {
    }

    @JsonProperty("Head")
    @XmlElement(name = "Head")
    private Head head;

    @FieldDoc("缓存流水号，响应中返回")
    @JsonProperty("CacheKey")
    @XmlElement(name = "CacheKey")
    private String cacheKey;

    @FieldDoc("查询、翻查关键信息")
    @JsonProperty("FlightSearchInfo")
    @XmlElement(name = "FlightSearchInfo")
    private FlightSearchInfo flightSearchInfo;

    @FieldDoc("缓存流水号，响应中返回")
    @JsonProperty("VerifyOption")
    @XmlElement(name = "VerifyOption")
    private VerifyOptionType verifyOption;

    @FieldDoc("订单号集合，用于online确认页拉取已经提交的变价信息（非Online不需要传）")
    @JsonProperty("OrderIDList")
    @XmlElement(name = "OrderIDList")
    private List<Long> orderIDList;

    @FieldDoc("订单是否发生过变价 （非Online不需要传）")
    @JsonProperty("PriceChanged")
    @XmlElement(name = "PriceChanged")
    private boolean priceChanged;

    public Head getHead() {
        return this.head;
    }

    public void setHead(Head head) {
        this.head = head;
    }

    /**
     * 缓存流水号，响应中返回
     */
    public String getCacheKey() {
        return this.cacheKey;
    }

    public void setCacheKey(String cacheKey) {
        this.cacheKey = cacheKey;
    }

    /**
     * 查询、翻查关键信息
     */
    public FlightSearchInfo getFlightSearchInfo() {
        return this.flightSearchInfo;
    }

    public void setFlightSearchInfo(FlightSearchInfo flightSearchInfo) {
        this.flightSearchInfo = flightSearchInfo;
    }

    /**
     * 缓存流水号，响应中返回
     */
    public VerifyOptionType getVerifyOption() {
        return this.verifyOption;
    }

    public void setVerifyOption(VerifyOptionType verifyOption) {
        this.verifyOption = verifyOption;
    }

    /**
     * 订单号集合，用于online确认页拉取已经提交的变价信息（非Online不需要传）
     */
    public List<Long> getOrderIDList() {
        return this.orderIDList;
    }

    public void setOrderIDList(List<Long> orderIDList) {
        this.orderIDList = orderIDList;
    }

    /**
     * 订单是否发生过变价 （非Online不需要传）
     */
    public boolean getPriceChanged() {
        return this.priceChanged;
    }

    public void setPriceChanged(boolean priceChanged) {
        this.priceChanged = priceChanged;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;

        final GaGetFlightBookingInfoRequest other = (GaGetFlightBookingInfoRequest)obj;
        return
            Objects.equal(this.head, other.head) && 
            Objects.equal(this.cacheKey, other.cacheKey) && 
            Objects.equal(this.flightSearchInfo, other.flightSearchInfo) && 
            Objects.equal(this.verifyOption, other.verifyOption) && 
            Objects.equal(this.orderIDList, other.orderIDList) && 
            Objects.equal(this.priceChanged, other.priceChanged);
    }

    @Override
    public int hashCode() {
        int result = 1;

        result = 31 * result + Objects.hashCode(this.head);
        result = 31 * result + Objects.hashCode(this.cacheKey);
        result = 31 * result + Objects.hashCode(this.flightSearchInfo);
        result = 31 * result + Objects.hashCode(this.verifyOption);
        result = 31 * result + Objects.hashCode(this.orderIDList);
        result = 31 * result + Objects.hashCode(this.priceChanged);

        return result;
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
            .add("head", head)
            .add("cacheKey", cacheKey)
            .add("flightSearchInfo", flightSearchInfo)
            .add("verifyOption", verifyOption)
            .add("orderIDList", orderIDList)
            .add("priceChanged", priceChanged)
            .toString();
    }
}