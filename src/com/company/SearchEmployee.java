package com.company;

import java.util.List;
import java.util.Scanner;

public class SearchEmployee {
    public void searchData(List<Employee> employeeList) {
        Scanner scanner=new Scanner(System.in);
        int choice=0;
        do{
            System.out.println("\n1. Search by name..");
            System.out.println("2. Search by id..");
            System.out.println("3. Search by address..");
            System.out.println("\n Enter your choices..");

            choice=scanner.nextInt();
            switch (choice){
                case 1: //Search by name

                    System.out.println("Enter name to seach..");
                    String name=scanner.next();
                    for(Employee employee:employeeList){

                        if(employee.getName().equalsIgnoreCase(name)){
                            System.out.println(employee.toString());
                        }
                    }
                    break;
                case 2: //Search by ID

                    System.out.println("Enter id to seach..");
                    int id=scanner.nextInt();
                    for(Employee employee:employeeList){

                        if(employee.getEmployeeId()==id){

                            System.out.println(employee.toString());

                        }
                    }


                    break;
                case 3: //Search by address
                    System.out.println("Enter address to seach..");
                    String address=scanner.next();
                    for(Employee employee:employeeList){
                        if(employee.getAddress().equalsIgnoreCase(address)){
                            System.out.println(employee.toString());
                        }
                    }

                    break;
                case 4:
                    default:
                        System.out.println("please enter valid choices..");
            }

        }while (choice!=3);


    }
}
