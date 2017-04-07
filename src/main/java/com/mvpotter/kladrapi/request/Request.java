package com.mvpotter.kladrapi.request;

import java.util.Map;

/**
 * KLADR request.
 */
public interface Request {

    /**
     * Convert request parameters to map.
     *
     * @return map with request parameters
     */
    Map<String, String> toMap();

}
