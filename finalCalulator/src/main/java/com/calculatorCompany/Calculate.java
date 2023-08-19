package com.calculatorCompany;

import com.scientific.Trigonometric;

public class Calculate {
    public static double add(double x, double y){
        return x + y;
    }
    public static double sub(double x, double y){
        return x - y;
    }
    public static double trigo(String t, double deg){
        if(t.equals("sin")){
            return Trigonometric.sin(deg);
        }
        else if(t.equals("cos")){
            return Trigonometric.cos(deg);
        }
        else if(t.equals("tan")){
            return Trigonometric.tan(deg);
        }
        else{
            throw new RuntimeException("Unsupported Trigonometric Function Provided");
        }
    }
}
