package com.mvpotter.kladrapi.request;

/**
 * KLADR request wrapper that adds limit and offset.
 */
public class RequestWithLimit extends AbstractRequest {

    public static final String PARAM_LIMIT = "limit";
    public static final String PARAM_OFFSET = "offset";

    /**
     * Constructor.
     *
     * @param request original request
     * @param limit limit value
     */
    public RequestWithLimit(final Request request, final int limit) {
        super(request.toMap());
        map.put(PARAM_LIMIT, String.valueOf(limit));
    }

    /**
     * Constructor.
     *
     * @param request original request
     * @param limit limit value
     * @param offset offset value
     */
    public RequestWithLimit(final Request request, final int limit, final int offset) {
        super(request.toMap());
        map.put(PARAM_LIMIT, String.valueOf(limit));
        map.put(PARAM_OFFSET, String.valueOf(offset));
    }

}
