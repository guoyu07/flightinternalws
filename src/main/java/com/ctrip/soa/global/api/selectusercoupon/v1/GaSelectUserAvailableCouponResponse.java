/**
 * Autogenerated by soa-sdk-toolkit
 *
 * DO NOT EDIT DIRECTLY
 */
package com.ctrip.soa.global.api.selectusercoupon.v1;

import com.ctrip.soa.global.api.comm.responsehead.v1.ResponseHead;
import com.ctriposs.baiji.rpc.common.HasResponseStatus;
import com.ctriposs.baiji.rpc.common.apidoc.DtoDoc;
import com.ctriposs.baiji.rpc.common.apidoc.FieldDoc;
import com.ctriposs.baiji.rpc.common.types.ResponseStatusType;
import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.common.base.MoreObjects;
import com.google.common.base.Objects;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * 用户可用优惠券查询响应
 */
@DtoDoc("用户可用优惠券查询响应")
@JsonAutoDetect(getterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE)
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "GaSelectUserAvailableCouponResponse", namespace = "http://soa.ctrip.com/Global/API/SelectUserCoupon/v1")
@XmlType(name = "GaSelectUserAvailableCouponResponse", propOrder = {
    "responseHead",
    "promotionStrategyList",
    "resultCode",
    "resultNo",
    "totalCount",
    "responseStatus"
})
@SuppressWarnings("all")
public class GaSelectUserAvailableCouponResponse implements HasResponseStatus {

    private static final long serialVersionUID = 1L;

    public GaSelectUserAvailableCouponResponse(
        ResponseHead responseHead, 
        List<GaUserCouponPromotionStrategyItem> promotionStrategyList, 
        String resultCode, 
        Integer resultNo, 
        Integer totalCount, 
        ResponseStatusType responseStatus) {
        this.responseHead = responseHead;
        this.promotionStrategyList = promotionStrategyList;
        this.resultCode = resultCode;
        this.resultNo = resultNo;
        this.totalCount = totalCount;
        this.responseStatus = responseStatus;
    }

    public GaSelectUserAvailableCouponResponse() {
    }

    @JsonProperty("ResponseHead")
    @XmlElement(name = "ResponseHead")
    private ResponseHead responseHead;

    @FieldDoc("优惠券显示字段")
    @JsonProperty("PromotionStrategyList")
    @XmlElement(name = "PromotionStrategyList")
    private List<GaUserCouponPromotionStrategyItem> promotionStrategyList;

    @FieldDoc("处理结果 string" +
"\"Success\":接口调用成功，\"Fail\":接口调用失败，“UnKown”：SOA等异常")
    @JsonProperty("ResultCode")
    @XmlElement(name = "ResultCode")
    private String resultCode;

    @FieldDoc("返回代码 0:失败 1:成功")
    @JsonProperty("ResultNo")
    @XmlElement(name = "ResultNo", nillable = true)
    private Integer resultNo;

    @FieldDoc("返回总数")
    @JsonProperty("TotalCount")
    @XmlElement(name = "TotalCount", nillable = true)
    private Integer totalCount;

    @JsonProperty("ResponseStatus")
    @XmlElement(name = "ResponseStatus")
    private ResponseStatusType responseStatus;

    public ResponseHead getResponseHead() {
        return this.responseHead;
    }

    public void setResponseHead(ResponseHead responseHead) {
        this.responseHead = responseHead;
    }

    /**
     * 优惠券显示字段
     */
    public List<GaUserCouponPromotionStrategyItem> getPromotionStrategyList() {
        return this.promotionStrategyList;
    }

    public void setPromotionStrategyList(List<GaUserCouponPromotionStrategyItem> promotionStrategyList) {
        this.promotionStrategyList = promotionStrategyList;
    }

    /**
     * 处理结果 string
     * "Success":接口调用成功，"Fail":接口调用失败，“UnKown”：SOA等异常
     */
    public String getResultCode() {
        return this.resultCode;
    }

    public void setResultCode(String resultCode) {
        this.resultCode = resultCode;
    }

    /**
     * 返回代码 0:失败 1:成功
     */
    public Integer getResultNo() {
        return this.resultNo;
    }

    public void setResultNo(Integer resultNo) {
        this.resultNo = resultNo;
    }

    /**
     * 返回总数
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public ResponseStatusType getResponseStatus() {
        return this.responseStatus;
    }

    public void setResponseStatus(ResponseStatusType responseStatus) {
        this.responseStatus = responseStatus;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;

        final GaSelectUserAvailableCouponResponse other = (GaSelectUserAvailableCouponResponse)obj;
        return
            Objects.equal(this.responseHead, other.responseHead) && 
            Objects.equal(this.promotionStrategyList, other.promotionStrategyList) && 
            Objects.equal(this.resultCode, other.resultCode) && 
            Objects.equal(this.resultNo, other.resultNo) && 
            Objects.equal(this.totalCount, other.totalCount) && 
            Objects.equal(this.responseStatus, other.responseStatus);
    }

    @Override
    public int hashCode() {
        int result = 1;

        result = 31 * result + Objects.hashCode(this.responseHead);
        result = 31 * result + Objects.hashCode(this.promotionStrategyList);
        result = 31 * result + Objects.hashCode(this.resultCode);
        result = 31 * result + Objects.hashCode(this.resultNo);
        result = 31 * result + Objects.hashCode(this.totalCount);
        result = 31 * result + Objects.hashCode(this.responseStatus);

        return result;
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
            .add("responseHead", responseHead)
            .add("promotionStrategyList", promotionStrategyList)
            .add("resultCode", resultCode)
            .add("resultNo", resultNo)
            .add("totalCount", totalCount)
            .add("responseStatus", responseStatus)
            .toString();
    }
}