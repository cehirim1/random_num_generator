package edu.greenriver.sdev.random_num_generator.controller;

import edu.greenriver.sdev.random_num_generator.service.NumberService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


/**
 * The NumberController class.. and returns the request to the user.
 */
@Controller
public class NumberController {

    private NumberService service;

    public NumberController(NumberService service) {
        this.service = service;
    }

    @RequestMapping("/randnum")
    public String genNumber(Model modelVars){

        modelVars.addAttribute("num", service.between(1,20));
        return "randnum";
    }

    @RequestMapping("/powerball")
    public String genNumbers(Model modelBall){

        modelBall.addAttribute("nums", service.six(1,69));

        modelBall.addAttribute("num1", service.between(1,20));

        return "powerball";
    }

    @RequestMapping("/numlist")
    public String allNumbers(Model twenty){

        twenty.addAttribute("nums", service.lists(1,69));

        return "numlist";
    }
}
