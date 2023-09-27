package ie.atu.hellothere;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RequestController {

    @GetMapping("/hello")
    public String hello() {
        return "Hello, There!";
    }

    @GetMapping ("/greet/{name}")
    public String greetbyname(@PathVariable String name){
        return "Hello there, " + name;
    }



}
