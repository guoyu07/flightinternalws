/**
 * Autogenerated by soa-sdk-toolkit
 *
 * DO NOT EDIT DIRECTLY
 */
package com.ctrip.soa.global.api.flight.transfersrecommandation.v1;

import com.ctriposs.baiji.rpc.common.apidoc.DtoDoc;
import com.ctriposs.baiji.rpc.common.apidoc.FieldDoc;
import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.common.base.MoreObjects;
import com.google.common.base.Objects;
import java.math.BigDecimal;
import java.util.Calendar;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * 选择的航班列表
 */
@DtoDoc("选择的航班列表")
@JsonAutoDetect(getterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE)
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FlightNoEntity", propOrder = {
    "flightNo",
    "departureCityCode",
    "arrivalCityCode",
    "departureDate",
    "subClass",
    "price"
})
@SuppressWarnings("all")
public class FlightNoEntity  {

    private static final long serialVersionUID = 1L;

    public FlightNoEntity(
        String flightNo, 
        String departureCityCode, 
        String arrivalCityCode, 
        Calendar departureDate, 
        String subClass, 
        BigDecimal price) {
        this.flightNo = flightNo;
        this.departureCityCode = departureCityCode;
        this.arrivalCityCode = arrivalCityCode;
        this.departureDate = departureDate;
        this.subClass = subClass;
        this.price = price;
    }

    public FlightNoEntity() {
    }

    @FieldDoc("航班号")
    @JsonProperty("FlightNo")
    @XmlElement(name = "FlightNo")
    private String flightNo;

    @FieldDoc("出发城市")
    @JsonProperty("DepartureCityCode")
    @XmlElement(name = "DepartureCityCode")
    private String departureCityCode;

    @FieldDoc("到达城市")
    @JsonProperty("ArrivalCityCode")
    @XmlElement(name = "ArrivalCityCode")
    private String arrivalCityCode;

    @FieldDoc("出发日期")
    @JsonProperty("DepartureDate")
    @XmlElement(name = "DepartureDate")
    private Calendar departureDate;

    @FieldDoc("仓位")
    @JsonProperty("SubClass")
    @XmlElement(name = "SubClass")
    private String subClass;

    @FieldDoc("价格")
    @JsonProperty("Price")
    @XmlElement(name = "Price")
    private BigDecimal price;

    /**
     * 航班号
     */
    public String getFlightNo() {
        return this.flightNo;
    }

    public void setFlightNo(String flightNo) {
        this.flightNo = flightNo;
    }

    /**
     * 出发城市
     */
    public String getDepartureCityCode() {
        return this.departureCityCode;
    }

    public void setDepartureCityCode(String departureCityCode) {
        this.departureCityCode = departureCityCode;
    }

    /**
     * 到达城市
     */
    public String getArrivalCityCode() {
        return this.arrivalCityCode;
    }

    public void setArrivalCityCode(String arrivalCityCode) {
        this.arrivalCityCode = arrivalCityCode;
    }

    /**
     * 出发日期
     */
    public Calendar getDepartureDate() {
        return this.departureDate;
    }

    public void setDepartureDate(Calendar departureDate) {
        this.departureDate = departureDate;
    }

    /**
     * 仓位
     */
    public String getSubClass() {
        return this.subClass;
    }

    public void setSubClass(String subClass) {
        this.subClass = subClass;
    }

    /**
     * 价格
     */
    public BigDecimal getPrice() {
        return this.price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;

        final FlightNoEntity other = (FlightNoEntity)obj;
        return
            Objects.equal(this.flightNo, other.flightNo) && 
            Objects.equal(this.departureCityCode, other.departureCityCode) && 
            Objects.equal(this.arrivalCityCode, other.arrivalCityCode) && 
            Objects.equal(this.departureDate, other.departureDate) && 
            Objects.equal(this.subClass, other.subClass) && 
            Objects.equal(this.price, other.price);
    }

    @Override
    public int hashCode() {
        int result = 1;

        result = 31 * result + Objects.hashCode(this.flightNo);
        result = 31 * result + Objects.hashCode(this.departureCityCode);
        result = 31 * result + Objects.hashCode(this.arrivalCityCode);
        result = 31 * result + Objects.hashCode(this.departureDate);
        result = 31 * result + Objects.hashCode(this.subClass);
        result = 31 * result + Objects.hashCode(this.price);

        return result;
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
            .add("flightNo", flightNo)
            .add("departureCityCode", departureCityCode)
            .add("arrivalCityCode", arrivalCityCode)
            .add("departureDate", departureDate)
            .add("subClass", subClass)
            .add("price", price)
            .toString();
    }
}