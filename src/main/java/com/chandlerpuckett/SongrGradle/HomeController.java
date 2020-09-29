package com.chandlerpuckett.SongrGradle;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {

    @GetMapping("/hello")                            // in js: app.get("/)
    public String showHome(){
        return "hello";                          // filename for thymeleaf file for render --> ejs
    }

    @GetMapping("/capitalize/{var}")
    public String capitalize (
            Model m,
            @PathVariable String var
    ) {

        System.out.println(var.toUpperCase());
        m.addAttribute("uppercase",var.toUpperCase());

        return "capitalize";
    }
}
