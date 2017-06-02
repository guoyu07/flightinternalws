/**
 * Autogenerated by soa-sdk-toolkit
 *
 * DO NOT EDIT DIRECTLY
 */
package com.ctrip.soa.global.api.getseoairlineinfo.v1;

import com.ctrip.soa.global.api.comm.responsehead.v1.ResponseHead;
import com.ctrip.soa.global.api.flightcommon.v1.SeoLinkDto;
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
 * 机票Seo航线信息返回
 */
@DtoDoc("机票Seo航线信息返回")
@JsonAutoDetect(getterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE)
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "GetSeoAirlineInfoResponse", namespace = "http://soa.ctrip.com/Global/API/GetSeoAirlineInfo/v1")
@XmlType(name = "GetSeoAirlineInfoResponse", propOrder = {
    "responseHead",
    "responseStatus",
    "errorCode",
    "errorMsg",
    "cheapAirlineTicketsStr",
    "cheapAirlineTicketsDtoList",
    "airportDeparturesAndArrivalsStr",
    "airportDeparturesAndArrivalsDtoList",
    "flightScheduleStr",
    "flightScheduleUrl"
})
@SuppressWarnings("all")
public class GetSeoAirlineInfoResponse implements HasResponseStatus {

    private static final long serialVersionUID = 1L;

    public GetSeoAirlineInfoResponse(
        ResponseHead responseHead, 
        ResponseStatusType responseStatus, 
        int errorCode, 
        String errorMsg, 
        String cheapAirlineTicketsStr, 
        List<SeoLinkDto> cheapAirlineTicketsDtoList, 
        String airportDeparturesAndArrivalsStr, 
        List<SeoLinkDto> airportDeparturesAndArrivalsDtoList, 
        String flightScheduleStr, 
        String flightScheduleUrl) {
        this.responseHead = responseHead;
        this.responseStatus = responseStatus;
        this.errorCode = errorCode;
        this.errorMsg = errorMsg;
        this.cheapAirlineTicketsStr = cheapAirlineTicketsStr;
        this.cheapAirlineTicketsDtoList = cheapAirlineTicketsDtoList;
        this.airportDeparturesAndArrivalsStr = airportDeparturesAndArrivalsStr;
        this.airportDeparturesAndArrivalsDtoList = airportDeparturesAndArrivalsDtoList;
        this.flightScheduleStr = flightScheduleStr;
        this.flightScheduleUrl = flightScheduleUrl;
    }

    public GetSeoAirlineInfoResponse() {
    }

    @JsonProperty("ResponseHead")
    @XmlElement(name = "ResponseHead")
    private ResponseHead responseHead;

    @FieldDoc("SOA2.0返回头部信息")
    @JsonProperty("ResponseStatus")
    @XmlElement(name = "ResponseStatus")
    private ResponseStatusType responseStatus;

    @FieldDoc("错误编号,0为正确")
    @JsonProperty("ErrorCode")
    @XmlElement(name = "ErrorCode")
    private int errorCode;

    @FieldDoc("错误消息,正确为空")
    @JsonProperty("ErrorMsg")
    @XmlElement(name = "ErrorMsg")
    private String errorMsg;

    @FieldDoc("Cheap airline tickets 多语言字符")
    @JsonProperty("CheapAirlineTicketsStr")
    @XmlElement(name = "CheapAirlineTicketsStr")
    private String cheapAirlineTicketsStr;

    @FieldDoc("Cheap airline tickets 模块下的连接实体列表")
    @JsonProperty("CheapAirlineTicketsDtoList")
    @XmlElement(name = "CheapAirlineTicketsDtoList")
    private List<SeoLinkDto> cheapAirlineTicketsDtoList;

    @FieldDoc("Airport departures and arrivals 多语言字符")
    @JsonProperty("AirportDeparturesAndArrivalsStr")
    @XmlElement(name = "AirportDeparturesAndArrivalsStr")
    private String airportDeparturesAndArrivalsStr;

    @FieldDoc("Airport departures and arrivals模块下的连接实体列表")
    @JsonProperty("AirportDeparturesAndArrivalsDtoList")
    @XmlElement(name = "AirportDeparturesAndArrivalsDtoList")
    private List<SeoLinkDto> airportDeparturesAndArrivalsDtoList;

    @FieldDoc("Flight Schedule 多语言字符")
    @JsonProperty("FlightScheduleStr")
    @XmlElement(name = "FlightScheduleStr")
    private String flightScheduleStr;

    @FieldDoc("Flight Schedule Url连接")
    @JsonProperty("FlightScheduleUrl")
    @XmlElement(name = "FlightScheduleUrl")
    private String flightScheduleUrl;

    public ResponseHead getResponseHead() {
        return this.responseHead;
    }

    public void setResponseHead(ResponseHead responseHead) {
        this.responseHead = responseHead;
    }

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
     * 错误编号,0为正确
     */
    public int getErrorCode() {
        return this.errorCode;
    }

    public void setErrorCode(int errorCode) {
        this.errorCode = errorCode;
    }

    /**
     * 错误消息,正确为空
     */
    public String getErrorMsg() {
        return this.errorMsg;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }

    /**
     * Cheap airline tickets 多语言字符
     */
    public String getCheapAirlineTicketsStr() {
        return this.cheapAirlineTicketsStr;
    }

    public void setCheapAirlineTicketsStr(String cheapAirlineTicketsStr) {
        this.cheapAirlineTicketsStr = cheapAirlineTicketsStr;
    }

    /**
     * Cheap airline tickets 模块下的连接实体列表
     */
    public List<SeoLinkDto> getCheapAirlineTicketsDtoList() {
        return this.cheapAirlineTicketsDtoList;
    }

    public void setCheapAirlineTicketsDtoList(List<SeoLinkDto> cheapAirlineTicketsDtoList) {
        this.cheapAirlineTicketsDtoList = cheapAirlineTicketsDtoList;
    }

    /**
     * Airport departures and arrivals 多语言字符
     */
    public String getAirportDeparturesAndArrivalsStr() {
        return this.airportDeparturesAndArrivalsStr;
    }

    public void setAirportDeparturesAndArrivalsStr(String airportDeparturesAndArrivalsStr) {
        this.airportDeparturesAndArrivalsStr = airportDeparturesAndArrivalsStr;
    }

    /**
     * Airport departures and arrivals模块下的连接实体列表
     */
    public List<SeoLinkDto> getAirportDeparturesAndArrivalsDtoList() {
        return this.airportDeparturesAndArrivalsDtoList;
    }

    public void setAirportDeparturesAndArrivalsDtoList(List<SeoLinkDto> airportDeparturesAndArrivalsDtoList) {
        this.airportDeparturesAndArrivalsDtoList = airportDeparturesAndArrivalsDtoList;
    }

    /**
     * Flight Schedule 多语言字符
     */
    public String getFlightScheduleStr() {
        return this.flightScheduleStr;
    }

    public void setFlightScheduleStr(String flightScheduleStr) {
        this.flightScheduleStr = flightScheduleStr;
    }

    /**
     * Flight Schedule Url连接
     */
    public String getFlightScheduleUrl() {
        return this.flightScheduleUrl;
    }

    public void setFlightScheduleUrl(String flightScheduleUrl) {
        this.flightScheduleUrl = flightScheduleUrl;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;

        final GetSeoAirlineInfoResponse other = (GetSeoAirlineInfoResponse)obj;
        return
            Objects.equal(this.responseHead, other.responseHead) && 
            Objects.equal(this.responseStatus, other.responseStatus) && 
            Objects.equal(this.errorCode, other.errorCode) && 
            Objects.equal(this.errorMsg, other.errorMsg) && 
            Objects.equal(this.cheapAirlineTicketsStr, other.cheapAirlineTicketsStr) && 
            Objects.equal(this.cheapAirlineTicketsDtoList, other.cheapAirlineTicketsDtoList) && 
            Objects.equal(this.airportDeparturesAndArrivalsStr, other.airportDeparturesAndArrivalsStr) && 
            Objects.equal(this.airportDeparturesAndArrivalsDtoList, other.airportDeparturesAndArrivalsDtoList) && 
            Objects.equal(this.flightScheduleStr, other.flightScheduleStr) && 
            Objects.equal(this.flightScheduleUrl, other.flightScheduleUrl);
    }

    @Override
    public int hashCode() {
        int result = 1;

        result = 31 * result + Objects.hashCode(this.responseHead);
        result = 31 * result + Objects.hashCode(this.responseStatus);
        result = 31 * result + Objects.hashCode(this.errorCode);
        result = 31 * result + Objects.hashCode(this.errorMsg);
        result = 31 * result + Objects.hashCode(this.cheapAirlineTicketsStr);
        result = 31 * result + Objects.hashCode(this.cheapAirlineTicketsDtoList);
        result = 31 * result + Objects.hashCode(this.airportDeparturesAndArrivalsStr);
        result = 31 * result + Objects.hashCode(this.airportDeparturesAndArrivalsDtoList);
        result = 31 * result + Objects.hashCode(this.flightScheduleStr);
        result = 31 * result + Objects.hashCode(this.flightScheduleUrl);

        return result;
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
            .add("responseHead", responseHead)
            .add("responseStatus", responseStatus)
            .add("errorCode", errorCode)
            .add("errorMsg", errorMsg)
            .add("cheapAirlineTicketsStr", cheapAirlineTicketsStr)
            .add("cheapAirlineTicketsDtoList", cheapAirlineTicketsDtoList)
            .add("airportDeparturesAndArrivalsStr", airportDeparturesAndArrivalsStr)
            .add("airportDeparturesAndArrivalsDtoList", airportDeparturesAndArrivalsDtoList)
            .add("flightScheduleStr", flightScheduleStr)
            .add("flightScheduleUrl", flightScheduleUrl)
            .toString();
    }
}