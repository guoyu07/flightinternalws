package com.ctrip.ibu.flight.internalws.autogenservice;

public enum ResultCode {

    Success(0),
    Fail(1),
    Warning(2);

    private final int value;

    ResultCode(int value) {
        this.value = value;
    }

    /**
     * Get the integer value of this enum value, as defined in the Baiji IDL.
     */
    public int getValue() {
        return value;
    }

    /**
     * Get the integer value of this enum value, as defined in the Baiji IDL.
     */
    public static ResultCode findByValue(int value) {
        switch (value) {
            case 0:
                return Success;
            case 1:
                return Fail;
            case 2:
                return Warning;
            default:
                return null;
        }
    }
}
