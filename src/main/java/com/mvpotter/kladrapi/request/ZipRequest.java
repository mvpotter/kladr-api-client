package com.mvpotter.kladrapi.request;

/**
 * KLADR zip request.
 */
public class ZipRequest extends AbstractRequest {

    public static final String PARAM_ZIP = "zip";
    public static final String PARAM_CONTENT_TYPE = "contentType";

    /**
     * Constructor.
     *
     * @param zip zip value
     */
    public ZipRequest(final String zip) {
        map.put(PARAM_ZIP, zip);
        map.put(PARAM_CONTENT_TYPE, ContentType.BUILDING.getCode());
    }

}
