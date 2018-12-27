package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AddEmployee {
    Scanner scanner=new Scanner(System.in);

    public List<Employee> addEmployee() {
        List<Employee> employeeList=new ArrayList<>();


        int choices=0;
        do{

            System.out.println("1. Add Salary Employee::");
            System.out.println("2. Add Basic plus Commission Employee..");
            System.out.println("3. Add Hourly Employee..");
            System.out.println("4. Add Commission Employee");
            System.out.println("5. Back to main..");
            System.out.println("\n Enter your choices..");
            choices=scanner.nextInt();

            switch (choices){
                case 1: //Add salary Employee

                    employeeList.add(addMonthlyEmployee());

                    break;
                case 2: //Add Basic plus Commission Employee

                    employeeList.add(addBasicPlusCommissionEmployee());

                    break;
                case 3://Add Hourly Employee

                    employeeList.add(addHourlyEmployee());

                    break;
                case 4://Add commission employee

                    employeeList.add(addCommissionEmployee());
                    break;

                case 5://case exit
                    System.out.println("Back to main");



                    default:
                        System.out.println("please enter valid choices..");
            }
        }while (choices!= 5);
        return employeeList;
    }
    //method to add hourly employee
    private HourlyEmployee addHourlyEmployee() {
        HourlyEmployee hourlyEmployee=new HourlyEmployee();
        hourlyEmployee.getData();
        return hourlyEmployee;
    }

    //method to add monthly salary employee
    private MonthlySalaryEmployee addMonthlyEmployee(){
        MonthlySalaryEmployee monthlySalaryEmployee=new MonthlySalaryEmployee();
        monthlySalaryEmployee.getData();
        return monthlySalaryEmployee;
    }

    //method to add  basic plus commission employee
    private BasicPlusCommissionEmployee addBasicPlusCommissionEmployee(){
        BasicPlusCommissionEmployee basicPlusCommissionEmployee=new BasicPlusCommissionEmployee();
        basicPlusCommissionEmployee.getData();
        return basicPlusCommissionEmployee;


    }
    //method to add commission emmployee
    private CommissionEmployee addCommissionEmployee(){
        CommissionEmployee commissionEmployee=new CommissionEmployee();
        commissionEmployee.getData();
        return commissionEmployee;
    }
}
