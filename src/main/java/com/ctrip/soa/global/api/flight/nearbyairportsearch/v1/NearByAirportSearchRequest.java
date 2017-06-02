/**
 * Autogenerated by soa-sdk-toolkit
 *
 * DO NOT EDIT DIRECTLY
 */
package com.ctrip.soa.global.api.flight.nearbyairportsearch.v1;

import com.ctrip.soa.global.api.comm.head.v1.RequestHead;
import com.ctriposs.baiji.rpc.common.apidoc.DtoDoc;
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

/**
 * 周边机场搜索请求
 */
@DtoDoc("周边机场搜索请求")
@JsonAutoDetect(getterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE)
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "NearByAirportSearchRequest", namespace = "http://soa.ctrip.com/Global/API/Flight/NearByAirportSearch/v1")
@XmlType(name = "NearByAirportSearchRequest", propOrder = {
    "dotY",
    "dotX",
    "isHideAllAirport"
})
@SuppressWarnings("all")
public class NearByAirportSearchRequest extends RequestHead  {

    private static final long serialVersionUID = 1L;

    public NearByAirportSearchRequest(
        double dotY, 
        double dotX, 
        boolean isHideAllAirport) {
        this.dotY = dotY;
        this.dotX = dotX;
        this.isHideAllAirport = isHideAllAirport;
    }

    public NearByAirportSearchRequest() {
    }

    @FieldDoc("经度")
    @JsonProperty("DotY")
    @XmlElement(name = "DotY")
    private double dotY;

    @FieldDoc("纬度")
    @JsonProperty("DotX")
    @XmlElement(name = "DotX")
    private double dotX;

    @FieldDoc("是否隐藏“所有机场”")
    @JsonProperty("IsHideAllAirport")
    @XmlElement(name = "IsHideAllAirport")
    private boolean isHideAllAirport;

    /**
     * 经度
     */
    public double getDotY() {
        return this.dotY;
    }

    public void setDotY(double dotY) {
        this.dotY = dotY;
    }

    /**
     * 纬度
     */
    public double getDotX() {
        return this.dotX;
    }

    public void setDotX(double dotX) {
        this.dotX = dotX;
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

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;

        final NearByAirportSearchRequest other = (NearByAirportSearchRequest)obj;
        return
            Objects.equal(this.dotY, other.dotY) && 
            Objects.equal(this.dotX, other.dotX) && 
            Objects.equal(this.isHideAllAirport, other.isHideAllAirport);
    }

    @Override
    public int hashCode() {
        int result = 1;

        result = 31 * result + Objects.hashCode(this.dotY);
        result = 31 * result + Objects.hashCode(this.dotX);
        result = 31 * result + Objects.hashCode(this.isHideAllAirport);

        return result;
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
            .add("dotY", dotY)
            .add("dotX", dotX)
            .add("isHideAllAirport", isHideAllAirport)
            .toString();
    }
}