package com.mvpotter.kladrapi.request.wrapper;

import com.mvpotter.kladrapi.request.AbstractRequest;
import com.mvpotter.kladrapi.request.Request;

/**
 * KLADR request wrapper that adds region id to request.
 */
public class RequestWithRegionId extends AbstractRequest {

    public static final String PARAM_REGION_ID = "regionId";

    /**
     * Constructor.
     *
     * @param request original request
     * @param regionId region id
     */
    public RequestWithRegionId(final Request request, final String regionId) {
        super(request.toMap());
        map.put(PARAM_REGION_ID, regionId);
    }

}
