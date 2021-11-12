/**
 * @author Devanshu Dave
 * @date 08/11/2021
 * @type ICE8
 */


package ca.durhamcollege;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {

        // scanner declaration
        Scanner keyboard = new Scanner(System.in);

        // input
        // string name
        String name = null;
        System.out.print("Please Enter your name: ");
        name = keyboard.nextLine(); // input inside the keyboard a string


        float age = 0.0f;

        boolean isValidInput = false;

        do
        {
            System.out.print("Please Enter Your age: ");
            try
            {

                age = keyboard.nextFloat();
                System.out.println();
                isValidInput = true;
                if((age  < 0.0f)  ||  (age > 120.0f))
                {
                    System.out.println("Error: You must enter a age greater than 0.0 and less than 120.0 years old");
                    isValidInput = false;

                }


            }
            catch (InputMismatchException inputMismatchException)
            {
                System.out.println("Error: You must enter a valid floating-point number");
                keyboard.nextLine();
                isValidInput = false;


            }
        }
        while(!isValidInput);



        System.out.println("Multi-Dimensional Array example");
        int rows = 8;
        int cols =8;
        float[][] board = new float[rows][cols];

        for (int x = 0; x < rows; x++)
        {
            for (int y = 0; y < cols; y++)
            {
                board[x][y] = (float)(Math.random() *100.0f) + 1.0f;
            }
        }


        System.out.println("Showing 10 Random Values: ");

        for (int i = 0; i < 10; i++)
        {
            var randRows = (int)(Math.random() * rows);
            var randCols= (int)(Math.random() * cols);

            System.out.print("For row: " + randCols + " Col: " + randCols + " ");
            System.out.printf("Random number is : %.2f \n", board[randRows][randCols]);
        }

        //output
        System.out.println();
        System.out.printf("\nYou entered: %s \n", name);
        System.out.printf("You Entered: %.2f \n",age);
    }
}
