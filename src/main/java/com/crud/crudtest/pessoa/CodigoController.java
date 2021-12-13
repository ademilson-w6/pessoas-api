package com.crud.crudtest.pessoa;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RestController("/source")
public class CodigoController {

    @GetMapping("/")
    public String retornarLink(){
        return "https://github.com/reyotech/compras-api";
    }
}
