/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package employee.version1;

import java.time.LocalDate;

/**
 * VERSION 1
 * @author USER
 */
public class PieceWorkerEmployee {
    private int empID;
    private String empName;
    private LocalDate empDateHired;
    private LocalDate empBirthDate;
    private int totalPiecesFinished;
    private float ratePerPiece;
    
//  Constructors
    public PieceWorkerEmployee() {
    }

    public PieceWorkerEmployee(int empID, String empName, LocalDate empDateHired, LocalDate empBirthDate, int totalPiecesFinished, float ratePerPiece) {
        this.empID = empID;
        this.empName = empName;
        this.empDateHired = empDateHired;
        this.empBirthDate = empBirthDate;
        this.totalPiecesFinished = totalPiecesFinished;
        this.ratePerPiece = ratePerPiece;
    }

    public PieceWorkerEmployee(int empID, String empName, LocalDate empDateHired, LocalDate empBirthDate, int totalPiecesFinished) {
        this.empID = empID;
        this.empName = empName;
        this.empDateHired = empDateHired;
        this.empBirthDate = empBirthDate;
        this.totalPiecesFinished = totalPiecesFinished;
        ratePerPiece = 50;
    }
    
//  Getters and Setters 
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

    public int getTotalPiecesFinished() {
        return totalPiecesFinished;
    }

    public void setTotalPiecesFinished(int totalPiecesFinished) {
        this.totalPiecesFinished = totalPiecesFinished;
    }

    public float getRatePerPiece() {
        return ratePerPiece;
    }

    public void setRatePerPiece(float ratePerPiece) {
        this.ratePerPiece = ratePerPiece;
    }
    
//  computeSalary()
    public double computeSalary(){
        double salary = getTotalPiecesFinished() * getRatePerPiece();
        
        if (getTotalPiecesFinished() >= 100){
            double bonusPieces = getTotalPiecesFinished() / 100;
            double bonusAmount = bonusPieces * getRatePerPiece() * 10;
        
            salary += bonusAmount;
        }
        
        return salary;
    }
    
    //  Display Info
    public void displayInfo() {
        System.out.printf("Employee ID: %d\n", getEmpID());
        System.out.printf("Employee Name: %s\n", getEmpName());
        System.out.printf("Employee Date Hired: %s\n", getEmpDateHired());
        System.out.printf("Employee Birthdate: %s\n", getEmpBirthDate());
        System.out.printf("Total pieces finished: %d\n", getTotalPiecesFinished());
        System.out.printf("Rate per piece: %.2f\n", getRatePerPiece());
        System.out.printf("Salary: %.2f\n", computeSalary());
    }
    
    @Override
    public String toString() {
        return String.format(
                "Employee ID: %d\nEmployee Name: %s\nDate Hired: %s\nDate of Birth: %s\nRate per piece: %f\nTotal pieces finished: %d\nSalary: %.2f",
                getEmpID(), 
                getEmpName(), 
                getEmpDateHired(), 
                getEmpBirthDate(), 
                getRatePerPiece(), 
                getTotalPiecesFinished(),
                    computeSalary());
    }
    
}
