package com.bridgelabz;

public class EmployeeWage {
    static int finalWage = 0;
    static int finalWorkHours = 0;
    static final int IS_FULL_TIME = 1;
    static final int IS_PART_TIME = 2;
    static int EMP_RATE_PER_HOUR = 20;
    static int FULL_DAY_WORK_HOUR = 8;
    static int PART_TIME_WORK_HOUR = 4;
    static int totalWorkingDaysInMonth = 20;

    static int checkEmpAttendence(){
        int empCheck = (int)Math.floor(Math.random()*10)%3;
        return empCheck;
    }
    public static int computeEmpWageMethod(){
        int empHrs = 0;
        int totalWage = 0;
        for(int i= 0; i < totalWorkingDaysInMonth ; i++){
            int empCheckCopy = checkEmpAttendence();
            switch (empCheckCopy) {
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

            finalWorkHours = finalWorkHours + empHrs;

            System.out.println("Day - > "+ i + " : Final Wage -> "+ finalWage + " : Workinghrs -> " + finalWorkHours);

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
        return finalWage;
    }

    public static void main(String[] args) {
        System.out.println("Welcome to the Employee Wage Program");
        int totalWage = computeEmpWageMethod();
        System.out.println("Total wage = " + totalWage);
    }
}
