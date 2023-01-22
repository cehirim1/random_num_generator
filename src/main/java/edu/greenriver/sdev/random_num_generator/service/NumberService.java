package edu.greenriver.sdev.random_num_generator.service;

import org.springframework.stereotype.Service;

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
}
