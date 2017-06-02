/**
 * Autogenerated by soa-sdk-toolkit
 *
 * DO NOT EDIT DIRECTLY
 */
package com.ctrip.soa.global.api.gaflightrevisecondition.v1;

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
 * 国际机票提交订单
 */
@DtoDoc("国际机票提交订单")
@JsonAutoDetect(getterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE)
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "GaFlightReviseConditionRequest", namespace = "http://soa.ctrip.com/Global/API/GaFlightReviseCondition/v1")
@XmlType(name = "GaFlightReviseConditionRequest", propOrder = {
    "head",
    "orderID"
})
@SuppressWarnings("all")
public class GaFlightReviseConditionRequest  {

    private static final long serialVersionUID = 1L;

    public GaFlightReviseConditionRequest(
        Head head, 
        long orderID) {
        this.head = head;
        this.orderID = orderID;
    }

    public GaFlightReviseConditionRequest() {
    }

    @FieldDoc("SOA2.0请求头部信息")
    @JsonProperty("Head")
    @XmlElement(name = "Head")
    private Head head;

    @FieldDoc("订单ID")
    @JsonProperty("OrderID")
    @XmlElement(name = "OrderID")
    private long orderID;

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

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;

        final GaFlightReviseConditionRequest other = (GaFlightReviseConditionRequest)obj;
        return
            Objects.equal(this.head, other.head) && 
            Objects.equal(this.orderID, other.orderID);
    }

    @Override
    public int hashCode() {
        int result = 1;

        result = 31 * result + Objects.hashCode(this.head);
        result = 31 * result + Objects.hashCode(this.orderID);

        return result;
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
            .add("head", head)
            .add("orderID", orderID)
            .toString();
    }
}