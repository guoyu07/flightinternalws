/**
 * Autogenerated by soa-sdk-toolkit
 *
 * DO NOT EDIT DIRECTLY
 */
package com.ctrip.soa.global.api.flight.union_searchflightsws.v1;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.common.base.MoreObjects;
import com.google.common.base.Objects;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlType;

@JsonAutoDetect(getterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE)
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FlightProductGroupType", propOrder = {
    "flightSegmentList",
    "priceList"
})
@SuppressWarnings("all")
public class FlightProductGroupType  {

    private static final long serialVersionUID = 1L;

    public FlightProductGroupType(
        List<FlightSegmentType> flightSegmentList, 
        List<PriceType> priceList) {
        this.flightSegmentList = flightSegmentList;
        this.priceList = priceList;
    }

    public FlightProductGroupType() {
    }

    @JsonProperty("FlightSegmentList")
    @XmlElement(name = "FlightSegment")
    @XmlElementWrapper(name = "FlightSegmentList")
    private List<FlightSegmentType> flightSegmentList;

    @JsonProperty("PriceList")
    @XmlElement(name = "Price")
    @XmlElementWrapper(name = "PriceList")
    private List<PriceType> priceList;

    public List<FlightSegmentType> getFlightSegmentList() {
        return this.flightSegmentList;
    }

    public void setFlightSegmentList(List<FlightSegmentType> flightSegmentList) {
        this.flightSegmentList = flightSegmentList;
    }

    public List<PriceType> getPriceList() {
        return this.priceList;
    }

    public void setPriceList(List<PriceType> priceList) {
        this.priceList = priceList;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;

        final FlightProductGroupType other = (FlightProductGroupType)obj;
        return
            Objects.equal(this.flightSegmentList, other.flightSegmentList) && 
            Objects.equal(this.priceList, other.priceList);
    }

    @Override
    public int hashCode() {
        int result = 1;

        result = 31 * result + Objects.hashCode(this.flightSegmentList);
        result = 31 * result + Objects.hashCode(this.priceList);

        return result;
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
            .add("flightSegmentList", flightSegmentList)
            .add("priceList", priceList)
            .toString();
    }
}