package com.mvpotter.kladrapi;

import com.mvpotter.kladrapi.request.CityRequest;
import com.mvpotter.kladrapi.request.ContentType;
import com.mvpotter.kladrapi.request.OneStringRequest;
import com.mvpotter.kladrapi.request.Request;
import com.mvpotter.kladrapi.request.wrapper.RequestWithLimit;
import com.mvpotter.kladrapi.request.wrapper.RequestWithParent;
import com.mvpotter.kladrapi.request.ZipRequest;
import com.mvpotter.kladrapi.response.Locality;
import com.mvpotter.kladrapi.response.Response;
import com.mvpotter.kladrapi.response.SearchContext;
import org.junit.Assert;
import org.junit.Test;

import javax.ws.rs.ForbiddenException;

/**
 * @author mvpotter
 * @since 08/04/17
 */
public class KladrApiClientIT {

    private final KladrApiClient freeClient = new KladrApiClient("");

    @Test
    public void testFreeApiSearch() {
        final Response response = freeClient.search(new CityRequest("мос"));
        Assert.assertTrue(response.getResult().size() > 0);
    }

    @Test
    public void testFreeApiZipSearch() {
        final String zip = "119027";
        final Request request = new RequestWithParent(
                new RequestWithLimit(
                        new ZipRequest(zip),
                        1)
                );
        final Response response = freeClient.search(request);

        final SearchContext searchContext = response.getSearchContext();
        Assert.assertEquals("1", searchContext.getWithParent());
        Assert.assertEquals("1", searchContext.getLimit());
        Assert.assertEquals(ContentType.BUILDING.getCode(), searchContext.getContentType());

        Assert.assertEquals(1, response.getResult().size());
        final Locality locality = response.getResult().get(0);
        Assert.assertNotNull(locality.getId());
        Assert.assertNotNull(locality.getName());
        Assert.assertEquals(ContentType.BUILDING.getCode(), locality.getContentType());
        Assert.assertEquals(zip, locality.getZip());
        Assert.assertEquals("дом", locality.getType());
        Assert.assertEquals("д", locality.getTypeShort());
        Assert.assertEquals("45268552000", locality.getOkato());
        Assert.assertTrue(locality.getParents().size() > 0);
    }

    @Test
    public void testFreeApiOneStringSearch() {
        final String query = "ленина";
        final Request request = new OneStringRequest(query);
        final Response response = freeClient.search(request);
        final SearchContext searchContext = response.getSearchContext();
        Assert.assertEquals(query, searchContext.getQuery());
        Assert.assertEquals("1", searchContext.getOneString());
    }

    @Test(expected = ForbiddenException.class)
    public void testPaidApiSearchWithoutToken() {
        final KladrApiClient client = new KladrApiClient(KladrApiClient.PAID_URL, "");
        client.search(new CityRequest("мос"));
    }

}
