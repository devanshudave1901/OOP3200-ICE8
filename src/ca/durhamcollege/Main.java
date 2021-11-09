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

        // scanner declaration
        Scanner keyboard = new Scanner(System.in);

        // input
        // string name
        String name = null;
        System.out.print("Please Enter your name ");
        name = keyboard.nextLine(); // input inside the keyboard a string


        float age = 0.0f;
        System.out.print("Please enter your age: ");
        age = keyboard.nextFloat();
        System.out.println();


        //output
        System.out.printf("You entered: %s ", name);
        System.out.printf("You Entered: %.2f \n",age);

    }
}
