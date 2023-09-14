/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.anya.classchallenge;

/**
 *
 * @author USER
 */
public class ClassChallenge {

    public static void main(String[] args) {
        BankAccount Achille = new BankAccount(0,0,0,"Achille Lanutan", "lanutanenzo@gmail.com");
        Achille.deposit(500);
        Achille.withdraw(100);
        System.out.println(Achille);
        
    }
}
