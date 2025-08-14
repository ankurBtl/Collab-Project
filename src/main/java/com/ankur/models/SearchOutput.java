package com.ankur.models;

import com.fasterxml.jackson.annotation.JsonGetter;

import java.util.List;

public class SearchOutput {
    private List<Search> Search;

    @JsonGetter(value="Search")
    public List<Search> getSearch() {
        return Search;
    }

    public void setSearch(List<Search> search) {
        Search = search;
    }
}
