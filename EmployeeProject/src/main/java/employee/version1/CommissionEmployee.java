/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package employee.version1;

import java.time.LocalDate;

/**
 * VERSION 2
 * @author USER
 */
public class CommissionEmployee {
    private int empID;
    private String empName;
    private LocalDate empDateHired;
    private LocalDate empBirthDate;
    private double totalSales;

//    Constructors
    public CommissionEmployee() {
    }

    public CommissionEmployee(int empID, String empName, LocalDate empDateHired, LocalDate empBirthDate, double totalSales) {
        this.empID = empID;
        this.empName = empName;
        this.empDateHired = empDateHired;
        this.empBirthDate = empBirthDate;
        this.totalSales = totalSales;
    }

    public CommissionEmployee(int empID, String empName, LocalDate empDateHired, LocalDate empBirthDate) {
        this.empID = empID;
        this.empName = empName;
        this.empDateHired = empDateHired;
        this.empBirthDate = empBirthDate;
        totalSales = 0;
    }

//    Getters and Setters
    public int getEmpID() {
        return empID;
    }

    public void setEmpID(int empID) {
        this.empID = empID;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public LocalDate getEmpDateHired() {
        return empDateHired;
    }

    public void setEmpDateHired(LocalDate empDateHired) {
        this.empDateHired = empDateHired;
    }

    public LocalDate getEmpBirthDate() {
        return empBirthDate;
    }

    public void setEmpBirthDate(LocalDate empBirthDate) {
        this.empBirthDate = empBirthDate;
    }

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
    
     public void displayInfo() {
        System.out.printf("Employee Name: %s\n", getEmpName());
        System.out.printf("Employee ID: %d\n", getEmpID());
        System.out.printf("Date Hired: %s\n", getEmpDateHired());
        System.out.printf("Date of Birth: %s\n", getEmpBirthDate());
        System.out.printf("Total Sales: %.2f\n", getTotalSales());
        System.out.printf("Salary: %.2f\n", computeSalary());
    }

    @Override
    public String toString() {
        return String.format(
                "Employee Name: %s\nEmployee ID: %d\nDate Hired: %s\nDate of Birth: %s\nTotal Sales: %.2f hrs\nSalary: %.2f\n",
                getEmpName(), getEmpID(), getEmpDateHired(), getEmpBirthDate(), getTotalSales(),
                computeSalary());
    }
}
