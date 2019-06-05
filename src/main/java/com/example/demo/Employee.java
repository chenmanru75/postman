package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class Employee {
    @GetMapping("/employees")
    public String employee(){
        return "[{\"id\":0,\"name\":\"小明\",\"age\":20,\"gender\":\"男\"},{\"id\":1,\"name\":\"小红\",\"age\":19,\"gender\":\"女\"},{\"id\":2,\"name\":\"小智\",\"age\":15,\"gender\":\"男\"},{\"id\":3,\"name\":\"小刚\",\"age\":16,\"gender\":\"男\"},{\"id\":0,\"name\":\"小明\",\"age\":20,\"gender\":\"男\"}]";

    }
}
