/**
 * Autogenerated by soa-sdk-toolkit
 *
 * DO NOT EDIT DIRECTLY
 */
package com.ctrip.soa.global.api.flightcommon.v1;

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

@JsonAutoDetect(getterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE)
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ThirdPartyDeliveryInfo", propOrder = {
    "infoID",
    "uid",
    "address",
    "cantonID",
    "cantonName",
    "cityID",
    "cityName",
    "postCode",
    "provinceName",
    "provinceID",
    "receiverName",
    "updateTime",
    "title",
    "mobilePhone",
    "spendFee",
    "mailingType",
    "mailingPayType"
})
@SuppressWarnings("all")
public class ThirdPartyDeliveryInfo  {

    private static final long serialVersionUID = 1L;

    public ThirdPartyDeliveryInfo(
        int infoID, 
        String uid, 
        String address, 
        int cantonID, 
        String cantonName, 
        int cityID, 
        String cityName, 
        String postCode, 
        String provinceName, 
        int provinceID, 
        String receiverName, 
        Calendar updateTime, 
        String title, 
        String mobilePhone, 
        int spendFee, 
        GaMailingType mailingType, 
        GaMailingPayType mailingPayType) {
        this.infoID = infoID;
        this.uid = uid;
        this.address = address;
        this.cantonID = cantonID;
        this.cantonName = cantonName;
        this.cityID = cityID;
        this.cityName = cityName;
        this.postCode = postCode;
        this.provinceName = provinceName;
        this.provinceID = provinceID;
        this.receiverName = receiverName;
        this.updateTime = updateTime;
        this.title = title;
        this.mobilePhone = mobilePhone;
        this.spendFee = spendFee;
        this.mailingType = mailingType;
        this.mailingPayType = mailingPayType;
    }

    public ThirdPartyDeliveryInfo() {
    }

    @FieldDoc("InfoID")
    @JsonProperty("InfoID")
    @XmlElement(name = "InfoID")
    private int infoID;

    @JsonProperty("UID")
    @XmlElement(name = "UID")
    private String uid;

    @FieldDoc("配送地址")
    @JsonProperty("Address")
    @XmlElement(name = "Address")
    private String address;

    @FieldDoc("区ID")
    @JsonProperty("CantonID")
    @XmlElement(name = "CantonID")
    private int cantonID;

    @FieldDoc("区")
    @JsonProperty("CantonName")
    @XmlElement(name = "CantonName")
    private String cantonName;

    @FieldDoc("城市ID")
    @JsonProperty("CityID")
    @XmlElement(name = "CityID")
    private int cityID;

    @FieldDoc("城市名称")
    @JsonProperty("CityName")
    @XmlElement(name = "CityName")
    private String cityName;

    @FieldDoc("邮编")
    @JsonProperty("PostCode")
    @XmlElement(name = "PostCode")
    private String postCode;

    @FieldDoc("省名称")
    @JsonProperty("ProvinceName")
    @XmlElement(name = "ProvinceName")
    private String provinceName;

    @FieldDoc("省ID")
    @JsonProperty("ProvinceID")
    @XmlElement(name = "ProvinceID")
    private int provinceID;

    @FieldDoc("收件人")
    @JsonProperty("ReceiverName")
    @XmlElement(name = "ReceiverName")
    private String receiverName;

    @FieldDoc("修改事件")
    @JsonProperty("UpdateTime")
    @XmlElement(name = "UpdateTime")
    private Calendar updateTime;

    @FieldDoc("发票抬头")
    @JsonProperty("Title")
    @XmlElement(name = "Title")
    private String title;

    @FieldDoc("联系手机号")
    @JsonProperty("MobilePhone")
    @XmlElement(name = "MobilePhone")
    private String mobilePhone;

    @FieldDoc("配送费(钱或者积分)")
    @JsonProperty("SpendFee")
    @XmlElement(name = "SpendFee")
    private int spendFee;

    @FieldDoc("配送类型")
    @JsonProperty("MailingType")
    @XmlElement(name = "MailingType")
    private GaMailingType mailingType;

    @FieldDoc("配送费类型(扣钱Or扣积分)")
    @JsonProperty("MailingPayType")
    @XmlElement(name = "MailingPayType")
    private GaMailingPayType mailingPayType;

    /**
     * InfoID
     */
    public int getInfoID() {
        return this.infoID;
    }

    public void setInfoID(int infoID) {
        this.infoID = infoID;
    }

    public String getUid() {
        return this.uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    /**
     * 配送地址
     */
    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * 区ID
     */
    public int getCantonID() {
        return this.cantonID;
    }

    public void setCantonID(int cantonID) {
        this.cantonID = cantonID;
    }

    /**
     * 区
     */
    public String getCantonName() {
        return this.cantonName;
    }

    public void setCantonName(String cantonName) {
        this.cantonName = cantonName;
    }

    /**
     * 城市ID
     */
    public int getCityID() {
        return this.cityID;
    }

    public void setCityID(int cityID) {
        this.cityID = cityID;
    }

    /**
     * 城市名称
     */
    public String getCityName() {
        return this.cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    /**
     * 邮编
     */
    public String getPostCode() {
        return this.postCode;
    }

    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }

    /**
     * 省名称
     */
    public String getProvinceName() {
        return this.provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    /**
     * 省ID
     */
    public int getProvinceID() {
        return this.provinceID;
    }

    public void setProvinceID(int provinceID) {
        this.provinceID = provinceID;
    }

    /**
     * 收件人
     */
    public String getReceiverName() {
        return this.receiverName;
    }

    public void setReceiverName(String receiverName) {
        this.receiverName = receiverName;
    }

    /**
     * 修改事件
     */
    public Calendar getUpdateTime() {
        return this.updateTime;
    }

    public void setUpdateTime(Calendar updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * 发票抬头
     */
    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * 联系手机号
     */
    public String getMobilePhone() {
        return this.mobilePhone;
    }

    public void setMobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone;
    }

    /**
     * 配送费(钱或者积分)
     */
    public int getSpendFee() {
        return this.spendFee;
    }

    public void setSpendFee(int spendFee) {
        this.spendFee = spendFee;
    }

    /**
     * 配送类型
     */
    public GaMailingType getMailingType() {
        return this.mailingType;
    }

    public void setMailingType(GaMailingType mailingType) {
        this.mailingType = mailingType;
    }

    /**
     * 配送费类型(扣钱Or扣积分)
     */
    public GaMailingPayType getMailingPayType() {
        return this.mailingPayType;
    }

    public void setMailingPayType(GaMailingPayType mailingPayType) {
        this.mailingPayType = mailingPayType;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;

        final ThirdPartyDeliveryInfo other = (ThirdPartyDeliveryInfo)obj;
        return
            Objects.equal(this.infoID, other.infoID) && 
            Objects.equal(this.uid, other.uid) && 
            Objects.equal(this.address, other.address) && 
            Objects.equal(this.cantonID, other.cantonID) && 
            Objects.equal(this.cantonName, other.cantonName) && 
            Objects.equal(this.cityID, other.cityID) && 
            Objects.equal(this.cityName, other.cityName) && 
            Objects.equal(this.postCode, other.postCode) && 
            Objects.equal(this.provinceName, other.provinceName) && 
            Objects.equal(this.provinceID, other.provinceID) && 
            Objects.equal(this.receiverName, other.receiverName) && 
            Objects.equal(this.updateTime, other.updateTime) && 
            Objects.equal(this.title, other.title) && 
            Objects.equal(this.mobilePhone, other.mobilePhone) && 
            Objects.equal(this.spendFee, other.spendFee) && 
            Objects.equal(this.mailingType, other.mailingType) && 
            Objects.equal(this.mailingPayType, other.mailingPayType);
    }

    @Override
    public int hashCode() {
        int result = 1;

        result = 31 * result + Objects.hashCode(this.infoID);
        result = 31 * result + Objects.hashCode(this.uid);
        result = 31 * result + Objects.hashCode(this.address);
        result = 31 * result + Objects.hashCode(this.cantonID);
        result = 31 * result + Objects.hashCode(this.cantonName);
        result = 31 * result + Objects.hashCode(this.cityID);
        result = 31 * result + Objects.hashCode(this.cityName);
        result = 31 * result + Objects.hashCode(this.postCode);
        result = 31 * result + Objects.hashCode(this.provinceName);
        result = 31 * result + Objects.hashCode(this.provinceID);
        result = 31 * result + Objects.hashCode(this.receiverName);
        result = 31 * result + Objects.hashCode(this.updateTime);
        result = 31 * result + Objects.hashCode(this.title);
        result = 31 * result + Objects.hashCode(this.mobilePhone);
        result = 31 * result + Objects.hashCode(this.spendFee);
        result = 31 * result + Objects.hashCode(this.mailingType);
        result = 31 * result + Objects.hashCode(this.mailingPayType);

        return result;
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
            .add("infoID", infoID)
            .add("uid", uid)
            .add("address", address)
            .add("cantonID", cantonID)
            .add("cantonName", cantonName)
            .add("cityID", cityID)
            .add("cityName", cityName)
            .add("postCode", postCode)
            .add("provinceName", provinceName)
            .add("provinceID", provinceID)
            .add("receiverName", receiverName)
            .add("updateTime", updateTime)
            .add("title", title)
            .add("mobilePhone", mobilePhone)
            .add("spendFee", spendFee)
            .add("mailingType", mailingType)
            .add("mailingPayType", mailingPayType)
            .toString();
    }
}