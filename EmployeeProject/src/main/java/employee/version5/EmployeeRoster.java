/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package employee.version5;

//  List imports
import java.util.List;
import java.util.ArrayList;

import employee.version4.*;

/**
 *
 * @author USER
 */
public class EmployeeRoster {

//    private Employee[] empList;
    private List<Employee> empList;
//    private int count;
//    private int size = 10;

//    Constructors
    public EmployeeRoster() {
        empList = new ArrayList<>();
    }
    
    public EmployeeRoster(List<Employee> empList) {
        this.empList = empList;
    }

//    public List<employee.version5.Employee> getEmpList() {
//        return empList;
//    }

//    public EmployeeRoster(int count) {
//        this.count = count;
//        size = 5;
//    }
//
//    public EmployeeRoster(Employee[] empList, int count, int size) {
//        this.empList = empList;
//        this.count = count;
//        this.size = size;
//    }
//    Getters and Setters
    public int getSize() {
        return empList.size();
    }

    public List<Employee> getEmpList() {
        return empList;
    }

    public void setEmpList(List<Employee> empList) {
        this.empList = empList;
    }

//    Code
    public void displayAll() {
        for (Employee employee : empList) {
            if (employee == null) {
                System.out.printf("No employees listed.\n");
            } else {
                employee.displayInfo();
            }
        }
    }

    public boolean addEmployee(Employee newEmp) {
        if (empList.size() < 10) {
            empList.add(newEmp);

            System.out.printf("New employee has been added!\n");

            return true;
        } else {
            System.out.printf("Employee roster is full.\n");

            return false;
        }
    }

    public Employee removeEmployee(int id) {
        Employee deletedEmp = null;

        for (Employee employee : empList) {
            if (employee.getEmpID() == id) {
                deletedEmp = employee;
                empList.remove(employee);
                break;
            }
        }

        if (deletedEmp != null) {
            System.out.printf("Employee #%d has been removed.\n", id);
        } else {
            System.out.printf("Employee #%d not found.\n", id);
        }

        return deletedEmp;
    }

    public EmployeeRoster searchEmployee(String keyword) {
        EmployeeRoster match = new EmployeeRoster();

        for (Employee employee : empList) {

            if (employee != null) {
                String empName = employee.getEmpName().toString().toLowerCase();
                String search = keyword.toLowerCase();

                if (empName.contains(search) || String.valueOf(employee.getEmpID()).contains(search)) {
                    match.addEmployee(employee);
                    System.out.printf("Employee has been found.\n");

                }
            }

        }
        return match;
    }

    public int getTotalHourly() {
        int x = 0;

        for (Employee employee : empList) {
            if (employee instanceof HourlyEmployee) {
                x++;
            }
        }

        return x;
    }

    public int getTotalPieceWorker() {
        int x = 0;

        for (Employee employee : empList) {
            if (employee instanceof PieceWorkerEmployee) {
                x++;
            }
        }

        return x;
    }

    public int getTotalCommissionEmployee() {
        int x = 0;

        for (Employee employee : empList) {
            if (employee instanceof CommissionEmployee) {
                x++;
            }
        }

        return x;
    }

    public int getTotalBaseCommissionEmployee() {
        int x = 0;

        for (Employee employee : empList) {
            if (employee instanceof BasePlusCommissionEmployee) {
                x++;
            }
        }

        return x;
    }

    public void displayEmployeeByType(String type) {
        String displayMessage;

        switch (type.toUpperCase().charAt(0)) {
            case 'H' ->
                displayMessage = "Displaying Hourly Employees: \n";
            case 'C' ->
                displayMessage = "Displaying Commission Employees: \n";
            case 'B' ->
                displayMessage = "Displaying Base Plus Commission Employees: \n";
            case 'P' ->
                displayMessage = "Displaying Piece Worker Employees: \n";
            default -> {
                System.out.println("Unknown employee type: " + type);
                return;
            }
        }

        System.out.println(displayMessage);

        for (Employee employee : empList) {
            if (employee != null) {
                switch (type.toUpperCase().charAt(0)) {
                    case 'H' -> {
                        if (employee instanceof HourlyEmployee) {
                            employee.displayInfo();
                            System.out.println("\n");
                        }
                    }
                    case 'C' -> {
                        if (employee instanceof CommissionEmployee) {
                            employee.displayInfo();
                            System.out.println("\n");
                        }
                    }
                    case 'B' -> {
                        if (employee instanceof BasePlusCommissionEmployee) {
                            employee.displayInfo();
                            System.out.println("\n");
                        }
                    }
                    case 'P' -> {
                        if (employee instanceof PieceWorkerEmployee) {
                            employee.displayInfo();
                            System.out.println("\n");
                        }
                    }
                }
            }
        }
    }

    public void updateEmpInfo(int id, String prefix, String firstName, String middleName, String lastName, String suffix) {
        Employee employeeToUpdate = findEmployeeById(id);

        if (employeeToUpdate != null) {
            employeeToUpdate.updateName(prefix, firstName, middleName, lastName, suffix);
            System.out.println("Name updated for Employee #" + id);
        } else {
            System.out.println("Employee #" + id + " does not exist!");
        }
    }

    private Employee findEmployeeById(int id) {
        for (Employee employee : empList) {
            if (employee != null && id == employee.getEmpID()) {
                return employee;
            }
        }
        return null; // Employee with the given ID not found
    }

}
