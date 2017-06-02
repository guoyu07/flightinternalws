/**
 * Autogenerated by soa-sdk-toolkit
 *
 * DO NOT EDIT DIRECTLY
 */
package com.ctrip.soa.global.api.flightvariinforesponse.v1;

import com.ctriposs.baiji.rpc.common.HasResponseStatus;
import com.ctriposs.baiji.rpc.common.apidoc.DtoDoc;
import com.ctriposs.baiji.rpc.common.apidoc.FieldDoc;
import com.ctriposs.baiji.rpc.common.types.ResponseStatusType;
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
 * 机场天气和流量信息
 */
@DtoDoc("机场天气和流量信息")
@JsonAutoDetect(getterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE)
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FlightAirPortInfoType", propOrder = {
    "responseStatus",
    "cityID",
    "cityName",
    "airPort",
    "airportDelayText",
    "weatherTemperature",
    "weatherType",
    "weatherVisib"
})
@SuppressWarnings("all")
public class FlightAirPortInfoType implements HasResponseStatus {

    private static final long serialVersionUID = 1L;

    public FlightAirPortInfoType(
        ResponseStatusType responseStatus, 
        int cityID, 
        String cityName, 
        String airPort, 
        String airportDelayText, 
        String weatherTemperature, 
        String weatherType, 
        String weatherVisib) {
        this.responseStatus = responseStatus;
        this.cityID = cityID;
        this.cityName = cityName;
        this.airPort = airPort;
        this.airportDelayText = airportDelayText;
        this.weatherTemperature = weatherTemperature;
        this.weatherType = weatherType;
        this.weatherVisib = weatherVisib;
    }

    public FlightAirPortInfoType() {
    }

    @FieldDoc("SOA2.0返回头部信息")
    @JsonProperty("ResponseStatus")
    @XmlElement(name = "ResponseStatus")
    private ResponseStatusType responseStatus;

    @FieldDoc("城市ID")
    @JsonProperty("CityID")
    @XmlElement(name = "CityID")
    private int cityID;

    @FieldDoc("城市名")
    @JsonProperty("CityName")
    @XmlElement(name = "CityName")
    private String cityName;

    @FieldDoc("机场三字码")
    @JsonProperty("AirPort")
    @XmlElement(name = "AirPort")
    private String airPort;

    @FieldDoc("机场流量情况")
    @JsonProperty("AirportDelayText")
    @XmlElement(name = "AirportDelayText")
    private String airportDelayText;

    @FieldDoc("温度")
    @JsonProperty("WeatherTemperature")
    @XmlElement(name = "WeatherTemperature")
    private String weatherTemperature;

    @FieldDoc("天气类型")
    @JsonProperty("WeatherType")
    @XmlElement(name = "WeatherType")
    private String weatherType;

    @FieldDoc("能见度")
    @JsonProperty("WeatherVisib")
    @XmlElement(name = "WeatherVisib")
    private String weatherVisib;

    /**
     * SOA2.0返回头部信息
     */
    public ResponseStatusType getResponseStatus() {
        return this.responseStatus;
    }

    public void setResponseStatus(ResponseStatusType responseStatus) {
        this.responseStatus = responseStatus;
    }

    /**
     * 城市ID
     */
    public int getCityID() {
        return this.cityID;
    }

    public void setCityID(int cityID) {
        this.cityID = cityID;
    }

    /**
     * 城市名
     */
    public String getCityName() {
        return this.cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    /**
     * 机场三字码
     */
    public String getAirPort() {
        return this.airPort;
    }

    public void setAirPort(String airPort) {
        this.airPort = airPort;
    }

    /**
     * 机场流量情况
     */
    public String getAirportDelayText() {
        return this.airportDelayText;
    }

    public void setAirportDelayText(String airportDelayText) {
        this.airportDelayText = airportDelayText;
    }

    /**
     * 温度
     */
    public String getWeatherTemperature() {
        return this.weatherTemperature;
    }

    public void setWeatherTemperature(String weatherTemperature) {
        this.weatherTemperature = weatherTemperature;
    }

    /**
     * 天气类型
     */
    public String getWeatherType() {
        return this.weatherType;
    }

    public void setWeatherType(String weatherType) {
        this.weatherType = weatherType;
    }

    /**
     * 能见度
     */
    public String getWeatherVisib() {
        return this.weatherVisib;
    }

    public void setWeatherVisib(String weatherVisib) {
        this.weatherVisib = weatherVisib;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;

        final FlightAirPortInfoType other = (FlightAirPortInfoType)obj;
        return
            Objects.equal(this.responseStatus, other.responseStatus) && 
            Objects.equal(this.cityID, other.cityID) && 
            Objects.equal(this.cityName, other.cityName) && 
            Objects.equal(this.airPort, other.airPort) && 
            Objects.equal(this.airportDelayText, other.airportDelayText) && 
            Objects.equal(this.weatherTemperature, other.weatherTemperature) && 
            Objects.equal(this.weatherType, other.weatherType) && 
            Objects.equal(this.weatherVisib, other.weatherVisib);
    }

    @Override
    public int hashCode() {
        int result = 1;

        result = 31 * result + Objects.hashCode(this.responseStatus);
        result = 31 * result + Objects.hashCode(this.cityID);
        result = 31 * result + Objects.hashCode(this.cityName);
        result = 31 * result + Objects.hashCode(this.airPort);
        result = 31 * result + Objects.hashCode(this.airportDelayText);
        result = 31 * result + Objects.hashCode(this.weatherTemperature);
        result = 31 * result + Objects.hashCode(this.weatherType);
        result = 31 * result + Objects.hashCode(this.weatherVisib);

        return result;
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
            .add("responseStatus", responseStatus)
            .add("cityID", cityID)
            .add("cityName", cityName)
            .add("airPort", airPort)
            .add("airportDelayText", airportDelayText)
            .add("weatherTemperature", weatherTemperature)
            .add("weatherType", weatherType)
            .add("weatherVisib", weatherVisib)
            .toString();
    }
}