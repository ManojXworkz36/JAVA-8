package com.xworkz.javaEightFeatures;

import com.xworkz.javaEightFeatures.employee.EmployeeDto;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class EmployeeTester {
    public static void main(String[] args) {
        List<EmployeeDto> list = Arrays.asList(new EmployeeDto(1,"Gagan","Software Engineer",69000),
                new EmployeeDto(5,"Yuvraj","Civil Engineer",120000),
                new EmployeeDto(3,"Sachin","Marketing",35000),
                new EmployeeDto(2,"Eshwar","Testing",55000),
                new EmployeeDto(4,"Keerthi","Testing",80000));

      //  System.out.println( list.stream().sorted(Comparator.comparing(EmployeeDto::getSalary)).collect(Collectors.toList()));
       // System.out.println(list.stream().min(Comparator.comparing(EmployeeDto::getSalary)).get());

       // System.out.println(list.stream().min(Comparator.comparing(EmployeeDto::getEmpName)).get());

       // list.stream().sorted((o1, o2) -> o1.getEmpName().compareTo(o2.getEmpName())).forEach(System.out::println);

        //list.stream().sorted((o1, o2) -> o1.getDepartment().compareTo(o2.getDepartment())).forEach(System.out::println);

        //list.stream().sorted((o1, o2) -> (int)(o1.getSalary()- o2.getSalary())).limit(2).forEach(System.out::println);
       // System.out.println(  list.stream().sorted((o1, o2) ->(int) (o1.getSalary()- o2.getSalary())).skip(1).findFirst());

      //  System.out.println( list.stream().sorted(Comparator.comparing(EmployeeDto::getSalary).reversed()).skip(1).findFirst());
       // Map<String,Long> employeeCount= list.stream().collect(Collectors.groupingBy(EmployeeDto::getDepartment, TreeMap::new,Collectors.counting()));
//        employeeCount.forEach(department,count)->System.out.println("%s has %d employee(s)%n",department,count);
//
      //  System.out.println(employeeCount);
        Function<EmployeeDto,Double> function=EmployeeDto::getSalary;
        System.out.println( list.stream().max(Comparator.comparing(function)).get());


        Function<EmployeeDto,Double> function1=employeeDto -> {
            return employeeDto.getSalary();
        };
        System.out.println(list.stream().max(Comparator.comparing(function1)).get());

    }

}
//number of employees in the respective departments
