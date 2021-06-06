/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solutions
 *  Copyright 2021 Kevin Schiffli
 */
package Base;

import java.util.Scanner;

public class App {
    static Scanner in = new Scanner(System.in);

    public static void main( String[] args )
    {
        String age = getAge();
        int ageNum = stringToInt(age);
        String output = validateAge(ageNum);
        printOutput(output);
    }
    public static String getAge()
    {
        System.out.println( "What is your age? " );
        return in.nextLine();
    }

    public static int stringToInt(String number)
    {
        return Integer.parseInt(number);
    }

    public static String validateAge(int age)
    {
        String output = (age >= 16)? "You are old enough to legally drive" : "You are not old enough to legally drive";
        return output;
    }

    public static void printOutput(String output)
    {
        System.out.println(output);
    }
}