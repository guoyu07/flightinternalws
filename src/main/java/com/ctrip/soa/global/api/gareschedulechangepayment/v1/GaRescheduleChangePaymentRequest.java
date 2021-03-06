/**
 * Autogenerated by soa-sdk-toolkit
 *
 * DO NOT EDIT DIRECTLY
 */
package com.ctrip.soa.global.api.gareschedulechangepayment.v1;

import com.ctrip.soa.global.api.comm.head.v1.Head;
import com.ctriposs.baiji.rpc.common.apidoc.DtoDoc;
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

/**
 * 机票改签修改支付方式接口请求
 */
@DtoDoc("机票改签修改支付方式接口请求")
@JsonAutoDetect(getterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE)
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "GaRescheduleChangePaymentRequest", namespace = "http://soa.ctrip.com/Global/API/GaRescheduleChangePayment/v1")
@XmlType(name = "GaRescheduleChangePaymentRequest", propOrder = {
    "head",
    "orderID",
    "flightOrderClass",
    "rebookID"
})
@SuppressWarnings("all")
public class GaRescheduleChangePaymentRequest  {

    private static final long serialVersionUID = 1L;

    public GaRescheduleChangePaymentRequest(
        Head head, 
        long orderID, 
        String flightOrderClass, 
        String rebookID) {
        this.head = head;
        this.orderID = orderID;
        this.flightOrderClass = flightOrderClass;
        this.rebookID = rebookID;
    }

    public GaRescheduleChangePaymentRequest() {
    }

    @FieldDoc("SOA2.0请求头部信息")
    @JsonProperty("Head")
    @XmlElement(name = "Head")
    private Head head;

    @FieldDoc("改签订单号")
    @JsonProperty("OrderID")
    @XmlElement(name = "OrderID")
    private long orderID;

    @FieldDoc("I：国际，N：国内")
    @JsonProperty("FlightOrderClass")
    @XmlElement(name = "FlightOrderClass")
    private String flightOrderClass;

    @FieldDoc("改签单ID")
    @JsonProperty("RebookID")
    @XmlElement(name = "RebookID")
    private String rebookID;

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
     * 改签订单号
     */
    public long getOrderID() {
        return this.orderID;
    }

    public void setOrderID(long orderID) {
        this.orderID = orderID;
    }

    /**
     * I：国际，N：国内
     */
    public String getFlightOrderClass() {
        return this.flightOrderClass;
    }

    public void setFlightOrderClass(String flightOrderClass) {
        this.flightOrderClass = flightOrderClass;
    }

    /**
     * 改签单ID
     */
    public String getRebookID() {
        return this.rebookID;
    }

    public void setRebookID(String rebookID) {
        this.rebookID = rebookID;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;

        final GaRescheduleChangePaymentRequest other = (GaRescheduleChangePaymentRequest)obj;
        return
            Objects.equal(this.head, other.head) && 
            Objects.equal(this.orderID, other.orderID) && 
            Objects.equal(this.flightOrderClass, other.flightOrderClass) && 
            Objects.equal(this.rebookID, other.rebookID);
    }

    @Override
    public int hashCode() {
        int result = 1;

        result = 31 * result + Objects.hashCode(this.head);
        result = 31 * result + Objects.hashCode(this.orderID);
        result = 31 * result + Objects.hashCode(this.flightOrderClass);
        result = 31 * result + Objects.hashCode(this.rebookID);

        return result;
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
            .add("head", head)
            .add("orderID", orderID)
            .add("flightOrderClass", flightOrderClass)
            .add("rebookID", rebookID)
            .toString();
    }
}