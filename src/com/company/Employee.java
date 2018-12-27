package com.company;
import java.util.Scanner;

public abstract class Employee {
    private String name;
    private int employeeId;
    private String address;

    public abstract double totalSalary();

    public void getData(){

        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter Employee Name:");
        this.setName(scanner.next());
        System.out.println("Enter Employee ID:");
        this.setEmployeeId(scanner.nextInt());
        System.out.println("Enter Employee Address:");
        this.setAddress(scanner.next());



    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "\nEmployee name: "
                +getName()
                + "\nEmployee ID: "
                +getEmployeeId()
                +"\nEmployee Address: "
                +getAddress();
    }
}
