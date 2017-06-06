package com.ctrip.ibu.flight.internalws.autogenservice;

public enum LanguageType {

    CN(0),
    JA(1),
    KO(2),
    FR(3),
    DE(4),
    RU(5),
    ES(6),
    EN(7),
    VI(8),
    ZH_HK(9),
    MY(10),
    TH(11),
    ID(12),
    NULL(13);

    private final int value;

    LanguageType(int value) {
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
    public static LanguageType findByValue(int value) {
        switch (value) {
            case 0:
                return CN;
            case 1:
                return JA;
            case 2:
                return KO;
            case 3:
                return FR;
            case 4:
                return DE;
            case 5:
                return RU;
            case 6:
                return ES;
            case 7:
                return EN;
            case 8:
                return VI;
            case 9:
                return ZH_HK;
            case 10:
                return MY;
            case 11:
                return TH;
            case 12:
                return ID;
            case 13:
                return NULL;
            default:
                return null;
        }
    }
}
