/**
 * Autogenerated by soa-sdk-toolkit
 *
 * DO NOT EDIT DIRECTLY
 */
package com.ctrip.soa.global.api.gacreateflightorder.v1;

import com.ctriposs.baiji.rpc.common.apidoc.DtoDoc;
import com.ctriposs.baiji.rpc.common.apidoc.FieldDoc;
import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.common.base.MoreObjects;
import com.google.common.base.Objects;
import java.math.BigDecimal;
import java.util.Calendar;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * 套餐信息
 */
@DtoDoc("套餐信息")
@JsonAutoDetect(getterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE)
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PackageAttachItem", propOrder = {
    "sequence",
    "product",
    "price",
    "number",
    "name",
    "type",
    "expiryDate",
    "desc"
})
@SuppressWarnings("all")
public class PackageAttachItem  {

    private static final long serialVersionUID = 1L;

    public PackageAttachItem(
        int sequence, 
        int product, 
        BigDecimal price, 
        int number, 
        String name, 
        int type, 
        Calendar expiryDate, 
        String desc) {
        this.sequence = sequence;
        this.product = product;
        this.price = price;
        this.number = number;
        this.name = name;
        this.type = type;
        this.expiryDate = expiryDate;
        this.desc = desc;
    }

    public PackageAttachItem() {
    }

    @FieldDoc("套餐绑定的航段号")
    @JsonProperty("Sequence")
    @XmlElement(name = "Sequence")
    private int sequence;

    @FieldDoc("产品编号")
    @JsonProperty("Product")
    @XmlElement(name = "Product")
    private int product;

    @FieldDoc("价格")
    @JsonProperty("Price")
    @XmlElement(name = "Price")
    private BigDecimal price;

    @FieldDoc("数量")
    @JsonProperty("Number")
    @XmlElement(name = "Number")
    private int number;

    @FieldDoc("名称")
    @JsonProperty("Name")
    @XmlElement(name = "Name")
    private String name;

    @FieldDoc("类型")
    @JsonProperty("Type")
    @XmlElement(name = "Type")
    private int type;

    @FieldDoc("过期时间")
    @JsonProperty("ExpiryDate")
    @XmlElement(name = "ExpiryDate")
    private Calendar expiryDate;

    @FieldDoc("描述")
    @JsonProperty("Desc")
    @XmlElement(name = "Desc")
    private String desc;

    /**
     * 套餐绑定的航段号
     */
    public int getSequence() {
        return this.sequence;
    }

    public void setSequence(int sequence) {
        this.sequence = sequence;
    }

    /**
     * 产品编号
     */
    public int getProduct() {
        return this.product;
    }

    public void setProduct(int product) {
        this.product = product;
    }

    /**
     * 价格
     */
    public BigDecimal getPrice() {
        return this.price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    /**
     * 数量
     */
    public int getNumber() {
        return this.number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    /**
     * 名称
     */
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
     * 类型
     */
    public int getType() {
        return this.type;
    }

    public void setType(int type) {
        this.type = type;
    }

    /**
     * 过期时间
     */
    public Calendar getExpiryDate() {
        return this.expiryDate;
    }

    public void setExpiryDate(Calendar expiryDate) {
        this.expiryDate = expiryDate;
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

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;

        final PackageAttachItem other = (PackageAttachItem)obj;
        return
            Objects.equal(this.sequence, other.sequence) && 
            Objects.equal(this.product, other.product) && 
            Objects.equal(this.price, other.price) && 
            Objects.equal(this.number, other.number) && 
            Objects.equal(this.name, other.name) && 
            Objects.equal(this.type, other.type) && 
            Objects.equal(this.expiryDate, other.expiryDate) && 
            Objects.equal(this.desc, other.desc);
    }

    @Override
    public int hashCode() {
        int result = 1;

        result = 31 * result + Objects.hashCode(this.sequence);
        result = 31 * result + Objects.hashCode(this.product);
        result = 31 * result + Objects.hashCode(this.price);
        result = 31 * result + Objects.hashCode(this.number);
        result = 31 * result + Objects.hashCode(this.name);
        result = 31 * result + Objects.hashCode(this.type);
        result = 31 * result + Objects.hashCode(this.expiryDate);
        result = 31 * result + Objects.hashCode(this.desc);

        return result;
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
            .add("sequence", sequence)
            .add("product", product)
            .add("price", price)
            .add("number", number)
            .add("name", name)
            .add("type", type)
            .add("expiryDate", expiryDate)
            .add("desc", desc)
            .toString();
    }
}