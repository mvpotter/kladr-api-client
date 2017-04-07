package com.mvpotter.kladrapi.request;

/**
 * KLADR one string request.
 */
public class OneStringRequest extends AbstractQueryRequest {

    public static final String PARAM_ONE_STRING = "oneString";

    /**
     * Constructor.
     *
     * @param query one string query
     */
    public OneStringRequest(final String query) {
        super(query);
        map.put(PARAM_ONE_STRING, "1");
    }

}
