/**
 * Autogenerated by soa-sdk-toolkit
 *
 * DO NOT EDIT DIRECTLY
 */
package com.ctrip.soa.global.api.flightcommon.v1;

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
 * 航段信息
 */
@DtoDoc("航段信息")
@JsonAutoDetect(getterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE)
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ColunmInfo", propOrder = {
    "segNo",
    "productSource",
    "mealType",
    "punctuality",
    "clazz",
    "bookingClass",
    "rate",
    "arrivalDays",
    "fligntNo",
    "shareAirLine",
    "shareFlightNO",
    "alliance",
    "airLine",
    "craftType",
    "craftTypeInfo",
    "dDate",
    "aDate",
    "dCity",
    "aCity",
    "dPort",
    "aPort",
    "dTerminal",
    "aTerminal",
    "duration",
    "hour",
    "min",
    "stopDurationStr",
    "differentAirportPoint",
    "shareAirLinePoint",
    "flightStopInfo",
    "hasFlightPicInfo",
    "stopDuration"
})
@SuppressWarnings("all")
public class ColunmInfo  {

    private static final long serialVersionUID = 1L;

    public ColunmInfo(
        int segNo, 
        String productSource, 
        String mealType, 
        float punctuality, 
        GaCabinClassType clazz, 
        String bookingClass, 
        BigDecimal rate, 
        int arrivalDays, 
        String fligntNo, 
        AirLineInfo shareAirLine, 
        String shareFlightNO, 
        String alliance, 
        AirLineInfo airLine, 
        String craftType, 
        CraftTypeInfo craftTypeInfo, 
        long dDate, 
        long aDate, 
        CityInfo dCity, 
        CityInfo aCity, 
        AirPortInfo dPort, 
        AirPortInfo aPort, 
        TerminalInfo dTerminal, 
        TerminalInfo aTerminal, 
        int duration, 
        int hour, 
        int min, 
        String stopDurationStr, 
        String differentAirportPoint, 
        String shareAirLinePoint, 
        List<FlightStopInfo> flightStopInfo, 
        boolean hasFlightPicInfo, 
        int stopDuration) {
        this.segNo = segNo;
        this.productSource = productSource;
        this.mealType = mealType;
        this.punctuality = punctuality;
        this.clazz = clazz;
        this.bookingClass = bookingClass;
        this.rate = rate;
        this.arrivalDays = arrivalDays;
        this.fligntNo = fligntNo;
        this.shareAirLine = shareAirLine;
        this.shareFlightNO = shareFlightNO;
        this.alliance = alliance;
        this.airLine = airLine;
        this.craftType = craftType;
        this.craftTypeInfo = craftTypeInfo;
        this.dDate = dDate;
        this.aDate = aDate;
        this.dCity = dCity;
        this.aCity = aCity;
        this.dPort = dPort;
        this.aPort = aPort;
        this.dTerminal = dTerminal;
        this.aTerminal = aTerminal;
        this.duration = duration;
        this.hour = hour;
        this.min = min;
        this.stopDurationStr = stopDurationStr;
        this.differentAirportPoint = differentAirportPoint;
        this.shareAirLinePoint = shareAirLinePoint;
        this.flightStopInfo = flightStopInfo;
        this.hasFlightPicInfo = hasFlightPicInfo;
        this.stopDuration = stopDuration;
    }

    public ColunmInfo() {
    }

    @FieldDoc("航段序号")
    @JsonProperty("SegNo")
    @XmlElement(name = "SegNo")
    private int segNo;

    @FieldDoc("国际代表EngineType，国内代表ProductSource")
    @JsonProperty("ProductSource")
    @XmlElement(name = "ProductSource")
    private String productSource;

    @FieldDoc("餐食")
    @JsonProperty("MealType")
    @XmlElement(name = "MealType")
    private String mealType;

    @FieldDoc("准点率")
    @JsonProperty("Punctuality")
    @XmlElement(name = "Punctuality")
    private float punctuality;

    @FieldDoc("主舱")
    @JsonProperty("Class")
    @XmlElement(name = "Class")
    private GaCabinClassType clazz;

    @FieldDoc("子舱")
    @JsonProperty("BookingClass")
    @XmlElement(name = "BookingClass")
    private String bookingClass;

    @FieldDoc("扣率")
    @JsonProperty("Rate")
    @XmlElement(name = "Rate")
    private BigDecimal rate;

    @FieldDoc("跨天数")
    @JsonProperty("ArrivalDays")
    @XmlElement(name = "ArrivalDays")
    private int arrivalDays;

    @FieldDoc("航班号")
    @JsonProperty("FligntNo")
    @XmlElement(name = "FligntNo")
    private String fligntNo;

    @FieldDoc("实际承运航空公司")
    @JsonProperty("ShareAirLine")
    @XmlElement(name = "ShareAirLine")
    private AirLineInfo shareAirLine;

    @FieldDoc("共享航班号")
    @JsonProperty("ShareFlightNO")
    @XmlElement(name = "ShareFlightNO")
    private String shareFlightNO;

    @FieldDoc("航司联盟")
    @JsonProperty("Alliance")
    @XmlElement(name = "Alliance")
    private String alliance;

    @FieldDoc("航空公司")
    @JsonProperty("AirLine")
    @XmlElement(name = "AirLine")
    private AirLineInfo airLine;

    @FieldDoc("机型")
    @JsonProperty("CraftType")
    @XmlElement(name = "CraftType")
    private String craftType;

    @FieldDoc("机型实体")
    @JsonProperty("CraftTypeInfo")
    @XmlElement(name = "CraftTypeInfo")
    private CraftTypeInfo craftTypeInfo;

    @FieldDoc("出发时间")
    @JsonProperty("DDate")
    @XmlElement(name = "DDate")
    private long dDate;

    @FieldDoc("到达时间")
    @JsonProperty("ADate")
    @XmlElement(name = "ADate")
    private long aDate;

    @FieldDoc("出发城市")
    @JsonProperty("DCity")
    @XmlElement(name = "DCity")
    private CityInfo dCity;

    @FieldDoc("到达城市")
    @JsonProperty("ACity")
    @XmlElement(name = "ACity")
    private CityInfo aCity;

    @FieldDoc("出发机场")
    @JsonProperty("DPort")
    @XmlElement(name = "DPort")
    private AirPortInfo dPort;

    @FieldDoc("到达机场")
    @JsonProperty("APort")
    @XmlElement(name = "APort")
    private AirPortInfo aPort;

    @FieldDoc("出发航站楼")
    @JsonProperty("DTerminal")
    @XmlElement(name = "DTerminal")
    private TerminalInfo dTerminal;

    @FieldDoc("到达航站楼")
    @JsonProperty("ATerminal")
    @XmlElement(name = "ATerminal")
    private TerminalInfo aTerminal;

    @FieldDoc("飞行总时间/分钟")
    @JsonProperty("Duration")
    @XmlElement(name = "Duration")
    private int duration;

    @FieldDoc("飞行小时/总时间换算")
    @JsonProperty("Hour")
    @XmlElement(name = "Hour")
    private int hour;

    @FieldDoc("飞行除去小时后剩余分钟数")
    @JsonProperty("Min")
    @XmlElement(name = "Min")
    private int min;

    @FieldDoc("中转停留时间")
    @JsonProperty("StopDurationStr")
    @XmlElement(name = "StopDurationStr")
    private String stopDurationStr;

    @FieldDoc("不同机场中转提示")
    @JsonProperty("DifferentAirportPoint")
    @XmlElement(name = "DifferentAirportPoint")
    private String differentAirportPoint;

    @FieldDoc("实际承运航班提示")
    @JsonProperty("ShareAirLinePoint")
    @XmlElement(name = "ShareAirLinePoint")
    private String shareAirLinePoint;

    @FieldDoc("航班经停信息")
    @JsonProperty("FlightStopInfo")
    @XmlElement(name = "FlightStopInfo")
    private List<FlightStopInfo> flightStopInfo;

    @FieldDoc("航班是否有机舱图")
    @JsonProperty("HasFlightPicInfo")
    @XmlElement(name = "HasFlightPicInfo")
    private boolean hasFlightPicInfo;

    @FieldDoc("中转停留时间 单位分钟")
    @JsonProperty("StopDuration")
    @XmlElement(name = "StopDuration")
    private int stopDuration;

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
     * 国际代表EngineType，国内代表ProductSource
     */
    public String getProductSource() {
        return this.productSource;
    }

    public void setProductSource(String productSource) {
        this.productSource = productSource;
    }

    /**
     * 餐食
     */
    public String getMealType() {
        return this.mealType;
    }

    public void setMealType(String mealType) {
        this.mealType = mealType;
    }

    /**
     * 准点率
     */
    public float getPunctuality() {
        return this.punctuality;
    }

    public void setPunctuality(float punctuality) {
        this.punctuality = punctuality;
    }

    /**
     * 主舱
     */
    public GaCabinClassType getClazz() {
        return this.clazz;
    }

    public void setClazz(GaCabinClassType clazz) {
        this.clazz = clazz;
    }

    /**
     * 子舱
     */
    public String getBookingClass() {
        return this.bookingClass;
    }

    public void setBookingClass(String bookingClass) {
        this.bookingClass = bookingClass;
    }

    /**
     * 扣率
     */
    public BigDecimal getRate() {
        return this.rate;
    }

    public void setRate(BigDecimal rate) {
        this.rate = rate;
    }

    /**
     * 跨天数
     */
    public int getArrivalDays() {
        return this.arrivalDays;
    }

    public void setArrivalDays(int arrivalDays) {
        this.arrivalDays = arrivalDays;
    }

    /**
     * 航班号
     */
    public String getFligntNo() {
        return this.fligntNo;
    }

    public void setFligntNo(String fligntNo) {
        this.fligntNo = fligntNo;
    }

    /**
     * 实际承运航空公司
     */
    public AirLineInfo getShareAirLine() {
        return this.shareAirLine;
    }

    public void setShareAirLine(AirLineInfo shareAirLine) {
        this.shareAirLine = shareAirLine;
    }

    /**
     * 共享航班号
     */
    public String getShareFlightNO() {
        return this.shareFlightNO;
    }

    public void setShareFlightNO(String shareFlightNO) {
        this.shareFlightNO = shareFlightNO;
    }

    /**
     * 航司联盟
     */
    public String getAlliance() {
        return this.alliance;
    }

    public void setAlliance(String alliance) {
        this.alliance = alliance;
    }

    /**
     * 航空公司
     */
    public AirLineInfo getAirLine() {
        return this.airLine;
    }

    public void setAirLine(AirLineInfo airLine) {
        this.airLine = airLine;
    }

    /**
     * 机型
     */
    public String getCraftType() {
        return this.craftType;
    }

    public void setCraftType(String craftType) {
        this.craftType = craftType;
    }

    /**
     * 机型实体
     */
    public CraftTypeInfo getCraftTypeInfo() {
        return this.craftTypeInfo;
    }

    public void setCraftTypeInfo(CraftTypeInfo craftTypeInfo) {
        this.craftTypeInfo = craftTypeInfo;
    }

    /**
     * 出发时间
     */
    public long getDDate() {
        return this.dDate;
    }

    public void setDDate(long dDate) {
        this.dDate = dDate;
    }

    /**
     * 到达时间
     */
    public long getADate() {
        return this.aDate;
    }

    public void setADate(long aDate) {
        this.aDate = aDate;
    }

    /**
     * 出发城市
     */
    public CityInfo getDCity() {
        return this.dCity;
    }

    public void setDCity(CityInfo dCity) {
        this.dCity = dCity;
    }

    /**
     * 到达城市
     */
    public CityInfo getACity() {
        return this.aCity;
    }

    public void setACity(CityInfo aCity) {
        this.aCity = aCity;
    }

    /**
     * 出发机场
     */
    public AirPortInfo getDPort() {
        return this.dPort;
    }

    public void setDPort(AirPortInfo dPort) {
        this.dPort = dPort;
    }

    /**
     * 到达机场
     */
    public AirPortInfo getAPort() {
        return this.aPort;
    }

    public void setAPort(AirPortInfo aPort) {
        this.aPort = aPort;
    }

    /**
     * 出发航站楼
     */
    public TerminalInfo getDTerminal() {
        return this.dTerminal;
    }

    public void setDTerminal(TerminalInfo dTerminal) {
        this.dTerminal = dTerminal;
    }

    /**
     * 到达航站楼
     */
    public TerminalInfo getATerminal() {
        return this.aTerminal;
    }

    public void setATerminal(TerminalInfo aTerminal) {
        this.aTerminal = aTerminal;
    }

    /**
     * 飞行总时间/分钟
     */
    public int getDuration() {
        return this.duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    /**
     * 飞行小时/总时间换算
     */
    public int getHour() {
        return this.hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    /**
     * 飞行除去小时后剩余分钟数
     */
    public int getMin() {
        return this.min;
    }

    public void setMin(int min) {
        this.min = min;
    }

    /**
     * 中转停留时间
     */
    public String getStopDurationStr() {
        return this.stopDurationStr;
    }

    public void setStopDurationStr(String stopDurationStr) {
        this.stopDurationStr = stopDurationStr;
    }

    /**
     * 不同机场中转提示
     */
    public String getDifferentAirportPoint() {
        return this.differentAirportPoint;
    }

    public void setDifferentAirportPoint(String differentAirportPoint) {
        this.differentAirportPoint = differentAirportPoint;
    }

    /**
     * 实际承运航班提示
     */
    public String getShareAirLinePoint() {
        return this.shareAirLinePoint;
    }

    public void setShareAirLinePoint(String shareAirLinePoint) {
        this.shareAirLinePoint = shareAirLinePoint;
    }

    /**
     * 航班经停信息
     */
    public List<FlightStopInfo> getFlightStopInfo() {
        return this.flightStopInfo;
    }

    public void setFlightStopInfo(List<FlightStopInfo> flightStopInfo) {
        this.flightStopInfo = flightStopInfo;
    }

    /**
     * 航班是否有机舱图
     */
    public boolean getHasFlightPicInfo() {
        return this.hasFlightPicInfo;
    }

    public void setHasFlightPicInfo(boolean hasFlightPicInfo) {
        this.hasFlightPicInfo = hasFlightPicInfo;
    }

    /**
     * 中转停留时间 单位分钟
     */
    public int getStopDuration() {
        return this.stopDuration;
    }

    public void setStopDuration(int stopDuration) {
        this.stopDuration = stopDuration;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;

        final ColunmInfo other = (ColunmInfo)obj;
        return
            Objects.equal(this.segNo, other.segNo) && 
            Objects.equal(this.productSource, other.productSource) && 
            Objects.equal(this.mealType, other.mealType) && 
            Objects.equal(this.punctuality, other.punctuality) && 
            Objects.equal(this.clazz, other.clazz) && 
            Objects.equal(this.bookingClass, other.bookingClass) && 
            Objects.equal(this.rate, other.rate) && 
            Objects.equal(this.arrivalDays, other.arrivalDays) && 
            Objects.equal(this.fligntNo, other.fligntNo) && 
            Objects.equal(this.shareAirLine, other.shareAirLine) && 
            Objects.equal(this.shareFlightNO, other.shareFlightNO) && 
            Objects.equal(this.alliance, other.alliance) && 
            Objects.equal(this.airLine, other.airLine) && 
            Objects.equal(this.craftType, other.craftType) && 
            Objects.equal(this.craftTypeInfo, other.craftTypeInfo) && 
            Objects.equal(this.dDate, other.dDate) && 
            Objects.equal(this.aDate, other.aDate) && 
            Objects.equal(this.dCity, other.dCity) && 
            Objects.equal(this.aCity, other.aCity) && 
            Objects.equal(this.dPort, other.dPort) && 
            Objects.equal(this.aPort, other.aPort) && 
            Objects.equal(this.dTerminal, other.dTerminal) && 
            Objects.equal(this.aTerminal, other.aTerminal) && 
            Objects.equal(this.duration, other.duration) && 
            Objects.equal(this.hour, other.hour) && 
            Objects.equal(this.min, other.min) && 
            Objects.equal(this.stopDurationStr, other.stopDurationStr) && 
            Objects.equal(this.differentAirportPoint, other.differentAirportPoint) && 
            Objects.equal(this.shareAirLinePoint, other.shareAirLinePoint) && 
            Objects.equal(this.flightStopInfo, other.flightStopInfo) && 
            Objects.equal(this.hasFlightPicInfo, other.hasFlightPicInfo) && 
            Objects.equal(this.stopDuration, other.stopDuration);
    }

    @Override
    public int hashCode() {
        int result = 1;

        result = 31 * result + Objects.hashCode(this.segNo);
        result = 31 * result + Objects.hashCode(this.productSource);
        result = 31 * result + Objects.hashCode(this.mealType);
        result = 31 * result + Objects.hashCode(this.punctuality);
        result = 31 * result + Objects.hashCode(this.clazz);
        result = 31 * result + Objects.hashCode(this.bookingClass);
        result = 31 * result + Objects.hashCode(this.rate);
        result = 31 * result + Objects.hashCode(this.arrivalDays);
        result = 31 * result + Objects.hashCode(this.fligntNo);
        result = 31 * result + Objects.hashCode(this.shareAirLine);
        result = 31 * result + Objects.hashCode(this.shareFlightNO);
        result = 31 * result + Objects.hashCode(this.alliance);
        result = 31 * result + Objects.hashCode(this.airLine);
        result = 31 * result + Objects.hashCode(this.craftType);
        result = 31 * result + Objects.hashCode(this.craftTypeInfo);
        result = 31 * result + Objects.hashCode(this.dDate);
        result = 31 * result + Objects.hashCode(this.aDate);
        result = 31 * result + Objects.hashCode(this.dCity);
        result = 31 * result + Objects.hashCode(this.aCity);
        result = 31 * result + Objects.hashCode(this.dPort);
        result = 31 * result + Objects.hashCode(this.aPort);
        result = 31 * result + Objects.hashCode(this.dTerminal);
        result = 31 * result + Objects.hashCode(this.aTerminal);
        result = 31 * result + Objects.hashCode(this.duration);
        result = 31 * result + Objects.hashCode(this.hour);
        result = 31 * result + Objects.hashCode(this.min);
        result = 31 * result + Objects.hashCode(this.stopDurationStr);
        result = 31 * result + Objects.hashCode(this.differentAirportPoint);
        result = 31 * result + Objects.hashCode(this.shareAirLinePoint);
        result = 31 * result + Objects.hashCode(this.flightStopInfo);
        result = 31 * result + Objects.hashCode(this.hasFlightPicInfo);
        result = 31 * result + Objects.hashCode(this.stopDuration);

        return result;
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
            .add("segNo", segNo)
            .add("productSource", productSource)
            .add("mealType", mealType)
            .add("punctuality", punctuality)
            .add("clazz", clazz)
            .add("bookingClass", bookingClass)
            .add("rate", rate)
            .add("arrivalDays", arrivalDays)
            .add("fligntNo", fligntNo)
            .add("shareAirLine", shareAirLine)
            .add("shareFlightNO", shareFlightNO)
            .add("alliance", alliance)
            .add("airLine", airLine)
            .add("craftType", craftType)
            .add("craftTypeInfo", craftTypeInfo)
            .add("dDate", dDate)
            .add("aDate", aDate)
            .add("dCity", dCity)
            .add("aCity", aCity)
            .add("dPort", dPort)
            .add("aPort", aPort)
            .add("dTerminal", dTerminal)
            .add("aTerminal", aTerminal)
            .add("duration", duration)
            .add("hour", hour)
            .add("min", min)
            .add("stopDurationStr", stopDurationStr)
            .add("differentAirportPoint", differentAirportPoint)
            .add("shareAirLinePoint", shareAirLinePoint)
            .add("flightStopInfo", flightStopInfo)
            .add("hasFlightPicInfo", hasFlightPicInfo)
            .add("stopDuration", stopDuration)
            .toString();
    }
}