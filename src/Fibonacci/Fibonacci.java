package Fibonacci;

import java.util.Arrays;
import java.util.Scanner;

public class Fibonacci {
    public static void run(){

        // Creating a Scanner object
        Scanner sc = new Scanner(System.in);

        while (true) {
            // Getting the amount of numbers from fibonacci sequence:
            System.out.println("How manay numbers from the fibonacci sequence do you want?");
            int qnts = sc.nextInt();

            // if the amount is 0, ends the code
            if (qnts <= 0) {
                break;
            // if the amount is 1, show 0
            } else if (qnts == 1) {
                System.out.println("[0]");
                break;
            }

            // creating the array for the sequence
            int[] fibonacci = new int[qnts];

            // setting the 2 first numbers
            fibonacci[0] = 0;
            fibonacci[1] = 1;

            // calc the next numbers
            for (int i = 2; i < qnts; i++) {
                fibonacci[i] = fibonacci[i-1] + fibonacci[i-2];
            }
            
            // printing the sequence
            System.out.println(Arrays.toString(fibonacci)+"\n\n");
        }

    }
}
