package ie.atu.hellothere;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
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

    @GetMapping("/details")
    public String details(@RequestParam String name, @RequestParam int age){
        return "Hi my name is, " +name + " and I am " + age + " years old";
    }



}
