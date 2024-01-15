package com.xworkz.javaEightFeatures.employee;

import com.sun.org.apache.xerces.internal.impl.dv.xs.StringDV;

public class EmployeeDto implements Comparable {
    private int id;
    private String empName;
    private String department;
    private double salary;

    public EmployeeDto(){

    }

    public EmployeeDto(int id, String empName, String department,double salary){
        this.id=id;
        this.empName=empName;
        this.department=department;
        this.salary=salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "EmployeeDto{" +
                "id=" + id +
                ", empName='" + empName + '\'' +
                ", department='" + department + '\'' +
                ", salary=" + salary +
                '}';
    }

    @Override
    public int compareTo(Object o) {
        return this.id-id;
    }
}
