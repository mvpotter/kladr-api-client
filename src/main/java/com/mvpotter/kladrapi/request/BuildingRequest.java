package com.mvpotter.kladrapi.request;

/**
 * KLADR building request.
 */
public class BuildingRequest extends AbstractQueryWithTypeRequest {

    public static final String PARAM_STREET_ID = "streetId";

    /**
     * Constructor.
     *
     * @param streetId street id
     * @param query building query
     */
    public BuildingRequest(final String streetId, String query) {
        super(query, ContentType.BUILDING);
        map.put(PARAM_STREET_ID, streetId);
    }

}
