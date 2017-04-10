package com.mvpotter.kladrapi.request.wrapper;

import com.mvpotter.kladrapi.request.AbstractRequest;
import com.mvpotter.kladrapi.request.Request;

/**
 * KLADR request wrapper that adds district id to request.
 */
public class RequestWithDistrictId extends AbstractRequest {

    public static final String PARAM_DISTRICT_ID = "districtId";

    /**
     * Constructor.
     *
     * @param request original request
     * @param districtId district id
     */
    public RequestWithDistrictId(final Request request, final String districtId) {
        super(request.toMap());
        map.put(PARAM_DISTRICT_ID, districtId);
    }

}
