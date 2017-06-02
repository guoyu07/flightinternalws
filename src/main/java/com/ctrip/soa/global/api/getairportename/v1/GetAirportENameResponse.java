/**
 * Autogenerated by soa-sdk-toolkit
 *
 * DO NOT EDIT DIRECTLY
 */
package com.ctrip.soa.global.api.getairportename.v1;

import com.ctrip.soa.global.api.comm.responsehead.v1.ResponseHead;
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
 * 获取IBU机场英文名称响应
 */
@DtoDoc("获取IBU机场英文名称响应")
@JsonAutoDetect(getterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE)
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "GetAirportENameResponse", namespace = "http://soa.ctrip.com/Global/API/GetAirportEName/v1")
@XmlType(name = "GetAirportENameResponse", propOrder = {
    "responseStatus",
    "responseHead",
    "errorCode",
    "airportEName"
})
@SuppressWarnings("all")
public class GetAirportENameResponse implements HasResponseStatus {

    private static final long serialVersionUID = 1L;

    public GetAirportENameResponse(
        ResponseStatusType responseStatus, 
        ResponseHead responseHead, 
        String errorCode, 
        String airportEName) {
        this.responseStatus = responseStatus;
        this.responseHead = responseHead;
        this.errorCode = errorCode;
        this.airportEName = airportEName;
    }

    public GetAirportENameResponse() {
    }

    @FieldDoc("SOA2.0返回头部信息")
    @JsonProperty("ResponseStatus")
    @XmlElement(name = "ResponseStatus")
    private ResponseStatusType responseStatus;

    @FieldDoc("响应头信息")
    @JsonProperty("ResponseHead")
    @XmlElement(name = "ResponseHead")
    private ResponseHead responseHead;

    @FieldDoc("错误消息,正确为空")
    @JsonProperty("ErrorCode")
    @XmlElement(name = "ErrorCode")
    private String errorCode;

    @FieldDoc("IBU机场英文名称")
    @JsonProperty("AirportEName")
    @XmlElement(name = "AirportEName")
    private String airportEName;

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
     * 响应头信息
     */
    public ResponseHead getResponseHead() {
        return this.responseHead;
    }

    public void setResponseHead(ResponseHead responseHead) {
        this.responseHead = responseHead;
    }

    /**
     * 错误消息,正确为空
     */
    public String getErrorCode() {
        return this.errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    /**
     * IBU机场英文名称
     */
    public String getAirportEName() {
        return this.airportEName;
    }

    public void setAirportEName(String airportEName) {
        this.airportEName = airportEName;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;

        final GetAirportENameResponse other = (GetAirportENameResponse)obj;
        return
            Objects.equal(this.responseStatus, other.responseStatus) && 
            Objects.equal(this.responseHead, other.responseHead) && 
            Objects.equal(this.errorCode, other.errorCode) && 
            Objects.equal(this.airportEName, other.airportEName);
    }

    @Override
    public int hashCode() {
        int result = 1;

        result = 31 * result + Objects.hashCode(this.responseStatus);
        result = 31 * result + Objects.hashCode(this.responseHead);
        result = 31 * result + Objects.hashCode(this.errorCode);
        result = 31 * result + Objects.hashCode(this.airportEName);

        return result;
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
            .add("responseStatus", responseStatus)
            .add("responseHead", responseHead)
            .add("errorCode", errorCode)
            .add("airportEName", airportEName)
            .toString();
    }
}