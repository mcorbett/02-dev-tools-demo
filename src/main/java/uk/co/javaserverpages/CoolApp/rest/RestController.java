package uk.co.javaserverpages.CoolApp.rest;

import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.web.bind.annotation.RestController

public class RestController {
    @GetMapping("/")
    public String sayHello() {
        return " <h1> Hello Matt and Gemma's knickers on the floor</h1> ";
    }

    @GetMapping("/workout")
    public String getDailyWorkouy() {
        return " <h1> run really fucking hard </h1>";
    }

}
