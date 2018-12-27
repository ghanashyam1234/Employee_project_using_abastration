package com.company;
import java.util.Scanner;

public class MonthlySalaryEmployee extends Employee {
    private double salary;

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    @Override
    public void getData(){
        super.getData();
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter salary:");
        this.setSalary(scanner.nextDouble());
    }

    @Override
    public double totalSalary() {
        if(getSalary()<=0){
            throw new IllegalArgumentException("Not a valid Salary:");
        }
        return getSalary();
    }

    @Override
    public String toString() {
        return super.toString()
                +"\nSalary: "+getSalary()
                +"\nTotal salary: "+totalSalary();
    }
}
