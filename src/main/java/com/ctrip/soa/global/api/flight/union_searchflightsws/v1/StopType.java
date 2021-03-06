/**
 * Autogenerated by soa-sdk-toolkit
 *
 * DO NOT EDIT DIRECTLY
 */
package com.ctrip.soa.global.api.flight.union_searchflightsws.v1;

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

@JsonAutoDetect(getterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE)
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StopType", propOrder = {
    "airport",
    "duration"
})
@SuppressWarnings("all")
public class StopType  {

    private static final long serialVersionUID = 1L;

    public StopType(
        String airport, 
        String duration) {
        this.airport = airport;
        this.duration = duration;
    }

    public StopType() {
    }

    @FieldDoc("港口")
    @JsonProperty("Airport")
    @XmlElement(name = "Airport")
    private String airport;

    @FieldDoc("飞行时长")
    @JsonProperty("Duration")
    @XmlElement(name = "Duration")
    private String duration;

    /**
     * 港口
     */
    public String getAirport() {
        return this.airport;
    }

    public void setAirport(String airport) {
        this.airport = airport;
    }

    /**
     * 飞行时长
     */
    public String getDuration() {
        return this.duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;

        final StopType other = (StopType)obj;
        return
            Objects.equal(this.airport, other.airport) && 
            Objects.equal(this.duration, other.duration);
    }

    @Override
    public int hashCode() {
        int result = 1;

        result = 31 * result + Objects.hashCode(this.airport);
        result = 31 * result + Objects.hashCode(this.duration);

        return result;
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
            .add("airport", airport)
            .add("duration", duration)
            .toString();
    }
}