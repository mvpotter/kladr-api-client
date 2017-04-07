package com.mvpotter.kladrapi;

import com.mvpotter.kladrapi.request.Request;
import com.mvpotter.kladrapi.response.Response;
import org.glassfish.jersey.jackson.JacksonFeature;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import java.util.Map;

/**
 * KLADR API client.
 */
public class KladrApiClient {

    public static final String FREE_URL = "https://kladr-api.ru/api.php";
    public static final String PAID_URL = "https://kladr-api.com/api.php";

    public static final String PARAM_TOKEN = "token";

    private static final Logger LOGGER = LoggerFactory.getLogger(KladrApiClient.class);

    private final WebTarget target;

    public KladrApiClient(final String token) {
        this(FREE_URL, token);
    }

    public KladrApiClient(final String baseUrl, final String token) {
        final Client client = ClientBuilder.newBuilder()
                                           .register(ObjectMapperProvider.class)
                                           .register(JacksonFeature.class)
                                           .build();
        this.target = client.target(baseUrl).queryParam(PARAM_TOKEN, token);
    }

    /**
     * Search KLADR catalog.
     *
     * @param request search request
     * @return search result
     */
    public Response search(final Request request) {
        LOGGER.debug("search request: {}", request);
        WebTarget targetWithParams = target;
        for (final Map.Entry<String, String> entry: request.toMap().entrySet()) {
            targetWithParams = targetWithParams.queryParam(entry.getKey(), entry.getValue());
        }
        LOGGER.debug("search request url: {}", targetWithParams.getUri().toString());
        final Response response =  targetWithParams.request(MediaType.APPLICATION_JSON_TYPE).get(Response.class);
        LOGGER.debug("search result: {}", response);
        return response;
    }

}
