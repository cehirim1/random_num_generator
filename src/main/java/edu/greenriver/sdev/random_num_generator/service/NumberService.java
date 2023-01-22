package edu.greenriver.sdev.random_num_generator.service;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * This is class is the NumberService class that houses the Business Logic
 * of our program. The random number is generated here.
 */
@Service
public class NumberService {

    public int between(int low, int high){

        Random number = new Random();
        int rand = number.nextInt(low,high);
        return rand;
    }


    public List<Integer> six(int low, int high){

        List<Integer> numbers = new ArrayList<>();

        Random number = new Random();

        for (int i = 0; i < 5; i++) {

            numbers.add(number.nextInt(low, high));
        }
        return numbers;
    }


    public List<Integer> lists(int low, int high){

        List<Integer> random = new ArrayList<>();
                Random number = new Random();

        for (int i = 0; i < 20; i++) {

                random.add(number.nextInt(low, high));
        }
        return random;
    }
}
