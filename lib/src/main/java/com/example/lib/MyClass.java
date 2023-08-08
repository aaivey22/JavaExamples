package com.example.lib;

public class MyClass {
    public static void main(String[] args) {

        Cycle myCycle = new Cycle();
        myCycle.cycleStart = 27;
        myCycle.cycleEnd = 1;
        myCycle.prediction();

    }

}
class Cycle {
    // states
    int cycleStart;
    int cycleEnd;

    int nextCycle;

    // methods
    void prediction() {
        nextCycle += 25;
        System.out.println("next cycle starts: " + nextCycle);
    }

}
