package com.mvpotter.kladrapi.request;

/**
 * KLADR abstract query with content type request. Appends content type parameter to query request.
 */
public abstract class AbstractQueryWithTypeRequest extends AbstractQueryRequest {

    public static final String PARAM_CONTENT_TYPE = "contentType";

    /**
     * Constructor.
     *
     * @param query query
     * @param contentType required content type
     */
    public AbstractQueryWithTypeRequest(final String query, final ContentType contentType) {
        super(query);
        map.put(PARAM_CONTENT_TYPE, contentType.getCode());
    }



}
