package com.digihoss.dice;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;
public class Simulator {
    public  static void main() {
            Random rand = new Random();
            int rolledNumber;
            Scanner scanner = new Scanner(System.in);

            try {
                System.out.println("How many dice you would like to roll?");
                int numberOfDices = scanner.nextInt();
                System.out.println("About to roll " + numberOfDices + " dice");
                for (int i = 0; i < numberOfDices; i++) {
                    rolledNumber = rand.nextInt(6)+1;
                    System.out.println(display(rolledNumber));
                }
            } catch (InputMismatchException e) {
                System.out.println("You should enter a valid number");
                System.err.println("Error : " + e);
            }
    }

    static String display(int value) {
        return  switch (value) {
            case 1 
                -> "-----------\n|         |\n|    o    |\n|         |\n-----------";        
            case 2
                -> "-----------\n|      o  |\n|         |\n|  o      |\n-----------";   
            case 3
                -> "-----------\n|      o  |\n|    o    |\n|  o      |\n-----------";        
            case 4
                -> "-----------\n|  o   o  |\n|         |\n|  o   o  |\n-----------";  
            case 5
                -> "-----------\n|  o   o  |\n|    o    |\n|  o   o  |\n-----------";        
            case 6
                -> "-----------\n|  o   o  |\n|  o   o  |\n|  o   o  |\n-----------";  
            default
                -> "Not a valid number";
        };
    }
}
