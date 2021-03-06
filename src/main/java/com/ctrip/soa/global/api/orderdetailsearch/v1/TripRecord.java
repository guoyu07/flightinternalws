/**
 * Autogenerated by soa-sdk-toolkit
 *
 * DO NOT EDIT DIRECTLY
 */
package com.ctrip.soa.global.api.orderdetailsearch.v1;

import com.ctrip.soa.global.api.flightcommon.v1.DetailColunmInfo;
import com.ctrip.soa.global.api.flightcommon.v1.GaTicketNoInfo;
import com.ctriposs.baiji.rpc.common.apidoc.FieldDoc;
import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.common.base.MoreObjects;
import com.google.common.base.Objects;
import java.util.Calendar;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@JsonAutoDetect(getterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE)
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TripRecord", propOrder = {
    "source",
    "flightInfo",
    "ticketNoList",
    "lastUpdateTime",
    "tripChangeType"
})
@SuppressWarnings("all")
public class TripRecord  {

    private static final long serialVersionUID = 1L;

    public TripRecord(
        int source, 
        DetailColunmInfo flightInfo, 
        List<GaTicketNoInfo> ticketNoList, 
        Calendar lastUpdateTime, 
        int tripChangeType) {
        this.source = source;
        this.flightInfo = flightInfo;
        this.ticketNoList = ticketNoList;
        this.lastUpdateTime = lastUpdateTime;
        this.tripChangeType = tripChangeType;
    }

    public TripRecord() {
    }

    @FieldDoc("0:初始化，1:出票，2：退票，3：改签，4：航变，5：航信")
    @JsonProperty("source")
    @XmlElement(name = "source")
    private int source;

    @FieldDoc("航班信息")
    @JsonProperty("FlightInfo")
    @XmlElement(name = "FlightInfo")
    private DetailColunmInfo flightInfo;

    @FieldDoc("航班信息")
    @JsonProperty("TicketNoList")
    @XmlElement(name = "TicketNoList")
    private List<GaTicketNoInfo> ticketNoList;

    @FieldDoc("最后更新时间")
    @JsonProperty("LastUpdateTime")
    @XmlElement(name = "LastUpdateTime")
    private Calendar lastUpdateTime;

    @FieldDoc("0--原始航班" +
            "1--已调整航班" +
            "2--改签新航班" +
            "3--航班取消" +
            "4--部分退票" +
            "5--全部退票")
    @JsonProperty("TripChangeType")
    @XmlElement(name = "TripChangeType")
    private int tripChangeType;

    /**
     * 0:初始化，1:出票，2：退票，3：改签，4：航变，5：航信
     */
    public int getSource() {
        return this.source;
    }

    public void setSource(int source) {
        this.source = source;
    }

    /**
     * 航班信息
     */
    public DetailColunmInfo getFlightInfo() {
        return this.flightInfo;
    }

    public void setFlightInfo(DetailColunmInfo flightInfo) {
        this.flightInfo = flightInfo;
    }

    /**
     * 航班信息
     */
    public List<GaTicketNoInfo> getTicketNoList() {
        return this.ticketNoList;
    }

    public void setTicketNoList(List<GaTicketNoInfo> ticketNoList) {
        this.ticketNoList = ticketNoList;
    }

    /**
     * 最后更新时间
     */
    public Calendar getLastUpdateTime() {
        return this.lastUpdateTime;
    }

    public void setLastUpdateTime(Calendar lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
    }

    /**
     * 0--原始航班
     *             1--已调整航班
     *             2--改签新航班
     *             3--航班取消
     *             4--部分退票
     *             5--全部退票
     */
    public int getTripChangeType() {
        return this.tripChangeType;
    }

    public void setTripChangeType(int tripChangeType) {
        this.tripChangeType = tripChangeType;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;

        final TripRecord other = (TripRecord)obj;
        return
            Objects.equal(this.source, other.source) && 
            Objects.equal(this.flightInfo, other.flightInfo) && 
            Objects.equal(this.ticketNoList, other.ticketNoList) && 
            Objects.equal(this.lastUpdateTime, other.lastUpdateTime) && 
            Objects.equal(this.tripChangeType, other.tripChangeType);
    }

    @Override
    public int hashCode() {
        int result = 1;

        result = 31 * result + Objects.hashCode(this.source);
        result = 31 * result + Objects.hashCode(this.flightInfo);
        result = 31 * result + Objects.hashCode(this.ticketNoList);
        result = 31 * result + Objects.hashCode(this.lastUpdateTime);
        result = 31 * result + Objects.hashCode(this.tripChangeType);

        return result;
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
            .add("source", source)
            .add("flightInfo", flightInfo)
            .add("ticketNoList", ticketNoList)
            .add("lastUpdateTime", lastUpdateTime)
            .add("tripChangeType", tripChangeType)
            .toString();
    }
}