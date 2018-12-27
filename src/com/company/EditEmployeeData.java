package com.company;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Scanner;

public class EditEmployeeData {
    Scanner scanner=new Scanner(System.in);

    public List<Employee> editEmployeeData(List<Employee> employeeList) {
        int choice=0;

        do{
            System.out.println("1. Edit Monthly salary Employee..");
            System.out.println("2. Edit Hourly employee..");

            System.out.println("3. Edit Basic plus commission employee..");
            System.out.println("4. Edit Commission Employee..");
            System.out.println("5. Return back..");
            System.out.println("\n Enter your choices..");
            choice=scanner.nextInt();
            switch (choice){

                case 1: //Edit monthly salary employee data
                    for(Employee employee:employeeList){
                        if(employee instanceof MonthlySalaryEmployee){
                            System.out.println("Enter id for edit");
                            int id=scanner.nextInt();
                            if(employee.getEmployeeId()==id);{

                                System.out.println("Edit Your" +
                                        "\n1.Name" +
                                        "\n2.Address" +
                                        "\n3.id" +
                                        "\n4.salary" +
                                        "\n5.back");
                                int input=scanner.nextInt();
                                switch (input){
                                    case 1: //Edit name of monthly salary employee
                                        System.out.println("Enter new name");
                                        employee.setName(scanner.next());
                                        break;

                                    case 2: //Edit address of monthly salary employee
                                        System.out.println("Enter your new address");
                                        employee.setAddress(scanner.next());
                                        break;

                                    case 3: //Edit id of monthly salary employee
                                        System.out.println("Enter your new Id");
                                        employee.setEmployeeId(scanner.nextInt());
                                        break;

                                    case 4: //Edit salary of monthly salary employee
                                        System.out.println("Enter new salary");
                                        ((MonthlySalaryEmployee) employee).setSalary(scanner.nextDouble());
                                        break;
                                    case 5:
                                        break;
                                        default:
                                            System.out.println("Please enter valid choices..");
                                }
                            }
                        }
                    }
                    break;
                case 2: //Edit Hourly employee
                    for(Employee employee:employeeList){
                        if(employee instanceof HourlyEmployee){
                            System.out.println("Enter id for edit");
                            int id=scanner.nextInt();
                            if(employee.getEmployeeId()==id);{
                                System.out.println("Edit Your" +
                                        "\n1.Name" +
                                        "\n2.Address" +
                                        "\n3.id" +
                                        "\n4.total hours" +
                                        "\n5.rate per hours"+
                                        "\n6.back");
                                int input=scanner.nextInt();
                                switch (input){

                                    case 1: //Edit name of hourly employee
                                        System.out.println("Enter new name");
                                        employee.setName(scanner.next());
                                        break;

                                    case 2: //Edit address of hourly employee
                                        System.out.println("Enter your new address");
                                        employee.setAddress(scanner.next());
                                        break;

                                    case 3: //Edit Id of hourly employee
                                        System.out.println("Enter your new Id");
                                        employee.setEmployeeId(scanner.nextInt());
                                        break;

                                    case 4: //Edit total sale of hourly employe
                                        System.out.println("Enter your new total working hours");
                                        ((HourlyEmployee) employee).setTotalHours(scanner.nextInt());
                                        break;

                                    case 5: //Edit hourly rate of the hourly employee
                                        System.out.println("Enter your new hours rate..");
                                        ((HourlyEmployee) employee).setHourlyRate(scanner.nextDouble());
                                        break;
                                    case 6:
                                        break;
                                        default:
                                            System.out.println("Please enter valid choices..");
                                }
                            }
                        }
                    }
                    break;

                case 3: //Edit basic plus commission employee
                    for(Employee employee:employeeList){
                        if(employee instanceof BasicPlusCommissionEmployee){
                            System.out.println("Enter id for edit");
                            int id=scanner.nextInt();
                            if(employee.getEmployeeId()==id);{
                                System.out.println("Edit Your" +
                                        "\n1.Name" +
                                        "\n2.Address" +
                                        "\n3.id" +
                                        "\n4.Total sale" +
                                        "\n5.rate"+
                                        "\n6.Basic salary"+
                                        "\n7.Back");
                                int input=scanner.nextInt();
                                switch (input){
                                    case 1: //Edit name of basic plus commission employee
                                        System.out.println("Enter new name");
                                        employee.setName(scanner.next());
                                        break;
                                    case 2:
                                        System.out.println("Enter your new address");
                                        employee.setAddress(scanner.next());
                                        break;
                                    case 3:
                                        System.out.println("Enter your new Id");
                                        employee.setEmployeeId(scanner.nextInt());

                                        break;
                                    case 4:
                                        System.out.println("Enter new total sale:");
                                        ((BasicPlusCommissionEmployee) employee).setTotalSale(scanner.nextDouble());
                                        break;
                                    case 5:
                                        System.out.println("Enter new commission rate");
                                        ((BasicPlusCommissionEmployee) employee).setRate(scanner.nextDouble());
                                        break;
                                    case 6:
                                        System.out.println("Enter New Basic salary");
                                        ((BasicPlusCommissionEmployee) employee).setBasicSalary(scanner.nextDouble());
                                        break;
                                    case 7:
                                        System.out.println("Back..");
                                        break;
                                        default:
                                            System.out.println("please enter valid employee..");
                                }
                            }
                        }
                    }
                    break;
                case 4:
                    for(Employee employee:employeeList){
                        if(employee instanceof CommissionEmployee){
                            System.out.println("Enter name for edit");
                            int id=scanner.nextInt();
                            if(employee.getEmployeeId()==id);{
                                System.out.println("Edit Your" +
                                        "\n1.Name" +
                                        "\n2.Address" +
                                        "\n3.id" +
                                        "\n4.Total sale" +
                                        "\n5.rate"+
                                        "\n6.Back");
                                int input=scanner.nextInt();
                                switch (input){
                                    case 1:
                                        System.out.println("Enter new name");
                                        employee.setName(scanner.next());
                                        break;
                                    case 2:
                                        System.out.println("Enter your new address");
                                        employee.setAddress(scanner.next());
                                        break;
                                    case 3:
                                        System.out.println("Enter your new Id");
                                        employee.setEmployeeId(scanner.nextInt());

                                        break;
                                    case 4:
                                        System.out.println("Enter new total sale:");
                                        ((BasicPlusCommissionEmployee) employee).setTotalSale(scanner.nextDouble());
                                        break;
                                    case 5:
                                        System.out.println("Enter New Commission rate");
                                        ((CommissionEmployee) employee).setRate(scanner.nextDouble());
                                        break;
                                    case 6:
                                        System.out.println("Back..");
                                        break;
                                    default:
                                        System.out.println("please enter valid employee..");
                                }
                            }
                        }
                    }
                    break;

            }

        }while (choice!=5);

        return employeeList;
    }




}
