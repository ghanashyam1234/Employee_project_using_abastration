package com.company;

import java.util.List;
import java.util.Scanner;

public class RemoveData {
    public List<Employee> removeData(List<Employee> employeeList) {
        Scanner scanner=new Scanner(System.in);
        int choice=0;
        do{
            System.out.println("1.Remove data by name:");
            System.out.println("2.Remove data by id:");
            System.out.println("3.Remove data by address:");
            System.out.println("4.Back to main");
            System.out.println("\nEnter your choices..");
            choice=scanner.nextInt();
            switch (choice){
                case 1:
                    System.out.println("Enter name to remove..");
                    String name=scanner.next();
                    for(Employee employee:employeeList){

                        if(employee.getName().equalsIgnoreCase(name)){
                            employeeList.remove(employeeList.indexOf(employee));
                        }


                    }
                    break;
                case 2:
                    System.out.println("Enter id to remove..");
                    int id=scanner.nextInt();
                    for(Employee employee:employeeList){

                        if(employee.getEmployeeId()==id){

                            System.out.println(employee.toString());

                        }
                    }


                    break;
                case 3:
                    System.out.println("Enter address to remove..");
                    String address=scanner.next();
                    for(Employee employee:employeeList){
                        if(employee.getAddress().equalsIgnoreCase(address)){
                            System.out.println(employee.toString());
                        }
                    }
                    break;
                case 4:
                    System.out.println("Back..");
                    break;

            }


        }while (choice!=4);

        return employeeList;
    }


}
