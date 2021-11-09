/**
 * @author Devanshu Dave
 * @date 08/11/2021
 * @type ICE8
 */


package ca.durhamcollege;

import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        String name = null;
        int age;


        Scanner keyboard = new Scanner(System.in);
        System.out.print("Please Enter your name ");
        name = keyboard.nextLine(); // input inside the keyboard a string

        System.out.printf("You entered: %s ", name);


    }
}
