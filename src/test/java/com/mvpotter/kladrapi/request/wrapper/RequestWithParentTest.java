package com.mvpotter.kladrapi.request.wrapper;

import com.mvpotter.kladrapi.request.Request;
import com.mvpotter.kladrapi.request.ZipRequest;
import org.junit.Assert;
import org.junit.Test;

import java.util.Map;

public class RequestWithParentTest {

    private static final String PARAM_WITH_PARENT = "withParent";
    private static final Request REQUEST = new ZipRequest("");

    @Test
    public void testToMap() {
        final Request request = new RequestWithParent(REQUEST);
        final Map<String, String> map = request.toMap();
        Assert.assertNotNull(map.containsKey(PARAM_WITH_PARENT));
        Assert.assertEquals("1", map.get(PARAM_WITH_PARENT));
    }

}
