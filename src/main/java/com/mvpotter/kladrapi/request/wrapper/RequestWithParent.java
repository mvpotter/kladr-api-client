package com.mvpotter.kladrapi.request.wrapper;

import com.mvpotter.kladrapi.request.AbstractRequest;
import com.mvpotter.kladrapi.request.Request;

/**
 * KLADR request wrapper that adds include parent info property.
 */
public class RequestWithParent extends AbstractRequest {

    public static final String PARAM_WITH_PARENT = "withParent";

    /**
     * Constructor.
     *
     * @param request original request
     */
    public RequestWithParent(final Request request) {
        super(request.toMap());
        map.put(PARAM_WITH_PARENT, "1");
    }

}
