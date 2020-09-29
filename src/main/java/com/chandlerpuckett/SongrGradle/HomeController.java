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
        return "index";                          // filename for thymeleaf file for render --> ejs
    }

//    http://localhost:8080/greeting?person=%22chandler%22&lastSeen=0&message=%22good%20to%20see%20you%22
    @GetMapping("/greeting/{to}")
    public String sayHello(
            Model mPotato,
            String person,
            Integer lastSeen,
            String message,
            @PathVariable String to
            ){

        System.out.println("To : " + to);
        System.out.println(String.format(
                "Message from %s :" +
                "it's been %d days since i saw you, %s",
                person,
                lastSeen,
                message));

        mPotato.addAttribute("person",person);
        mPotato.addAttribute("days",lastSeen);
        mPotato.addAttribute("message",message);

        return "hello";
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
