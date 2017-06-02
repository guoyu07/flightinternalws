// Generated by eBay Common SDK Platform
package com.ctrip.soa.global.api.flightcommon.v1;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnumValue;

/**
 * 支付方式
 */
@XmlType(name = "PayTypeNew")
@XmlEnum
@SuppressWarnings("all")
public enum PayTypeNew {

    /**
     * 未知
     */
    @XmlEnumValue("NA")
    NA(0, "NA"),

    /**
     * 现金
     */
    @XmlEnumValue("CASH")
    CASH(1, "CASH"),

    /**
     * 信用卡
     */
    @XmlEnumValue("CREDITCARD")
    CREDITCARD(2, "CREDITCARD"),

    /**
     * paypal
     */
    @XmlEnumValue("PAYPAL")
    PAYPAL(3, "PAYPAL"),

    /**
     * 借记卡
     */
    @XmlEnumValue("DEPOSITCARD")
    DEPOSITCARD(4, "DEPOSITCARD"),

    /**
     * 储蓄卡
     */
    @XmlEnumValue("DQPAY")
    DQPAY(5, "DQPAY"),

    /**
     * 银联在线
     */
    @XmlEnumValue("UNPay")
    UNPay(6, "UNPay"),

    /**
     * 微信
     */
    @XmlEnumValue("WSCAN")
    WSCAN(7, "WSCAN"),

    /**
     * 礼品卡
     */
    @XmlEnumValue("TMPay")
    TMPay(8, "TMPay"),

    /**
     * 财付通
     */
    @XmlEnumValue("TNPAY")
    TNPAY(9, "TNPAY");

    private final int intValue;
    private final String value;

    PayTypeNew(int intValue, String value) {
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
    public static PayTypeNew fromValue(String v) {
        for (PayTypeNew e: PayTypeNew.values()) {
            if (e.value.equals(v)) {
                return e;
            }
        }
        throw new IllegalArgumentException(v);
    }

    public static PayTypeNew findByValue(int value) {
        switch (value) {
            case 0:
                return NA;
            case 1:
                return CASH;
            case 2:
                return CREDITCARD;
            case 3:
                return PAYPAL;
            case 4:
                return DEPOSITCARD;
            case 5:
                return DQPAY;
            case 6:
                return UNPay;
            case 7:
                return WSCAN;
            case 8:
                return TMPay;
            case 9:
                return TNPAY;
            default:
                return null;
        }
    }
}