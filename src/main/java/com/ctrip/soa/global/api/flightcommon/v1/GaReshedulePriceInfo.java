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
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * 变价信息
 */
@DtoDoc("变价信息")
@JsonAutoDetect(getterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE)
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GaReshedulePriceInfo", propOrder = {
    "priceChanged",
    "rescheduleFeeDetailsInfo"
})
@SuppressWarnings("all")
public class GaReshedulePriceInfo  {

    private static final long serialVersionUID = 1L;

    public GaReshedulePriceInfo(
        boolean priceChanged, 
        GaRescheduleFeeDetailsInfo rescheduleFeeDetailsInfo) {
        this.priceChanged = priceChanged;
        this.rescheduleFeeDetailsInfo = rescheduleFeeDetailsInfo;
    }

    public GaReshedulePriceInfo() {
    }

    @FieldDoc("价格是否发生变化")
    @JsonProperty("PriceChanged")
    @XmlElement(name = "PriceChanged")
    private boolean priceChanged;

    @FieldDoc("改签费用明细信息")
    @JsonProperty("RescheduleFeeDetailsInfo")
    @XmlElement(name = "RescheduleFeeDetailsInfo")
    private GaRescheduleFeeDetailsInfo rescheduleFeeDetailsInfo;

    /**
     * 价格是否发生变化
     */
    public boolean getPriceChanged() {
        return this.priceChanged;
    }

    public void setPriceChanged(boolean priceChanged) {
        this.priceChanged = priceChanged;
    }

    /**
     * 改签费用明细信息
     */
    public GaRescheduleFeeDetailsInfo getRescheduleFeeDetailsInfo() {
        return this.rescheduleFeeDetailsInfo;
    }

    public void setRescheduleFeeDetailsInfo(GaRescheduleFeeDetailsInfo rescheduleFeeDetailsInfo) {
        this.rescheduleFeeDetailsInfo = rescheduleFeeDetailsInfo;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;

        final GaReshedulePriceInfo other = (GaReshedulePriceInfo)obj;
        return
            Objects.equal(this.priceChanged, other.priceChanged) && 
            Objects.equal(this.rescheduleFeeDetailsInfo, other.rescheduleFeeDetailsInfo);
    }

    @Override
    public int hashCode() {
        int result = 1;

        result = 31 * result + Objects.hashCode(this.priceChanged);
        result = 31 * result + Objects.hashCode(this.rescheduleFeeDetailsInfo);

        return result;
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
            .add("priceChanged", priceChanged)
            .add("rescheduleFeeDetailsInfo", rescheduleFeeDetailsInfo)
            .toString();
    }
}