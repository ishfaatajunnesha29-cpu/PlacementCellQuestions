/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SubArrays;

/**
 *
 * @author ISHFAA TAJ
 */
public class SubArray 
{
    public static void main(String[] args) 
    {
        int ar[]={1,2,3,4,5};
        
        
        for(int i=0;i<ar.length;i++)
        {
            for(int j=i;j<ar.length;j++)
            {
                for(int k=i;k<=j;k++)
                {
                    System.out.print(ar[k]+" ");
                }
                System.out.println();
            }
        }
    }
}
