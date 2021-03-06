/**
 * Autogenerated by soa-sdk-toolkit
 *
 * DO NOT EDIT DIRECTLY
 */
package com.ctrip.soa.global.api.getfolloworderbyuserid.v1;

import com.ctrip.soa.global.api.comm.head.v1.Head;
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
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * 请求实体
 */
@DtoDoc("请求实体")
@JsonAutoDetect(getterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE)
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "GaGetFollowOrderByUserIDRequest", namespace = "http://soa.ctrip.com/Global/API/GetFollowOrderByUserID/v1")
@XmlType(name = "GaGetFollowOrderByUserIDRequest", propOrder = {
    "head"
})
@SuppressWarnings("all")
public class GaGetFollowOrderByUserIDRequest  {

    private static final long serialVersionUID = 1L;

    public GaGetFollowOrderByUserIDRequest(
        Head head) {
        this.head = head;
    }

    public GaGetFollowOrderByUserIDRequest() {
    }

    @FieldDoc("请求头部信息")
    @JsonProperty("Head")
    @XmlElement(name = "Head")
    private Head head;

    /**
     * 请求头部信息
     */
    public Head getHead() {
        return this.head;
    }

    public void setHead(Head head) {
        this.head = head;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;

        final GaGetFollowOrderByUserIDRequest other = (GaGetFollowOrderByUserIDRequest)obj;
        return
            Objects.equal(this.head, other.head);
    }

    @Override
    public int hashCode() {
        int result = 1;

        result = 31 * result + Objects.hashCode(this.head);

        return result;
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
            .add("head", head)
            .toString();
    }
}