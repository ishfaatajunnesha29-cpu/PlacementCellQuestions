/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package placementquestions.RollNumbers;

/**
 *
 * @author ISHFAA TAJ
 */
public class StudentRollNumber 
{
    public static void main(String[] args) 
    {
        int ar[]={101,102,104,105};
        int pos=3;
        int roll=103;
        int arr[]=new int[ar.length+1];
        
        for(int i=0;i<pos-1;i++)
        {
            arr[i]=ar[i];
        }
        
        arr[pos-1]=roll;
        
        for(int i=pos;i<ar.length+1;i++)
        {
            arr[i]=ar[i-1];
        }
        
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }
    }
    
}
