package com.ctrip.ibu.flight.internalws.autogenservice;

import java.util.*;
import com.ctriposs.baiji.exception.*;
import com.ctriposs.baiji.rpc.common.*;
import com.ctriposs.baiji.schema.*;
import com.ctriposs.baiji.specific.*;
import com.google.common.base.Objects;
import com.google.common.base.MoreObjects;
import com.ctriposs.baiji.rpc.common.types.*;

@SuppressWarnings("all")
public class SendMessageResponseType implements SpecificRecord, HasResponseStatus {
    private static final long serialVersionUID = 1L;

    public static final Schema SCHEMA = Schema.parse("{\"type\":\"record\",\"name\":\"SendMessageResponseType\",\"namespace\":\"" + SendMessageResponseType.class.getPackage().getName() + "\",\"doc\":null,\"fields\":[{\"name\":\"ResponseStatus\",\"type\":[{\"type\":\"record\",\"name\":\"ResponseStatusType\",\"namespace\":\"" + ResponseStatusType.class.getPackage().getName() + "\",\"doc\":null,\"fields\":[{\"name\":\"Timestamp\",\"type\":[\"datetime\",\"null\"]},{\"name\":\"Ack\",\"type\":[{\"type\":\"enum\",\"name\":\"AckCodeType\",\"namespace\":\"" + AckCodeType.class.getPackage().getName() + "\",\"doc\":null,\"symbols\":[\"Success\",\"Failure\",\"Warning\",\"PartialFailure\"]},\"null\"]},{\"name\":\"Errors\",\"type\":[{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"ErrorDataType\",\"namespace\":\"" + ErrorDataType.class.getPackage().getName() + "\",\"doc\":null,\"fields\":[{\"name\":\"Message\",\"type\":[\"string\",\"null\"]},{\"name\":\"ErrorCode\",\"type\":[\"string\",\"null\"]},{\"name\":\"StackTrace\",\"type\":[\"string\",\"null\"]},{\"name\":\"SeverityCode\",\"type\":[{\"type\":\"enum\",\"name\":\"SeverityCodeType\",\"namespace\":\"" + SeverityCodeType.class.getPackage().getName() + "\",\"doc\":null,\"symbols\":[\"Error\",\"Warning\"]},\"null\"]},{\"name\":\"ErrorFields\",\"type\":[{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"ErrorFieldType\",\"namespace\":\"" + ErrorFieldType.class.getPackage().getName() + "\",\"doc\":null,\"fields\":[{\"name\":\"FieldName\",\"type\":[\"string\",\"null\"]},{\"name\":\"ErrorCode\",\"type\":[\"string\",\"null\"]},{\"name\":\"Message\",\"type\":[\"string\",\"null\"]}]}},\"null\"]},{\"name\":\"ErrorClassification\",\"type\":[{\"type\":\"enum\",\"name\":\"ErrorClassificationCodeType\",\"namespace\":\"" + ErrorClassificationCodeType.class.getPackage().getName() + "\",\"doc\":null,\"symbols\":[\"ServiceError\",\"ValidationError\",\"FrameworkError\",\"SLAError\",\"SecurityError\"]},\"null\"]}]}},\"null\"]},{\"name\":\"Build\",\"type\":[\"string\",\"null\"]},{\"name\":\"Version\",\"type\":[\"string\",\"null\"]},{\"name\":\"Extension\",\"type\":[{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"ExtensionType\",\"namespace\":\"" + ExtensionType.class.getPackage().getName() + "\",\"doc\":null,\"fields\":[{\"name\":\"Id\",\"type\":[\"string\",\"null\"]},{\"name\":\"Version\",\"type\":[\"string\",\"null\"]},{\"name\":\"ContentType\",\"type\":[\"string\",\"null\"]},{\"name\":\"Value\",\"type\":[\"string\",\"null\"]}]}},\"null\"]}]},\"null\"]},{\"name\":\"resultCode\",\"type\":[{\"type\":\"enum\",\"name\":\"ResultCode\",\"namespace\":\"" + ResultCode.class.getPackage().getName() + "\",\"doc\":null,\"symbols\":[\"Success\",\"Fail\",\"Warning\"]},\"null\"]},{\"name\":\"message\",\"type\":[\"string\",\"null\"]}]}");

    public Schema getSchema() { return SCHEMA; }

    public SendMessageResponseType(
        ResponseStatusType responseStatus,
        ResultCode resultCode,
        String message) {
        this.responseStatus = responseStatus;
        this.resultCode = resultCode;
        this.message = message;
    }

    public SendMessageResponseType() {
    }

    public ResponseStatusType responseStatus;

    public ResultCode resultCode;

    public String message;

    public ResponseStatusType getResponseStatus() {
        return responseStatus;
    }

    public void setResponseStatus(final ResponseStatusType responseStatus) {
        this.responseStatus = responseStatus;
    }

    public ResultCode getResultCode() {
        return resultCode;
    }

    public void setResultCode(final ResultCode resultCode) {
        this.resultCode = resultCode;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(final String message) {
        this.message = message;
    }

    // Used by DatumWriter. Applications should not call.
    public Object get(int fieldPos) {
        switch (fieldPos) {
            case 0: return this.responseStatus;
            case 1: return this.resultCode;
            case 2: return this.message;
            default: throw new BaijiRuntimeException("Bad index " + fieldPos + " in get()");
        }
    }

    // Used by DatumReader. Applications should not call.
    @SuppressWarnings(value="unchecked")
    public void put(int fieldPos, Object fieldValue) {
        switch (fieldPos) {
            case 0: this.responseStatus = (ResponseStatusType)fieldValue; break;
            case 1: this.resultCode = (ResultCode)fieldValue; break;
            case 2: this.message = (String)fieldValue; break;
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

        final SendMessageResponseType other = (SendMessageResponseType)obj;
        return 
            Objects.equal(this.responseStatus, other.responseStatus) &&
            Objects.equal(this.resultCode, other.resultCode) &&
            Objects.equal(this.message, other.message);
    }

    @Override
    public int hashCode() {
        int result = 1;

        result = 31 * result + (this.responseStatus == null ? 0 : this.responseStatus.hashCode());
        result = 31 * result + (this.resultCode == null ? 0 : this.resultCode.hashCode());
        result = 31 * result + (this.message == null ? 0 : this.message.hashCode());

        return result;
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
            .add("responseStatus", responseStatus)
            .add("resultCode", resultCode)
            .add("message", message)
            .toString();
    }
}
