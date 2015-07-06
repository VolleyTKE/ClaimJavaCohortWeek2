/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package consecutivenumbers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author Chris
 */
public class Primes {
    
    
    
    List<Integer> primes = new ArrayList< >();

    
    
    
    public void findPrimes()    {
        for(int i = 2; i<100; i++)  {
            if(isPrime(i)) {
                
                //System.out.println(i);
                primes.add(i);
            }
        }
        System.out.print(Arrays.toString(primes.toArray())); //==26
    }
    
    
    
    boolean isPrime(int n) {
    for(int i=2;i<n;i++) {
        if(n%i==0)
            return false;
    }
    return true;
}
    
    
    
}
