/**
 * Autogenerated by soa-sdk-toolkit
 *
 * DO NOT EDIT DIRECTLY
 */
package com.ctrip.soa.global.api.flight.transfersrecommandation.v1;

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
 * 中转推荐响应
 */
@DtoDoc("中转推荐响应")
@JsonAutoDetect(getterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE)
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "TransitRecommandationResponse", namespace = "http://soa.ctrip.com/Global/API/Flight/TransfersRecommandation/v1")
@XmlType(name = "TransitRecommandationResponse", propOrder = {
    "responseStatus",
    "memcachedKey",
    "transitFlightList"
})
@SuppressWarnings("all")
public class TransitRecommandationResponse implements HasResponseStatus {

    private static final long serialVersionUID = 1L;

    public TransitRecommandationResponse(
        ResponseStatusType responseStatus, 
        String memcachedKey, 
        List<TransitFlightEntity> transitFlightList) {
        this.responseStatus = responseStatus;
        this.memcachedKey = memcachedKey;
        this.transitFlightList = transitFlightList;
    }

    public TransitRecommandationResponse() {
    }

    @JsonProperty("ResponseStatus")
    @XmlElement(name = "ResponseStatus")
    private ResponseStatusType responseStatus;

    @FieldDoc("Memcache Key")
    @JsonProperty("MemcachedKey")
    @XmlElement(name = "MemcachedKey")
    private String memcachedKey;

    @FieldDoc("中转联程政策列表")
    @JsonProperty("TransitFlightList")
    @XmlElement(name = "TransitFlightList")
    private List<TransitFlightEntity> transitFlightList;

    public ResponseStatusType getResponseStatus() {
        return this.responseStatus;
    }

    public void setResponseStatus(ResponseStatusType responseStatus) {
        this.responseStatus = responseStatus;
    }

    /**
     * Memcache Key
     */
    public String getMemcachedKey() {
        return this.memcachedKey;
    }

    public void setMemcachedKey(String memcachedKey) {
        this.memcachedKey = memcachedKey;
    }

    /**
     * 中转联程政策列表
     */
    public List<TransitFlightEntity> getTransitFlightList() {
        return this.transitFlightList;
    }

    public void setTransitFlightList(List<TransitFlightEntity> transitFlightList) {
        this.transitFlightList = transitFlightList;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;

        final TransitRecommandationResponse other = (TransitRecommandationResponse)obj;
        return
            Objects.equal(this.responseStatus, other.responseStatus) && 
            Objects.equal(this.memcachedKey, other.memcachedKey) && 
            Objects.equal(this.transitFlightList, other.transitFlightList);
    }

    @Override
    public int hashCode() {
        int result = 1;

        result = 31 * result + Objects.hashCode(this.responseStatus);
        result = 31 * result + Objects.hashCode(this.memcachedKey);
        result = 31 * result + Objects.hashCode(this.transitFlightList);

        return result;
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
            .add("responseStatus", responseStatus)
            .add("memcachedKey", memcachedKey)
            .add("transitFlightList", transitFlightList)
            .toString();
    }
}