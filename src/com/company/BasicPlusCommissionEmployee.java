package com.company;

import java.util.Scanner;

public class BasicPlusCommissionEmployee extends com.company.CommissionEmployee {
    private double basicSalary;

    public double getBasicSalary() {
        return basicSalary;
    }

    public void setBasicSalary(double basicSalary) {
        this.basicSalary = basicSalary;
    }


    @Override
    public void getData(){
        Scanner scanner=new Scanner(System.in);
        super.getData();
        System.out.println("Enter basic salary of the employee::");
        this.setBasicSalary(scanner.nextDouble());
    }

    @Override
    public double totalSalary(){
        return super.totalSalary()+this.getBasicSalary();
    }

    @Override
    public String toString() {
        return super.toString()
                +"\nBasic Salary: "
                +getBasicSalary()
                +"\nTotal salary: "+this.totalSalary();
    }
}
