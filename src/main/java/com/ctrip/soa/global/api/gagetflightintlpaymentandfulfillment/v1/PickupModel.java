/**
 * Autogenerated by soa-sdk-toolkit
 *
 * DO NOT EDIT DIRECTLY
 */
package com.ctrip.soa.global.api.gagetflightintlpaymentandfulfillment.v1;

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
 * 本地自取
 */
@DtoDoc("本地自取")
@JsonAutoDetect(getterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE)
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PickupModel", propOrder = {
    "pickupLocationID",
    "address",
    "addressEN",
    "shiftStartTime",
    "shiftStopTime",
    "airportCode",
    "terminalName",
    "terminalNameEN"
})
@SuppressWarnings("all")
public class PickupModel  {

    private static final long serialVersionUID = 1L;

    public PickupModel(
        int pickupLocationID, 
        String address, 
        String addressEN, 
        String shiftStartTime, 
        String shiftStopTime, 
        String airportCode, 
        String terminalName, 
        String terminalNameEN) {
        this.pickupLocationID = pickupLocationID;
        this.address = address;
        this.addressEN = addressEN;
        this.shiftStartTime = shiftStartTime;
        this.shiftStopTime = shiftStopTime;
        this.airportCode = airportCode;
        this.terminalName = terminalName;
        this.terminalNameEN = terminalNameEN;
    }

    public PickupModel() {
    }

    @FieldDoc("自取地ID号")
    @JsonProperty("PickupLocationID")
    @XmlElement(name = "PickupLocationID")
    private int pickupLocationID;

    @FieldDoc("取票地址")
    @JsonProperty("Address")
    @XmlElement(name = "Address")
    private String address;

    @FieldDoc("英文取票地址")
    @JsonProperty("AddressEN")
    @XmlElement(name = "AddressEN")
    private String addressEN;

    @FieldDoc("取票开始时间")
    @JsonProperty("ShiftStartTime")
    @XmlElement(name = "ShiftStartTime")
    private String shiftStartTime;

    @FieldDoc("取票结束时间")
    @JsonProperty("ShiftStopTime")
    @XmlElement(name = "ShiftStopTime")
    private String shiftStopTime;

    @FieldDoc("机场三字码")
    @JsonProperty("AirportCode")
    @XmlElement(name = "AirportCode")
    private String airportCode;

    @FieldDoc("航站楼中文名")
    @JsonProperty("TerminalName")
    @XmlElement(name = "TerminalName")
    private String terminalName;

    @FieldDoc("航站楼英文名")
    @JsonProperty("TerminalNameEN")
    @XmlElement(name = "TerminalNameEN")
    private String terminalNameEN;

    /**
     * 自取地ID号
     */
    public int getPickupLocationID() {
        return this.pickupLocationID;
    }

    public void setPickupLocationID(int pickupLocationID) {
        this.pickupLocationID = pickupLocationID;
    }

    /**
     * 取票地址
     */
    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * 英文取票地址
     */
    public String getAddressEN() {
        return this.addressEN;
    }

    public void setAddressEN(String addressEN) {
        this.addressEN = addressEN;
    }

    /**
     * 取票开始时间
     */
    public String getShiftStartTime() {
        return this.shiftStartTime;
    }

    public void setShiftStartTime(String shiftStartTime) {
        this.shiftStartTime = shiftStartTime;
    }

    /**
     * 取票结束时间
     */
    public String getShiftStopTime() {
        return this.shiftStopTime;
    }

    public void setShiftStopTime(String shiftStopTime) {
        this.shiftStopTime = shiftStopTime;
    }

    /**
     * 机场三字码
     */
    public String getAirportCode() {
        return this.airportCode;
    }

    public void setAirportCode(String airportCode) {
        this.airportCode = airportCode;
    }

    /**
     * 航站楼中文名
     */
    public String getTerminalName() {
        return this.terminalName;
    }

    public void setTerminalName(String terminalName) {
        this.terminalName = terminalName;
    }

    /**
     * 航站楼英文名
     */
    public String getTerminalNameEN() {
        return this.terminalNameEN;
    }

    public void setTerminalNameEN(String terminalNameEN) {
        this.terminalNameEN = terminalNameEN;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;

        final PickupModel other = (PickupModel)obj;
        return
            Objects.equal(this.pickupLocationID, other.pickupLocationID) && 
            Objects.equal(this.address, other.address) && 
            Objects.equal(this.addressEN, other.addressEN) && 
            Objects.equal(this.shiftStartTime, other.shiftStartTime) && 
            Objects.equal(this.shiftStopTime, other.shiftStopTime) && 
            Objects.equal(this.airportCode, other.airportCode) && 
            Objects.equal(this.terminalName, other.terminalName) && 
            Objects.equal(this.terminalNameEN, other.terminalNameEN);
    }

    @Override
    public int hashCode() {
        int result = 1;

        result = 31 * result + Objects.hashCode(this.pickupLocationID);
        result = 31 * result + Objects.hashCode(this.address);
        result = 31 * result + Objects.hashCode(this.addressEN);
        result = 31 * result + Objects.hashCode(this.shiftStartTime);
        result = 31 * result + Objects.hashCode(this.shiftStopTime);
        result = 31 * result + Objects.hashCode(this.airportCode);
        result = 31 * result + Objects.hashCode(this.terminalName);
        result = 31 * result + Objects.hashCode(this.terminalNameEN);

        return result;
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
            .add("pickupLocationID", pickupLocationID)
            .add("address", address)
            .add("addressEN", addressEN)
            .add("shiftStartTime", shiftStartTime)
            .add("shiftStopTime", shiftStopTime)
            .add("airportCode", airportCode)
            .add("terminalName", terminalName)
            .add("terminalNameEN", terminalNameEN)
            .toString();
    }
}