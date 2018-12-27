package com.company;

import java.util.Scanner;

public class CommissionEmployee extends  Employee{
    private double totalSale;
    private double rate;

    public double getTotalSale() {
        return this.totalSale;
    }

    public void setTotalSale(double totalSale) {
        this.totalSale = totalSale;
    }

    public double getRate() {
        return this.rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }
    @Override
    public void getData(){
        super.getData();
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter total sales:");
        this.setTotalSale(scanner.nextDouble());
        System.out.println("Enter sales rate:");
        this.setRate(scanner.nextDouble());
    }

    @Override
    public double totalSalary() {
        return this.rate*this.totalSale;
    }

    @Override
    public String toString() {
        return super.toString()
                +"\nTotal sale: "+getTotalSale()
                +"\nSales Rate: "+getRate()
                +"\nTotal Commission: "+rate*totalSale;
    }
}
