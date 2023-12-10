package org.example;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TutorialController {

    @GetMapping("/greeting")
    public String home() {
        return "home";
    }

    @GetMapping("/")
    public String index() {
        return "index";
    }
}
