package com.mvpotter.kladrapi.request;

import org.junit.Assert;
import org.junit.Test;

import java.util.Map;

public class RequestWithLimitTest {

    private static final String PARAM_LIMIT = "limit";
    private static final String PARAM_OFFSET = "offset";
    private static final Request REQUEST = new ZipRequest("");

    private static final int LIMIT = 5;
    private static final int OFFSET = 10;

    @Test
    public void testToMapWithLimit() {
        final Request request = new RequestWithLimit(REQUEST, LIMIT);
        final Map<String, String> map = request.toMap();
        Assert.assertNotNull(map.containsKey(PARAM_LIMIT));
        Assert.assertEquals(String.valueOf(LIMIT), map.get(PARAM_LIMIT));
    }

    @Test
    public void testToMapWithLimitAndOffset() {
        final Request request = new RequestWithLimit(REQUEST, LIMIT, OFFSET);
        final Map<String, String> map = request.toMap();
        Assert.assertNotNull(map.containsKey(PARAM_LIMIT));
        Assert.assertNotNull(map.containsKey(PARAM_OFFSET));
        Assert.assertEquals(String.valueOf(LIMIT), map.get(PARAM_LIMIT));
        Assert.assertEquals(String.valueOf(OFFSET), map.get(PARAM_OFFSET));
    }

}
