package com.companyName;

import com.calculatorCompany.Calculate;
import com.scientific.Trigonometric;

public class Main {
    public static void main(String[] args) {
        System.out.println(Calculate.add(5.0, 2.0));
        System.out.println(Calculate.sub(5.0, 2.0));
        System.out.println(Calculate.trigo("sin",30));
        //System.out.println(Trigonometric.cos(60));   // works when Trigonometric dependency is available at compile time

    }
}