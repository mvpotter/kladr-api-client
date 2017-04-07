package com.mvpotter.kladrapi.request;

/**
 * KLADR street request.
 */
public class StreetRequest extends AbstractQueryWithTypeRequest {

    public static final String PARAM_CITY_ID = "cityId";

    /**
     * Constructor.
     *
     * @param cityId city id
     * @param query street query
     */
    public StreetRequest(final String cityId, final String query) {
        super(query, ContentType.STREET);
        map.put(PARAM_CITY_ID, cityId);
    }

}
