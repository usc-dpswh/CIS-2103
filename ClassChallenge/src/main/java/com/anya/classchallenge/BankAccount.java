/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.anya.classchallenge;

/**
 *
 * @author USER
 */
public class BankAccount {
    private int accountNumber;
    private int phoneNumber;
    private float accountBalance;
    private String customerName;
    private String email;

    public BankAccount(int accountNumber, int phoneNumber, float accountBalance, String customerName, String email) {
        this.accountNumber = accountNumber;
        this.phoneNumber = phoneNumber;
        this.accountBalance = accountBalance;
        this.customerName = customerName;
        this.email = email;
    }
    
    

//    Getters
    public int getAccountNumber() {
        return accountNumber;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public float getAccountBalance() {
        return accountBalance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getEmail() {
        return email;
    }

//    Setters
    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setAccountBalance(float accountBalance) {
        this.accountBalance = accountBalance;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
//    Methods
    public void deposit(float funds){
        accountBalance += funds;
    }
    
    public void withdraw(float funds){
        if (funds > accountBalance){
            System.out.printf("Insufficient balance!");
        } else {
            accountBalance -= funds;
        }
    }
    
//    Override

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\n" + customerName + " Bank Account:");
        sb.append("\nAccount Number = ").append(accountNumber);
        sb.append("\nPhone Number = ").append(phoneNumber);
        sb.append("\nAccount Balance = ").append(accountBalance);
        sb.append("\nCustomer Name = ").append(customerName);
        sb.append("\nEmail = ").append(email);
       
        return sb.toString();
    }
    
}
 