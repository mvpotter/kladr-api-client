package com.mvpotter.kladrapi.request.wrapper;

import com.mvpotter.kladrapi.request.AbstractRequest;
import com.mvpotter.kladrapi.request.Request;

/**
 * KLADR request wrapper that adds city id to request.
 */
public class RequestWithCityId extends AbstractRequest {

    public static final String PARAM_CITY_ID = "cityId";

    /**
     * Constructor.
     *
     * @param request original request
     * @param cityId city id
     */
    public RequestWithCityId(final Request request, final String cityId) {
        super(request.toMap());
        map.put(PARAM_CITY_ID, cityId);
    }

}
