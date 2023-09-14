/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package employee.version1;

import java.time.LocalDate;
import java.time.Month;



/**
 *
 * @author USER
 */
public class TestMain {

    public static void main(String[] args) {
        HourlyEmployee Bokiks = new HourlyEmployee(01, "Bokiks the Great", LocalDate.now(), LocalDate.of(2003, 9, 15), 45.23f, 400.00f);
        PieceWorkerEmployee Julz = new PieceWorkerEmployee(02, "Kaupper the Bastard", LocalDate.now(), LocalDate.of(2004, 10, 16), 150);
        CommissionEmployee Xander = new CommissionEmployee();
        BasePlusCommissionEmployee BigNose = new BasePlusCommissionEmployee();
        
        Bokiks.displayInfo();
        Julz.displayInfo();
        Xander.displayInfo();
        BigNose.displayInfo();
        
    }
}
