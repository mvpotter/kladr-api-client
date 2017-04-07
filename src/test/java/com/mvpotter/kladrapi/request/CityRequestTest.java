package com.mvpotter.kladrapi.request;

import org.junit.Assert;
import org.junit.Test;

import java.util.Map;

public class CityRequestTest {

    private static final String PARAM_CONTENT_TYPE = "contentType";
    private static final String PARAM_QUERY = "query";

    private static final String QUERY = "Москва";

    @Test
    public void testToMap() {
        final Request request = new CityRequest(QUERY);
        final Map<String, String> map = request.toMap();
        Assert.assertNotNull(map.containsKey(PARAM_CONTENT_TYPE));
        Assert.assertNotNull(map.containsKey(PARAM_QUERY));
        Assert.assertEquals(ContentType.CITY.getCode(), map.get(PARAM_CONTENT_TYPE));
        Assert.assertEquals(QUERY, map.get(PARAM_QUERY));
    }

}
