package com.mvpotter.kladrapi;

import com.mvpotter.kladrapi.request.CityRequest;
import org.junit.Test;

import javax.ws.rs.ForbiddenException;

/**
 * @author mvpotter
 * @since 08/04/17
 */
public class KladrApiClientIT {

    @Test(expected = ForbiddenException.class)
    public void testPaidApiSearchWithoutToken() {
        final KladrApiClient client = new KladrApiClient(KladrApiClient.PAID_URL, "");
        client.search(new CityRequest("мос"));
    }

}
