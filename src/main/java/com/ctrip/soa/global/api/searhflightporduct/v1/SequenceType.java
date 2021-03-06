// Generated by eBay Common SDK Platform
package com.ctrip.soa.global.api.searhflightporduct.v1;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnumValue;

/**
 * 排序类型
 */
@XmlType(name = "SequenceType")
@XmlEnum
@SuppressWarnings("all")
public enum SequenceType {

    /**
     * 直飞+价格（默认推荐排序，先按是否直飞排序，再按价格排序）
     */
    @XmlEnumValue("Price")
    Price(0, "Price"),

    /**
     * 价格（只按价格排序）
     */
    @XmlEnumValue("NewPrice")
    NewPrice(1, "NewPrice"),

    /**
     * 出发时间（只按出发时间排序）
     */
    @XmlEnumValue("Departure")
    Departure(2, "Departure"),

    /**
     * 到达时间（只按到达时间排序）
     */
    @XmlEnumValue("Arrival")
    Arrival(3, "Arrival"),

    /**
     * 飞行总时长（只按飞行总时长排序）
     */
    @XmlEnumValue("Duration")
    Duration(4, "Duration");

    private final int intValue;
    private final String value;

    SequenceType(int intValue, String value) {
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
    public static SequenceType fromValue(String v) {
        for (SequenceType e: SequenceType.values()) {
            if (e.value.equals(v)) {
                return e;
            }
        }
        throw new IllegalArgumentException(v);
    }

    public static SequenceType findByValue(int value) {
        switch (value) {
            case 0:
                return Price;
            case 1:
                return NewPrice;
            case 2:
                return Departure;
            case 3:
                return Arrival;
            case 4:
                return Duration;
            default:
                return null;
        }
    }
}