package com.mvpotter.kladrapi.request;

import com.mvpotter.kladrapi.request.wrapper.RequestWithCityId;

/**
 * KLADR street request.
 */
public class StreetRequest extends AbstractQueryWithTypeRequest {

    /**
     * Constructor.
     *
     * @param cityId city id
     * @param query street query
     */
    public StreetRequest(final String cityId, final String query) {
        super(query, ContentType.STREET);
        map.put(RequestWithCityId.PARAM_CITY_ID, cityId);
    }

}
