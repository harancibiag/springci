package es.warewolf.springci;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @GetMapping
    public String hello() {
        return "<h1>Hello World 2025</h1>";
    }
}
