/**
 * Autogenerated by soa-sdk-toolkit
 *
 * DO NOT EDIT DIRECTLY
 */
package com.ctrip.soa.global.api.gacancelflightorderv2.v1;

import com.ctriposs.baiji.rpc.common.HasResponseStatus;
import com.ctriposs.baiji.rpc.common.apidoc.DtoDoc;
import com.ctriposs.baiji.rpc.common.apidoc.FieldDoc;
import com.ctriposs.baiji.rpc.common.types.ResponseStatusType;
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

/**
 * 取消订单接口返回
 */
@DtoDoc("取消订单接口返回")
@JsonAutoDetect(getterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE)
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "GaCancelFlightOrderV2Response", namespace = "http://soa.ctrip.com/Global/API/GaCancelFlightOrderV2/v1")
@XmlType(name = "GaCancelFlightOrderV2Response", propOrder = {
    "responseStatus",
    "openCancelOrderResponseItems"
})
@SuppressWarnings("all")
public class GaCancelFlightOrderV2Response implements HasResponseStatus {

    private static final long serialVersionUID = 1L;

    public GaCancelFlightOrderV2Response(
        ResponseStatusType responseStatus, 
        List<OpenCancelOrderResponseItems> openCancelOrderResponseItems) {
        this.responseStatus = responseStatus;
        this.openCancelOrderResponseItems = openCancelOrderResponseItems;
    }

    public GaCancelFlightOrderV2Response() {
    }

    @FieldDoc("SOA2.0返回头部信息")
    @JsonProperty("ResponseStatus")
    @XmlElement(name = "ResponseStatus")
    private ResponseStatusType responseStatus;

    @FieldDoc("订单取消返回结果")
    @JsonProperty("OpenCancelOrderResponseItems")
    @XmlElement(name = "OpenCancelOrderResponseItems")
    private List<OpenCancelOrderResponseItems> openCancelOrderResponseItems;

    /**
     * SOA2.0返回头部信息
     */
    public ResponseStatusType getResponseStatus() {
        return this.responseStatus;
    }

    public void setResponseStatus(ResponseStatusType responseStatus) {
        this.responseStatus = responseStatus;
    }

    /**
     * 订单取消返回结果
     */
    public List<OpenCancelOrderResponseItems> getOpenCancelOrderResponseItems() {
        return this.openCancelOrderResponseItems;
    }

    public void setOpenCancelOrderResponseItems(List<OpenCancelOrderResponseItems> openCancelOrderResponseItems) {
        this.openCancelOrderResponseItems = openCancelOrderResponseItems;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;

        final GaCancelFlightOrderV2Response other = (GaCancelFlightOrderV2Response)obj;
        return
            Objects.equal(this.responseStatus, other.responseStatus) && 
            Objects.equal(this.openCancelOrderResponseItems, other.openCancelOrderResponseItems);
    }

    @Override
    public int hashCode() {
        int result = 1;

        result = 31 * result + Objects.hashCode(this.responseStatus);
        result = 31 * result + Objects.hashCode(this.openCancelOrderResponseItems);

        return result;
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
            .add("responseStatus", responseStatus)
            .add("openCancelOrderResponseItems", openCancelOrderResponseItems)
            .toString();
    }
}