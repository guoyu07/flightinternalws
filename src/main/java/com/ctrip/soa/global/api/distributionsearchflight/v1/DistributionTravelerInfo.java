/**
 * Autogenerated by soa-sdk-toolkit
 *
 * DO NOT EDIT DIRECTLY
 */
package com.ctrip.soa.global.api.distributionsearchflight.v1;

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
 * 乘客数量（人数）
 */
@DtoDoc("乘客数量（人数）")
@JsonAutoDetect(getterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE)
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DistributionTravelerInfo", propOrder = {
    "adult",
    "child",
    "infant",
    "travelerEligibilityCodeType"
})
@SuppressWarnings("all")
public class DistributionTravelerInfo  {

    private static final long serialVersionUID = 1L;

    public DistributionTravelerInfo(
        Integer adult, 
        Integer child, 
        Integer infant, 
        DistributionTravelerEligibilityCodeType travelerEligibilityCodeType) {
        this.adult = adult;
        this.child = child;
        this.infant = infant;
        this.travelerEligibilityCodeType = travelerEligibilityCodeType;
    }

    public DistributionTravelerInfo() {
    }

    @FieldDoc("成人人数")
    @JsonProperty("Adult")
    @XmlElement(name = "Adult", nillable = true)
    private Integer adult;

    @FieldDoc("儿童人数")
    @JsonProperty("Child")
    @XmlElement(name = "Child", nillable = true)
    private Integer child;

    @FieldDoc("婴儿人数")
    @JsonProperty("Infant")
    @XmlElement(name = "Infant", nillable = true)
    private Integer infant;

    @FieldDoc("乘客资质")
    @JsonProperty("TravelerEligibilityCodeType")
    @XmlElement(name = "TravelerEligibilityCodeType", nillable = true)
    private DistributionTravelerEligibilityCodeType travelerEligibilityCodeType;

    /**
     * 成人人数
     */
    public Integer getAdult() {
        return this.adult;
    }

    public void setAdult(Integer adult) {
        this.adult = adult;
    }

    /**
     * 儿童人数
     */
    public Integer getChild() {
        return this.child;
    }

    public void setChild(Integer child) {
        this.child = child;
    }

    /**
     * 婴儿人数
     */
    public Integer getInfant() {
        return this.infant;
    }

    public void setInfant(Integer infant) {
        this.infant = infant;
    }

    /**
     * 乘客资质
     */
    public DistributionTravelerEligibilityCodeType getTravelerEligibilityCodeType() {
        return this.travelerEligibilityCodeType;
    }

    public void setTravelerEligibilityCodeType(DistributionTravelerEligibilityCodeType travelerEligibilityCodeType) {
        this.travelerEligibilityCodeType = travelerEligibilityCodeType;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;

        final DistributionTravelerInfo other = (DistributionTravelerInfo)obj;
        return
            Objects.equal(this.adult, other.adult) && 
            Objects.equal(this.child, other.child) && 
            Objects.equal(this.infant, other.infant) && 
            Objects.equal(this.travelerEligibilityCodeType, other.travelerEligibilityCodeType);
    }

    @Override
    public int hashCode() {
        int result = 1;

        result = 31 * result + Objects.hashCode(this.adult);
        result = 31 * result + Objects.hashCode(this.child);
        result = 31 * result + Objects.hashCode(this.infant);
        result = 31 * result + Objects.hashCode(this.travelerEligibilityCodeType);

        return result;
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
            .add("adult", adult)
            .add("child", child)
            .add("infant", infant)
            .add("travelerEligibilityCodeType", travelerEligibilityCodeType)
            .toString();
    }
}