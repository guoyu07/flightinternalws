/**
 * Autogenerated by soa-sdk-toolkit
 *
 * DO NOT EDIT DIRECTLY
 */
package com.ctrip.soa.global.api.orderdetailsearch.v1;

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
@XmlType(name = "OrderHistory", propOrder = {
    "operateType",
    "desc",
    "createDateTimeLong",
    "lastModifyDateTimeLong"
})
@SuppressWarnings("all")
public class OrderHistory  {

    private static final long serialVersionUID = 1L;

    public OrderHistory(
        int operateType, 
        String desc, 
        long createDateTimeLong, 
        long lastModifyDateTimeLong) {
        this.operateType = operateType;
        this.desc = desc;
        this.createDateTimeLong = createDateTimeLong;
        this.lastModifyDateTimeLong = lastModifyDateTimeLong;
    }

    public OrderHistory() {
    }

    @FieldDoc("操作类型：" +
            "0-未知" +
            "1-退票" +
            "2-改签" +
            "3-航变")
    @JsonProperty("OperateType")
    @XmlElement(name = "OperateType")
    private int operateType;

    @FieldDoc("描述")
    @JsonProperty("Desc")
    @XmlElement(name = "Desc")
    private String desc;

    @FieldDoc("提交时间")
    @JsonProperty("CreateDateTimeLong")
    @XmlElement(name = "CreateDateTimeLong")
    private long createDateTimeLong;

    @FieldDoc("最后修改时间")
    @JsonProperty("LastModifyDateTimeLong")
    @XmlElement(name = "LastModifyDateTimeLong")
    private long lastModifyDateTimeLong;

    /**
     * 操作类型：
     *             0-未知
     *             1-退票
     *             2-改签
     *             3-航变
     */
    public int getOperateType() {
        return this.operateType;
    }

    public void setOperateType(int operateType) {
        this.operateType = operateType;
    }

    /**
     * 描述
     */
    public String getDesc() {
        return this.desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    /**
     * 提交时间
     */
    public long getCreateDateTimeLong() {
        return this.createDateTimeLong;
    }

    public void setCreateDateTimeLong(long createDateTimeLong) {
        this.createDateTimeLong = createDateTimeLong;
    }

    /**
     * 最后修改时间
     */
    public long getLastModifyDateTimeLong() {
        return this.lastModifyDateTimeLong;
    }

    public void setLastModifyDateTimeLong(long lastModifyDateTimeLong) {
        this.lastModifyDateTimeLong = lastModifyDateTimeLong;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;

        final OrderHistory other = (OrderHistory)obj;
        return
            Objects.equal(this.operateType, other.operateType) && 
            Objects.equal(this.desc, other.desc) && 
            Objects.equal(this.createDateTimeLong, other.createDateTimeLong) && 
            Objects.equal(this.lastModifyDateTimeLong, other.lastModifyDateTimeLong);
    }

    @Override
    public int hashCode() {
        int result = 1;

        result = 31 * result + Objects.hashCode(this.operateType);
        result = 31 * result + Objects.hashCode(this.desc);
        result = 31 * result + Objects.hashCode(this.createDateTimeLong);
        result = 31 * result + Objects.hashCode(this.lastModifyDateTimeLong);

        return result;
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
            .add("operateType", operateType)
            .add("desc", desc)
            .add("createDateTimeLong", createDateTimeLong)
            .add("lastModifyDateTimeLong", lastModifyDateTimeLong)
            .toString();
    }
}