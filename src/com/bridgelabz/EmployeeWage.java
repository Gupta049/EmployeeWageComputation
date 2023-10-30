package com.bridgelabz;

public class EmployeeWage {
    public static void main(String[] args)
    {
        System.out.println("Welcome to the Employee Wage Program");
        int IS_FULL_TIME = 1;
        int EMP_RATE_PER_HOUR = 20;
        int FULL_DAY_WORK_HOUR = 8;
        int totalWage;

        int empCheck = (int)Math.floor(Math.random()*10)%2;
        if (empCheck == IS_FULL_TIME) {
            System.out.println("Employee is Present");
            totalWage = EMP_RATE_PER_HOUR * FULL_DAY_WORK_HOUR;
        }else {
            System.out.println("Employee is Absent");
            totalWage = 0;
        }
        System.out.println("Employee Daily Wage : " + totalWage);
    }
}
