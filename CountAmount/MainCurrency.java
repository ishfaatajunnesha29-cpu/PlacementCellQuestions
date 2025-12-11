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
public class MainCurrency
{

    public static void main(String[] args)
    {
        int ar[]={2000,500,200,100,50,20,10,5,1};
        int amount=800;
        
        Currency cu=new Currency();
        cu.count(ar,amount);
    }    
}
