/**
 * Autogenerated by soa-sdk-toolkit
 *
 * DO NOT EDIT DIRECTLY
 */
package com.ctrip.soa.global.api.getlowpricedic.v1;

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
 * 查询城市参数字典项
 */
@DtoDoc("查询城市参数字典项")
@JsonAutoDetect(getterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE)
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RequestCityDicItem", propOrder = {
    "dCityCode",
    "aCityCodeList"
})
@SuppressWarnings("all")
public class RequestCityDicItem  {

    private static final long serialVersionUID = 1L;

    public RequestCityDicItem(
        String dCityCode, 
        List<String> aCityCodeList) {
        this.dCityCode = dCityCode;
        this.aCityCodeList = aCityCodeList;
    }

    public RequestCityDicItem() {
    }

    @FieldDoc("出发城市三字码")
    @JsonProperty("DCityCode")
    @XmlElement(name = "DCityCode")
    private String dCityCode;

    @FieldDoc("达到城市三字码列表")
    @JsonProperty("ACityCodeList")
    @XmlElement(name = "ACityCodeList")
    private List<String> aCityCodeList;

    /**
     * 出发城市三字码
     */
    public String getDCityCode() {
        return this.dCityCode;
    }

    public void setDCityCode(String dCityCode) {
        this.dCityCode = dCityCode;
    }

    /**
     * 达到城市三字码列表
     */
    public List<String> getACityCodeList() {
        return this.aCityCodeList;
    }

    public void setACityCodeList(List<String> aCityCodeList) {
        this.aCityCodeList = aCityCodeList;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;

        final RequestCityDicItem other = (RequestCityDicItem)obj;
        return
            Objects.equal(this.dCityCode, other.dCityCode) && 
            Objects.equal(this.aCityCodeList, other.aCityCodeList);
    }

    @Override
    public int hashCode() {
        int result = 1;

        result = 31 * result + Objects.hashCode(this.dCityCode);
        result = 31 * result + Objects.hashCode(this.aCityCodeList);

        return result;
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
            .add("dCityCode", dCityCode)
            .add("aCityCodeList", aCityCodeList)
            .toString();
    }
}