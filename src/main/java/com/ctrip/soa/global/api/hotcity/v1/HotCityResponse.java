/**
 * Autogenerated by soa-sdk-toolkit
 *
 * DO NOT EDIT DIRECTLY
 */
package com.ctrip.soa.global.api.hotcity.v1;

import com.ctrip.soa.global.api.comm.responsehead.v1.ResponseHead;
import com.ctriposs.baiji.rpc.common.HasResponseStatus;
import com.ctriposs.baiji.rpc.common.apidoc.DtoDoc;
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
 * 热门城市返回类型
 */
@DtoDoc("热门城市返回类型")
@JsonAutoDetect(getterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE)
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "HotCityResponse", namespace = "http://soa.ctrip.com/Global/API/HotCity/v1")
@XmlType(name = "HotCityResponse", propOrder = {
    "responseStatus",
    "responseHead",
    "hotCitys"
})
@SuppressWarnings("all")
public class HotCityResponse implements HasResponseStatus {

    private static final long serialVersionUID = 1L;

    public HotCityResponse(
        ResponseStatusType responseStatus, 
        ResponseHead responseHead, 
        List<HotCity> hotCitys) {
        this.responseStatus = responseStatus;
        this.responseHead = responseHead;
        this.hotCitys = hotCitys;
    }

    public HotCityResponse() {
    }

    @JsonProperty("ResponseStatus")
    @XmlElement(name = "ResponseStatus")
    private ResponseStatusType responseStatus;

    @JsonProperty("ResponseHead")
    @XmlElement(name = "ResponseHead")
    private ResponseHead responseHead;

    @JsonProperty("HotCitys")
    @XmlElement(name = "HotCitys")
    private List<HotCity> hotCitys;

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

    public List<HotCity> getHotCitys() {
        return this.hotCitys;
    }

    public void setHotCitys(List<HotCity> hotCitys) {
        this.hotCitys = hotCitys;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;

        final HotCityResponse other = (HotCityResponse)obj;
        return
            Objects.equal(this.responseStatus, other.responseStatus) && 
            Objects.equal(this.responseHead, other.responseHead) && 
            Objects.equal(this.hotCitys, other.hotCitys);
    }

    @Override
    public int hashCode() {
        int result = 1;

        result = 31 * result + Objects.hashCode(this.responseStatus);
        result = 31 * result + Objects.hashCode(this.responseHead);
        result = 31 * result + Objects.hashCode(this.hotCitys);

        return result;
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
            .add("responseStatus", responseStatus)
            .add("responseHead", responseHead)
            .add("hotCitys", hotCitys)
            .toString();
    }
}