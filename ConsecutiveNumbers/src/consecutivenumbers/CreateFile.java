/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package consecutivenumbers;

import java.util.Formatter;

/**
 *
 * @author Chris
 */
public class CreateFile {
    Formatter x;
    public void openFile()  {
        
        try{
            x = new Formatter("primearray.txt");
            System.out.println("You created a file");
        }
        catch(Exception e)  {
            System.out.println("You got an error!");
        }
    }
    
    public void addRecord() {
        x.format(" ",);
         
    }
    
    public void closeFile() {
        x.close();
    }
}

