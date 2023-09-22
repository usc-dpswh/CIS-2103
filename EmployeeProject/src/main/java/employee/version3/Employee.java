/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package employee.version3;

import java.time.LocalDate;

/**
 *
 * @author USER
 */
public class Employee {
    private int empID;
    private Name name;
    private LocalDate empDateHired;
    private LocalDate empBirthDate;

//    Constructors

    public Employee() {
    }

    public Employee(LocalDate empDateHired, LocalDate empBirthDate) {
        this.empDateHired = empDateHired;
        this.empBirthDate = empBirthDate;
    }

    public Employee(int empID, Name name, LocalDate empDateHired, LocalDate empBirthDate) {
        this.empID = empID;
        this.name = name;
        this.empDateHired = empDateHired;
        this.empBirthDate = empBirthDate;
    }
    
//    Getters and Setters
    public int getEmpID() {
        return empID;
    }

    public void setEmpID(int empID) {
        this.empID = empID;
    }

    public Name getEmpName() {
        return name;
    }

    public void setEmpName(Name name) {
        this.name = name;
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
    
    public void displayInfo() {
        System.out.printf("Employee Name: %s\n", getEmpName());
        System.out.printf("Employee ID: %d\n", getEmpID());
        System.out.printf("Date Hired: %s\n", getEmpDateHired());
        System.out.printf("Date of Birth: %s\n", getEmpBirthDate());
    }

    @Override
    public String toString() {
        return String.format(
                "Employee Name: %s\nEmployee ID: %d\nDate Hired: %s\nDate of Birth: %s\n",
                getEmpName(), getEmpID(), getEmpDateHired(), getEmpBirthDate());
    }
    
}
