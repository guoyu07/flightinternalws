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
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * 退改签信息
 */
@DtoDoc("退改签信息")
@JsonAutoDetect(getterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE)
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PolicyInfo", propOrder = {
    "oriNo",
    "airChangeTagList",
    "refNote",
    "rerNote",
    "endNote",
    "note",
    "flightProductDescriptionInfo",
    "ticketRemark",
    "isIssueNeeded",
    "leastPerson",
    "refundEndorseJson",
    "fltRefundFeeList",
    "fltChangeFeeList",
    "childRefundFeeList",
    "childChangeFeeList",
    "infantRefundFeeList",
    "infantChangeFeeList"
})
@SuppressWarnings("all")
public class PolicyInfo  {

    private static final long serialVersionUID = 1L;

    public PolicyInfo(
        int oriNo, 
        List<String> airChangeTagList, 
        String refNote, 
        String rerNote, 
        String endNote, 
        String note, 
        GaFlightProductDescriptionInfo flightProductDescriptionInfo, 
        String ticketRemark, 
        boolean isIssueNeeded, 
        int leastPerson, 
        String refundEndorseJson, 
        List<FeeEntity> fltRefundFeeList, 
        List<FeeEntity> fltChangeFeeList, 
        List<FeeEntity> childRefundFeeList, 
        List<FeeEntity> childChangeFeeList, 
        List<FeeEntity> infantRefundFeeList, 
        List<FeeEntity> infantChangeFeeList) {
        this.oriNo = oriNo;
        this.airChangeTagList = airChangeTagList;
        this.refNote = refNote;
        this.rerNote = rerNote;
        this.endNote = endNote;
        this.note = note;
        this.flightProductDescriptionInfo = flightProductDescriptionInfo;
        this.ticketRemark = ticketRemark;
        this.isIssueNeeded = isIssueNeeded;
        this.leastPerson = leastPerson;
        this.refundEndorseJson = refundEndorseJson;
        this.fltRefundFeeList = fltRefundFeeList;
        this.fltChangeFeeList = fltChangeFeeList;
        this.childRefundFeeList = childRefundFeeList;
        this.childChangeFeeList = childChangeFeeList;
        this.infantRefundFeeList = infantRefundFeeList;
        this.infantChangeFeeList = infantChangeFeeList;
    }

    public PolicyInfo() {
    }

    @FieldDoc("航线序号")
    @JsonProperty("OriNo")
    @XmlElement(name = "OriNo")
    private int oriNo;

    @FieldDoc("退改签标签")
    @JsonProperty("AirChangeTagList")
    @XmlElement(name = "AirChangeTagList")
    private List<String> airChangeTagList;

    @FieldDoc("退-描述")
    @JsonProperty("RefNote")
    @XmlElement(name = "RefNote")
    private String refNote;

    @FieldDoc("改-描述")
    @JsonProperty("RerNote")
    @XmlElement(name = "RerNote")
    private String rerNote;

    @FieldDoc("转-描述")
    @JsonProperty("EndNote")
    @XmlElement(name = "EndNote")
    private String endNote;

    @FieldDoc("特殊描述")
    @JsonProperty("Note")
    @XmlElement(name = "Note")
    private String note;

    @FieldDoc("产品描述")
    @JsonProperty("FlightProductDescriptionInfo")
    @XmlElement(name = "FlightProductDescriptionInfo")
    private GaFlightProductDescriptionInfo flightProductDescriptionInfo;

    @FieldDoc("出票备注")
    @JsonProperty("TicketRemark")
    @XmlElement(name = "TicketRemark")
    private String ticketRemark;

    @FieldDoc("是否立即出票")
    @JsonProperty("IsIssueNeeded")
    @XmlElement(name = "IsIssueNeeded")
    private boolean isIssueNeeded;

    @FieldDoc("最小出行人数")
    @JsonProperty("LeastPerson")
    @XmlElement(name = "LeastPerson")
    private int leastPerson;

    @FieldDoc("格式化的退改签数据")
    @JsonProperty("RefundEndorseJson")
    @XmlElement(name = "RefundEndorseJson")
    private String refundEndorseJson;

    @FieldDoc("成人退票费列表")
    @JsonProperty("FltRefundFeeList")
    @XmlElement(name = "FltRefundFeeList")
    private List<FeeEntity> fltRefundFeeList;

    @FieldDoc("成人改签费列表")
    @JsonProperty("FltChangeFeeList")
    @XmlElement(name = "FltChangeFeeList")
    private List<FeeEntity> fltChangeFeeList;

    @FieldDoc("儿童退票费列表")
    @JsonProperty("ChildRefundFeeList")
    @XmlElement(name = "ChildRefundFeeList")
    private List<FeeEntity> childRefundFeeList;

    @FieldDoc("儿童改签费列表")
    @JsonProperty("ChildChangeFeeList")
    @XmlElement(name = "ChildChangeFeeList")
    private List<FeeEntity> childChangeFeeList;

    @FieldDoc("婴儿退票费列表")
    @JsonProperty("InfantRefundFeeList")
    @XmlElement(name = "InfantRefundFeeList")
    private List<FeeEntity> infantRefundFeeList;

    @FieldDoc("婴儿改签费列表")
    @JsonProperty("InfantChangeFeeList")
    @XmlElement(name = "InfantChangeFeeList")
    private List<FeeEntity> infantChangeFeeList;

    /**
     * 航线序号
     */
    public int getOriNo() {
        return this.oriNo;
    }

    public void setOriNo(int oriNo) {
        this.oriNo = oriNo;
    }

    /**
     * 退改签标签
     */
    public List<String> getAirChangeTagList() {
        return this.airChangeTagList;
    }

    public void setAirChangeTagList(List<String> airChangeTagList) {
        this.airChangeTagList = airChangeTagList;
    }

    /**
     * 退-描述
     */
    public String getRefNote() {
        return this.refNote;
    }

    public void setRefNote(String refNote) {
        this.refNote = refNote;
    }

    /**
     * 改-描述
     */
    public String getRerNote() {
        return this.rerNote;
    }

    public void setRerNote(String rerNote) {
        this.rerNote = rerNote;
    }

    /**
     * 转-描述
     */
    public String getEndNote() {
        return this.endNote;
    }

    public void setEndNote(String endNote) {
        this.endNote = endNote;
    }

    /**
     * 特殊描述
     */
    public String getNote() {
        return this.note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    /**
     * 产品描述
     */
    public GaFlightProductDescriptionInfo getFlightProductDescriptionInfo() {
        return this.flightProductDescriptionInfo;
    }

    public void setFlightProductDescriptionInfo(GaFlightProductDescriptionInfo flightProductDescriptionInfo) {
        this.flightProductDescriptionInfo = flightProductDescriptionInfo;
    }

    /**
     * 出票备注
     */
    public String getTicketRemark() {
        return this.ticketRemark;
    }

    public void setTicketRemark(String ticketRemark) {
        this.ticketRemark = ticketRemark;
    }

    /**
     * 是否立即出票
     */
    public boolean getIsIssueNeeded() {
        return this.isIssueNeeded;
    }

    public void setIsIssueNeeded(boolean isIssueNeeded) {
        this.isIssueNeeded = isIssueNeeded;
    }

    /**
     * 最小出行人数
     */
    public int getLeastPerson() {
        return this.leastPerson;
    }

    public void setLeastPerson(int leastPerson) {
        this.leastPerson = leastPerson;
    }

    /**
     * 格式化的退改签数据
     */
    public String getRefundEndorseJson() {
        return this.refundEndorseJson;
    }

    public void setRefundEndorseJson(String refundEndorseJson) {
        this.refundEndorseJson = refundEndorseJson;
    }

    /**
     * 成人退票费列表
     */
    public List<FeeEntity> getFltRefundFeeList() {
        return this.fltRefundFeeList;
    }

    public void setFltRefundFeeList(List<FeeEntity> fltRefundFeeList) {
        this.fltRefundFeeList = fltRefundFeeList;
    }

    /**
     * 成人改签费列表
     */
    public List<FeeEntity> getFltChangeFeeList() {
        return this.fltChangeFeeList;
    }

    public void setFltChangeFeeList(List<FeeEntity> fltChangeFeeList) {
        this.fltChangeFeeList = fltChangeFeeList;
    }

    /**
     * 儿童退票费列表
     */
    public List<FeeEntity> getChildRefundFeeList() {
        return this.childRefundFeeList;
    }

    public void setChildRefundFeeList(List<FeeEntity> childRefundFeeList) {
        this.childRefundFeeList = childRefundFeeList;
    }

    /**
     * 儿童改签费列表
     */
    public List<FeeEntity> getChildChangeFeeList() {
        return this.childChangeFeeList;
    }

    public void setChildChangeFeeList(List<FeeEntity> childChangeFeeList) {
        this.childChangeFeeList = childChangeFeeList;
    }

    /**
     * 婴儿退票费列表
     */
    public List<FeeEntity> getInfantRefundFeeList() {
        return this.infantRefundFeeList;
    }

    public void setInfantRefundFeeList(List<FeeEntity> infantRefundFeeList) {
        this.infantRefundFeeList = infantRefundFeeList;
    }

    /**
     * 婴儿改签费列表
     */
    public List<FeeEntity> getInfantChangeFeeList() {
        return this.infantChangeFeeList;
    }

    public void setInfantChangeFeeList(List<FeeEntity> infantChangeFeeList) {
        this.infantChangeFeeList = infantChangeFeeList;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;

        final PolicyInfo other = (PolicyInfo)obj;
        return
            Objects.equal(this.oriNo, other.oriNo) && 
            Objects.equal(this.airChangeTagList, other.airChangeTagList) && 
            Objects.equal(this.refNote, other.refNote) && 
            Objects.equal(this.rerNote, other.rerNote) && 
            Objects.equal(this.endNote, other.endNote) && 
            Objects.equal(this.note, other.note) && 
            Objects.equal(this.flightProductDescriptionInfo, other.flightProductDescriptionInfo) && 
            Objects.equal(this.ticketRemark, other.ticketRemark) && 
            Objects.equal(this.isIssueNeeded, other.isIssueNeeded) && 
            Objects.equal(this.leastPerson, other.leastPerson) && 
            Objects.equal(this.refundEndorseJson, other.refundEndorseJson) && 
            Objects.equal(this.fltRefundFeeList, other.fltRefundFeeList) && 
            Objects.equal(this.fltChangeFeeList, other.fltChangeFeeList) && 
            Objects.equal(this.childRefundFeeList, other.childRefundFeeList) && 
            Objects.equal(this.childChangeFeeList, other.childChangeFeeList) && 
            Objects.equal(this.infantRefundFeeList, other.infantRefundFeeList) && 
            Objects.equal(this.infantChangeFeeList, other.infantChangeFeeList);
    }

    @Override
    public int hashCode() {
        int result = 1;

        result = 31 * result + Objects.hashCode(this.oriNo);
        result = 31 * result + Objects.hashCode(this.airChangeTagList);
        result = 31 * result + Objects.hashCode(this.refNote);
        result = 31 * result + Objects.hashCode(this.rerNote);
        result = 31 * result + Objects.hashCode(this.endNote);
        result = 31 * result + Objects.hashCode(this.note);
        result = 31 * result + Objects.hashCode(this.flightProductDescriptionInfo);
        result = 31 * result + Objects.hashCode(this.ticketRemark);
        result = 31 * result + Objects.hashCode(this.isIssueNeeded);
        result = 31 * result + Objects.hashCode(this.leastPerson);
        result = 31 * result + Objects.hashCode(this.refundEndorseJson);
        result = 31 * result + Objects.hashCode(this.fltRefundFeeList);
        result = 31 * result + Objects.hashCode(this.fltChangeFeeList);
        result = 31 * result + Objects.hashCode(this.childRefundFeeList);
        result = 31 * result + Objects.hashCode(this.childChangeFeeList);
        result = 31 * result + Objects.hashCode(this.infantRefundFeeList);
        result = 31 * result + Objects.hashCode(this.infantChangeFeeList);

        return result;
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
            .add("oriNo", oriNo)
            .add("airChangeTagList", airChangeTagList)
            .add("refNote", refNote)
            .add("rerNote", rerNote)
            .add("endNote", endNote)
            .add("note", note)
            .add("flightProductDescriptionInfo", flightProductDescriptionInfo)
            .add("ticketRemark", ticketRemark)
            .add("isIssueNeeded", isIssueNeeded)
            .add("leastPerson", leastPerson)
            .add("refundEndorseJson", refundEndorseJson)
            .add("fltRefundFeeList", fltRefundFeeList)
            .add("fltChangeFeeList", fltChangeFeeList)
            .add("childRefundFeeList", childRefundFeeList)
            .add("childChangeFeeList", childChangeFeeList)
            .add("infantRefundFeeList", infantRefundFeeList)
            .add("infantChangeFeeList", infantChangeFeeList)
            .toString();
    }
}