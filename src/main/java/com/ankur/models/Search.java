package com.ankur.models;

import com.fasterxml.jackson.annotation.JsonGetter;

public class Search {
    private String title;
    private String Year;
    private String imdbID;
    private String Type;
    private String Poster;

    @JsonGetter(value="Title")
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @JsonGetter(value="Year")
    public String getYear() {
        return Year;
    }

    public void setYear(String year) {
        Year = year;
    }

    @JsonGetter(value="imdbID")
    public String getImdbID() {
        return imdbID;
    }

    public void setImdbID(String imdbID) {
        this.imdbID = imdbID;
    }

    @JsonGetter(value="Type")
    public String getType() {
        return Type;
    }

    public void setType(String type) {
        Type = type;
    }

    @JsonGetter(value="Poster")
    public String getPoster() {
        return Poster;
    }

    public void setPoster(String poster) {
        Poster = poster;
    }
}
