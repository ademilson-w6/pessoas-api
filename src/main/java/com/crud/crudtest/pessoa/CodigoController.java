package com.crud.crudtest.pessoa;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/source")
public class CodigoController {

    @GetMapping
    public String retornarLink(){
        return "https://github.com/ademilson-w6/pessoas-api.git";
    }
}
