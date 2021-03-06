/**
 * Autogenerated by soa-sdk-toolkit
 *
 * DO NOT EDIT DIRECTLY
 */
package com.ctrip.soa.global.api.cancelorderfollowrequest.v1;

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
 * 返回实体
 */
@DtoDoc("返回实体")
@JsonAutoDetect(getterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE)
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "GaCancelOrderFollowResponse", namespace = "http://soa.ctrip.com/Global/API/CancelOrderFollowRequest/v1")
@XmlType(name = "GaCancelOrderFollowResponse", propOrder = {
    "responseStatus",
    "retValue"
})
@SuppressWarnings("all")
public class GaCancelOrderFollowResponse implements HasResponseStatus {

    private static final long serialVersionUID = 1L;

    public GaCancelOrderFollowResponse(
        ResponseStatusType responseStatus, 
        int retValue) {
        this.responseStatus = responseStatus;
        this.retValue = retValue;
    }

    public GaCancelOrderFollowResponse() {
    }

    @FieldDoc("SOA2.0返回头部信息")
    @JsonProperty("ResponseStatus")
    @XmlElement(name = "ResponseStatus")
    private ResponseStatusType responseStatus;

    @FieldDoc("返回结果状态 0:成功  1:参数错误")
    @JsonProperty("RetValue")
    @XmlElement(name = "RetValue")
    private int retValue;

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
     * 返回结果状态 0:成功  1:参数错误
     */
    public int getRetValue() {
        return this.retValue;
    }

    public void setRetValue(int retValue) {
        this.retValue = retValue;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;

        final GaCancelOrderFollowResponse other = (GaCancelOrderFollowResponse)obj;
        return
            Objects.equal(this.responseStatus, other.responseStatus) && 
            Objects.equal(this.retValue, other.retValue);
    }

    @Override
    public int hashCode() {
        int result = 1;

        result = 31 * result + Objects.hashCode(this.responseStatus);
        result = 31 * result + Objects.hashCode(this.retValue);

        return result;
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
            .add("responseStatus", responseStatus)
            .add("retValue", retValue)
            .toString();
    }
}