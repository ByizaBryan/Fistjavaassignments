/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Bryan
 * 
 */
package firstquestion.checkoddnumber;
import java.util.Scanner;
public class checkingnumber {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        
        System.out.println(" please enter number to check whether it is positive, negative, or zero : ");
 
        int num = inp.nextInt();
        
        if(num>0){
            System.out.println(" The entered number is positive.");
        }
        else if(num<0){
         System.out.println( " The entered number is negative.");   
        }
        else{
        System.out.println(" The entered number is zero.");
        }
        }
    
}
