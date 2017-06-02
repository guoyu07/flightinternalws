// Generated by eBay Common SDK Platform
package com.ctrip.soa.global.api.flightcommon.v1;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnumValue;

/**
 * 查询方式
 */
@XmlType(name = "RangeSearchType")
@XmlEnum
@SuppressWarnings("all")
public enum RangeSearchType {

    /**
     * 国内
     */
    @XmlEnumValue("Inland")
    Inland(0, "Inland"),

    /**
     * 国际
     */
    @XmlEnumValue("Outland")
    Outland(1, "Outland"),

    /**
     * 全部
     */
    @XmlEnumValue("All")
    All(2, "All");

    private final int intValue;
    private final String value;

    RangeSearchType(int intValue, String value) {
        this.intValue = intValue;
        this.value = value;
    }

    public int getValue() {
        return intValue;
    }

    @JsonValue
    public String value() {
        return value;
    }

    @JsonCreator
    public static RangeSearchType fromValue(String v) {
        for (RangeSearchType e: RangeSearchType.values()) {
            if (e.value.equals(v)) {
                return e;
            }
        }
        throw new IllegalArgumentException(v);
    }

    public static RangeSearchType findByValue(int value) {
        switch (value) {
            case 0:
                return Inland;
            case 1:
                return Outland;
            case 2:
                return All;
            default:
                return null;
        }
    }
}