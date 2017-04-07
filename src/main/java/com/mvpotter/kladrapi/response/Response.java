package com.mvpotter.kladrapi.response;

import java.util.List;

/**
 * KLADR service response.
 */
public class Response {

    private SearchContext searchContext;
    private List<Locality> result;

    /**
     * Default constructor.
     */
    public Response() {
    }

    /**
     * Constructor.
     *
     * @param result query result
     * @param searchContext search context
     */
    public Response(final List<Locality> result, final SearchContext searchContext) {
        this.result = result;
        this.searchContext = searchContext;
    }

    public List<Locality> getResult() {
        return result;
    }

    public SearchContext getSearchContext() {
        return searchContext;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Response { ");
        sb.append("result = ").append(result);
        sb.append(", searchContext = ").append(searchContext);
        sb.append(" } ");
        return sb.toString();
    }

}
