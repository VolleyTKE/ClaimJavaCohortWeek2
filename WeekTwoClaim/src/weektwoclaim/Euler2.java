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
public class Euler2 {
    public void Euler2(){
    int n, n1 = 0, n2 =1;
        
        int largenumber;
        largenumber = 4000000;
        int total = 0;
        for(n = 1; n2 < largenumber; n++ )    {
            n = n1 + n2;
            n1 = n2;
            n2 = n;
            if(n2%2 == 0)   {
                total+=n2;
            }
        }
        
        System.out.println(total);
}
    
}
