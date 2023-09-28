/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package employee.version3;

import employee.version3.*;
import java.time.LocalDate;

/**
 * VERSION 2
 *
 * @author USER
 */
public class HourlyEmployee extends Employee {

    private float totalHoursWorked;
    private float ratePerHour;

//    Constructors
    public HourlyEmployee() {
    }

    public HourlyEmployee(int empID, Name empName, LocalDate empDateHired, LocalDate empBirthDate) {
        super(empID, empName, empDateHired, empBirthDate);
        totalHoursWorked = 0.0f;
        ratePerHour = 0.0f;
    }

    public HourlyEmployee(float totalHoursWorked, float ratePerHour, int empID, Name empName, LocalDate empDateHired, LocalDate empBirthDate) {
        super(empID, empName, empDateHired, empBirthDate);
        this.totalHoursWorked = totalHoursWorked;
        this.ratePerHour = ratePerHour;
    }

//    Getters and Setters
    public float getTotalHoursWorked() {
        return totalHoursWorked;
    }

    public void setTotalHoursWorked(float totalHoursWorked) {
        this.totalHoursWorked = totalHoursWorked;
    }

    public float getRatePerHour() {
        return ratePerHour;
    }

    public void setRatePerHour(float ratePerHour) {
        this.ratePerHour = ratePerHour;
    }

    //  computeSalary()
    public double computeSalary() {

//      Overtime       
        if (totalHoursWorked > 40) {
            double normalSalary = 40 * ratePerHour;
            double overtimeSalary = ratePerHour * 1.50 * (totalHoursWorked - 40);
            return normalSalary + overtimeSalary;
        }
        return totalHoursWorked * ratePerHour;

    }

    //  Display Info
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.printf("Total hours worked: %.2f\n", getTotalHoursWorked());
        System.out.printf("Rate per hour: %.2f\n", getRatePerHour());
        System.out.printf("Salary: %.2f\n", computeSalary());
    }
}
