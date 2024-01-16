package edu.greenriver.sdev.random_num_gen.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import edu.greenriver.sdev.random_num_gen.service.NumberService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


/**
 * @author Chisom E.
 * @version 17
 * Date 01/21/2023
 *
 * This is the NumberController class that passes a client's request to the NumberService class
 * and fetches data from the same class to the client.
 */
@Controller
public class NumberController {

    private static final int NUM = 20;
    private static final int HIGH = 69;
    private NumberService service;

    /**
     * @param service service
     */
    public NumberController(NumberService service) {
        this.service = service;
    }

    /**
     * @param modelVars modelVars
     * @return a random number between 1 - 20
     */
    @SuppressWarnings("SpellCheckingInspection")
    @RequestMapping("/randnum")
    public String genNumber(Model modelVars){

        modelVars.addAttribute("num", service.between(1, NUM));
        return "randnum";
    }

    /**
     * @param modelBall modelBall
     * @return a list of five random powerballs between 1 -69
     * and one powerball between 1 - 20.
     */
    @SuppressWarnings("SpellCheckingInspection")
    @RequestMapping("/powerball")
    public String genNumbers(Model modelBall){

        modelBall.addAttribute("nums", service.six(1, HIGH));

        modelBall.addAttribute("num1", service.between(1, NUM));

        return "powerball";
    }

    /**
     * @param twenty parameter
     * @return a list of random numbers between 1 and 69
     */
    @SuppressWarnings("SpellCheckingInspection")
    @RequestMapping("/numlist")
    public String allNumbers(Model twenty){
        twenty.addAttribute("nums", service.lists(1, HIGH));




        return "numlist";
    }

    @Override
    public String toString() {
        return "NumberController{" +
                "service=" + service +
                '}';
    }
}
