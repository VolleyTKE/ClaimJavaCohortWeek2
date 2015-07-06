/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sumandaverage;

/**
 *
 * @author Chris
 */
public class SumAndAverage {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        sumAndAverage();
        whileLoopSumAndAverage();
        sumInARange();
        oddNumberSumAndAverage();
        sevenSumAndAverage();
        sumOfSquares();
        
    }
    
    public static void sumAndAverage()  {
        int total = 0;
        int i;
        double average;
        for(i = 0; i < 50; i++) {
            total += i;
            
        }
        average = total/i;
        System.out.println(average);
        System.out.println(total);
    }
    
    public static void whileLoopSumAndAverage() {
        int total = 0;
        int i = 0;
        double average;
        while(i< 50)    {
            total += i;
            i++;
        }
        average = total/i;
        System.out.println("The doWHile loop average is " + average);
        System.out.println("The doWHile loop total is is " + total);
    }
    
    public static void sumInARange()    {
        int total = 0;
        int i;
        int count = 111;
        double average;
        for(i = 111; i < 8899; i++) {
            total += i;
            count++;
        }
        average = total/count;
        System.out.println("The suminarange loop average is " + average);
        System.out.println("The suminarange loop total is is " + total);
    }
    
    public static void oddNumberSumAndAverage() {
        int total = 0;
        int i;
        double average;
        for(i = 0; i < 100; i++) {
            if(i%2!=0)
            total += i;
            
        }
        average = total/i;
        System.out.println(average);
        System.out.println(total);
    }
    
    public static void sevenSumAndAverage() {
        int total = 0;
        int i;
        double average;
        for(i = 0; i < 100; i++) {
            if(i%7!=0)
            total += i;
            
        }
        average = total/i;
        System.out.println(average);
        System.out.println(total);
    }
    
    public static void sumOfSquares()   {
        int total = 0;
        int i;
        double average;
        for(i = 0; i < 100; i++) {
            total += i*i;
            
        }
        average = total/i;
        System.out.println(average);
        System.out.println(total);
    }
}
