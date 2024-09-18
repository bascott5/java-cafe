package com.csc340.demo;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@RestController
public class Controller {
    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public String index() {
        return "index";
    }
}
