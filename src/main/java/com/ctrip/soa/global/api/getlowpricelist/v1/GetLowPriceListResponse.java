/**
 * Autogenerated by soa-sdk-toolkit
 *
 * DO NOT EDIT DIRECTLY
 */
package com.ctrip.soa.global.api.getlowpricelist.v1;

import com.ctrip.soa.global.api.flightcommon.v1.LowPriceDto;
import com.ctrip.soa.global.api.flightcommon.v1.PaginationInfo;
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
 * 特惠机票返回
 */
@DtoDoc("特惠机票返回")
@JsonAutoDetect(getterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE)
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "GetLowPriceListResponse", namespace = "http://soa.ctrip.com/Global/API/GetLowPriceList/v1")
@XmlType(name = "GetLowPriceListResponse", propOrder = {
    "responseStatus",
    "errorCode",
    "errorMsg",
    "lowPriceDtoList",
    "paginationInfo"
})
@SuppressWarnings("all")
public class GetLowPriceListResponse implements HasResponseStatus {

    private static final long serialVersionUID = 1L;

    public GetLowPriceListResponse(
        ResponseStatusType responseStatus, 
        int errorCode, 
        String errorMsg, 
        List<LowPriceDto> lowPriceDtoList, 
        PaginationInfo paginationInfo) {
        this.responseStatus = responseStatus;
        this.errorCode = errorCode;
        this.errorMsg = errorMsg;
        this.lowPriceDtoList = lowPriceDtoList;
        this.paginationInfo = paginationInfo;
    }

    public GetLowPriceListResponse() {
    }

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

    @FieldDoc("特惠机票实体列表")
    @JsonProperty("LowPriceDtoList")
    @XmlElement(name = "LowPriceDtoList")
    private List<LowPriceDto> lowPriceDtoList;

    @FieldDoc("分页信息")
    @JsonProperty("PaginationInfo")
    @XmlElement(name = "PaginationInfo")
    private PaginationInfo paginationInfo;

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
     * 特惠机票实体列表
     */
    public List<LowPriceDto> getLowPriceDtoList() {
        return this.lowPriceDtoList;
    }

    public void setLowPriceDtoList(List<LowPriceDto> lowPriceDtoList) {
        this.lowPriceDtoList = lowPriceDtoList;
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

        final GetLowPriceListResponse other = (GetLowPriceListResponse)obj;
        return
            Objects.equal(this.responseStatus, other.responseStatus) && 
            Objects.equal(this.errorCode, other.errorCode) && 
            Objects.equal(this.errorMsg, other.errorMsg) && 
            Objects.equal(this.lowPriceDtoList, other.lowPriceDtoList) && 
            Objects.equal(this.paginationInfo, other.paginationInfo);
    }

    @Override
    public int hashCode() {
        int result = 1;

        result = 31 * result + Objects.hashCode(this.responseStatus);
        result = 31 * result + Objects.hashCode(this.errorCode);
        result = 31 * result + Objects.hashCode(this.errorMsg);
        result = 31 * result + Objects.hashCode(this.lowPriceDtoList);
        result = 31 * result + Objects.hashCode(this.paginationInfo);

        return result;
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
            .add("responseStatus", responseStatus)
            .add("errorCode", errorCode)
            .add("errorMsg", errorMsg)
            .add("lowPriceDtoList", lowPriceDtoList)
            .add("paginationInfo", paginationInfo)
            .toString();
    }
}