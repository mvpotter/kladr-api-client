package com.mvpotter.kladrapi.request;

import java.util.HashMap;
import java.util.Map;

/**
 * KLADR abstract request.
 */
public abstract class AbstractRequest implements Request {

    protected final Map<String, String> map;

    /**
     * Default constructor.
     */
    public AbstractRequest() {
        this.map = new HashMap<>();
    }

    /**
     * Constructor.
     *
     * @param map map with request parameters
     */
    public AbstractRequest(final Map<String, String> map) {
        this.map = new HashMap<>(map);
    }

    /**
     * {@inheritDoc}
     */
    public Map<String, String> toMap() {
        return map;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("AbstractRequest { ");
        sb.append("map = ").append(map);
        sb.append(" } ");
        return sb.toString();
    }
}
