package com.xworkz.javaEightFeatures;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Forest {
    public static void main(String[] args) {
        List<String> list =new ArrayList<>();
        list.add(null);
        list.add("Bandipur");
        list.add("BannerGhatta");
        list.add("Dandeli");
        list.add("Nagarahole");


//      Predicate<String> predicate = (String forestName)->forestName.contains("bandipur");
//        List<String>filterdOutput = list.stream().filter(predicate).collect(Collectors.toList());
//     System.out.println(filterdOutput);
        List<String> list11=null;

        List<String>list12 = Arrays.asList("Data not found");

        Optional<List<String>> optional = Optional.ofNullable(list11);
        System.out.println(optional.orElse(list12));



//        if (optional.isPresent()){
//            System.out.println(optional.get());
//        }else {
//            System.out.println("List is Null");
//        }
       //  System.out.println(optional.get());


        List<Integer> list1=new ArrayList<>();

list1.add(22);
list1.add(45);
list1.add(67);
list1.add(56);

List<Integer>filteredInteger = list1.stream().filter(integer -> integer%2==0).collect(Collectors.toList() );
        System.out.println(list1.stream().collect(Collectors.partitioningBy(integer -> integer%2==0)));
//        System.out.println(filteredInteger);

    }
}
