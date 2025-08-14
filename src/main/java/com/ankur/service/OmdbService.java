package com.ankur.service;

import com.ankur.models.SearchOutput;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class OmdbService {
    private static final String APIKey = "65aa85b";

    RestTemplate template = new RestTemplate();

    public SearchOutput searchByName(String name) {

        String url = "http://www.omdbapi.com/?apikey="+ APIKey +"&s="  + name;

        SearchOutput response = template.getForObject(url, SearchOutput.class);
        if (response != null) {
            System.out.println("Searched movie : " + name);
        }
        return response;
    }

}