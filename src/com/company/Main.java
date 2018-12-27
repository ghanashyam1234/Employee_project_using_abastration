package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        List<Employee> employeeList=new ArrayList<>();

        Scanner scanner=new Scanner(System.in);


        int choices=0;
        do{
            System.out.println("1. Add Employee..");
            System.out.println("2. View Employee..");
            System.out.println("3. Search Employee..");
            System.out.println("4. Edit Eployee..");
            System.out.println("5. Remove Employee..");
            System.out.println("6. Do you want to exit..");
            System.out.println("Enter your choices..");
            choices=scanner.nextInt();
            switch (choices){
                case 1: //Add employee

                    System.out.println("Add Employee Details::");
                    AddEmployee addEmployee=new AddEmployee();
                    employeeList.addAll(addEmployee.addEmployee());

                    break;

                case 2: //View Employee

                    ViewEmployeeDetails v=new ViewEmployeeDetails();
                    v.viewData(employeeList);
                    break;
                case 3: // Search Employee
                        SearchEmployee searchEmployee=new SearchEmployee();
                        searchEmployee.searchData(employeeList);
                    break;
                case 4: //Edit Employee
                    EditEmployeeData editEmployeeData=new EditEmployeeData();
                    employeeList.addAll(editEmployeeData.editEmployeeData(employeeList));
                    System.out.println("Edit Employee Details::");
                    break;
                case 5: //Remove employee
                    RemoveData removeData=new RemoveData();
                    employeeList=removeData.removeData(employeeList);

                    break;
                case 6:
                    System.out.println("exit");
                    default:
                        System.out.println("Enter valid choices::");
            }
        }
        while(choices!=6);


































//        List<Employee> list=new ArrayList<>();
//        Scanner scanner=new Scanner(System.in);
//        System.out.println("Do you want to run program: [y/n]");
//
//        char condition=scanner.next().charAt(0);
//        while (condition=='y'||condition=='Y'){
//            System.out.println("1.Commission Employee...");
//            System.out.println("2.Monthly salary Employee...");
//            System.out.println("3.HOurly Employee...");
//            System.out.println("4.Basic plus commission employee..");
//            System.out.println("5.Show your details:");
//            System.out.println("\n Enter your choices:");
//            int choices=scanner.nextInt();
//            switch (choices){
//
//                case 1:
//                    System.out.println("Enter number of employee you want:");
//                    int num1=scanner.nextInt();
//                    for(int i=0;i<num1;i++){
//                        Employee employee=new CommissionEmployee();
//                        employee.getData();
////
//                        list.add(employee);
//                    }
//
////                    for(Employee emp:list){
////                        System.out.println("Commission Employee details: "+emp.toString());
////                    }
//                    break;
//
//                case 2:
//                    Employee employee1=new MonthlySalaryEmployee();
//                    employee1.getData();
//                    list.add(employee1);
//                    break;
//
//                case 3:
//                    Employee employee2=new HourlyEmployee();
//                    employee2.getData();
//                    list.add(employee2);
//                    break;
//
//                case 4:
//                    Employee employee3=new BasicPlusCommissionEmployee();
//                    employee3.getData();
//                    employee3.totalSalary();
//                    list.add(employee3);
//                    break;
//
//                case 5:
//                    for(Employee emp:list){
//                        System.out.println(emp.toString());
//                    }
//                    break;
//
//                case 6:
//                    for(Employee emp:list){
//
//                    }
//                    default:
//                        System.out.println("Invalid choices..please enter 1-5");
//
//            }
//
//
//            System.out.println("Do you want to run again [y/n]:");
//            char condition1=scanner.next().charAt(0);
//            condition=condition1;
//        }
//
//










    }
}
