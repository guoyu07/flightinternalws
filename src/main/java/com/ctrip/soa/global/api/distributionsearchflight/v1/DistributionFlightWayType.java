// Generated by eBay Common SDK Platform
package com.ctrip.soa.global.api.distributionsearchflight.v1;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnumValue;

/**
 * 航程类型
 */
@XmlType(name = "DistributionFlightWayType")
@XmlEnum
@SuppressWarnings("all")
public enum DistributionFlightWayType {

    /**
     * 单程
     */
    @XmlEnumValue("OW")
    OW(0, "OW"),

    /**
     * 往返
     */
    @XmlEnumValue("RT")
    RT(1, "RT"),

    /**
     * 联程
     */
    @XmlEnumValue("MT")
    MT(2, "MT");

    private final int intValue;
    private final String value;

    DistributionFlightWayType(int intValue, String value) {
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
    public static DistributionFlightWayType fromValue(String v) {
        for (DistributionFlightWayType e: DistributionFlightWayType.values()) {
            if (e.value.equals(v)) {
                return e;
            }
        }
        throw new IllegalArgumentException(v);
    }

    public static DistributionFlightWayType findByValue(int value) {
        switch (value) {
            case 0:
                return OW;
            case 1:
                return RT;
            case 2:
                return MT;
            default:
                return null;
        }
    }
}