package com.mvpotter.kladrapi.request;

import org.junit.Assert;
import org.junit.Test;

import java.util.Map;

public class OneStringRequestTest {

    public static final String PARAM_ONE_STRING = "oneString";
    private static final String PARAM_QUERY = "query";

    private static final String QUERY = "Ленина";

    @Test
    public void testToMap() {
        final Request request = new OneStringRequest(QUERY);
        final Map<String, String> map = request.toMap();
        Assert.assertNotNull(map.containsKey(PARAM_ONE_STRING));
        Assert.assertNotNull(map.containsKey(PARAM_QUERY));
        Assert.assertEquals("1", map.get(PARAM_ONE_STRING));
        Assert.assertEquals(QUERY, map.get(PARAM_QUERY));
    }

}
