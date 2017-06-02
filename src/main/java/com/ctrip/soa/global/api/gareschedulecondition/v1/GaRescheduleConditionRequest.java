/**
 * Autogenerated by soa-sdk-toolkit
 *
 * DO NOT EDIT DIRECTLY
 */
package com.ctrip.soa.global.api.gareschedulecondition.v1;

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
 * 国际机票改签条件查询请求
 */
@DtoDoc("国际机票改签条件查询请求")
@JsonAutoDetect(getterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE)
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "GaRescheduleConditionRequest", namespace = "http://soa.ctrip.com/Global/API/GaRescheduleCondition/v1")
@XmlType(name = "GaRescheduleConditionRequest", propOrder = {
    "head",
    "orderID",
    "flightOrderClass"
})
@SuppressWarnings("all")
public class GaRescheduleConditionRequest  {

    private static final long serialVersionUID = 1L;

    public GaRescheduleConditionRequest(
        Head head, 
        long orderID, 
        String flightOrderClass) {
        this.head = head;
        this.orderID = orderID;
        this.flightOrderClass = flightOrderClass;
    }

    public GaRescheduleConditionRequest() {
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

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;

        final GaRescheduleConditionRequest other = (GaRescheduleConditionRequest)obj;
        return
            Objects.equal(this.head, other.head) && 
            Objects.equal(this.orderID, other.orderID) && 
            Objects.equal(this.flightOrderClass, other.flightOrderClass);
    }

    @Override
    public int hashCode() {
        int result = 1;

        result = 31 * result + Objects.hashCode(this.head);
        result = 31 * result + Objects.hashCode(this.orderID);
        result = 31 * result + Objects.hashCode(this.flightOrderClass);

        return result;
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
            .add("head", head)
            .add("orderID", orderID)
            .add("flightOrderClass", flightOrderClass)
            .toString();
    }
}