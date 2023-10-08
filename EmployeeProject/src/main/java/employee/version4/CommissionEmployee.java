/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package employee.version4;

import employee.version3.*;
import employee.version3.*;
import java.time.LocalDate;

/**
 * VERSION 2
 * @author USER
 */
public class CommissionEmployee extends Employee{
    private double totalSales;
    
//    Constructors
    public CommissionEmployee() {
    }
    
    public CommissionEmployee(int empID, Name empName, LocalDate empDateHired, LocalDate empBirthDate){
        super(empID, empName, empDateHired, empBirthDate);
        totalSales = 0.0f;
    }

    public CommissionEmployee(double totalSales, int empID, Name empName, LocalDate empDateHired, LocalDate empBirthDate) {
        super(empID, empName, empDateHired, empBirthDate);
        this.totalSales = totalSales;
    }
    
//    Getters and Setters
    public double getTotalSales() {
        return totalSales;
    }

    public void setTotalSales(double totalSales) {
        this.totalSales = totalSales;
    }
    
//    computeSalary()
    public double computeSalary() {
        double salary;

        if (getTotalSales() < 50_000) {
            salary = getTotalSales() * 0.05;
        } else if (getTotalSales() < 100_000) {
            salary = getTotalSales() * 0.2;
        } else if (getTotalSales() < 500_000) {
            salary = getTotalSales() * 0.3; 
        } else {
            salary = getTotalSales() * 0.5;
        }
        
        return salary;
    }
    
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.printf("Total Sales: %.2f\n", getTotalSales());
        System.out.printf("Salary: %.2f\n", computeSalary());
    }
}
