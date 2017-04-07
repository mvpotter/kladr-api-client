package com.mvpotter.kladrapi.request;

import org.junit.Assert;
import org.junit.Test;

import java.util.Map;

public class ZipRequestTest {

    private static final String ZIP = "630001";
    private static final String PARAM_ZIP = "zip";
    private static final String PARAM_CONTENT_TYPE = "contentType";

    @Test
    public void testToMap() {
        final Request request = new ZipRequest(ZIP);
        final Map<String, String> map = request.toMap();
        Assert.assertNotNull(map.containsKey(PARAM_ZIP));
        Assert.assertNotNull(map.containsKey(PARAM_CONTENT_TYPE));
        Assert.assertEquals(ZIP, map.get(PARAM_ZIP));
        Assert.assertEquals(ContentType.BUILDING.getCode(), map.get(PARAM_CONTENT_TYPE));
    }

}
