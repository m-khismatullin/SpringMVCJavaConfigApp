package ru.khismatullin.springcourse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {
    @GetMapping(value="/")
    public String root() {
        return "root";
    }
    @GetMapping(value="/hello-world")
    public String sayHello() {
        return "hello_world";
    }
}
