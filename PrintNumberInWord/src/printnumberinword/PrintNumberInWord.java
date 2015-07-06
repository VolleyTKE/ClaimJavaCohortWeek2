/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package printnumberinword;

import java.util.Scanner;

/**
 *
 * @author Chris
 */
public class PrintNumberInWord {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        String choice = "y";

        int number;

        
        

        do {
            System.out.println("Please enter a number...");
        
        number = in.nextInt();
            useNestedIf(number);
            useSwitch(number);
            
            System.out.println();
            System.out.println("continue? y or n");
            choice = in.next();
        } while(!choice.equalsIgnoreCase("n"));

    }

    public static void useNestedIf(int number) {
        System.out.println("NestedIf prints ");

        if (number == 1) {
            System.out.println("ONE");
        } else if (number == 2) {
            System.out.println("TWO");
        } else if (number == 3) {
            System.out.println("THREE");
        } else if (number == 4) {
            System.out.println("FOUR");
        } else if (number == 5) {
            System.out.println("FIVE");
        } else if (number == 6) {
            System.out.println("SIX");
        } else if (number == 7) {
            System.out.println("SEVEN");
        } else if (number == 8) {
            System.out.println("EIGHT");
        } else if (number == 9) {
            System.out.println("NINE");
        } else {
            System.out.println("OTHER");
        }

    }

    private static void useSwitch(int number) {
        //To change body of generated methods, choose Tools | Templates.
        String word;
        switch (number) {
            case 1:
                word = "ONE";
                break;
            case 2:
                word = "TWO";
                break;
            case 3:
                word = "THREE";
                break;
            case 4:
                word = "FOUR";
                break;
            case 5:
                word = "FIVE";
                break;
            case 6:
                word = "SIX";
                break;
            case 7:
                word = "SEVEN";
                break;
            case 8:
                word = "EIGHT";
                break;
            case 9:
                word = "NINE";
                break;
            default:
                word = "OTHER";
                break;

        }
        System.out.println("Switch prints " + word);
    }
}
