/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package checkpassfail;

import java.util.Scanner;

/**
 *
 * @author Chris
 */
public class CheckPassfail {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        String choice = "y";

        int mark;

        

        
        do {
            System.out.println("Please enter an integer...");
            mark = in.nextInt();

            if (mark >= 50) {
                System.out.println("PASS");
            } else {
                System.out.println("FAIL");
            }
            
            
            
                            
        } while (!choice.equalsIgnoreCase("n"));
        
    }

}
