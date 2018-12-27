package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ViewEmployeeDetails {


    public void viewData(List<Employee> employeeList) {

        Scanner scanner = new Scanner(System.in);

        int choice=0;
        do{
            System.out.println("\n1.View by monthly salary..");
            System.out.println("2.View by Balsic plus commission salary..");
            System.out.println("3.View by Commission Employee..");
            System.out.println("4.View by HOurly salary..");
            System.out.println("5.Back to main..");

            System.out.println("\nEnter your choices..");
            choice=scanner.nextInt();
            switch (choice){
                case 1:
                    System.out.println("Monthly Salary Employee Details..");
                    for(Employee employee:employeeList){
                        if(employee instanceof MonthlySalaryEmployee){
                            System.out.println(employee.toString());
                        }
                    }
                    break;
                case 2:
                    System.out.println("Basic plus commission Salary Employee Details..");
                    for(Employee employee:employeeList){
                        if(employee instanceof BasicPlusCommissionEmployee){
                            System.out.println(employee.toString());
                        }
                    }

                    break;
                case 3:
                    System.out.println("Commission Employee Details..");
                    for(Employee employee:employeeList){
                        if(employee instanceof CommissionEmployee){
                            System.out.println(employee.toString());
                        }
                    }
                    break;
                case 4:
                    System.out.println("Hourly Salary Employee Details..");
                    for(Employee employee:employeeList){
                        if(employee instanceof HourlyEmployee){
                            System.out.println(employee.toString());
                        }
                    }
                    break;
                case 5:
                    System.out.println("Back to main..");
                    break;
                    default:
                        System.out.println("Enter valid choices..");
            }

        }while (choice!=3);


    }






}
