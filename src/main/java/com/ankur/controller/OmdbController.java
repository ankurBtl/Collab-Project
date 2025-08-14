package com.ankur.controller;

import com.ankur.models.SearchInput;
import com.ankur.models.SearchOutput;
import com.ankur.service.OmdbService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OmdbController {
@Autowired
OmdbService service;
    @RequestMapping(value = "/search/", method = RequestMethod.GET)
    public SearchOutput getProducts(@RequestBody SearchInput object) {
        return service.searchByName(object.getName());
    }
}
