package com.mvpotter.kladrapi.request;

/**
 * KLADR type codes.
 */
public enum TypeCode {

    CITY(1),
    SETTLEMENT(2),
    VILLAGE(4);

    private final int code;

    TypeCode(final int code) {
        this.code = code;
    }

    public int getCode() {
        return code;
    }

}
