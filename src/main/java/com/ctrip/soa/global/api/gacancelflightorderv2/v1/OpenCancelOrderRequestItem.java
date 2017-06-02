/**
 * Autogenerated by soa-sdk-toolkit
 *
 * DO NOT EDIT DIRECTLY
 */
package com.ctrip.soa.global.api.gacancelflightorderv2.v1;

import com.ctriposs.baiji.rpc.common.apidoc.FieldDoc;
import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.common.base.MoreObjects;
import com.google.common.base.Objects;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@JsonAutoDetect(getterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE)
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OpenCancelOrderRequestItem", propOrder = {
    "orderID",
    "cancelReason",
    "isCancelPNR",
    "isCancelRelation"
})
@SuppressWarnings("all")
public class OpenCancelOrderRequestItem  {

    private static final long serialVersionUID = 1L;

    public OpenCancelOrderRequestItem(
        long orderID, 
        String cancelReason, 
        boolean isCancelPNR, 
        boolean isCancelRelation) {
        this.orderID = orderID;
        this.cancelReason = cancelReason;
        this.isCancelPNR = isCancelPNR;
        this.isCancelRelation = isCancelRelation;
    }

    public OpenCancelOrderRequestItem() {
    }

    @FieldDoc("订单号")
    @JsonProperty("OrderID")
    @XmlElement(name = "OrderID")
    private long orderID;

    @FieldDoc("取消原因")
    @JsonProperty("CancelReason")
    @XmlElement(name = "CancelReason")
    private String cancelReason;

    @FieldDoc("是否取消PNR")
    @JsonProperty("IsCancelPNR")
    @XmlElement(name = "IsCancelPNR")
    private boolean isCancelPNR;

    @FieldDoc("是否取消关联订单")
    @JsonProperty("IsCancelRelation")
    @XmlElement(name = "IsCancelRelation")
    private boolean isCancelRelation;

    /**
     * 订单号
     */
    public long getOrderID() {
        return this.orderID;
    }

    public void setOrderID(long orderID) {
        this.orderID = orderID;
    }

    /**
     * 取消原因
     */
    public String getCancelReason() {
        return this.cancelReason;
    }

    public void setCancelReason(String cancelReason) {
        this.cancelReason = cancelReason;
    }

    /**
     * 是否取消PNR
     */
    public boolean getIsCancelPNR() {
        return this.isCancelPNR;
    }

    public void setIsCancelPNR(boolean isCancelPNR) {
        this.isCancelPNR = isCancelPNR;
    }

    /**
     * 是否取消关联订单
     */
    public boolean getIsCancelRelation() {
        return this.isCancelRelation;
    }

    public void setIsCancelRelation(boolean isCancelRelation) {
        this.isCancelRelation = isCancelRelation;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;

        final OpenCancelOrderRequestItem other = (OpenCancelOrderRequestItem)obj;
        return
            Objects.equal(this.orderID, other.orderID) && 
            Objects.equal(this.cancelReason, other.cancelReason) && 
            Objects.equal(this.isCancelPNR, other.isCancelPNR) && 
            Objects.equal(this.isCancelRelation, other.isCancelRelation);
    }

    @Override
    public int hashCode() {
        int result = 1;

        result = 31 * result + Objects.hashCode(this.orderID);
        result = 31 * result + Objects.hashCode(this.cancelReason);
        result = 31 * result + Objects.hashCode(this.isCancelPNR);
        result = 31 * result + Objects.hashCode(this.isCancelRelation);

        return result;
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
            .add("orderID", orderID)
            .add("cancelReason", cancelReason)
            .add("isCancelPNR", isCancelPNR)
            .add("isCancelRelation", isCancelRelation)
            .toString();
    }
}