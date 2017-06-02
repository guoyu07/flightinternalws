/**
 * Autogenerated by soa-sdk-toolkit
 *
 * DO NOT EDIT DIRECTLY
 */
package com.ctrip.soa.global.api.gaflightpaymentnotifyforonlinedomestic.v1;

import com.ctriposs.baiji.rpc.common.HasResponseStatus;
import com.ctriposs.baiji.rpc.common.apidoc.DtoDoc;
import com.ctriposs.baiji.rpc.common.apidoc.FieldDoc;
import com.ctriposs.baiji.rpc.common.types.ResponseStatusType;
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
 * 订单完成通知支付结果
 */
@DtoDoc("订单完成通知支付结果")
@JsonAutoDetect(getterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE)
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "GaFlightPaymentNotifyForOnlineIntlResponse", namespace = "http://soa.ctrip.com/Global/API/GaFlightPaymentNotifyForOnlineIntl/v1")
@XmlType(name = "FlightsOnlinePaymentNotifyResponse", propOrder = {
    "responseStatus",
    "resultCode",
    "orderID",
    "messageCode"
})
@SuppressWarnings("all")
public class FlightsOnlinePaymentNotifyResponse implements HasResponseStatus {

    private static final long serialVersionUID = 1L;

    public FlightsOnlinePaymentNotifyResponse(
        ResponseStatusType responseStatus, 
        int resultCode, 
        long orderID, 
        String messageCode) {
        this.responseStatus = responseStatus;
        this.resultCode = resultCode;
        this.orderID = orderID;
        this.messageCode = messageCode;
    }

    public FlightsOnlinePaymentNotifyResponse() {
    }

    @JsonProperty("ResponseStatus")
    @XmlElement(name = "ResponseStatus")
    private ResponseStatusType responseStatus;

    @FieldDoc("执行结果0 :成功；1 :失败")
    @JsonProperty("ResultCode")
    @XmlElement(name = "ResultCode")
    private int resultCode;

    @FieldDoc("订单号")
    @JsonProperty("OrderID")
    @XmlElement(name = "OrderID")
    private long orderID;

    @FieldDoc("信息代码（暂时保留，无意义 lengeth:16）")
    @JsonProperty("MessageCode")
    @XmlElement(name = "MessageCode")
    private String messageCode;

    public ResponseStatusType getResponseStatus() {
        return this.responseStatus;
    }

    public void setResponseStatus(ResponseStatusType responseStatus) {
        this.responseStatus = responseStatus;
    }

    /**
     * 执行结果0 :成功；1 :失败
     */
    public int getResultCode() {
        return this.resultCode;
    }

    public void setResultCode(int resultCode) {
        this.resultCode = resultCode;
    }

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
     * 信息代码（暂时保留，无意义 lengeth:16）
     */
    public String getMessageCode() {
        return this.messageCode;
    }

    public void setMessageCode(String messageCode) {
        this.messageCode = messageCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;

        final FlightsOnlinePaymentNotifyResponse other = (FlightsOnlinePaymentNotifyResponse)obj;
        return
            Objects.equal(this.responseStatus, other.responseStatus) && 
            Objects.equal(this.resultCode, other.resultCode) && 
            Objects.equal(this.orderID, other.orderID) && 
            Objects.equal(this.messageCode, other.messageCode);
    }

    @Override
    public int hashCode() {
        int result = 1;

        result = 31 * result + Objects.hashCode(this.responseStatus);
        result = 31 * result + Objects.hashCode(this.resultCode);
        result = 31 * result + Objects.hashCode(this.orderID);
        result = 31 * result + Objects.hashCode(this.messageCode);

        return result;
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
            .add("responseStatus", responseStatus)
            .add("resultCode", resultCode)
            .add("orderID", orderID)
            .add("messageCode", messageCode)
            .toString();
    }
}