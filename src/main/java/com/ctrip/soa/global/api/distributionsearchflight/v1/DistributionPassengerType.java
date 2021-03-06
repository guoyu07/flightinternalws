// Generated by eBay Common SDK Platform
package com.ctrip.soa.global.api.distributionsearchflight.v1;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnumValue;

/**
 * 乘客类型
 */
@XmlType(name = "DistributionPassengerType")
@XmlEnum
@SuppressWarnings("all")
public enum DistributionPassengerType {

    /**
     * 成人
     */
    @XmlEnumValue("ADT")
    ADT(0, "ADT"),

    /**
     * 儿童
     */
    @XmlEnumValue("CHD")
    CHD(1, "CHD"),

    /**
     * 婴儿
     */
    @XmlEnumValue("INF")
    INF(2, "INF");

    private final int intValue;
    private final String value;

    DistributionPassengerType(int intValue, String value) {
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
    public static DistributionPassengerType fromValue(String v) {
        for (DistributionPassengerType e: DistributionPassengerType.values()) {
            if (e.value.equals(v)) {
                return e;
            }
        }
        throw new IllegalArgumentException(v);
    }

    public static DistributionPassengerType findByValue(int value) {
        switch (value) {
            case 0:
                return ADT;
            case 1:
                return CHD;
            case 2:
                return INF;
            default:
                return null;
        }
    }
}