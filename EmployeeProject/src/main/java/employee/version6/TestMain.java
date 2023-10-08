/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package employee.version6;

import employee.version5.*;
import employee.version4.*;
import employee.version3.*;
import java.time.LocalDate;

/**
 * VERSION 3
 *
 * @author USER
 */
public class TestMain {

    public static void main(String[] args) {
       
        EmployeeRoster PowerRangers = new EmployeeRoster();
        EmployeeRoster Search = new EmployeeRoster();
        
//      New name instances
        Name name1 = new Name()
                .firstName("Achille")
                .lastName("Lanutan")
                .middleInitial("Malaki");
        
        Name name2 = new Name()
                .firstName("Dianne")
                .lastName("Yuvallos")
                .middleInitial("Angela");
        
        Name name3 = new Name()
                .firstName("Matt")
                .lastName("Magdadaro")
                .middleInitial("Vincent");
        
        Name name4 = new Name()
                .firstName("Carlo")
                .lastName("Juab")
                .middleInitial("Aparri");
        
//      New Employee Instances
        HourlyEmployee Julz = new HourlyEmployee(
                001, 
                name1, 
                LocalDate.of(2023, 4, 6), 
                LocalDate.of(2003, 5, 5));
        
        PieceWorkerEmployee Carlo = new PieceWorkerEmployee(
                002, 
                name2, 
                LocalDate.of(2023, 9, 15), 
                LocalDate.of(2003, 9, 15));
        
        
        CommissionEmployee Xander = new CommissionEmployee(
                003, 
                name3, 
                LocalDate.of(2023, 12, 3), 
                LocalDate.of(2003, 1, 5));
        
        BasePlusCommissionEmployee Dianne = new BasePlusCommissionEmployee(
                004, 
                name4, 
                LocalDate.of(2023, 5, 17), 
                LocalDate.of(2003, 5, 8));
        
        Julz.displayInfo();
        Carlo.displayInfo();
        Xander.displayInfo();
        Dianne.displayInfo();
        
        PowerRangers.addEmployee(Julz);
        PowerRangers.addEmployee(Carlo);
        PowerRangers.addEmployee(Xander);
        PowerRangers.addEmployee(Dianne);
        
        PowerRangers.displayEmployeeByType("H");
        PowerRangers.displayEmployeeByType("C");
        PowerRangers.displayEmployeeByType("B");
        PowerRangers.displayEmployeeByType("P");
        
//        Search contains all the employees we searched for.
        System.out.println("=============\n");
        Search = PowerRangers.searchEmployee("Dianne");
        Search.displayAll();
        System.out.println("=============\n");
        
        PowerRangers.displayAll();
        PowerRangers.removeEmployee(3);
        PowerRangers.displayAll();
    }

}
