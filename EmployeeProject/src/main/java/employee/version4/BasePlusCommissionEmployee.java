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
public class BasePlusCommissionEmployee extends CommissionEmployee {
    private double baseSalary;

//    Constructors
    public BasePlusCommissionEmployee() {
    }

    public BasePlusCommissionEmployee(int empID, Name empName, LocalDate empDateHired, LocalDate empBirthDate) {
        super(empID, empName, empDateHired, empBirthDate);
        baseSalary = 0.0f;
    }

    public BasePlusCommissionEmployee(double baseSalary, int empID, Name empName, LocalDate empDateHired, LocalDate empBirthDate) {
        super(empID, empName, empDateHired, empBirthDate);
        this.baseSalary = baseSalary;
    }
    
//    Getters and Setters

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }
    
    @Override
    public double computeSalary(){
        return baseSalary + super.computeSalary();
    }
    
    //  Display Info
    @Override
    public void displayInfo() {
        super.displayInfo();
    }
    
}
