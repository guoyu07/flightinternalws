package com.ctrip.ibu.flight.internalws.autogenservice;

import java.util.*;
import com.ctriposs.baiji.exception.*;
import com.ctriposs.baiji.rpc.common.*;
import com.ctriposs.baiji.schema.*;
import com.ctriposs.baiji.specific.*;
import com.google.common.base.Objects;
import com.google.common.base.MoreObjects;

@SuppressWarnings("all")
public class SendMessageRequestType implements SpecificRecord {
    private static final long serialVersionUID = 1L;

    public static final Schema SCHEMA = Schema.parse("{\"type\":\"record\",\"name\":\"SendMessageRequestType\",\"namespace\":\"" + SendMessageRequestType.class.getPackage().getName() + "\",\"doc\":null,\"fields\":[{\"name\":\"orderID\",\"type\":[\"long\",\"null\"]},{\"name\":\"uid\",\"type\":[\"string\",\"null\"]},{\"name\":\"messageType\",\"type\":[{\"type\":\"enum\",\"name\":\"MessageType\",\"namespace\":\"" + MessageType.class.getPackage().getName() + "\",\"doc\":null,\"symbols\":[\"Email_ReservationConfirmation\",\"Email_PaymentSuccess\"]},\"null\"]},{\"name\":\"languageType\",\"type\":[{\"type\":\"enum\",\"name\":\"LanguageType\",\"namespace\":\"" + LanguageType.class.getPackage().getName() + "\",\"doc\":null,\"symbols\":[\"CN\",\"JA\",\"KO\",\"FR\",\"DE\",\"RU\",\"ES\",\"EN\",\"VI\",\"ZH_HK\",\"MY\",\"TH\",\"ID\",\"NULL\"]},\"null\"]},{\"name\":\"recipient\",\"type\":[\"string\",\"null\"]},{\"name\":\"subject\",\"type\":[\"string\",\"null\"]},{\"name\":\"messageContent\",\"type\":[\"string\",\"null\"]},{\"name\":\"cc\",\"type\":[\"string\",\"null\"]},{\"name\":\"bcc\",\"type\":[\"string\",\"null\"]},{\"name\":\"eid\",\"type\":[\"string\",\"null\"]},{\"name\":\"importance\",\"type\":[\"string\",\"null\"]},{\"name\":\"uniqueID\",\"type\":[\"string\",\"null\"]},{\"name\":\"remark\",\"type\":[\"string\",\"null\"]}]}");

    public Schema getSchema() { return SCHEMA; }

    public SendMessageRequestType(
        Long orderID,
        String uid,
        MessageType messageType,
        LanguageType languageType,
        String recipient,
        String subject,
        String messageContent,
        String cc,
        String bcc,
        String eid,
        String importance,
        String uniqueID,
        String remark) {
        this.orderID = orderID;
        this.uid = uid;
        this.messageType = messageType;
        this.languageType = languageType;
        this.recipient = recipient;
        this.subject = subject;
        this.messageContent = messageContent;
        this.cc = cc;
        this.bcc = bcc;
        this.eid = eid;
        this.importance = importance;
        this.uniqueID = uniqueID;
        this.remark = remark;
    }

    public SendMessageRequestType() {
    }

    public Long orderID;

    public String uid;

    public MessageType messageType;

    public LanguageType languageType;

    public String recipient;

    public String subject;

    public String messageContent;

    public String cc;

    public String bcc;

    public String eid;

    public String importance;

    public String uniqueID;

    public String remark;

    public Long getOrderID() {
        return orderID;
    }

    public void setOrderID(final Long orderID) {
        this.orderID = orderID;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(final String uid) {
        this.uid = uid;
    }

    public MessageType getMessageType() {
        return messageType;
    }

    public void setMessageType(final MessageType messageType) {
        this.messageType = messageType;
    }

    public LanguageType getLanguageType() {
        return languageType;
    }

    public void setLanguageType(final LanguageType languageType) {
        this.languageType = languageType;
    }

    public String getRecipient() {
        return recipient;
    }

    public void setRecipient(final String recipient) {
        this.recipient = recipient;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(final String subject) {
        this.subject = subject;
    }

    public String getMessageContent() {
        return messageContent;
    }

    public void setMessageContent(final String messageContent) {
        this.messageContent = messageContent;
    }

    public String getCc() {
        return cc;
    }

    public void setCc(final String cc) {
        this.cc = cc;
    }

    public String getBcc() {
        return bcc;
    }

    public void setBcc(final String bcc) {
        this.bcc = bcc;
    }

    public String getEid() {
        return eid;
    }

    public void setEid(final String eid) {
        this.eid = eid;
    }

    public String getImportance() {
        return importance;
    }

    public void setImportance(final String importance) {
        this.importance = importance;
    }

    public String getUniqueID() {
        return uniqueID;
    }

    public void setUniqueID(final String uniqueID) {
        this.uniqueID = uniqueID;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(final String remark) {
        this.remark = remark;
    }

    // Used by DatumWriter. Applications should not call.
    public Object get(int fieldPos) {
        switch (fieldPos) {
            case 0: return this.orderID;
            case 1: return this.uid;
            case 2: return this.messageType;
            case 3: return this.languageType;
            case 4: return this.recipient;
            case 5: return this.subject;
            case 6: return this.messageContent;
            case 7: return this.cc;
            case 8: return this.bcc;
            case 9: return this.eid;
            case 10: return this.importance;
            case 11: return this.uniqueID;
            case 12: return this.remark;
            default: throw new BaijiRuntimeException("Bad index " + fieldPos + " in get()");
        }
    }

    // Used by DatumReader. Applications should not call.
    @SuppressWarnings(value="unchecked")
    public void put(int fieldPos, Object fieldValue) {
        switch (fieldPos) {
            case 0: this.orderID = (Long)fieldValue; break;
            case 1: this.uid = (String)fieldValue; break;
            case 2: this.messageType = (MessageType)fieldValue; break;
            case 3: this.languageType = (LanguageType)fieldValue; break;
            case 4: this.recipient = (String)fieldValue; break;
            case 5: this.subject = (String)fieldValue; break;
            case 6: this.messageContent = (String)fieldValue; break;
            case 7: this.cc = (String)fieldValue; break;
            case 8: this.bcc = (String)fieldValue; break;
            case 9: this.eid = (String)fieldValue; break;
            case 10: this.importance = (String)fieldValue; break;
            case 11: this.uniqueID = (String)fieldValue; break;
            case 12: this.remark = (String)fieldValue; break;
            default: throw new BaijiRuntimeException("Bad index " + fieldPos + " in put()");
        }
    }

    public Object get(String fieldName) {
        Schema schema = getSchema();
        if (!(schema instanceof RecordSchema)) {
            return null;
        }
        Field field = ((RecordSchema) schema).getField(fieldName);
        return field != null ? get(field.getPos()) : null;
    }

    public void put(String fieldName, Object fieldValue) {
        Schema schema = getSchema();
        if (!(schema instanceof RecordSchema)) {
            return;
        }
        Field field = ((RecordSchema) schema).getField(fieldName);
        if (field != null) {
            put(field.getPos(), fieldValue);
        }
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;

        final SendMessageRequestType other = (SendMessageRequestType)obj;
        return 
            Objects.equal(this.orderID, other.orderID) &&
            Objects.equal(this.uid, other.uid) &&
            Objects.equal(this.messageType, other.messageType) &&
            Objects.equal(this.languageType, other.languageType) &&
            Objects.equal(this.recipient, other.recipient) &&
            Objects.equal(this.subject, other.subject) &&
            Objects.equal(this.messageContent, other.messageContent) &&
            Objects.equal(this.cc, other.cc) &&
            Objects.equal(this.bcc, other.bcc) &&
            Objects.equal(this.eid, other.eid) &&
            Objects.equal(this.importance, other.importance) &&
            Objects.equal(this.uniqueID, other.uniqueID) &&
            Objects.equal(this.remark, other.remark);
    }

    @Override
    public int hashCode() {
        int result = 1;

        result = 31 * result + (this.orderID == null ? 0 : this.orderID.hashCode());
        result = 31 * result + (this.uid == null ? 0 : this.uid.hashCode());
        result = 31 * result + (this.messageType == null ? 0 : this.messageType.hashCode());
        result = 31 * result + (this.languageType == null ? 0 : this.languageType.hashCode());
        result = 31 * result + (this.recipient == null ? 0 : this.recipient.hashCode());
        result = 31 * result + (this.subject == null ? 0 : this.subject.hashCode());
        result = 31 * result + (this.messageContent == null ? 0 : this.messageContent.hashCode());
        result = 31 * result + (this.cc == null ? 0 : this.cc.hashCode());
        result = 31 * result + (this.bcc == null ? 0 : this.bcc.hashCode());
        result = 31 * result + (this.eid == null ? 0 : this.eid.hashCode());
        result = 31 * result + (this.importance == null ? 0 : this.importance.hashCode());
        result = 31 * result + (this.uniqueID == null ? 0 : this.uniqueID.hashCode());
        result = 31 * result + (this.remark == null ? 0 : this.remark.hashCode());

        return result;
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
            .add("orderID", orderID)
            .add("uid", uid)
            .add("messageType", messageType)
            .add("languageType", languageType)
            .add("recipient", recipient)
            .add("subject", subject)
            .add("messageContent", messageContent)
            .add("cc", cc)
            .add("bcc", bcc)
            .add("eid", eid)
            .add("importance", importance)
            .add("uniqueID", uniqueID)
            .add("remark", remark)
            .toString();
    }
}
