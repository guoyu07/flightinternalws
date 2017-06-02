/**
 * Autogenerated by soa-sdk-toolkit
 *
 * DO NOT EDIT DIRECTLY
 */
package com.ctrip.soa.global.api.getflightintlfareremark.v1;

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
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * 国际机票退改签查询返回值
 */
@DtoDoc("国际机票退改签查询返回值")
@JsonAutoDetect(getterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE)
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "GaPenaltyQueryResponse", namespace = "http://soa.ctrip.com/Global/API/GetFlightIntlFareRemark/v1")
@XmlType(name = "GaGetFlightIntlFareRemarkResponse", propOrder = {
    "responseStatus",
    "responseHead",
    "fltRemarkInfoList"
})
@SuppressWarnings("all")
public class GaGetFlightIntlFareRemarkResponse implements HasResponseStatus {

    private static final long serialVersionUID = 1L;

    public GaGetFlightIntlFareRemarkResponse(
        ResponseStatusType responseStatus, 
        ResponseHead responseHead, 
        List<FltRemarkInfo> fltRemarkInfoList) {
        this.responseStatus = responseStatus;
        this.responseHead = responseHead;
        this.fltRemarkInfoList = fltRemarkInfoList;
    }

    public GaGetFlightIntlFareRemarkResponse() {
    }

    @FieldDoc("SOA2.0返回头部信息")
    @JsonProperty("ResponseStatus")
    @XmlElement(name = "ResponseStatus")
    private ResponseStatusType responseStatus;

    @JsonProperty("ResponseHead")
    @XmlElement(name = "ResponseHead")
    private ResponseHead responseHead;

    @FieldDoc("退改签信息集合")
    @JsonProperty("FltRemarkInfoList")
    @XmlElement(name = "FltRemarkInfoList")
    private List<FltRemarkInfo> fltRemarkInfoList;

    /**
     * SOA2.0返回头部信息
     */
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
     * 退改签信息集合
     */
    public List<FltRemarkInfo> getFltRemarkInfoList() {
        return this.fltRemarkInfoList;
    }

    public void setFltRemarkInfoList(List<FltRemarkInfo> fltRemarkInfoList) {
        this.fltRemarkInfoList = fltRemarkInfoList;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;

        final GaGetFlightIntlFareRemarkResponse other = (GaGetFlightIntlFareRemarkResponse)obj;
        return
            Objects.equal(this.responseStatus, other.responseStatus) && 
            Objects.equal(this.responseHead, other.responseHead) && 
            Objects.equal(this.fltRemarkInfoList, other.fltRemarkInfoList);
    }

    @Override
    public int hashCode() {
        int result = 1;

        result = 31 * result + Objects.hashCode(this.responseStatus);
        result = 31 * result + Objects.hashCode(this.responseHead);
        result = 31 * result + Objects.hashCode(this.fltRemarkInfoList);

        return result;
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
            .add("responseStatus", responseStatus)
            .add("responseHead", responseHead)
            .add("fltRemarkInfoList", fltRemarkInfoList)
            .toString();
    }
}