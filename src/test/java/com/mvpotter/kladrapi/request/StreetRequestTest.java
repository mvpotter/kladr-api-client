package com.mvpotter.kladrapi.request;

import org.junit.Assert;
import org.junit.Test;

import java.util.Map;

public class StreetRequestTest {

    private static final String PARAM_CITY_ID = "cityId";
    private static final String PARAM_QUERY = "query";

    private static final String CITY_ID = "78000000";
    private static final String QUERY = "Ленина";

    @Test
    public void testToMap() {
        final Request request = new StreetRequest(CITY_ID, QUERY);
        final Map<String, String> map = request.toMap();
        Assert.assertNotNull(map.containsKey(PARAM_CITY_ID));
        Assert.assertNotNull(map.containsKey(PARAM_QUERY));
        Assert.assertEquals(CITY_ID, map.get(PARAM_CITY_ID));
        Assert.assertEquals(QUERY, map.get(PARAM_QUERY));
    }

}
