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

    @RequestMapping()
    public String genNumber(Model modelVars){

        modelVars.addAttribute("num", service.between(1,20));
        return "";
    }
}
