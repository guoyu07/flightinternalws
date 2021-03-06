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
@XmlType(name = "DateInfo", propOrder = {
    "week",
    "month",
    "year",
    "day",
    "formatDate"
})
@SuppressWarnings("all")
public class DateInfo  {

    private static final long serialVersionUID = 1L;

    public DateInfo(
        String week, 
        String month, 
        String year, 
        String day, 
        String formatDate) {
        this.week = week;
        this.month = month;
        this.year = year;
        this.day = day;
        this.formatDate = formatDate;
    }

    public DateInfo() {
    }

    @FieldDoc("星期多语言缩写")
    @JsonProperty("Week")
    @XmlElement(name = "Week")
    private String week;

    @FieldDoc("月份多语言")
    @JsonProperty("Month")
    @XmlElement(name = "Month")
    private String month;

    @FieldDoc("年份多语言")
    @JsonProperty("Year")
    @XmlElement(name = "Year")
    private String year;

    @FieldDoc("日 多语言")
    @JsonProperty("Day")
    @XmlElement(name = "Day")
    private String day;

    @FieldDoc("格式化日期")
    @JsonProperty("FormatDate")
    @XmlElement(name = "FormatDate")
    private String formatDate;

    /**
     * 星期多语言缩写
     */
    public String getWeek() {
        return this.week;
    }

    public void setWeek(String week) {
        this.week = week;
    }

    /**
     * 月份多语言
     */
    public String getMonth() {
        return this.month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    /**
     * 年份多语言
     */
    public String getYear() {
        return this.year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    /**
     * 日 多语言
     */
    public String getDay() {
        return this.day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    /**
     * 格式化日期
     */
    public String getFormatDate() {
        return this.formatDate;
    }

    public void setFormatDate(String formatDate) {
        this.formatDate = formatDate;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;

        final DateInfo other = (DateInfo)obj;
        return
            Objects.equal(this.week, other.week) && 
            Objects.equal(this.month, other.month) && 
            Objects.equal(this.year, other.year) && 
            Objects.equal(this.day, other.day) && 
            Objects.equal(this.formatDate, other.formatDate);
    }

    @Override
    public int hashCode() {
        int result = 1;

        result = 31 * result + Objects.hashCode(this.week);
        result = 31 * result + Objects.hashCode(this.month);
        result = 31 * result + Objects.hashCode(this.year);
        result = 31 * result + Objects.hashCode(this.day);
        result = 31 * result + Objects.hashCode(this.formatDate);

        return result;
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
            .add("week", week)
            .add("month", month)
            .add("year", year)
            .add("day", day)
            .add("formatDate", formatDate)
            .toString();
    }
}