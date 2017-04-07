package com.mvpotter.kladrapi.request;

import org.junit.Assert;
import org.junit.Test;

public class ContentTypeTest {

    @Test
    public void findByCodeTest() {
        final ContentType contentType = ContentType.findByCode(ContentType.CITY.getCode());
        Assert.assertEquals(ContentType.CITY, contentType);
    }

    @Test(expected = IllegalArgumentException.class)
    public void findByUnknownCodeTest() {
        ContentType.findByCode("dfvsdfvsdf");
    }

}
