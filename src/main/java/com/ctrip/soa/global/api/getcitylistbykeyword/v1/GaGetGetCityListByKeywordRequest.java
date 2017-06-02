/**
 * Autogenerated by soa-sdk-toolkit
 *
 * DO NOT EDIT DIRECTLY
 */
package com.ctrip.soa.global.api.getcitylistbykeyword.v1;

import com.ctrip.soa.global.api.comm.head.v1.Head;
import com.ctriposs.baiji.rpc.common.apidoc.FieldDoc;
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

@JsonAutoDetect(getterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE)
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "GaGetGetCityListByKeywordRequest", namespace = "http://soa.ctrip.com/Global/API/GetCityListByKeyword/v1")
@XmlType(name = "GaGetGetCityListByKeywordRequest", propOrder = {
    "head",
    "key",
    "isHideAllAirport",
    "flightKey"
})
@SuppressWarnings("all")
public class GaGetGetCityListByKeywordRequest  {

    private static final long serialVersionUID = 1L;

    public GaGetGetCityListByKeywordRequest(
        Head head, 
        String key, 
        boolean isHideAllAirport, 
        String flightKey) {
        this.head = head;
        this.key = key;
        this.isHideAllAirport = isHideAllAirport;
        this.flightKey = flightKey;
    }

    public GaGetGetCityListByKeywordRequest() {
    }

    @JsonProperty("Head")
    @XmlElement(name = "Head")
    private Head head;

    @FieldDoc("查询字符串")
    @JsonProperty("Key")
    @XmlElement(name = "Key")
    private String key;

    @FieldDoc("是否隐藏“所有机场”")
    @JsonProperty("IsHideAllAirport")
    @XmlElement(name = "IsHideAllAirport")
    private boolean isHideAllAirport;

    @FieldDoc("查询字符串 兼容 APP4.5bug")
    @JsonProperty("FlightKey")
    @XmlElement(name = "FlightKey")
    private String flightKey;

    public Head getHead() {
        return this.head;
    }

    public void setHead(Head head) {
        this.head = head;
    }

    /**
     * 查询字符串
     */
    public String getKey() {
        return this.key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    /**
     * 是否隐藏“所有机场”
     */
    public boolean getIsHideAllAirport() {
        return this.isHideAllAirport;
    }

    public void setIsHideAllAirport(boolean isHideAllAirport) {
        this.isHideAllAirport = isHideAllAirport;
    }

    /**
     * 查询字符串 兼容 APP4.5bug
     */
    public String getFlightKey() {
        return this.flightKey;
    }

    public void setFlightKey(String flightKey) {
        this.flightKey = flightKey;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;

        final GaGetGetCityListByKeywordRequest other = (GaGetGetCityListByKeywordRequest)obj;
        return
            Objects.equal(this.head, other.head) && 
            Objects.equal(this.key, other.key) && 
            Objects.equal(this.isHideAllAirport, other.isHideAllAirport) && 
            Objects.equal(this.flightKey, other.flightKey);
    }

    @Override
    public int hashCode() {
        int result = 1;

        result = 31 * result + Objects.hashCode(this.head);
        result = 31 * result + Objects.hashCode(this.key);
        result = 31 * result + Objects.hashCode(this.isHideAllAirport);
        result = 31 * result + Objects.hashCode(this.flightKey);

        return result;
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
            .add("head", head)
            .add("key", key)
            .add("isHideAllAirport", isHideAllAirport)
            .add("flightKey", flightKey)
            .toString();
    }
}