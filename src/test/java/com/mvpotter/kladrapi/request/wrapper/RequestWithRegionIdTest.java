package com.mvpotter.kladrapi.request.wrapper;

import com.mvpotter.kladrapi.request.AbstractRequest;
import com.mvpotter.kladrapi.request.OneStringRequest;
import com.mvpotter.kladrapi.request.Request;
import org.junit.Assert;
import org.junit.Test;

import java.util.Map;

public class RequestWithRegionIdTest extends AbstractRequest {

    private static final String PARAM_REGION_ID = "regionId";

    private static final String REGION_ID = "540000";
    private static final Request REQUEST = new OneStringRequest("test");

    @Test
    public void testToMap() {
        final Request request = new RequestWithRegionId(REQUEST, REGION_ID);
        final Map<String, String> map = request.toMap();
        Assert.assertNotNull(map.containsKey(PARAM_REGION_ID));
        Assert.assertEquals(REGION_ID, map.get(PARAM_REGION_ID));
    }

}
