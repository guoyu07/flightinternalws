/**
 * Autogenerated by soa-sdk-toolkit
 *
 * DO NOT EDIT DIRECTLY
 */
package com.ctrip.soa.global.api.getflightairportinfobycode.v1;

import com.ctrip.soa.global.api.flightvariinforesponse.v1.FlightAirPortInfoType;
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
 * 根据机场三字码查询机场天气信息返回值
 */
@DtoDoc("根据机场三字码查询机场天气信息返回值")
@JsonAutoDetect(getterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE)
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "GaGetFlightAirPortInfoByCodeResponse", namespace = "http://soa.ctrip.com/Global/API/GetFlightAirPortInfoByCode/v1")
@XmlType(name = "GaGetFlightAirPortInfoByCodeResponse", propOrder = {
    "responseStatus",
    "flightAirPortInfo"
})
@SuppressWarnings("all")
public class GaGetFlightAirPortInfoByCodeResponse implements HasResponseStatus {

    private static final long serialVersionUID = 1L;

    public GaGetFlightAirPortInfoByCodeResponse(
        ResponseStatusType responseStatus, 
        FlightAirPortInfoType flightAirPortInfo) {
        this.responseStatus = responseStatus;
        this.flightAirPortInfo = flightAirPortInfo;
    }

    public GaGetFlightAirPortInfoByCodeResponse() {
    }

    @FieldDoc("SOA2.0返回头部信息")
    @JsonProperty("ResponseStatus")
    @XmlElement(name = "ResponseStatus")
    private ResponseStatusType responseStatus;

    @FieldDoc("机场天气信息")
    @JsonProperty("FlightAirPortInfo")
    @XmlElement(name = "FlightAirPortInfo")
    private FlightAirPortInfoType flightAirPortInfo;

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
     * 机场天气信息
     */
    public FlightAirPortInfoType getFlightAirPortInfo() {
        return this.flightAirPortInfo;
    }

    public void setFlightAirPortInfo(FlightAirPortInfoType flightAirPortInfo) {
        this.flightAirPortInfo = flightAirPortInfo;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;

        final GaGetFlightAirPortInfoByCodeResponse other = (GaGetFlightAirPortInfoByCodeResponse)obj;
        return
            Objects.equal(this.responseStatus, other.responseStatus) && 
            Objects.equal(this.flightAirPortInfo, other.flightAirPortInfo);
    }

    @Override
    public int hashCode() {
        int result = 1;

        result = 31 * result + Objects.hashCode(this.responseStatus);
        result = 31 * result + Objects.hashCode(this.flightAirPortInfo);

        return result;
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
            .add("responseStatus", responseStatus)
            .add("flightAirPortInfo", flightAirPortInfo)
            .toString();
    }
}