/**
 * Autogenerated by soa-sdk-toolkit
 *
 * DO NOT EDIT DIRECTLY
 */
package com.ctrip.soa.global.api.receiveflightvari.v1;

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
 * 航班起降时间信息
 */
@DtoDoc("航班起降时间信息")
@JsonAutoDetect(getterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE)
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FlightDateTimeInfoType", propOrder = {
    "planDateTime",
    "actualDateTime",
    "readyDateTime",
    "zones"
})
@SuppressWarnings("all")
public class FlightDateTimeInfoType  {

    private static final long serialVersionUID = 1L;

    public FlightDateTimeInfoType(
        String planDateTime, 
        String actualDateTime, 
        String readyDateTime, 
        String zones) {
        this.planDateTime = planDateTime;
        this.actualDateTime = actualDateTime;
        this.readyDateTime = readyDateTime;
        this.zones = zones;
    }

    public FlightDateTimeInfoType() {
    }

    @FieldDoc("计划")
    @JsonProperty("PlanDateTime")
    @XmlElement(name = "PlanDateTime")
    private String planDateTime;

    @FieldDoc("实际")
    @JsonProperty("ActualDateTime")
    @XmlElement(name = "ActualDateTime")
    private String actualDateTime;

    @FieldDoc("预计")
    @JsonProperty("ReadyDateTime")
    @XmlElement(name = "ReadyDateTime")
    private String readyDateTime;

    @FieldDoc("当地时区")
    @JsonProperty("Zones")
    @XmlElement(name = "Zones")
    private String zones;

    /**
     * 计划
     */
    public String getPlanDateTime() {
        return this.planDateTime;
    }

    public void setPlanDateTime(String planDateTime) {
        this.planDateTime = planDateTime;
    }

    /**
     * 实际
     */
    public String getActualDateTime() {
        return this.actualDateTime;
    }

    public void setActualDateTime(String actualDateTime) {
        this.actualDateTime = actualDateTime;
    }

    /**
     * 预计
     */
    public String getReadyDateTime() {
        return this.readyDateTime;
    }

    public void setReadyDateTime(String readyDateTime) {
        this.readyDateTime = readyDateTime;
    }

    /**
     * 当地时区
     */
    public String getZones() {
        return this.zones;
    }

    public void setZones(String zones) {
        this.zones = zones;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;

        final FlightDateTimeInfoType other = (FlightDateTimeInfoType)obj;
        return
            Objects.equal(this.planDateTime, other.planDateTime) && 
            Objects.equal(this.actualDateTime, other.actualDateTime) && 
            Objects.equal(this.readyDateTime, other.readyDateTime) && 
            Objects.equal(this.zones, other.zones);
    }

    @Override
    public int hashCode() {
        int result = 1;

        result = 31 * result + Objects.hashCode(this.planDateTime);
        result = 31 * result + Objects.hashCode(this.actualDateTime);
        result = 31 * result + Objects.hashCode(this.readyDateTime);
        result = 31 * result + Objects.hashCode(this.zones);

        return result;
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
            .add("planDateTime", planDateTime)
            .add("actualDateTime", actualDateTime)
            .add("readyDateTime", readyDateTime)
            .add("zones", zones)
            .toString();
    }
}