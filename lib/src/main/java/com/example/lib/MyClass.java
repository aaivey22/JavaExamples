package com.example.lib;

import java.util.Scanner;

public class MyClass {
    public static void main(String[] args) {

        // period app
/*        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter the first calendar date of your cycle: ");
        int n1 = s1.nextInt();
        //int n1 = 1;
        System.out.println("Enter the last calendar date of your cycle: ");
        int n2 = s1.nextInt();
        //int n2 = 2;
        Cycle myCycle = new Cycle();
        myCycle.cycleStart = n1;
        myCycle.cycleEnd = n2;
        myCycle.prediction();*/

        // exercise 4
/*        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String input_string = s1.nextLine();
        count(input_string);*/

        // exercise 5: reversing a string
        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter a string: ");
        char[] letters = s1.nextLine().toCharArray();
        System.out.println("The reversed string: ");
        for (int i = letters.length-1; i >=0; i--) {
            System.out.println(letters[i]);
        }
        System.out.println("\n");
    }

    // exercise 4
/*    public static void count(String x) {

        char[] ch = x.toCharArray();
        int letters = 0;
        int spaces = 0;
        int numbers = 0;
        int others = 0;

        for (int i = 0; i < x.length(); i++) {
            if (Character.isLetter(ch[i])) {
                letters++;
            } else if (Character.isDigit(ch[i])) {
                numbers++;
            } else if (Character.isSpaceChar(ch[i])) {
                spaces++;
            } else {
                others++;
            }
        }
        System.out.println("There are "+letters+" letters");
        System.out.println("There are "+spaces+" spaces");
        System.out.println("There are "+numbers+" numbers");
        System.out.println("There are "+others+" characters");

    }*/
}

// period app
/*class Cycle {
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

}*/
