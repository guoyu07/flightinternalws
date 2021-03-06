/**
 * Autogenerated by soa-sdk-toolkit
 *
 * DO NOT EDIT DIRECTLY
 */
package com.ctrip.soa.global.api.gagetflightpicinfo.v1;

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

@JsonAutoDetect(getterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE)
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FlightPicInfoType", propOrder = {
    "flightNo",
    "picTitle",
    "picContent",
    "smallPicUrl",
    "largePicUrl",
    "cabinClass"
})
@SuppressWarnings("all")
public class FlightPicInfoType  {

    private static final long serialVersionUID = 1L;

    public FlightPicInfoType(
        String flightNo, 
        String picTitle, 
        String picContent, 
        String smallPicUrl, 
        String largePicUrl, 
        String cabinClass) {
        this.flightNo = flightNo;
        this.picTitle = picTitle;
        this.picContent = picContent;
        this.smallPicUrl = smallPicUrl;
        this.largePicUrl = largePicUrl;
        this.cabinClass = cabinClass;
    }

    public FlightPicInfoType() {
    }

    @FieldDoc("航班号")
    @JsonProperty("FlightNo")
    @XmlElement(name = "FlightNo")
    private String flightNo;

    @FieldDoc("图片标题")
    @JsonProperty("PicTitle")
    @XmlElement(name = "PicTitle")
    private String picTitle;

    @FieldDoc("图片内容")
    @JsonProperty("PicContent")
    @XmlElement(name = "PicContent")
    private String picContent;

    @FieldDoc("小图片URL")
    @JsonProperty("SmallPicUrl")
    @XmlElement(name = "SmallPicUrl")
    private String smallPicUrl;

    @FieldDoc("大图片URL")
    @JsonProperty("LargePicUrl")
    @XmlElement(name = "LargePicUrl")
    private String largePicUrl;

    @FieldDoc("舱等")
    @JsonProperty("CabinClass")
    @XmlElement(name = "CabinClass")
    private String cabinClass;

    /**
     * 航班号
     */
    public String getFlightNo() {
        return this.flightNo;
    }

    public void setFlightNo(String flightNo) {
        this.flightNo = flightNo;
    }

    /**
     * 图片标题
     */
    public String getPicTitle() {
        return this.picTitle;
    }

    public void setPicTitle(String picTitle) {
        this.picTitle = picTitle;
    }

    /**
     * 图片内容
     */
    public String getPicContent() {
        return this.picContent;
    }

    public void setPicContent(String picContent) {
        this.picContent = picContent;
    }

    /**
     * 小图片URL
     */
    public String getSmallPicUrl() {
        return this.smallPicUrl;
    }

    public void setSmallPicUrl(String smallPicUrl) {
        this.smallPicUrl = smallPicUrl;
    }

    /**
     * 大图片URL
     */
    public String getLargePicUrl() {
        return this.largePicUrl;
    }

    public void setLargePicUrl(String largePicUrl) {
        this.largePicUrl = largePicUrl;
    }

    /**
     * 舱等
     */
    public String getCabinClass() {
        return this.cabinClass;
    }

    public void setCabinClass(String cabinClass) {
        this.cabinClass = cabinClass;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;

        final FlightPicInfoType other = (FlightPicInfoType)obj;
        return
            Objects.equal(this.flightNo, other.flightNo) && 
            Objects.equal(this.picTitle, other.picTitle) && 
            Objects.equal(this.picContent, other.picContent) && 
            Objects.equal(this.smallPicUrl, other.smallPicUrl) && 
            Objects.equal(this.largePicUrl, other.largePicUrl) && 
            Objects.equal(this.cabinClass, other.cabinClass);
    }

    @Override
    public int hashCode() {
        int result = 1;

        result = 31 * result + Objects.hashCode(this.flightNo);
        result = 31 * result + Objects.hashCode(this.picTitle);
        result = 31 * result + Objects.hashCode(this.picContent);
        result = 31 * result + Objects.hashCode(this.smallPicUrl);
        result = 31 * result + Objects.hashCode(this.largePicUrl);
        result = 31 * result + Objects.hashCode(this.cabinClass);

        return result;
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
            .add("flightNo", flightNo)
            .add("picTitle", picTitle)
            .add("picContent", picContent)
            .add("smallPicUrl", smallPicUrl)
            .add("largePicUrl", largePicUrl)
            .add("cabinClass", cabinClass)
            .toString();
    }
}