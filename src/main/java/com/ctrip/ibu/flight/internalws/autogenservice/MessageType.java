package com.ctrip.ibu.flight.internalws.autogenservice;

public enum MessageType {

    Email_ReservationConfirmation(0),
    Email_PaymentSuccess(1);

    private final int value;

    MessageType(int value) {
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
    public static MessageType findByValue(int value) {
        switch (value) {
            case 0:
                return Email_ReservationConfirmation;
            case 1:
                return Email_PaymentSuccess;
            default:
                return null;
        }
    }
}
