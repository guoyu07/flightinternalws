/**
 * Autogenerated by soa-sdk-toolkit
 *
 * DO NOT EDIT DIRECTLY
 */
package com.ctrip.soa.global.api.garefundflightorder.v1;

import com.ctriposs.baiji.rpc.common.apidoc.DtoDoc;
import com.ctriposs.baiji.rpc.common.apidoc.FieldDoc;
import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.common.base.MoreObjects;
import com.google.common.base.Objects;
import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * 退票申请单保险信息
 */
@DtoDoc("退票申请单保险信息")
@JsonAutoDetect(getterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE)
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RefundOrderInsurance", propOrder = {
    "companyId",
    "passengerName",
    "productCode",
    "refInsuranceNum",
    "sequence",
    "typeIDs",
    "unitPrice"
})
@SuppressWarnings("all")
public class RefundOrderInsurance  {

    private static final long serialVersionUID = 1L;

    public RefundOrderInsurance(
        String companyId, 
        String passengerName, 
        String productCode, 
        int refInsuranceNum, 
        int sequence, 
        String typeIDs, 
        BigDecimal unitPrice) {
        this.companyId = companyId;
        this.passengerName = passengerName;
        this.productCode = productCode;
        this.refInsuranceNum = refInsuranceNum;
        this.sequence = sequence;
        this.typeIDs = typeIDs;
        this.unitPrice = unitPrice;
    }

    public RefundOrderInsurance() {
    }

    @FieldDoc("保险产品id")
    @JsonProperty("CompanyId")
    @XmlElement(name = "CompanyId")
    private String companyId;

    @FieldDoc("乘客姓名")
    @JsonProperty("PassengerName")
    @XmlElement(name = "PassengerName")
    private String passengerName;

    @FieldDoc("保险产品Code")
    @JsonProperty("ProductCode")
    @XmlElement(name = "ProductCode")
    private String productCode;

    @FieldDoc("退保险份数")
    @JsonProperty("RefInsuranceNum")
    @XmlElement(name = "RefInsuranceNum")
    private int refInsuranceNum;

    @FieldDoc("航程")
    @JsonProperty("Sequence")
    @XmlElement(name = "Sequence")
    private int sequence;

    @FieldDoc("保险种类")
    @JsonProperty("TypeIDs")
    @XmlElement(name = "TypeIDs")
    private String typeIDs;

    @FieldDoc("保险单价（人民币）")
    @JsonProperty("UnitPrice")
    @XmlElement(name = "UnitPrice")
    private BigDecimal unitPrice;

    /**
     * 保险产品id
     */
    public String getCompanyId() {
        return this.companyId;
    }

    public void setCompanyId(String companyId) {
        this.companyId = companyId;
    }

    /**
     * 乘客姓名
     */
    public String getPassengerName() {
        return this.passengerName;
    }

    public void setPassengerName(String passengerName) {
        this.passengerName = passengerName;
    }

    /**
     * 保险产品Code
     */
    public String getProductCode() {
        return this.productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    /**
     * 退保险份数
     */
    public int getRefInsuranceNum() {
        return this.refInsuranceNum;
    }

    public void setRefInsuranceNum(int refInsuranceNum) {
        this.refInsuranceNum = refInsuranceNum;
    }

    /**
     * 航程
     */
    public int getSequence() {
        return this.sequence;
    }

    public void setSequence(int sequence) {
        this.sequence = sequence;
    }

    /**
     * 保险种类
     */
    public String getTypeIDs() {
        return this.typeIDs;
    }

    public void setTypeIDs(String typeIDs) {
        this.typeIDs = typeIDs;
    }

    /**
     * 保险单价（人民币）
     */
    public BigDecimal getUnitPrice() {
        return this.unitPrice;
    }

    public void setUnitPrice(BigDecimal unitPrice) {
        this.unitPrice = unitPrice;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;

        final RefundOrderInsurance other = (RefundOrderInsurance)obj;
        return
            Objects.equal(this.companyId, other.companyId) && 
            Objects.equal(this.passengerName, other.passengerName) && 
            Objects.equal(this.productCode, other.productCode) && 
            Objects.equal(this.refInsuranceNum, other.refInsuranceNum) && 
            Objects.equal(this.sequence, other.sequence) && 
            Objects.equal(this.typeIDs, other.typeIDs) && 
            Objects.equal(this.unitPrice, other.unitPrice);
    }

    @Override
    public int hashCode() {
        int result = 1;

        result = 31 * result + Objects.hashCode(this.companyId);
        result = 31 * result + Objects.hashCode(this.passengerName);
        result = 31 * result + Objects.hashCode(this.productCode);
        result = 31 * result + Objects.hashCode(this.refInsuranceNum);
        result = 31 * result + Objects.hashCode(this.sequence);
        result = 31 * result + Objects.hashCode(this.typeIDs);
        result = 31 * result + Objects.hashCode(this.unitPrice);

        return result;
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
            .add("companyId", companyId)
            .add("passengerName", passengerName)
            .add("productCode", productCode)
            .add("refInsuranceNum", refInsuranceNum)
            .add("sequence", sequence)
            .add("typeIDs", typeIDs)
            .add("unitPrice", unitPrice)
            .toString();
    }
}