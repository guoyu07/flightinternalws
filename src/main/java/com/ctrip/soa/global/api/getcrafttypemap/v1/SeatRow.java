/**
 * Autogenerated by soa-sdk-toolkit
 *
 * DO NOT EDIT DIRECTLY
 */
package com.ctrip.soa.global.api.getcrafttypemap.v1;

import com.ctrip.soa.global.api.flightcommon.v1.SeatStatus;
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
@XmlType(name = "SeatRow", propOrder = {
    "deck",
    "seatNumber",
    "status"
})
@SuppressWarnings("all")
public class SeatRow  {

    private static final long serialVersionUID = 1L;

    public SeatRow(
        String deck, 
        String seatNumber, 
        SeatStatus status) {
        this.deck = deck;
        this.seatNumber = seatNumber;
        this.status = status;
    }

    public SeatRow() {
    }

    @FieldDoc("舱层")
    @JsonProperty("Deck")
    @XmlElement(name = "Deck")
    private String deck;

    @FieldDoc("座位编号")
    @JsonProperty("SeatNumber")
    @XmlElement(name = "SeatNumber")
    private String seatNumber;

    @FieldDoc("座位状态")
    @JsonProperty("Status")
    @XmlElement(name = "Status")
    private SeatStatus status;

    /**
     * 舱层
     */
    public String getDeck() {
        return this.deck;
    }

    public void setDeck(String deck) {
        this.deck = deck;
    }

    /**
     * 座位编号
     */
    public String getSeatNumber() {
        return this.seatNumber;
    }

    public void setSeatNumber(String seatNumber) {
        this.seatNumber = seatNumber;
    }

    /**
     * 座位状态
     */
    public SeatStatus getStatus() {
        return this.status;
    }

    public void setStatus(SeatStatus status) {
        this.status = status;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;

        final SeatRow other = (SeatRow)obj;
        return
            Objects.equal(this.deck, other.deck) && 
            Objects.equal(this.seatNumber, other.seatNumber) && 
            Objects.equal(this.status, other.status);
    }

    @Override
    public int hashCode() {
        int result = 1;

        result = 31 * result + Objects.hashCode(this.deck);
        result = 31 * result + Objects.hashCode(this.seatNumber);
        result = 31 * result + Objects.hashCode(this.status);

        return result;
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
            .add("deck", deck)
            .add("seatNumber", seatNumber)
            .add("status", status)
            .toString();
    }
}