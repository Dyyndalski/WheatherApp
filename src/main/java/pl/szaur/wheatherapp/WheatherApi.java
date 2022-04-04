package pl.szaur.wheatherapp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WheatherApi{

    @GetMapping("/hello")
    public String sayHello(){
        return "hello";
    }
}
