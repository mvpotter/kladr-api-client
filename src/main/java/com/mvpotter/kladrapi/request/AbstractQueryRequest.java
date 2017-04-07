package com.mvpotter.kladrapi.request;

/**
 * KLADR abstract query request. Appends query parameter to request.
 */
public abstract class AbstractQueryRequest extends AbstractRequest {

    public static final String PARAM_QUERY = "query";

    public AbstractQueryRequest(final String query) {
        super();
        map.put(PARAM_QUERY, query);
    }



}
