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
public class CheckVowels 
{
    public int check(String str,int count)
    {
        str = str.toLowerCase();
        for(int i=0;i<str.length();i++)
        {
            char c = str.charAt(i);
            switch(c)
            {
                case'a':
                case'e':
                case'i':
                case'o':
                case'u':
                    count++;
                    break;
            
            default:

            }
        } 
        return count;
    }
}
