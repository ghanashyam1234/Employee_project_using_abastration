package com.company;

import java.util.Scanner;

public class HourlyEmployee extends Employee {
    private double hourlyRate;
    private int totalHours;

    public int getTotalHours() {
        return totalHours;
    }

    public void setTotalHours(int totalHours) {
        this.totalHours = totalHours;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    @Override
    public void getData(){
        super.getData();
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter total Number of hours works:");
        this.setTotalHours(scanner.nextInt());
        System.out.println("Enter rate per hours:");
        this.setHourlyRate(scanner.nextDouble());
    }

    @Override
    public double totalSalary() {

        if(getTotalHours()>48 || getTotalHours()<=0){
            throw new IllegalArgumentException("cant work more than 48 hours a week");
        }
        if(getTotalHours()<=40){        return getHourlyRate()*getTotalHours();
        }
        else{
            return getHourlyRate()*40+(getTotalHours()-40)*getHourlyRate()*1.5;
        }
    }

    @Override
    public String toString() {
        return super.toString()
                +"\nHOurs Rate: "
                +getHourlyRate()
                +"\nTotal Work Hours: "
                +getTotalHours()
                +"\nTotal Salary: "+totalSalary();
    }

}
