package com.mvpotter.kladrapi.request;

public class RegionRequest extends AbstractQueryWithTypeRequest {

    public RegionRequest(final String query) {
        super(query, ContentType.REGION);
    }

}
