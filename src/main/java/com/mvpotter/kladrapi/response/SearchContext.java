package com.mvpotter.kladrapi.response;

/**
 * KLADR search context.
 */
public class SearchContext {

    private String query;
    private String oneString;
    private String contentType;
    private String withParent;
    private String limit;

    public String getContentType() {
        return contentType;
    }

    public void setContentType(final String contentType) {
        this.contentType = contentType;
    }

    public String getLimit() {
        return limit;
    }

    public void setLimit(final String limit) {
        this.limit = limit;
    }

    public String getQuery() {
        return query;
    }

    public void setQuery(final String query) {
        this.query = query;
    }

    public String getOneString() {
        return oneString;
    }

    public void setOneString(final String oneString) {
        this.oneString = oneString;
    }

    public String getWithParent() {
        return withParent;
    }

    public void setWithParent(final String withParent) {
        this.withParent = withParent;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("SearchContext { ");
        sb.append("contentType = '").append(contentType).append('\'');
        sb.append(", query = '").append(query).append('\'');
        sb.append(", withParent = '").append(withParent).append('\'');
        sb.append(", limit = '").append(limit).append('\'');
        sb.append(" } ");
        return sb.toString();
    }

}
