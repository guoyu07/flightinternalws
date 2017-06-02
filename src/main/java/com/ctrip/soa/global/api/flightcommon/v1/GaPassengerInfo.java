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
import java.util.Calendar;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * 乘机人信息
 */
@DtoDoc("乘机人信息")
@JsonAutoDetect(getterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE)
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GaPassengerInfo", propOrder = {
    "passengerInfoID",
    "ticketType",
    "nameCN",
    "name",
    "firstName",
    "middleName",
    "lastName",
    "birthDay",
    "idNo",
    "ageType",
    "idType",
    "idName",
    "gender",
    "genderCode",
    "nationalityCode",
    "nationalityName",
    "idLimit",
    "airLineCardList",
    "insuranceList",
    "gaTravelerEligibilityCodeType"
})
@SuppressWarnings("all")
public class GaPassengerInfo  {

    private static final long serialVersionUID = 1L;

    public GaPassengerInfo(
        int passengerInfoID, 
        GaPassengerType ticketType, 
        String nameCN, 
        String name, 
        String firstName, 
        String middleName, 
        String lastName, 
        Calendar birthDay, 
        String idNo, 
        GaPassengerType ageType, 
        GaIDCardType idType, 
        String idName, 
        String gender, 
        String genderCode, 
        String nationalityCode, 
        String nationalityName, 
        Calendar idLimit, 
        List<AirlineCardType> airLineCardList, 
        List<GaSimpleInsurance> insuranceList, 
        GaTravelerEligibilityCodeType gaTravelerEligibilityCodeType) {
        this.passengerInfoID = passengerInfoID;
        this.ticketType = ticketType;
        this.nameCN = nameCN;
        this.name = name;
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.birthDay = birthDay;
        this.idNo = idNo;
        this.ageType = ageType;
        this.idType = idType;
        this.idName = idName;
        this.gender = gender;
        this.genderCode = genderCode;
        this.nationalityCode = nationalityCode;
        this.nationalityName = nationalityName;
        this.idLimit = idLimit;
        this.airLineCardList = airLineCardList;
        this.insuranceList = insuranceList;
        this.gaTravelerEligibilityCodeType = gaTravelerEligibilityCodeType;
    }

    public GaPassengerInfo() {
    }

    @FieldDoc("乘机人ID")
    @JsonProperty("PassengerInfoID")
    @XmlElement(name = "PassengerInfoID")
    private int passengerInfoID;

    @FieldDoc("票类型")
    @JsonProperty("TicketType")
    @XmlElement(name = "TicketType")
    private GaPassengerType ticketType;

    @FieldDoc("乘机人中文名")
    @JsonProperty("NameCN")
    @XmlElement(name = "NameCN")
    private String nameCN;

    @FieldDoc("last/first 全名")
    @JsonProperty("Name")
    @XmlElement(name = "Name")
    private String name;

    @FieldDoc("名")
    @JsonProperty("FirstName")
    @XmlElement(name = "FirstName")
    private String firstName;

    @FieldDoc("中间名")
    @JsonProperty("MiddleName")
    @XmlElement(name = "MiddleName")
    private String middleName;

    @FieldDoc("姓")
    @JsonProperty("LastName")
    @XmlElement(name = "LastName")
    private String lastName;

    @FieldDoc("生日")
    @JsonProperty("BirthDay")
    @XmlElement(name = "BirthDay")
    private Calendar birthDay;

    @FieldDoc("证件号")
    @JsonProperty("IDNo")
    @XmlElement(name = "IDNo")
    private String idNo;

    @FieldDoc("年龄类型")
    @JsonProperty("AgeType")
    @XmlElement(name = "AgeType")
    private GaPassengerType ageType;

    @FieldDoc("证件类型")
    @JsonProperty("IDType")
    @XmlElement(name = "IDType")
    private GaIDCardType idType;

    @FieldDoc("证件名")
    @JsonProperty("IDName")
    @XmlElement(name = "IDName")
    private String idName;

    @FieldDoc("性别")
    @JsonProperty("Gender")
    @XmlElement(name = "Gender")
    private String gender;

    @FieldDoc("性别Code  F,M,U")
    @JsonProperty("GenderCode")
    @XmlElement(name = "GenderCode")
    private String genderCode;

    @FieldDoc("国籍代码")
    @JsonProperty("NationalityCode")
    @XmlElement(name = "NationalityCode")
    private String nationalityCode;

    @FieldDoc("国籍名称")
    @JsonProperty("NationalityName")
    @XmlElement(name = "NationalityName")
    private String nationalityName;

    @FieldDoc("证件有效期")
    @JsonProperty("IDLimit")
    @XmlElement(name = "IDLimit")
    private Calendar idLimit;

    @FieldDoc("常旅卡信息列表")
    @JsonProperty("AirLineCardList")
    @XmlElement(name = "AirLineCardList")
    private List<AirlineCardType> airLineCardList;

    @FieldDoc("旅客购买的保险信息")
    @JsonProperty("InsuranceList")
    @XmlElement(name = "InsuranceList")
    private List<GaSimpleInsurance> insuranceList;

    @FieldDoc("乘客资质")
    @JsonProperty("GaTravelerEligibilityCodeType")
    @XmlElement(name = "GaTravelerEligibilityCodeType")
    private GaTravelerEligibilityCodeType gaTravelerEligibilityCodeType;

    /**
     * 乘机人ID
     */
    public int getPassengerInfoID() {
        return this.passengerInfoID;
    }

    public void setPassengerInfoID(int passengerInfoID) {
        this.passengerInfoID = passengerInfoID;
    }

    /**
     * 票类型
     */
    public GaPassengerType getTicketType() {
        return this.ticketType;
    }

    public void setTicketType(GaPassengerType ticketType) {
        this.ticketType = ticketType;
    }

    /**
     * 乘机人中文名
     */
    public String getNameCN() {
        return this.nameCN;
    }

    public void setNameCN(String nameCN) {
        this.nameCN = nameCN;
    }

    /**
     * last/first 全名
     */
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
     * 名
     */
    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * 中间名
     */
    public String getMiddleName() {
        return this.middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    /**
     * 姓
     */
    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * 生日
     */
    public Calendar getBirthDay() {
        return this.birthDay;
    }

    public void setBirthDay(Calendar birthDay) {
        this.birthDay = birthDay;
    }

    /**
     * 证件号
     */
    public String getIdNo() {
        return this.idNo;
    }

    public void setIdNo(String idNo) {
        this.idNo = idNo;
    }

    /**
     * 年龄类型
     */
    public GaPassengerType getAgeType() {
        return this.ageType;
    }

    public void setAgeType(GaPassengerType ageType) {
        this.ageType = ageType;
    }

    /**
     * 证件类型
     */
    public GaIDCardType getIdType() {
        return this.idType;
    }

    public void setIdType(GaIDCardType idType) {
        this.idType = idType;
    }

    /**
     * 证件名
     */
    public String getIdName() {
        return this.idName;
    }

    public void setIdName(String idName) {
        this.idName = idName;
    }

    /**
     * 性别
     */
    public String getGender() {
        return this.gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    /**
     * 性别Code  F,M,U
     */
    public String getGenderCode() {
        return this.genderCode;
    }

    public void setGenderCode(String genderCode) {
        this.genderCode = genderCode;
    }

    /**
     * 国籍代码
     */
    public String getNationalityCode() {
        return this.nationalityCode;
    }

    public void setNationalityCode(String nationalityCode) {
        this.nationalityCode = nationalityCode;
    }

    /**
     * 国籍名称
     */
    public String getNationalityName() {
        return this.nationalityName;
    }

    public void setNationalityName(String nationalityName) {
        this.nationalityName = nationalityName;
    }

    /**
     * 证件有效期
     */
    public Calendar getIdLimit() {
        return this.idLimit;
    }

    public void setIdLimit(Calendar idLimit) {
        this.idLimit = idLimit;
    }

    /**
     * 常旅卡信息列表
     */
    public List<AirlineCardType> getAirLineCardList() {
        return this.airLineCardList;
    }

    public void setAirLineCardList(List<AirlineCardType> airLineCardList) {
        this.airLineCardList = airLineCardList;
    }

    /**
     * 旅客购买的保险信息
     */
    public List<GaSimpleInsurance> getInsuranceList() {
        return this.insuranceList;
    }

    public void setInsuranceList(List<GaSimpleInsurance> insuranceList) {
        this.insuranceList = insuranceList;
    }

    /**
     * 乘客资质
     */
    public GaTravelerEligibilityCodeType getGaTravelerEligibilityCodeType() {
        return this.gaTravelerEligibilityCodeType;
    }

    public void setGaTravelerEligibilityCodeType(GaTravelerEligibilityCodeType gaTravelerEligibilityCodeType) {
        this.gaTravelerEligibilityCodeType = gaTravelerEligibilityCodeType;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;

        final GaPassengerInfo other = (GaPassengerInfo)obj;
        return
            Objects.equal(this.passengerInfoID, other.passengerInfoID) && 
            Objects.equal(this.ticketType, other.ticketType) && 
            Objects.equal(this.nameCN, other.nameCN) && 
            Objects.equal(this.name, other.name) && 
            Objects.equal(this.firstName, other.firstName) && 
            Objects.equal(this.middleName, other.middleName) && 
            Objects.equal(this.lastName, other.lastName) && 
            Objects.equal(this.birthDay, other.birthDay) && 
            Objects.equal(this.idNo, other.idNo) && 
            Objects.equal(this.ageType, other.ageType) && 
            Objects.equal(this.idType, other.idType) && 
            Objects.equal(this.idName, other.idName) && 
            Objects.equal(this.gender, other.gender) && 
            Objects.equal(this.genderCode, other.genderCode) && 
            Objects.equal(this.nationalityCode, other.nationalityCode) && 
            Objects.equal(this.nationalityName, other.nationalityName) && 
            Objects.equal(this.idLimit, other.idLimit) && 
            Objects.equal(this.airLineCardList, other.airLineCardList) && 
            Objects.equal(this.insuranceList, other.insuranceList) && 
            Objects.equal(this.gaTravelerEligibilityCodeType, other.gaTravelerEligibilityCodeType);
    }

    @Override
    public int hashCode() {
        int result = 1;

        result = 31 * result + Objects.hashCode(this.passengerInfoID);
        result = 31 * result + Objects.hashCode(this.ticketType);
        result = 31 * result + Objects.hashCode(this.nameCN);
        result = 31 * result + Objects.hashCode(this.name);
        result = 31 * result + Objects.hashCode(this.firstName);
        result = 31 * result + Objects.hashCode(this.middleName);
        result = 31 * result + Objects.hashCode(this.lastName);
        result = 31 * result + Objects.hashCode(this.birthDay);
        result = 31 * result + Objects.hashCode(this.idNo);
        result = 31 * result + Objects.hashCode(this.ageType);
        result = 31 * result + Objects.hashCode(this.idType);
        result = 31 * result + Objects.hashCode(this.idName);
        result = 31 * result + Objects.hashCode(this.gender);
        result = 31 * result + Objects.hashCode(this.genderCode);
        result = 31 * result + Objects.hashCode(this.nationalityCode);
        result = 31 * result + Objects.hashCode(this.nationalityName);
        result = 31 * result + Objects.hashCode(this.idLimit);
        result = 31 * result + Objects.hashCode(this.airLineCardList);
        result = 31 * result + Objects.hashCode(this.insuranceList);
        result = 31 * result + Objects.hashCode(this.gaTravelerEligibilityCodeType);

        return result;
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
            .add("passengerInfoID", passengerInfoID)
            .add("ticketType", ticketType)
            .add("nameCN", nameCN)
            .add("name", name)
            .add("firstName", firstName)
            .add("middleName", middleName)
            .add("lastName", lastName)
            .add("birthDay", birthDay)
            .add("idNo", idNo)
            .add("ageType", ageType)
            .add("idType", idType)
            .add("idName", idName)
            .add("gender", gender)
            .add("genderCode", genderCode)
            .add("nationalityCode", nationalityCode)
            .add("nationalityName", nationalityName)
            .add("idLimit", idLimit)
            .add("airLineCardList", airLineCardList)
            .add("insuranceList", insuranceList)
            .add("gaTravelerEligibilityCodeType", gaTravelerEligibilityCodeType)
            .toString();
    }
}