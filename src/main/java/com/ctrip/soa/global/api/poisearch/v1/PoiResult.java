/**
 * Autogenerated by soa-sdk-toolkit
 *
 * DO NOT EDIT DIRECTLY
 */
package com.ctrip.soa.global.api.poisearch.v1;

import com.ctriposs.baiji.rpc.common.apidoc.DtoDoc;
import com.ctriposs.baiji.rpc.common.apidoc.FieldDoc;
import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.common.base.MoreObjects;
import com.google.common.base.Objects;
import java.math.BigDecimal;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * POI结果类型
 */
@DtoDoc("POI结果类型")
@JsonAutoDetect(getterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE)
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PoiResult", propOrder = {
    "id",
    "name",
    "cityCode",
    "cityName",
    "provinceName",
    "provinceCode",
    "countryName",
    "mapWord",
    "isCanSelect",
    "airportCode",
    "childResults",
    "dataType",
    "index",
    "distance",
    "isDomestic",
    "airportShortName",
    "cityEName"
})
@SuppressWarnings("all")
public class PoiResult  {

    private static final long serialVersionUID = 1L;

    public PoiResult(
        long id, 
        String name, 
        String cityCode, 
        String cityName, 
        String provinceName, 
        String provinceCode, 
        String countryName, 
        String mapWord, 
        int isCanSelect, 
        String airportCode, 
        List<PoiChildResult> childResults, 
        int dataType, 
        int index, 
        BigDecimal distance, 
        int isDomestic, 
        String airportShortName, 
        String cityEName) {
        this.id = id;
        this.name = name;
        this.cityCode = cityCode;
        this.cityName = cityName;
        this.provinceName = provinceName;
        this.provinceCode = provinceCode;
        this.countryName = countryName;
        this.mapWord = mapWord;
        this.isCanSelect = isCanSelect;
        this.airportCode = airportCode;
        this.childResults = childResults;
        this.dataType = dataType;
        this.index = index;
        this.distance = distance;
        this.isDomestic = isDomestic;
        this.airportShortName = airportShortName;
        this.cityEName = cityEName;
    }

    public PoiResult() {
    }

    @FieldDoc("ID值")
    @JsonProperty("ID")
    @XmlElement(name = "ID")
    private long id;

    @FieldDoc("当前语言搜索项名称，当当前语言不存在时候，用英文替换")
    @JsonProperty("Name")
    @XmlElement(name = "Name")
    private String name;

    @FieldDoc("城市三字码")
    @JsonProperty("CityCode")
    @XmlElement(name = "CityCode")
    private String cityCode;

    @FieldDoc("城市名称")
    @JsonProperty("CityName")
    @XmlElement(name = "CityName")
    private String cityName;

    @FieldDoc("省的当前语言名称，不存在用英文名称代替")
    @JsonProperty("ProvinceName")
    @XmlElement(name = "ProvinceName")
    private String provinceName;

    @FieldDoc("省二代")
    @JsonProperty("ProvinceCode")
    @XmlElement(name = "ProvinceCode")
    private String provinceCode;

    @FieldDoc("当前语言国家名称，不存在用英文替换")
    @JsonProperty("CountryName")
    @XmlElement(name = "CountryName")
    private String countryName;

    @FieldDoc("匹配到索引的字段值，当该字段为空时候，索引是从Name中Mapping到的")
    @JsonProperty("MapWord")
    @XmlElement(name = "MapWord")
    private String mapWord;

    @FieldDoc("是否能选择或者点击 1是可点击，0 不可点击选择")
    @JsonProperty("IsCanSelect")
    @XmlElement(name = "IsCanSelect")
    private int isCanSelect;

    @FieldDoc("机场三字码")
    @JsonProperty("AirportCode")
    @XmlElement(name = "AirportCode")
    private String airportCode;

    @FieldDoc("POI搜索下挂数据")
    @JsonProperty("ChildResults")
    @XmlElement(name = "ChildResults")
    private List<PoiChildResult> childResults;

    @FieldDoc("数据类型 1 国家 2省 3有机场城市 4 无机场城市 5机场 6 景点 7周边地区")
    @JsonProperty("DataType")
    @XmlElement(name = "DataType")
    private int dataType;

    @FieldDoc("第几个")
    @JsonProperty("Index")
    @XmlElement(name = "Index")
    private int index;

    @FieldDoc("距离 单位km 周边查询的时候，该字段使用")
    @JsonProperty("Distance")
    @XmlElement(name = "Distance")
    private BigDecimal distance;

    @FieldDoc("是否是国内 1国内 0 国际")
    @JsonProperty("IsDomestic")
    @XmlElement(name = "IsDomestic")
    private int isDomestic;

    @FieldDoc("机场短名称")
    @JsonProperty("AirportShortName")
    @XmlElement(name = "AirportShortName")
    private String airportShortName;

    @FieldDoc("城市英文名称")
    @JsonProperty("CityEName")
    @XmlElement(name = "CityEName")
    private String cityEName;

    /**
     * ID值
     */
    public long getId() {
        return this.id;
    }

    public void setId(long id) {
        this.id = id;
    }

    /**
     * 当前语言搜索项名称，当当前语言不存在时候，用英文替换
     */
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
     * 城市三字码
     */
    public String getCityCode() {
        return this.cityCode;
    }

    public void setCityCode(String cityCode) {
        this.cityCode = cityCode;
    }

    /**
     * 城市名称
     */
    public String getCityName() {
        return this.cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    /**
     * 省的当前语言名称，不存在用英文名称代替
     */
    public String getProvinceName() {
        return this.provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    /**
     * 省二代
     */
    public String getProvinceCode() {
        return this.provinceCode;
    }

    public void setProvinceCode(String provinceCode) {
        this.provinceCode = provinceCode;
    }

    /**
     * 当前语言国家名称，不存在用英文替换
     */
    public String getCountryName() {
        return this.countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    /**
     * 匹配到索引的字段值，当该字段为空时候，索引是从Name中Mapping到的
     */
    public String getMapWord() {
        return this.mapWord;
    }

    public void setMapWord(String mapWord) {
        this.mapWord = mapWord;
    }

    /**
     * 是否能选择或者点击 1是可点击，0 不可点击选择
     */
    public int getIsCanSelect() {
        return this.isCanSelect;
    }

    public void setIsCanSelect(int isCanSelect) {
        this.isCanSelect = isCanSelect;
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
     * POI搜索下挂数据
     */
    public List<PoiChildResult> getChildResults() {
        return this.childResults;
    }

    public void setChildResults(List<PoiChildResult> childResults) {
        this.childResults = childResults;
    }

    /**
     * 数据类型 1 国家 2省 3有机场城市 4 无机场城市 5机场 6 景点 7周边地区
     */
    public int getDataType() {
        return this.dataType;
    }

    public void setDataType(int dataType) {
        this.dataType = dataType;
    }

    /**
     * 第几个
     */
    public int getIndex() {
        return this.index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    /**
     * 距离 单位km 周边查询的时候，该字段使用
     */
    public BigDecimal getDistance() {
        return this.distance;
    }

    public void setDistance(BigDecimal distance) {
        this.distance = distance;
    }

    /**
     * 是否是国内 1国内 0 国际
     */
    public int getIsDomestic() {
        return this.isDomestic;
    }

    public void setIsDomestic(int isDomestic) {
        this.isDomestic = isDomestic;
    }

    /**
     * 机场短名称
     */
    public String getAirportShortName() {
        return this.airportShortName;
    }

    public void setAirportShortName(String airportShortName) {
        this.airportShortName = airportShortName;
    }

    /**
     * 城市英文名称
     */
    public String getCityEName() {
        return this.cityEName;
    }

    public void setCityEName(String cityEName) {
        this.cityEName = cityEName;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;

        final PoiResult other = (PoiResult)obj;
        return
            Objects.equal(this.id, other.id) && 
            Objects.equal(this.name, other.name) && 
            Objects.equal(this.cityCode, other.cityCode) && 
            Objects.equal(this.cityName, other.cityName) && 
            Objects.equal(this.provinceName, other.provinceName) && 
            Objects.equal(this.provinceCode, other.provinceCode) && 
            Objects.equal(this.countryName, other.countryName) && 
            Objects.equal(this.mapWord, other.mapWord) && 
            Objects.equal(this.isCanSelect, other.isCanSelect) && 
            Objects.equal(this.airportCode, other.airportCode) && 
            Objects.equal(this.childResults, other.childResults) && 
            Objects.equal(this.dataType, other.dataType) && 
            Objects.equal(this.index, other.index) && 
            Objects.equal(this.distance, other.distance) && 
            Objects.equal(this.isDomestic, other.isDomestic) && 
            Objects.equal(this.airportShortName, other.airportShortName) && 
            Objects.equal(this.cityEName, other.cityEName);
    }

    @Override
    public int hashCode() {
        int result = 1;

        result = 31 * result + Objects.hashCode(this.id);
        result = 31 * result + Objects.hashCode(this.name);
        result = 31 * result + Objects.hashCode(this.cityCode);
        result = 31 * result + Objects.hashCode(this.cityName);
        result = 31 * result + Objects.hashCode(this.provinceName);
        result = 31 * result + Objects.hashCode(this.provinceCode);
        result = 31 * result + Objects.hashCode(this.countryName);
        result = 31 * result + Objects.hashCode(this.mapWord);
        result = 31 * result + Objects.hashCode(this.isCanSelect);
        result = 31 * result + Objects.hashCode(this.airportCode);
        result = 31 * result + Objects.hashCode(this.childResults);
        result = 31 * result + Objects.hashCode(this.dataType);
        result = 31 * result + Objects.hashCode(this.index);
        result = 31 * result + Objects.hashCode(this.distance);
        result = 31 * result + Objects.hashCode(this.isDomestic);
        result = 31 * result + Objects.hashCode(this.airportShortName);
        result = 31 * result + Objects.hashCode(this.cityEName);

        return result;
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
            .add("id", id)
            .add("name", name)
            .add("cityCode", cityCode)
            .add("cityName", cityName)
            .add("provinceName", provinceName)
            .add("provinceCode", provinceCode)
            .add("countryName", countryName)
            .add("mapWord", mapWord)
            .add("isCanSelect", isCanSelect)
            .add("airportCode", airportCode)
            .add("childResults", childResults)
            .add("dataType", dataType)
            .add("index", index)
            .add("distance", distance)
            .add("isDomestic", isDomestic)
            .add("airportShortName", airportShortName)
            .add("cityEName", cityEName)
            .toString();
    }
}