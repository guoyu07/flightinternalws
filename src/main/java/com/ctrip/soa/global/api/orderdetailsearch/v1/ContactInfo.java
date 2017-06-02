/**
 * Autogenerated by soa-sdk-toolkit
 *
 * DO NOT EDIT DIRECTLY
 */
package com.ctrip.soa.global.api.orderdetailsearch.v1;

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
import javax.xml.bind.annotation.XmlType;

/**
 * 联系人信息
 */
@DtoDoc("联系人信息")
@JsonAutoDetect(getterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE)
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ContactInfo", propOrder = {
    "name",
    "phone",
    "phoneCountryfix",
    "email"
})
@SuppressWarnings("all")
public class ContactInfo  {

    private static final long serialVersionUID = 1L;

    public ContactInfo(
        String name, 
        String phone, 
        String phoneCountryfix, 
        String email) {
        this.name = name;
        this.phone = phone;
        this.phoneCountryfix = phoneCountryfix;
        this.email = email;
    }

    public ContactInfo() {
    }

    @FieldDoc("last/first 全名")
    @JsonProperty("Name")
    @XmlElement(name = "Name")
    private String name;

    @FieldDoc("电话")
    @JsonProperty("Phone")
    @XmlElement(name = "Phone")
    private String phone;

    @FieldDoc("电话的国家区号")
    @JsonProperty("PhoneCountryfix")
    @XmlElement(name = "PhoneCountryfix")
    private String phoneCountryfix;

    @FieldDoc("邮箱")
    @JsonProperty("Email")
    @XmlElement(name = "Email")
    private String email;

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
     * 电话
     */
    public String getPhone() {
        return this.phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * 电话的国家区号
     */
    public String getPhoneCountryfix() {
        return this.phoneCountryfix;
    }

    public void setPhoneCountryfix(String phoneCountryfix) {
        this.phoneCountryfix = phoneCountryfix;
    }

    /**
     * 邮箱
     */
    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;

        final ContactInfo other = (ContactInfo)obj;
        return
            Objects.equal(this.name, other.name) && 
            Objects.equal(this.phone, other.phone) && 
            Objects.equal(this.phoneCountryfix, other.phoneCountryfix) && 
            Objects.equal(this.email, other.email);
    }

    @Override
    public int hashCode() {
        int result = 1;

        result = 31 * result + Objects.hashCode(this.name);
        result = 31 * result + Objects.hashCode(this.phone);
        result = 31 * result + Objects.hashCode(this.phoneCountryfix);
        result = 31 * result + Objects.hashCode(this.email);

        return result;
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
            .add("name", name)
            .add("phone", phone)
            .add("phoneCountryfix", phoneCountryfix)
            .add("email", email)
            .toString();
    }
}