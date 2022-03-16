package ru.netology.jdatahw_3_1.controller;

import org.springframework.web.bind.annotation.*;
import ru.netology.jdatahw_3_1.service.Service;

@RestController
@RequestMapping("/")
public class Controller {

    private Service service;

    public Controller(Service service) {
        this.service = service;
    }

    @GetMapping("/hello")
    public String hello (){
        return "Hello!";
    }

    @GetMapping("/products/fetch-product")
    public String getProduct(@RequestParam String name) {
        return service.getProduct(name);
    }

}