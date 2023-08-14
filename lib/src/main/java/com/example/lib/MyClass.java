package com.example.lib;

import java.util.Scanner;

public class MyClass {
    public static void main(String[] args) {

        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter the first calendar date of your cycle: ");
        int n1 = s1.nextInt();
        //int n1 = 1;
        System.out.println("Enter the last calendar date of your cycle: ");
        int n2 = s1.nextInt();
        //int n2 = 2;
        Cycle myCycle = new Cycle();
        myCycle.cycleStart = n1;
        myCycle.cycleEnd = n2;
        myCycle.prediction();
    }

}
class Cycle {
    // states
    int cycleStart;
    int cycleEnd;

    int nextCycle = 0;

    // methods
    void prediction() {
        nextCycle += 25;
        System.out.println("Your last cycle began on: " + cycleStart);
        System.out.println("Your last cycle ended on: " + cycleEnd);

        System.out.println("next cycle starts: " + nextCycle);
    }

}
