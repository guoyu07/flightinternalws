// Generated by eBay Common SDK Platform
package com.ctrip.soa.global.api.flightcommon.v1;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnumValue;

/**
 * 提交订单状态(国内国际通用)
 */
@XmlType(name = "GaSubmitOrderStatus")
@XmlEnum
@SuppressWarnings("all")
public enum GaSubmitOrderStatus {

    @XmlEnumValue("Success")
    Success(0, "Success"),

    @XmlEnumValue("RepeatSubmit")
    RepeatSubmit(1, "RepeatSubmit"),

    @XmlEnumValue("Fail")
    Fail(2, "Fail");

    private final int intValue;
    private final String value;

    GaSubmitOrderStatus(int intValue, String value) {
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
    public static GaSubmitOrderStatus fromValue(String v) {
        for (GaSubmitOrderStatus e: GaSubmitOrderStatus.values()) {
            if (e.value.equals(v)) {
                return e;
            }
        }
        throw new IllegalArgumentException(v);
    }

    public static GaSubmitOrderStatus findByValue(int value) {
        switch (value) {
            case 0:
                return Success;
            case 1:
                return RepeatSubmit;
            case 2:
                return Fail;
            default:
                return null;
        }
    }
}