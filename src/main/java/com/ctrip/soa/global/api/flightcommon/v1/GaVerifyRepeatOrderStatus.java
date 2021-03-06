// Generated by eBay Common SDK Platform
package com.ctrip.soa.global.api.flightcommon.v1;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnumValue;

/**
 * 重复订单接口状态
 */
@XmlType(name = "GaVerifyRepeatOrderStatus")
@XmlEnum
@SuppressWarnings("all")
public enum GaVerifyRepeatOrderStatus {

    /**
     * 有重复订单
     */
    @XmlEnumValue("HasRepeatOrder")
    HasRepeatOrder(0, "HasRepeatOrder"),

    /**
     * 无重复订单
     */
    @XmlEnumValue("NoRepeatOrder")
    NoRepeatOrder(1, "NoRepeatOrder"),

    /**
     * 调用出错
     */
    @XmlEnumValue("Fail")
    Fail(2, "Fail"),

    /**
     * 参数出错
     */
    @XmlEnumValue("ParameterError")
    ParameterError(3, "ParameterError");

    private final int intValue;
    private final String value;

    GaVerifyRepeatOrderStatus(int intValue, String value) {
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
    public static GaVerifyRepeatOrderStatus fromValue(String v) {
        for (GaVerifyRepeatOrderStatus e: GaVerifyRepeatOrderStatus.values()) {
            if (e.value.equals(v)) {
                return e;
            }
        }
        throw new IllegalArgumentException(v);
    }

    public static GaVerifyRepeatOrderStatus findByValue(int value) {
        switch (value) {
            case 0:
                return HasRepeatOrder;
            case 1:
                return NoRepeatOrder;
            case 2:
                return Fail;
            case 3:
                return ParameterError;
            default:
                return null;
        }
    }
}