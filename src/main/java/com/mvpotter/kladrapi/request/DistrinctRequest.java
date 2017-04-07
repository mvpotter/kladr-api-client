package com.mvpotter.kladrapi.request;

/**
 * KLADR district request.
 */
public class DistrinctRequest extends AbstractQueryWithTypeRequest {

    /**
     * Constructor.
     *
     * @param query district query
     */
    public DistrinctRequest(final String query) {
        super(query, ContentType.DISTRICT);
    }

}
