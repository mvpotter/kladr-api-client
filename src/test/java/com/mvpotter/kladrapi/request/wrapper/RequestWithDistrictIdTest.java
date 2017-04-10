package com.mvpotter.kladrapi.request.wrapper;

import com.mvpotter.kladrapi.request.AbstractRequest;
import com.mvpotter.kladrapi.request.OneStringRequest;
import com.mvpotter.kladrapi.request.Request;
import org.junit.Assert;
import org.junit.Test;

import java.util.Map;

public class RequestWithDistrictIdTest extends AbstractRequest {

    private static final String PARAM_DISTRICT_ID = "districtId";

    private static final String DISTRICT_ID = "830000";
    private static final Request REQUEST = new OneStringRequest("test");

    @Test
    public void testToMap() {
        final Request request = new RequestWithDistrictId(REQUEST, DISTRICT_ID);
        final Map<String, String> map = request.toMap();
        Assert.assertNotNull(map.containsKey(PARAM_DISTRICT_ID));
        Assert.assertEquals(DISTRICT_ID, map.get(PARAM_DISTRICT_ID));
    }

}
