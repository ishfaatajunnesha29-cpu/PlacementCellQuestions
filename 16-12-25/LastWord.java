/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LengthOfLastWord;

/**
 *
 * @author ISHFAA TAJ
 */
public class LastWord
{
    public static void main(String[] args)
    {
        String str = "Hello World";
        String words[] = str.split(" ");
        String lastWord = words[words.length-1];
        
        char ch[] = lastWord.toCharArray();
        System.out.println("Length of last word is :"+ch.length);
    }
}
