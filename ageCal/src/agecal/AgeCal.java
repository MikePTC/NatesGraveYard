/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agecal;
import java.util.Scanner;
/**
 *
 * @author phant
 */

import java.util.Scanner;
public class AgeCal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Mike Commit");
        int ageNine;
        
              ageNine = 9;  
               
               System.out.println("How old are you:");
               Scanner inPut = new Scanner(System.in);
               int age= inPut.nextInt();
               int diff =  age - ageNine;
               int sum =  age + ageNine;
               System.out.println("you are : "+age);
               System.out.println("you will be  : "+sum+" : in 9 years");
               System.out.println("you where  : "+diff+" : 9 years ago");
        // TODO code application logic here
    }
    
}
