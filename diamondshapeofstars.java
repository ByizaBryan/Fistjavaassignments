/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author Bryan
 */
package firstquestion.checkoddnumber;
public class diamondshapeofstars {
     public static void main(String[] args) {
        int num= 7;  
        for (int i = 1; i <= num; i++) {       
           for (int j = i; j < num; j++) {
                System.out.print(" ");
            }   
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println();  
        }

        for (int i = num - 1; i >= 1; i--) {
            
            for (int j = num; j > i; j--) {
                System.out.print(" ");
            }
            
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println();  
        }
    }
}
        
        

    
    

