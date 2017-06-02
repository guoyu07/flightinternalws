/**
 * Autogenerated by soa-sdk-toolkit
 *
 * DO NOT EDIT DIRECTLY
 */
package com.ctrip.soa.global.api.getlowpricelist.v1;

import com.ctrip.soa.global.api.comm.head.v1.Head;
import com.ctrip.soa.global.api.flightcommon.v1.PaginationInfo;
import com.ctriposs.baiji.rpc.common.apidoc.DtoDoc;
import com.ctriposs.baiji.rpc.common.apidoc.FieldDoc;
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
 * 特惠机票请求
 */
@DtoDoc("特惠机票请求")
@JsonAutoDetect(getterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE)
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "GetLowPriceListRequest", namespace = "http://soa.ctrip.com/Global/API/GetLowPriceList/v1")
@XmlType(name = "GetLowPriceListRequest", propOrder = {
    "head",
    "flightWayType",
    "dCityList",
    "aCityList",
    "airlineCode",
    "classGrade",
    "flightTypeCode",
    "paginationInfo"
})
@SuppressWarnings("all")
public class GetLowPriceListRequest  {

    private static final long serialVersionUID = 1L;

    public GetLowPriceListRequest(
        Head head, 
        String flightWayType, 
        List<String> dCityList, 
        List<String> aCityList, 
        String airlineCode, 
        String classGrade, 
        short flightTypeCode, 
        PaginationInfo paginationInfo) {
        this.head = head;
        this.flightWayType = flightWayType;
        this.dCityList = dCityList;
        this.aCityList = aCityList;
        this.airlineCode = airlineCode;
        this.classGrade = classGrade;
        this.flightTypeCode = flightTypeCode;
        this.paginationInfo = paginationInfo;
    }

    public GetLowPriceListRequest() {
    }

    @FieldDoc("SOA2.0请求头部信息")
    @JsonProperty("Head")
    @XmlElement(name = "Head")
    private Head head;

    @FieldDoc("行程类型：单程（OW）/往返（RT），必填")
    @JsonProperty("FlightWayType")
    @XmlElement(name = "FlightWayType")
    private String flightWayType;

    @FieldDoc("出发城市三字码列表")
    @JsonProperty("DCityList")
    @XmlElement(name = "DCityList")
    private List<String> dCityList;

    @FieldDoc("到达城市三字码列表")
    @JsonProperty("ACityList")
    @XmlElement(name = "ACityList")
    private List<String> aCityList;

    @FieldDoc("航司号，可填0-1个指定航司")
    @JsonProperty("AirlineCode")
    @XmlElement(name = "AirlineCode")
    private String airlineCode;

    @FieldDoc("舱等：不填默认经济舱。经济舱Y/超级经济舱S/商务舱C/头等舱F")
    @JsonProperty("ClassGrade")
    @XmlElement(name = "ClassGrade")
    private String classGrade;

    @FieldDoc("航班飞行类型:0默认 1国内 2国际")
    @JsonProperty("FlightTypeCode")
    @XmlElement(name = "FlightTypeCode")
    private short flightTypeCode;

    @FieldDoc("分页信息")
    @JsonProperty("PaginationInfo")
    @XmlElement(name = "PaginationInfo")
    private PaginationInfo paginationInfo;

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
     * 行程类型：单程（OW）/往返（RT），必填
     */
    public String getFlightWayType() {
        return this.flightWayType;
    }

    public void setFlightWayType(String flightWayType) {
        this.flightWayType = flightWayType;
    }

    /**
     * 出发城市三字码列表
     */
    public List<String> getDCityList() {
        return this.dCityList;
    }

    public void setDCityList(List<String> dCityList) {
        this.dCityList = dCityList;
    }

    /**
     * 到达城市三字码列表
     */
    public List<String> getACityList() {
        return this.aCityList;
    }

    public void setACityList(List<String> aCityList) {
        this.aCityList = aCityList;
    }

    /**
     * 航司号，可填0-1个指定航司
     */
    public String getAirlineCode() {
        return this.airlineCode;
    }

    public void setAirlineCode(String airlineCode) {
        this.airlineCode = airlineCode;
    }

    /**
     * 舱等：不填默认经济舱。经济舱Y/超级经济舱S/商务舱C/头等舱F
     */
    public String getClassGrade() {
        return this.classGrade;
    }

    public void setClassGrade(String classGrade) {
        this.classGrade = classGrade;
    }

    /**
     * 航班飞行类型:0默认 1国内 2国际
     */
    public short getFlightTypeCode() {
        return this.flightTypeCode;
    }

    public void setFlightTypeCode(short flightTypeCode) {
        this.flightTypeCode = flightTypeCode;
    }

    /**
     * 分页信息
     */
    public PaginationInfo getPaginationInfo() {
        return this.paginationInfo;
    }

    public void setPaginationInfo(PaginationInfo paginationInfo) {
        this.paginationInfo = paginationInfo;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;

        final GetLowPriceListRequest other = (GetLowPriceListRequest)obj;
        return
            Objects.equal(this.head, other.head) && 
            Objects.equal(this.flightWayType, other.flightWayType) && 
            Objects.equal(this.dCityList, other.dCityList) && 
            Objects.equal(this.aCityList, other.aCityList) && 
            Objects.equal(this.airlineCode, other.airlineCode) && 
            Objects.equal(this.classGrade, other.classGrade) && 
            Objects.equal(this.flightTypeCode, other.flightTypeCode) && 
            Objects.equal(this.paginationInfo, other.paginationInfo);
    }

    @Override
    public int hashCode() {
        int result = 1;

        result = 31 * result + Objects.hashCode(this.head);
        result = 31 * result + Objects.hashCode(this.flightWayType);
        result = 31 * result + Objects.hashCode(this.dCityList);
        result = 31 * result + Objects.hashCode(this.aCityList);
        result = 31 * result + Objects.hashCode(this.airlineCode);
        result = 31 * result + Objects.hashCode(this.classGrade);
        result = 31 * result + Objects.hashCode(this.flightTypeCode);
        result = 31 * result + Objects.hashCode(this.paginationInfo);

        return result;
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
            .add("head", head)
            .add("flightWayType", flightWayType)
            .add("dCityList", dCityList)
            .add("aCityList", aCityList)
            .add("airlineCode", airlineCode)
            .add("classGrade", classGrade)
            .add("flightTypeCode", flightTypeCode)
            .add("paginationInfo", paginationInfo)
            .toString();
    }
}