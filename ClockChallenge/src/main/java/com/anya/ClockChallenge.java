/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.anya;

/**
 *
 * @author LANUTAN  -   22103514
 */
public class ClockChallenge {

    public static void main(String[] args) {
        MyTime today = new MyTime(2, 80, 0, true);
        System.out.println("Time is " + today);
        
        today.displayTime12hr();
        today.displayTime24hr();
    }
}
