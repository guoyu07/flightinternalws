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
import java.util.Calendar;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * 请求航程参数
 */
@DtoDoc("请求航程参数")
@JsonAutoDetect(getterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE)
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DistributionSegmentParameterInfo", propOrder = {
    "dCityCode",
    "aCityCode",
    "dDate"
})
@SuppressWarnings("all")
public class DistributionSegmentParameterInfo  {

    private static final long serialVersionUID = 1L;

    public DistributionSegmentParameterInfo(
        String dCityCode, 
        String aCityCode, 
        Calendar dDate) {
        this.dCityCode = dCityCode;
        this.aCityCode = aCityCode;
        this.dDate = dDate;
    }

    public DistributionSegmentParameterInfo() {
    }

    @FieldDoc("出发城市")
    @JsonProperty("DCityCode")
    @XmlElement(name = "DCityCode")
    private String dCityCode;

    @FieldDoc("到达城市")
    @JsonProperty("ACityCode")
    @XmlElement(name = "ACityCode")
    private String aCityCode;

    @FieldDoc("出发日期")
    @JsonProperty("DDate")
    @XmlElement(name = "DDate")
    private Calendar dDate;

    /**
     * 出发城市
     */
    public String getDCityCode() {
        return this.dCityCode;
    }

    public void setDCityCode(String dCityCode) {
        this.dCityCode = dCityCode;
    }

    /**
     * 到达城市
     */
    public String getACityCode() {
        return this.aCityCode;
    }

    public void setACityCode(String aCityCode) {
        this.aCityCode = aCityCode;
    }

    /**
     * 出发日期
     */
    public Calendar getDDate() {
        return this.dDate;
    }

    public void setDDate(Calendar dDate) {
        this.dDate = dDate;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;

        final DistributionSegmentParameterInfo other = (DistributionSegmentParameterInfo)obj;
        return
            Objects.equal(this.dCityCode, other.dCityCode) && 
            Objects.equal(this.aCityCode, other.aCityCode) && 
            Objects.equal(this.dDate, other.dDate);
    }

    @Override
    public int hashCode() {
        int result = 1;

        result = 31 * result + Objects.hashCode(this.dCityCode);
        result = 31 * result + Objects.hashCode(this.aCityCode);
        result = 31 * result + Objects.hashCode(this.dDate);

        return result;
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
            .add("dCityCode", dCityCode)
            .add("aCityCode", aCityCode)
            .add("dDate", dDate)
            .toString();
    }
}