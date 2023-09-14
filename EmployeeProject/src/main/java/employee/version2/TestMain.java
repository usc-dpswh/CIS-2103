/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package employee.version2;

/**
 * VERSION 2
 *
 * @author USER
 */
public class TestMain {

    public static void main(String[] args) {
        HourlyEmployee Julz = new HourlyEmployee();
        PieceWorkerEmployee Carlo = new PieceWorkerEmployee();
        CommissionEmployee Xander = new CommissionEmployee();
        BasePlusCommissionEmployee BigNose = new BasePlusCommissionEmployee();

        Julz.displayInfo();
        Carlo.displayInfo();
        Xander.displayInfo();
        BigNose.displayInfo();
    }

}
