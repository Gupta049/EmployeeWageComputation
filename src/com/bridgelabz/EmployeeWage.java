package com.bridgelabz;

public class EmployeeWage {
    static final int IS_PRESENT = 1;
    public static void main(String[] args)
    {
        System.out.println("Welcome to the Employee Wage Program");
        int empCheck = (int)Math.floor(Math.random()*10)%2;
        if (empCheck == IS_PRESENT){
            System.out.println("Employee is Present");
        }else{
            System.out.println("Employee is Absent");
        }
    }
}
