package com.kodilla.kodillacalculator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.*;
import java.lang.*;
import java.io.*;

@SpringBootApplication
public class KodillaCalculatorApplication {

    public static void main(String[] args) {
        SpringApplication.run(KodillaCalculatorApplication.class, args);

        SimpleCalculator simpleCalculator = new SimpleCalculator();
        int result = simpleCalculator.addAToB(5, 5);
        System.out.println("Wynik to: " + result);
    }
}
