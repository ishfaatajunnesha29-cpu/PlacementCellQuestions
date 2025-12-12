/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StringToChar;

/**
 *
 * @author ISHFAA TAJ
 */
public class StringMain 
{
    public static void main(String[] args) 
    {
        String str = "Welcome";
       
        int count = 0;

        CheckVowels cv = new CheckVowels();
        int c = cv.check(str, count);
        System.out.println("Total number of vowels: "+c);
    }
}
