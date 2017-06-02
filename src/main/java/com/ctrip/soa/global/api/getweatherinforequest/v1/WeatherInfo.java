/**
 * Autogenerated by soa-sdk-toolkit
 *
 * DO NOT EDIT DIRECTLY
 */
package com.ctrip.soa.global.api.getweatherinforequest.v1;

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
@XmlType(name = "WeatherInfo", propOrder = {
    "windLevelNo",
    "windDirectionName",
    "windDirectionNo",
    "windLevelName",
    "humidity",
    "precipitation"
})
@SuppressWarnings("all")
public class WeatherInfo  {

    private static final long serialVersionUID = 1L;

    public WeatherInfo(
        String windLevelNo, 
        String windDirectionName, 
        String windDirectionNo, 
        String windLevelName, 
        String humidity, 
        String precipitation) {
        this.windLevelNo = windLevelNo;
        this.windDirectionName = windDirectionName;
        this.windDirectionNo = windDirectionNo;
        this.windLevelName = windLevelName;
        this.humidity = humidity;
        this.precipitation = precipitation;
    }

    public WeatherInfo() {
    }

    @FieldDoc("风力等级")
    @JsonProperty("WindLevelNo")
    @XmlElement(name = "WindLevelNo")
    private String windLevelNo;

    @FieldDoc("风向等级名字")
    @JsonProperty("WindDirectionName")
    @XmlElement(name = "WindDirectionName")
    private String windDirectionName;

    @FieldDoc("风向等级")
    @JsonProperty("WindDirectionNo")
    @XmlElement(name = "WindDirectionNo")
    private String windDirectionNo;

    @FieldDoc("风力等级名字")
    @JsonProperty("WindLevelName")
    @XmlElement(name = "WindLevelName")
    private String windLevelName;

    @FieldDoc("湿度")
    @JsonProperty("Humidity")
    @XmlElement(name = "Humidity")
    private String humidity;

    @FieldDoc("降水量")
    @JsonProperty("Precipitation")
    @XmlElement(name = "Precipitation")
    private String precipitation;

    /**
     * 风力等级
     */
    public String getWindLevelNo() {
        return this.windLevelNo;
    }

    public void setWindLevelNo(String windLevelNo) {
        this.windLevelNo = windLevelNo;
    }

    /**
     * 风向等级名字
     */
    public String getWindDirectionName() {
        return this.windDirectionName;
    }

    public void setWindDirectionName(String windDirectionName) {
        this.windDirectionName = windDirectionName;
    }

    /**
     * 风向等级
     */
    public String getWindDirectionNo() {
        return this.windDirectionNo;
    }

    public void setWindDirectionNo(String windDirectionNo) {
        this.windDirectionNo = windDirectionNo;
    }

    /**
     * 风力等级名字
     */
    public String getWindLevelName() {
        return this.windLevelName;
    }

    public void setWindLevelName(String windLevelName) {
        this.windLevelName = windLevelName;
    }

    /**
     * 湿度
     */
    public String getHumidity() {
        return this.humidity;
    }

    public void setHumidity(String humidity) {
        this.humidity = humidity;
    }

    /**
     * 降水量
     */
    public String getPrecipitation() {
        return this.precipitation;
    }

    public void setPrecipitation(String precipitation) {
        this.precipitation = precipitation;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;

        final WeatherInfo other = (WeatherInfo)obj;
        return
            Objects.equal(this.windLevelNo, other.windLevelNo) && 
            Objects.equal(this.windDirectionName, other.windDirectionName) && 
            Objects.equal(this.windDirectionNo, other.windDirectionNo) && 
            Objects.equal(this.windLevelName, other.windLevelName) && 
            Objects.equal(this.humidity, other.humidity) && 
            Objects.equal(this.precipitation, other.precipitation);
    }

    @Override
    public int hashCode() {
        int result = 1;

        result = 31 * result + Objects.hashCode(this.windLevelNo);
        result = 31 * result + Objects.hashCode(this.windDirectionName);
        result = 31 * result + Objects.hashCode(this.windDirectionNo);
        result = 31 * result + Objects.hashCode(this.windLevelName);
        result = 31 * result + Objects.hashCode(this.humidity);
        result = 31 * result + Objects.hashCode(this.precipitation);

        return result;
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
            .add("windLevelNo", windLevelNo)
            .add("windDirectionName", windDirectionName)
            .add("windDirectionNo", windDirectionNo)
            .add("windLevelName", windLevelName)
            .add("humidity", humidity)
            .add("precipitation", precipitation)
            .toString();
    }
}