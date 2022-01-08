package com.crud.crudtest.url;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/source")
public class UrlController {

    @GetMapping
    public String retornarLink(){
        return "https://github.com/ademilson-w6/pessoas-api.git";
    }
}
