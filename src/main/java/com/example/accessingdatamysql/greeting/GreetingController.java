package com.example.accessingdatamysql.greeting;

import com.example.accessingdatamysql.greeting.Greeting;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
//@RequestMapping(path="/greet")
public class GreetingController {
//@Autowired
//    private static final String template = "Hello, %s!";
//    private final AtomicLong counter = new AtomicLong();
    @GetMapping("/greeting")
    public String getForm(Model model){

        model.addAttribute("greeting",new Greeting());
        System.out.println("111");
        System.out.println(model.getAttribute("greeting"));
        return "greeting";
    }
    @PostMapping("/blog/result")
    //
    public String greetingSubmit(@ModelAttribute Greeting greeting) {
        System.out.println("2222");
        //System.out.println(greeting.getId());

        return "result";
    }
    @GetMapping("/blog/result")
    public String  jump(){
        return  "result";
    }
}