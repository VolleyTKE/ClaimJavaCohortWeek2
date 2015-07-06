/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package consecutivenumbers;

/**
 *
 * @author Chris
 */
public class Consecutive {
     public void Count() {
        
        int[] newArr = new int[]{1,3,5,7,11,13,17,19,23};
        int num = 0, numTwo = 0, counter = 0, abs = 0;
        
        for(int i = 1; i < newArr.length;i++)   {
            num = newArr[i-1];
            numTwo = newArr[i];
            abs = Math.abs(num-numTwo)-1;
            
            
            
                counter+=abs;
            
            
            //System.out.println(num + " " + numTwo + " " + i + " " + counter + " " + abs);
        }
    }
}
