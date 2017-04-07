package com.mvpotter.kladrapi.request;

import org.junit.Assert;
import org.junit.Test;

import java.util.Map;

public class BuildingRequestTest {

    private static final String PARAM_STREET_ID = "streetId";
    private static final String PARAM_QUERY = "query";

    private static final String STREET_ID = "1228";
    private static final String QUERY = "55";

    @Test
    public void testToMap() {
        final Request request = new BuildingRequest(STREET_ID, QUERY);
        final Map<String, String> map = request.toMap();
        Assert.assertNotNull(map.containsKey(PARAM_STREET_ID));
        Assert.assertNotNull(map.containsKey(PARAM_QUERY));
        Assert.assertEquals(STREET_ID, map.get(PARAM_STREET_ID));
        Assert.assertEquals(QUERY, map.get(PARAM_QUERY));
    }

}
