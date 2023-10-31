package com.bridgelabz;

public class EmployeeWage {
    static int finalWage = 0;
    static int finalWorkHours = 0;
    public static final int IS_FULL_TIME = 1;
    public static final int IS_PART_TIME = 2;
    public static void main(String[] args)
    {
        System.out.println("Welcome to the Employee Wage Program");
        int EMP_RATE_PER_HOUR = 20;
        int FULL_DAY_WORK_HOUR = 8;
        int PART_TIME_WORK_HOUR = 4;
        int totalWorkingDaysInMonth = 20;
        int empHrs = 0;
        int totalWage = 0;

        for(int i= 0; i < totalWorkingDaysInMonth ; i++){
            int empCheck = (int)Math.floor(Math.random()*10)%3;
            switch (empCheck) {
                case IS_FULL_TIME:
                    System.out.println("Employee is Full time present");
                    totalWage = EMP_RATE_PER_HOUR * FULL_DAY_WORK_HOUR;
                    empHrs = 8;
                    break;
                case IS_PART_TIME:
                    System.out.println("Employee is working as Part Time");
                    totalWage = EMP_RATE_PER_HOUR * PART_TIME_WORK_HOUR;
                    empHrs =4;
                    break;
                case 0:
                    System.out.println("Employee is Absent");
                    totalWage = 0;
                    empHrs = 0;
                    break;
                default:
                    System.out.println("Something went wrong");
                    break;
            }
            finalWage = finalWage + totalWage;
            System.out.println("Final  Wage : " + finalWage);

            finalWorkHours = finalWorkHours + empHrs;
            System.out.println("Final works hours : " + finalWorkHours);

            if(finalWorkHours == 100) // MAX_HRS_IN_MONTH =  100;
            {
                System.out.println("Work Completed of this month");
                break;
            }else if (finalWorkHours > 100){
                System.out.println("Work hours is exceed the limit of the month");
                finalWage = finalWage - totalWage;
                System.out.println("Final wage = " + finalWage);

                finalWorkHours = finalWorkHours - empHrs;
                System.out.println("Final work hours = " + finalWorkHours);
            }
        }
        System.out.println("Final Wage = " + finalWage);
    }
}
