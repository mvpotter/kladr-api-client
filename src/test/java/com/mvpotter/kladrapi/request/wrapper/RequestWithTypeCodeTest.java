package com.mvpotter.kladrapi.request.wrapper;

import com.mvpotter.kladrapi.request.CityRequest;
import com.mvpotter.kladrapi.request.Request;
import com.mvpotter.kladrapi.request.TypeCode;
import org.junit.Assert;
import org.junit.Test;

import java.util.Map;

public class RequestWithTypeCodeTest {

    private static final String PARAM_TYPE_CODE = "typeCode";
    private static final Request REQUEST = new CityRequest("");

    @Test(expected = IllegalArgumentException.class)
    public void testEmpty() {
        new RequestWithTypeCode(REQUEST);
    }

    @Test
    public void testCity() {
        final Request request = new RequestWithTypeCode(REQUEST, TypeCode.CITY);
        final Map<String, String> map = request.toMap();
        Assert.assertNotNull(map.containsKey(PARAM_TYPE_CODE));
        Assert.assertEquals(String.valueOf(TypeCode.CITY.getCode()), map.get(PARAM_TYPE_CODE));
    }

    @Test
    public void testCitiesAndSettlements() {
        final Request request = new RequestWithTypeCode(REQUEST, TypeCode.CITY, TypeCode.SETTLEMENT);
        final Map<String, String> map = request.toMap();
        Assert.assertNotNull(map.containsKey(PARAM_TYPE_CODE));
        Assert.assertEquals(String.valueOf(TypeCode.CITY.getCode() | TypeCode.SETTLEMENT.getCode()),
                            map.get(PARAM_TYPE_CODE));
    }

}
