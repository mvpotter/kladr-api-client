package com.mvpotter.kladrapi.response;

import java.util.List;

/**
 * KLADR locality: region, district, city, street, building.
 */
public class Locality {

    private String id;
    private String name;
    private String fullName;
    private String zip;
    private String type;
    private String typeShort;
    private String okato;
    private String contentType;
    private List<Locality> parents;

    public String getContentType() {
        return contentType;
    }

    public void setContentType(final String contentType) {
        this.contentType = contentType;
    }

    public String getId() {
        return id;
    }

    public void setId(final String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(final String fullName) {
        this.fullName = fullName;
    }

    public String getOkato() {
        return okato;
    }

    public void setOkato(final String okato) {
        this.okato = okato;
    }

    public List<Locality> getParents() {
        return parents;
    }

    public void setParents(final List<Locality> parents) {
        this.parents = parents;
    }

    public String getType() {
        return type;
    }

    public void setType(final String type) {
        this.type = type;
    }

    public String getTypeShort() {
        return typeShort;
    }

    public void setTypeShort(final String typeShort) {
        this.typeShort = typeShort;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(final String zip) {
        this.zip = zip;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Locality { ");
        sb.append("contentType = '").append(contentType).append('\'');
        sb.append(", id = '").append(id).append('\'');
        sb.append(", name = '").append(name).append('\'');
        sb.append(", fullName = '").append(fullName).append('\'');
        sb.append(", zip = '").append(zip).append('\'');
        sb.append(", type = '").append(type).append('\'');
        sb.append(", typeShort = '").append(typeShort).append('\'');
        sb.append(", okato = '").append(okato).append('\'');
        sb.append(", parents = ").append(parents);
        sb.append(" } ");
        return sb.toString();
    }

}
