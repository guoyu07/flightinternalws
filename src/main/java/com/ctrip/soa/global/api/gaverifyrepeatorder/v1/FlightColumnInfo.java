/**
 * Autogenerated by soa-sdk-toolkit
 *
 * DO NOT EDIT DIRECTLY
 */
package com.ctrip.soa.global.api.gaverifyrepeatorder.v1;

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
 * 航段信息
 */
@DtoDoc("航段信息")
@JsonAutoDetect(getterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE)
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FlightColumnInfo", propOrder = {
    "segNo",
    "dDate",
    "aDate"
})
@SuppressWarnings("all")
public class FlightColumnInfo  {

    private static final long serialVersionUID = 1L;

    public FlightColumnInfo(
        int segNo, 
        long dDate, 
        long aDate) {
        this.segNo = segNo;
        this.dDate = dDate;
        this.aDate = aDate;
    }

    public FlightColumnInfo() {
    }

    @FieldDoc("航段序号")
    @JsonProperty("SegNo")
    @XmlElement(name = "SegNo")
    private int segNo;

    @FieldDoc("航班出发时间")
    @JsonProperty("DDate")
    @XmlElement(name = "DDate")
    private long dDate;

    @FieldDoc("航班到达时间")
    @JsonProperty("ADate")
    @XmlElement(name = "ADate")
    private long aDate;

    /**
     * 航段序号
     */
    public int getSegNo() {
        return this.segNo;
    }

    public void setSegNo(int segNo) {
        this.segNo = segNo;
    }

    /**
     * 航班出发时间
     */
    public long getDDate() {
        return this.dDate;
    }

    public void setDDate(long dDate) {
        this.dDate = dDate;
    }

    /**
     * 航班到达时间
     */
    public long getADate() {
        return this.aDate;
    }

    public void setADate(long aDate) {
        this.aDate = aDate;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;

        final FlightColumnInfo other = (FlightColumnInfo)obj;
        return
            Objects.equal(this.segNo, other.segNo) && 
            Objects.equal(this.dDate, other.dDate) && 
            Objects.equal(this.aDate, other.aDate);
    }

    @Override
    public int hashCode() {
        int result = 1;

        result = 31 * result + Objects.hashCode(this.segNo);
        result = 31 * result + Objects.hashCode(this.dDate);
        result = 31 * result + Objects.hashCode(this.aDate);

        return result;
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
            .add("segNo", segNo)
            .add("dDate", dDate)
            .add("aDate", aDate)
            .toString();
    }
}