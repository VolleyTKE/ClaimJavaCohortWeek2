/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package weektwoclaim;

/**
 *
 * @author Chris
 */
public class FindPrimes {

    public void findPrimes() {
        for(int i = 2; i <1000;i++)
            
        if (isPrime(i)) {
           System.out.println(i);
       
    }}

    public static boolean isPrime(int n) {
    for(int i=2;i<n;i++) {
        if(n%i==0){
            return false;
        }    
    }
    return true;
}
}
