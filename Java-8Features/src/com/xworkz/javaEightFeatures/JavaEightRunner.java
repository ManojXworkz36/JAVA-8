package com.xworkz.javaEightFeatures;


import com.xworkz.javaEightFeatures.inter.Addition;
import com.xworkz.javaEightFeatures.inter.Division;
import com.xworkz.javaEightFeatures.inter.Multiplication;
import com.xworkz.javaEightFeatures.inter.Substraction;

public class JavaEightRunner {
    public static void addition(int q,int w,int r) {
        System.out.println(q + w + r);
    }
    public static void multiply(int q,int x){
        System.out.println(q*x);
    }
    public static  void subtract(int w,int e){
        System.out.println(w-e);
    }

    public static void division(int q,int s){
        System.out.println(q%s);
    }
    public static void main(String[] args) {
        Addition addition = JavaEightRunner::addition;
        addition.addition(10,13,33);

        Multiplication multiplication = JavaEightRunner::multiply;
        multiplication.multiply(12,22);

        Division division = JavaEightRunner::division;
        division.division(12,24);

        Substraction substraction = JavaEightRunner::subtract;
        substraction.subtract(23,56);

        

    }
}
