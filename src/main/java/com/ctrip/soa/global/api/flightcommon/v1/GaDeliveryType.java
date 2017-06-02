// Generated by eBay Common SDK Platform
package com.ctrip.soa.global.api.flightcommon.v1;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnumValue;

/**
 * 配送类型
 */
@XmlType(name = "GaDeliveryType")
@XmlEnum
@SuppressWarnings("all")
public enum GaDeliveryType {

    /**
     * 不需要
     */
    @XmlEnumValue("PJN")
    PJN(0, "PJN"),

    /**
     * （国内代表快递，国际代表邮送）
     */
    @XmlEnumValue("PJS")
    PJS(1, "PJS"),

    /**
     * 国际使用，快递
     */
    @XmlEnumValue("EMS")
    EMS(2, "EMS"),

    /**
     * 通用机场自取
     */
    @XmlEnumValue("AIR")
    AIR(3, "AIR");

    private final int intValue;
    private final String value;

    GaDeliveryType(int intValue, String value) {
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
    public static GaDeliveryType fromValue(String v) {
        for (GaDeliveryType e: GaDeliveryType.values()) {
            if (e.value.equals(v)) {
                return e;
            }
        }
        throw new IllegalArgumentException(v);
    }

    public static GaDeliveryType findByValue(int value) {
        switch (value) {
            case 0:
                return PJN;
            case 1:
                return PJS;
            case 2:
                return EMS;
            case 3:
                return AIR;
            default:
                return null;
        }
    }
}