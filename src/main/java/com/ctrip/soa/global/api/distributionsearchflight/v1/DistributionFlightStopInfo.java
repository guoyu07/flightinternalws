/**
 * Autogenerated by soa-sdk-toolkit
 *
 * DO NOT EDIT DIRECTLY
 */
package com.ctrip.soa.global.api.distributionsearchflight.v1;

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
import javax.xml.bind.annotation.XmlType;

/**
 * 经停信息
 */
@DtoDoc("经停信息")
@JsonAutoDetect(getterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE)
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DistributionFlightStopInfo", propOrder = {
    "city",
    "airPort",
    "duration",
    "hour",
    "min"
})
@SuppressWarnings("all")
public class DistributionFlightStopInfo  {

    private static final long serialVersionUID = 1L;

    public DistributionFlightStopInfo(
        DistributionCityInfo city, 
        DistributionAirPortInfo airPort, 
        int duration, 
        int hour, 
        int min) {
        this.city = city;
        this.airPort = airPort;
        this.duration = duration;
        this.hour = hour;
        this.min = min;
    }

    public DistributionFlightStopInfo() {
    }

    @FieldDoc("经停城市")
    @JsonProperty("City")
    @XmlElement(name = "City")
    private DistributionCityInfo city;

    @FieldDoc("经停机场")
    @JsonProperty("AirPort")
    @XmlElement(name = "AirPort")
    private DistributionAirPortInfo airPort;

    @FieldDoc("经停总时间/分钟")
    @JsonProperty("Duration")
    @XmlElement(name = "Duration")
    private int duration;

    @FieldDoc("经停小时/总时间换算")
    @JsonProperty("Hour")
    @XmlElement(name = "Hour")
    private int hour;

    @FieldDoc("经停除去小时后剩余分钟数")
    @JsonProperty("Min")
    @XmlElement(name = "Min")
    private int min;

    /**
     * 经停城市
     */
    public DistributionCityInfo getCity() {
        return this.city;
    }

    public void setCity(DistributionCityInfo city) {
        this.city = city;
    }

    /**
     * 经停机场
     */
    public DistributionAirPortInfo getAirPort() {
        return this.airPort;
    }

    public void setAirPort(DistributionAirPortInfo airPort) {
        this.airPort = airPort;
    }

    /**
     * 经停总时间/分钟
     */
    public int getDuration() {
        return this.duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    /**
     * 经停小时/总时间换算
     */
    public int getHour() {
        return this.hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    /**
     * 经停除去小时后剩余分钟数
     */
    public int getMin() {
        return this.min;
    }

    public void setMin(int min) {
        this.min = min;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;

        final DistributionFlightStopInfo other = (DistributionFlightStopInfo)obj;
        return
            Objects.equal(this.city, other.city) && 
            Objects.equal(this.airPort, other.airPort) && 
            Objects.equal(this.duration, other.duration) && 
            Objects.equal(this.hour, other.hour) && 
            Objects.equal(this.min, other.min);
    }

    @Override
    public int hashCode() {
        int result = 1;

        result = 31 * result + Objects.hashCode(this.city);
        result = 31 * result + Objects.hashCode(this.airPort);
        result = 31 * result + Objects.hashCode(this.duration);
        result = 31 * result + Objects.hashCode(this.hour);
        result = 31 * result + Objects.hashCode(this.min);

        return result;
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
            .add("city", city)
            .add("airPort", airPort)
            .add("duration", duration)
            .add("hour", hour)
            .add("min", min)
            .toString();
    }
}