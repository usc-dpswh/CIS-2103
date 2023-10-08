/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package employee.version5;

import employee.version4.*;
import employee.version3.*;
import employee.version3.*;
import java.time.LocalDate;

/**
 * VERSION 2
 * @author USER
 */
public class PieceWorkerEmployee extends Employee {
    private int totalPiecesFinished;
    private float ratePerPiece;
    
//    Constructors
    public PieceWorkerEmployee(){
    }
    
    public PieceWorkerEmployee(int empID, Name empName, LocalDate empDateHired, LocalDate empBirthDate){
        super(empID, empName, empDateHired, empBirthDate);
        totalPiecesFinished = 0;
        ratePerPiece = 0.0f;
    }

    public PieceWorkerEmployee(int totalPiecesFinished, float ratePerPiece, int empID, Name empName, LocalDate empDateHired, LocalDate empBirthDate) {
        super(empID, empName, empDateHired, empBirthDate);
        this.totalPiecesFinished = totalPiecesFinished;
        this.ratePerPiece = ratePerPiece;
    }

//    Getters and Setters
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
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.printf("Total pieces finished: %d\n", getTotalPiecesFinished());
        System.out.printf("Rate per piece: %.2f\n", getRatePerPiece());
        System.out.printf("Salary: %.2f\n", computeSalary());
    }
    
    
}
