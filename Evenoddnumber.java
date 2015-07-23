/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package evenoddnumber;

/**
 *
 * @author ikramlim
 */
public class Evenoddnumber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        int no = 10;
        
        System.out.println("Even Numbers" );
        
        for (int i = 1; i < no; i++)
        {
            if(i % 2 == 0)
            {
                System.out.println(i + " ");
            }
           
        }
        System.out.println("---------------------------");
        
        System.out.println("Odd Numbers" );
        
        for (int j = 0; j < no; j++)
        {
            if (j % 2 == 1)
            {
                System.out.println(j + " ");
            }
        }
    }
    
}
