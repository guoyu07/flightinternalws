/**
 * Autogenerated by soa-sdk-toolkit
 *
 * DO NOT EDIT DIRECTLY
 */
package com.ctrip.soa.global.api.searhflightporduct.v1;

import com.ctrip.soa.global.api.comm.responsehead.v1.ResponseHead;
import com.ctrip.soa.global.api.flightcommon.v1.AirLineInfo;
import com.ctrip.soa.global.api.flightcommon.v1.AirPortInfo;
import com.ctrip.soa.global.api.flightcommon.v1.AllianceInfo;
import com.ctrip.soa.global.api.flightcommon.v1.AppSloganInfo;
import com.ctrip.soa.global.api.flightcommon.v1.CityInfo;
import com.ctrip.soa.global.api.flightcommon.v1.PaginationInfo;
import com.ctriposs.baiji.rpc.common.HasResponseStatus;
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
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@JsonAutoDetect(getterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE)
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "GaSearchFlightProductResponse", namespace = "http://soa.ctrip.com/Global/API/SearhFlightPorduct/v1")
@XmlType(name = "GaSearchFlightProductResponse", propOrder = {
    "responseStatus",
    "responseHead",
    "no",
    "cacheKey",
    "flightClass",
    "partitionedToken",
    "isAllResult",
    "resultCount",
    "fltProductInfoList",
    "filterDAirPort",
    "filterAAirPort",
    "filterAirLine",
    "paginationInfo",
    "selectedFltProductInfo",
    "selectedFltProductInfoList",
    "appSlogan",
    "responseExtensionFlag",
    "filterStopCity",
    "filterAllianceList",
    "appSloganList"
})
@SuppressWarnings("all")
public class GaSearchFlightProductResponse implements HasResponseStatus {

    private static final long serialVersionUID = 1L;

    public GaSearchFlightProductResponse(
        ResponseStatusType responseStatus, 
        ResponseHead responseHead, 
        int no, 
        String cacheKey, 
        String flightClass, 
        List<String> partitionedToken, 
        boolean isAllResult, 
        int resultCount, 
        List<FltProductInfo> fltProductInfoList, 
        List<AirPortInfo> filterDAirPort, 
        List<AirPortInfo> filterAAirPort, 
        List<AirLineInfo> filterAirLine, 
        PaginationInfo paginationInfo, 
        SelectedFltProductInfo selectedFltProductInfo, 
        List<SelectedFlightInfo> selectedFltProductInfoList, 
        String appSlogan, 
        int responseExtensionFlag, 
        List<CityInfo> filterStopCity, 
        List<AllianceInfo> filterAllianceList, 
        List<AppSloganInfo> appSloganList) {
        this.responseStatus = responseStatus;
        this.responseHead = responseHead;
        this.no = no;
        this.cacheKey = cacheKey;
        this.flightClass = flightClass;
        this.partitionedToken = partitionedToken;
        this.isAllResult = isAllResult;
        this.resultCount = resultCount;
        this.fltProductInfoList = fltProductInfoList;
        this.filterDAirPort = filterDAirPort;
        this.filterAAirPort = filterAAirPort;
        this.filterAirLine = filterAirLine;
        this.paginationInfo = paginationInfo;
        this.selectedFltProductInfo = selectedFltProductInfo;
        this.selectedFltProductInfoList = selectedFltProductInfoList;
        this.appSlogan = appSlogan;
        this.responseExtensionFlag = responseExtensionFlag;
        this.filterStopCity = filterStopCity;
        this.filterAllianceList = filterAllianceList;
        this.appSloganList = appSloganList;
    }

    public GaSearchFlightProductResponse() {
    }

    @JsonProperty("ResponseStatus")
    @XmlElement(name = "ResponseStatus")
    private ResponseStatusType responseStatus;

    @JsonProperty("ResponseHead")
    @XmlElement(name = "ResponseHead")
    private ResponseHead responseHead;

    @FieldDoc("返回序号，从1开始，去程1，返程2，类推")
    @JsonProperty("No")
    @XmlElement(name = "No")
    private int no;

    @FieldDoc("缓存流水号")
    @JsonProperty("CacheKey")
    @XmlElement(name = "CacheKey")
    private String cacheKey;

    @FieldDoc("I国际，N国内")
    @JsonProperty("FlightClass")
    @XmlElement(name = "FlightClass")
    private String flightClass;

    @FieldDoc("分批token-只有选择Sync时有返回")
    @JsonProperty("PartitionedToken")
    @XmlElement(name = "PartitionedToken")
    private List<String> partitionedToken;

    @FieldDoc("是否加载完全部数据")
    @JsonProperty("IsAllResult")
    @XmlElement(name = "IsAllResult")
    private boolean isAllResult;

    @FieldDoc("返回总数据量")
    @JsonProperty("ResultCount")
    @XmlElement(name = "ResultCount")
    private int resultCount;

    @FieldDoc("航线产品信息")
    @JsonProperty("FltProductInfoList")
    @XmlElement(name = "FltProductInfoList")
    private List<FltProductInfo> fltProductInfoList;

    @FieldDoc("出发机场可过滤列表")
    @JsonProperty("FilterDAirPort")
    @XmlElement(name = "FilterDAirPort")
    private List<AirPortInfo> filterDAirPort;

    @FieldDoc("到达机场可过滤列表")
    @JsonProperty("FilterAAirPort")
    @XmlElement(name = "FilterAAirPort")
    private List<AirPortInfo> filterAAirPort;

    @FieldDoc("可过滤航司列表")
    @JsonProperty("FilterAirLine")
    @XmlElement(name = "FilterAirLine")
    private List<AirLineInfo> filterAirLine;

    @FieldDoc("分页信息")
    @JsonProperty("PaginationInfo")
    @XmlElement(name = "PaginationInfo")
    private PaginationInfo paginationInfo;

    @FieldDoc("已选航班信息，去程时为空")
    @JsonProperty("SelectedFltProductInfo")
    @XmlElement(name = "SelectedFltProductInfo")
    private SelectedFltProductInfo selectedFltProductInfo;

    @FieldDoc("已选航班信息列表，去程时为空")
    @JsonProperty("SelectedFltProductInfoList")
    @XmlElement(name = "SelectedFltProductInfo")
    @XmlElementWrapper(name = "SelectedFltProductInfoList")
    private List<SelectedFlightInfo> selectedFltProductInfoList;

    @FieldDoc("APP顶部滚动标语")
    @JsonProperty("APPSlogan")
    @XmlElement(name = "APPSlogan")
    private String appSlogan;

    @FieldDoc("响应码，用以标识相应的结果")
    @JsonProperty("ResponseExtensionFlag")
    @XmlElement(name = "ResponseExtensionFlag")
    private int responseExtensionFlag;

    @FieldDoc("中转城市,机场列表")
    @JsonProperty("FilterStopCity")
    @XmlElement(name = "FilterStopCity")
    private List<CityInfo> filterStopCity;

    @FieldDoc("可过滤的航司联盟")
    @JsonProperty("FilterAllianceList")
    @XmlElement(name = "FilterAllianceList")
    private List<AllianceInfo> filterAllianceList;

    @FieldDoc("重要通知列表")
    @JsonProperty("AppSloganList")
    @XmlElement(name = "AppSloganList")
    private List<AppSloganInfo> appSloganList;

    public ResponseStatusType getResponseStatus() {
        return this.responseStatus;
    }

    public void setResponseStatus(ResponseStatusType responseStatus) {
        this.responseStatus = responseStatus;
    }

    public ResponseHead getResponseHead() {
        return this.responseHead;
    }

    public void setResponseHead(ResponseHead responseHead) {
        this.responseHead = responseHead;
    }

    /**
     * 返回序号，从1开始，去程1，返程2，类推
     */
    public int getNo() {
        return this.no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    /**
     * 缓存流水号
     */
    public String getCacheKey() {
        return this.cacheKey;
    }

    public void setCacheKey(String cacheKey) {
        this.cacheKey = cacheKey;
    }

    /**
     * I国际，N国内
     */
    public String getFlightClass() {
        return this.flightClass;
    }

    public void setFlightClass(String flightClass) {
        this.flightClass = flightClass;
    }

    /**
     * 分批token-只有选择Sync时有返回
     */
    public List<String> getPartitionedToken() {
        return this.partitionedToken;
    }

    public void setPartitionedToken(List<String> partitionedToken) {
        this.partitionedToken = partitionedToken;
    }

    /**
     * 是否加载完全部数据
     */
    public boolean getIsAllResult() {
        return this.isAllResult;
    }

    public void setIsAllResult(boolean isAllResult) {
        this.isAllResult = isAllResult;
    }

    /**
     * 返回总数据量
     */
    public int getResultCount() {
        return this.resultCount;
    }

    public void setResultCount(int resultCount) {
        this.resultCount = resultCount;
    }

    /**
     * 航线产品信息
     */
    public List<FltProductInfo> getFltProductInfoList() {
        return this.fltProductInfoList;
    }

    public void setFltProductInfoList(List<FltProductInfo> fltProductInfoList) {
        this.fltProductInfoList = fltProductInfoList;
    }

    /**
     * 出发机场可过滤列表
     */
    public List<AirPortInfo> getFilterDAirPort() {
        return this.filterDAirPort;
    }

    public void setFilterDAirPort(List<AirPortInfo> filterDAirPort) {
        this.filterDAirPort = filterDAirPort;
    }

    /**
     * 到达机场可过滤列表
     */
    public List<AirPortInfo> getFilterAAirPort() {
        return this.filterAAirPort;
    }

    public void setFilterAAirPort(List<AirPortInfo> filterAAirPort) {
        this.filterAAirPort = filterAAirPort;
    }

    /**
     * 可过滤航司列表
     */
    public List<AirLineInfo> getFilterAirLine() {
        return this.filterAirLine;
    }

    public void setFilterAirLine(List<AirLineInfo> filterAirLine) {
        this.filterAirLine = filterAirLine;
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

    /**
     * 已选航班信息，去程时为空
     */
    public SelectedFltProductInfo getSelectedFltProductInfo() {
        return this.selectedFltProductInfo;
    }

    public void setSelectedFltProductInfo(SelectedFltProductInfo selectedFltProductInfo) {
        this.selectedFltProductInfo = selectedFltProductInfo;
    }

    /**
     * 已选航班信息列表，去程时为空
     */
    public List<SelectedFlightInfo> getSelectedFltProductInfoList() {
        return this.selectedFltProductInfoList;
    }

    public void setSelectedFltProductInfoList(List<SelectedFlightInfo> selectedFltProductInfoList) {
        this.selectedFltProductInfoList = selectedFltProductInfoList;
    }

    /**
     * APP顶部滚动标语
     */
    public String getAppSlogan() {
        return this.appSlogan;
    }

    public void setAppSlogan(String appSlogan) {
        this.appSlogan = appSlogan;
    }

    /**
     * 响应码，用以标识相应的结果
     */
    public int getResponseExtensionFlag() {
        return this.responseExtensionFlag;
    }

    public void setResponseExtensionFlag(int responseExtensionFlag) {
        this.responseExtensionFlag = responseExtensionFlag;
    }

    /**
     * 中转城市,机场列表
     */
    public List<CityInfo> getFilterStopCity() {
        return this.filterStopCity;
    }

    public void setFilterStopCity(List<CityInfo> filterStopCity) {
        this.filterStopCity = filterStopCity;
    }

    /**
     * 可过滤的航司联盟
     */
    public List<AllianceInfo> getFilterAllianceList() {
        return this.filterAllianceList;
    }

    public void setFilterAllianceList(List<AllianceInfo> filterAllianceList) {
        this.filterAllianceList = filterAllianceList;
    }

    /**
     * 重要通知列表
     */
    public List<AppSloganInfo> getAppSloganList() {
        return this.appSloganList;
    }

    public void setAppSloganList(List<AppSloganInfo> appSloganList) {
        this.appSloganList = appSloganList;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;

        final GaSearchFlightProductResponse other = (GaSearchFlightProductResponse)obj;
        return
            Objects.equal(this.responseStatus, other.responseStatus) && 
            Objects.equal(this.responseHead, other.responseHead) && 
            Objects.equal(this.no, other.no) && 
            Objects.equal(this.cacheKey, other.cacheKey) && 
            Objects.equal(this.flightClass, other.flightClass) && 
            Objects.equal(this.partitionedToken, other.partitionedToken) && 
            Objects.equal(this.isAllResult, other.isAllResult) && 
            Objects.equal(this.resultCount, other.resultCount) && 
            Objects.equal(this.fltProductInfoList, other.fltProductInfoList) && 
            Objects.equal(this.filterDAirPort, other.filterDAirPort) && 
            Objects.equal(this.filterAAirPort, other.filterAAirPort) && 
            Objects.equal(this.filterAirLine, other.filterAirLine) && 
            Objects.equal(this.paginationInfo, other.paginationInfo) && 
            Objects.equal(this.selectedFltProductInfo, other.selectedFltProductInfo) && 
            Objects.equal(this.selectedFltProductInfoList, other.selectedFltProductInfoList) && 
            Objects.equal(this.appSlogan, other.appSlogan) && 
            Objects.equal(this.responseExtensionFlag, other.responseExtensionFlag) && 
            Objects.equal(this.filterStopCity, other.filterStopCity) && 
            Objects.equal(this.filterAllianceList, other.filterAllianceList) && 
            Objects.equal(this.appSloganList, other.appSloganList);
    }

    @Override
    public int hashCode() {
        int result = 1;

        result = 31 * result + Objects.hashCode(this.responseStatus);
        result = 31 * result + Objects.hashCode(this.responseHead);
        result = 31 * result + Objects.hashCode(this.no);
        result = 31 * result + Objects.hashCode(this.cacheKey);
        result = 31 * result + Objects.hashCode(this.flightClass);
        result = 31 * result + Objects.hashCode(this.partitionedToken);
        result = 31 * result + Objects.hashCode(this.isAllResult);
        result = 31 * result + Objects.hashCode(this.resultCount);
        result = 31 * result + Objects.hashCode(this.fltProductInfoList);
        result = 31 * result + Objects.hashCode(this.filterDAirPort);
        result = 31 * result + Objects.hashCode(this.filterAAirPort);
        result = 31 * result + Objects.hashCode(this.filterAirLine);
        result = 31 * result + Objects.hashCode(this.paginationInfo);
        result = 31 * result + Objects.hashCode(this.selectedFltProductInfo);
        result = 31 * result + Objects.hashCode(this.selectedFltProductInfoList);
        result = 31 * result + Objects.hashCode(this.appSlogan);
        result = 31 * result + Objects.hashCode(this.responseExtensionFlag);
        result = 31 * result + Objects.hashCode(this.filterStopCity);
        result = 31 * result + Objects.hashCode(this.filterAllianceList);
        result = 31 * result + Objects.hashCode(this.appSloganList);

        return result;
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
            .add("responseStatus", responseStatus)
            .add("responseHead", responseHead)
            .add("no", no)
            .add("cacheKey", cacheKey)
            .add("flightClass", flightClass)
            .add("partitionedToken", partitionedToken)
            .add("isAllResult", isAllResult)
            .add("resultCount", resultCount)
            .add("fltProductInfoList", fltProductInfoList)
            .add("filterDAirPort", filterDAirPort)
            .add("filterAAirPort", filterAAirPort)
            .add("filterAirLine", filterAirLine)
            .add("paginationInfo", paginationInfo)
            .add("selectedFltProductInfo", selectedFltProductInfo)
            .add("selectedFltProductInfoList", selectedFltProductInfoList)
            .add("appSlogan", appSlogan)
            .add("responseExtensionFlag", responseExtensionFlag)
            .add("filterStopCity", filterStopCity)
            .add("filterAllianceList", filterAllianceList)
            .add("appSloganList", appSloganList)
            .toString();
    }
}