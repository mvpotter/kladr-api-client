package com.mvpotter.kladrapi.request.wrapper;

import com.mvpotter.kladrapi.request.AbstractRequest;
import com.mvpotter.kladrapi.request.OneStringRequest;
import com.mvpotter.kladrapi.request.Request;
import org.junit.Assert;
import org.junit.Test;

import java.util.Map;

public class RequestWithCityIdTest extends AbstractRequest {

    private static final String PARAM_CITY_ID = "cityId";

    private static final String CITY_ID = "5005";
    private static final Request REQUEST = new OneStringRequest("test");

    @Test
    public void testToMap() {
        final Request request = new RequestWithCityId(REQUEST, CITY_ID);
        final Map<String, String> map = request.toMap();
        Assert.assertNotNull(map.containsKey(PARAM_CITY_ID));
        Assert.assertEquals(CITY_ID, map.get(PARAM_CITY_ID));
    }

}
