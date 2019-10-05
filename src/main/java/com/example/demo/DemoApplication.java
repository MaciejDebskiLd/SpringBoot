package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

@SpringBootApplication
@RestController
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @RequestMapping(path = "/", method = RequestMethod.GET)
    public String indexPage() {
        return "Helloo world";
    }

    @GetMapping(path="/random")
    public double randomValue(){
        return Math.random() * 10;
    }

    @GetMapping(path= "/hello/{firstName}/{lastName}")
    public String hello(@PathVariable("firstName") String firstName, @PathVariable("lastName") String lastName){
        return "Hello" + firstName + " " + lastName;
    }

    @GetMapping(path = "/sum")
    public double sumValue(@RequestParam Double valueA, @RequestParam Double valueB){
        return valueA + valueB;
    }


}
