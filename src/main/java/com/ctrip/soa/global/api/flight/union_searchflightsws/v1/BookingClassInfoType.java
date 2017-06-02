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
@XmlType(name = "BookingClassInfoType", propOrder = {
    "bookingClass",
    "cabinClass",
    "bookingToken"
})
@SuppressWarnings("all")
public class BookingClassInfoType  {

    private static final long serialVersionUID = 1L;

    public BookingClassInfoType(
        String bookingClass, 
        String cabinClass, 
        String bookingToken) {
        this.bookingClass = bookingClass;
        this.cabinClass = cabinClass;
        this.bookingToken = bookingToken;
    }

    public BookingClassInfoType() {
    }

    @FieldDoc("舱位")
    @JsonProperty("BookingClass")
    @XmlElement(name = "BookingClass")
    private String bookingClass;

    @FieldDoc("舱等：经济舱/超级经济舱/商务舱/头等舱")
    @JsonProperty("CabinClass")
    @XmlElement(name = "CabinClass")
    private String cabinClass;

    @FieldDoc("附加舱等信息，春秋专用，对应其AgreementID")
    @JsonProperty("BookingToken")
    @XmlElement(name = "BookingToken")
    private String bookingToken;

    /**
     * 舱位
     */
    public String getBookingClass() {
        return this.bookingClass;
    }

    public void setBookingClass(String bookingClass) {
        this.bookingClass = bookingClass;
    }

    /**
     * 舱等：经济舱/超级经济舱/商务舱/头等舱
     */
    public String getCabinClass() {
        return this.cabinClass;
    }

    public void setCabinClass(String cabinClass) {
        this.cabinClass = cabinClass;
    }

    /**
     * 附加舱等信息，春秋专用，对应其AgreementID
     */
    public String getBookingToken() {
        return this.bookingToken;
    }

    public void setBookingToken(String bookingToken) {
        this.bookingToken = bookingToken;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;

        final BookingClassInfoType other = (BookingClassInfoType)obj;
        return
            Objects.equal(this.bookingClass, other.bookingClass) && 
            Objects.equal(this.cabinClass, other.cabinClass) && 
            Objects.equal(this.bookingToken, other.bookingToken);
    }

    @Override
    public int hashCode() {
        int result = 1;

        result = 31 * result + Objects.hashCode(this.bookingClass);
        result = 31 * result + Objects.hashCode(this.cabinClass);
        result = 31 * result + Objects.hashCode(this.bookingToken);

        return result;
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
            .add("bookingClass", bookingClass)
            .add("cabinClass", cabinClass)
            .add("bookingToken", bookingToken)
            .toString();
    }
}