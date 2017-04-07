package com.mvpotter.kladrapi.request;

/**
 * KLADR city request.
 */
public class CityRequest extends AbstractQueryWithTypeRequest {

    /**
     * Constructor.
     *
     * @param query city query
     */
    public CityRequest(final String query) {
        super(query, ContentType.CITY);
    }

}
