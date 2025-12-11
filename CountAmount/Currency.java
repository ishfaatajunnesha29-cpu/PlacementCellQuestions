/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package placementquestions;

/**
 *
 * @author ISHFAA TAJ
 */
public class Currency 
{
    public void count(int ar[],int amount)
    {
        for(int i=0;i<ar.length;i++)
        {
            if(amount>=ar[i])
            {
                int count=amount/ar[i];
                amount=amount%ar[i];
                System.out.println(ar[i]+" : "+count);
            }
        }
    }
}
