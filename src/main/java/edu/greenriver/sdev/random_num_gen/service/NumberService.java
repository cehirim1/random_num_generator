package edu.greenriver.sdev.random_num_gen.service;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * @author Chisom E.
 * @version 17
 * Date 01/21/2023
 *
 *  This is the NumberService class that houses the Business Logic
 *  * of our program. The random data is generated here and passed to the
 *  * Controller which returns the data to the view (html file).
 */
@Service
public class NumberService {

    private static final int INT = 20;

    /**
     * @param low int low
     * @param high int high
     * @return random number between low and high
     */
    public int between(int low, int high){

        Random number = new Random();
        return number.nextInt(low,high);
    }


    /**
     * @param low int low
     * @param high int high
     * @return a list of randomly generated numbers between low and high
     */
    public List<Integer> six(int low, int high){

        List<Integer> numbers = new ArrayList<>();

        Random number = new Random();

        for (int i = 0; i < 5; i++) {

            numbers.add(number.nextInt(low, high));
        }
        return numbers;
    }


    /**
     * @param low int low
     * @param high int high
     * @return a list of randomly generated numbers between low and high
     */
    public List<Integer> lists(int low, int high){

        List<Integer> random = new ArrayList<>();
                Random number = new Random();

        for (int i = 0; i < INT; i++) {

                random.add(number.nextInt(low, high));
        }
        return random;
    }
}
