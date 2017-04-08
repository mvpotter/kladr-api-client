package com.mvpotter.kladrapi.request;

/**
 * KLADR district request.
 */
public class DistrictRequest extends AbstractQueryWithTypeRequest {

    /**
     * Constructor.
     *
     * @param query district query
     */
    public DistrictRequest(final String query) {
        super(query, ContentType.DISTRICT);
    }

}
