/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.anya;

/**
 *
 * @author LANUTAN  -   22103514
 */
public class MyTime {
    private int hours;
    private int minutes;
    private int seconds;
    private boolean meridian;

    public MyTime() {
    }

    public MyTime(int hours, int minutes, int seconds, boolean meridian) {
        this.hours = hours > 12 ? 0 : hours;
        this.minutes = minutes > 60 ? 0 : minutes;
        this.seconds = seconds > 60 ? 0 : seconds;
        this.meridian = meridian;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        if (hours > 12) {
            System.out.println("Invalid input.");
        } else {
            this.hours = hours;
        }
    }

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        if (minutes > 60) {
            System.out.println("Invalid input.");
        } else {
            this.minutes = minutes;
        }
    }

    public int getSeconds() {
        return seconds;
    }

    public void setSeconds(int seconds) {
        if (seconds > 60) {
            System.out.println("Invalid input.");
        } else {
            this.seconds = seconds;
        }
    }

    public String isMeridian() {
        return meridian ? "PM" : "AM";
    }

    public void setMeridian(boolean meridian) {
        this.meridian = meridian;
    }

    public void advanceTime(int seconds) {
        for (int i = 0; i < seconds; i++) {
            tickBySecond();
        }
    }

    public void tickBySecond() {
        seconds++;
        if (seconds >= 60) {
            seconds -= 60;
            tickByMinute();
        }
    }

    public void tickByMinute() {
        minutes++;
        if (minutes >= 60) {
            minutes -= 60;
            tickByHour();
        }
    }

    public void tickByHour() {
        hours++;
        if (hours > 12) {
            hours -= 12;
            meridian = !meridian;
        }
    }

    public void displayTime12hr() {
        System.out.printf("TIME IS [12HR]: %02d:%02d:%02d %s\n", hours, minutes, seconds, isMeridian());
    }

    public void displayTime24hr() {
        System.out.printf("TIME IS [24HR]: %02d:%02d:%02d\n", !meridian ? hours : hours + 12, minutes, seconds);
    }

    @Override
    public String toString() {
        return String.format("%02d:%02d:%02d %s", hours, minutes, seconds, isMeridian());
    }
}
