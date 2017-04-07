package com.mvpotter.kladrapi.request;

/**
 * KLADR content type.
 */
public enum ContentType {

    REGION("region"),
    DISTRICT("district"),
    CITY("city"),
    STREET("street"),
    BUILDING("building");

    private final String code;

    ContentType(final String code) {
        this.code = code;
    }

    /**
     * Find content type by code.
     *
     * @param code content type code
     * @return found content type
     * @throws IllegalArgumentException if content type not found
     */
    public static ContentType findByCode(final String code) {
        for (final ContentType contentType: values()) {
            if (contentType.getCode().equals(code)) {
                return contentType;
            }
        }
        throw new IllegalArgumentException("No content type with code = " + code + " found");
    }

    public String getCode() {
        return code;
    }

}
