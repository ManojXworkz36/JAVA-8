package com.xworkz.javaEightFeatures;

import com.xworkz.javaEightFeatures.inter.*;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class JavaEightFeaturesRunner {
    public static void main(String[] args) {
        Multiplication consumer = (i, j)-> System.out.println(i*j);
        consumer.multiply(23,22);

        Addition addition = (x,y,z)-> System.out.println(x+y+z);
        addition.addition(12,32,54);

        Substraction substraction= (m,n)-> System.out.println(m-n);
        substraction.subtract(77,99);

        Division division=((a, b) -> System.out.println(a/b));
        division.division(24,12);

        List<Integer> integers = new ArrayList<>();

        integers.add(443);
        integers.add(33);
        integers.add(4333);
        integers.add(222);
        integers.stream().filter(integer-> integer%2!=0).forEach(oddInteger-> System.out.println(oddInteger));
integers.stream().filter(integer -> integer %2==0).forEach(evenInteger-> System.out.println(evenInteger));
        Consumer<Integer>consumer1=integer -> System.out.println(integer);
        integers.forEach(consumer1);

        integers.forEach(integer -> System.out.println(integer));

        Print print=(detail -> System.out.println(detail));
        print.printPaper("Newspaper are called printed media");

        Bank bank=(amount -> System.out.println(amount));
        bank.deposit(5000);

        Cofee cofee =(flavour -> System.out.println(flavour));
        cofee.drink("Waah taj");
                   
        Employee employee=(name -> System.out.println(name));
        employee.data("Abhilash S N");

        Player player=(function -> System.out.println(function));
        player.move("Fitness is the key for any sports");

        Police police=(salary -> System.out.println(salary));
        police.duty(32000);

        Radio radio=(sound -> System.out.println(sound));
        radio.transmitting("Radio transmits and recives the electromagnetic waves ");

        Television television = movies -> System.out.println(movies);
        television.entertainment("Kantara,Kgf,Vikrant rona,max");

        Vehicle vehicle=speed -> System.out.println(speed);
        vehicle.speedUp(200);


    }
}
