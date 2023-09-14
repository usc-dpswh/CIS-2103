/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package employee.version1;

import java.time.LocalDate;

/**
 *
 * @author USER
 */
public class HourlyEmployee {

    private int empID;
    private String empName;
    private LocalDate empDateHired;
    private LocalDate empBirthDate;
    private float totalHoursWorked;
    private float ratePerHour;

//  CONSTRUCTORS
    public HourlyEmployee() {
    }

    public HourlyEmployee(int empID, String empName, LocalDate empDateHired, LocalDate empBirthDate, float totalHoursWorked, float ratePerHour) {
        this.empID = empID;
        this.empName = empName;
        this.empDateHired = empDateHired;
        this.empBirthDate = empBirthDate;
        this.totalHoursWorked = totalHoursWorked;
        this.ratePerHour = ratePerHour;
    }

    public HourlyEmployee(int empID, String empName, LocalDate empDateHired, LocalDate empBirthDate) {
        this.empID = empID;
        this.empName = empName;
        this.empDateHired = empDateHired;
        this.empBirthDate = empBirthDate;
        totalHoursWorked = 0.0f;
        ratePerHour = 0.0f;
    }

//  ACCESSORS AND MUTATORS
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
    public void displayInfo() {
        System.out.printf("Employee ID: %d\n", getEmpID());
        System.out.printf("Employee Name: %s\n", getEmpName());
        System.out.printf("Employee Date Hired: %s\n", getEmpDateHired());
        System.out.printf("Employee Birthdate: %s\n", getEmpBirthDate());
        System.out.printf("Total hours worked: %.2f\n", getTotalHoursWorked());
        System.out.printf("Rate per hour: %.2f\n", getRatePerHour());
        System.out.printf("Salary: %.2f\n", computeSalary());
    }

    @Override
    public String toString() {
        return String.format(
                "Employee ID: %d\nEmployee Name: %s\nDate Hired: %s\nDate of Birth: %s\nRate per hour: %.2f\nTotal Hours Worked: %.2f hrs\nSalary: %.2f\n",
                getEmpID(), getEmpName(), getEmpDateHired(), getEmpBirthDate(), getRatePerHour(), getTotalHoursWorked(),
                computeSalary());
    }

}
