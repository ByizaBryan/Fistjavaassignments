/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author Bryan
 */
package firstquestion.checkoddnumber;
import java.util.Scanner;
public class largestnumber {
     public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        
     
        System.out.println("Enter the first number: ");
        int num1 = inp.nextInt();
        
        System.out.println("Enter the second number: ");
        int num2 = inp.nextInt();
        
         System.out.println("Enter the third number: ");
        int num3 = inp.nextInt();
        
                if (num1 >= num2 && num1 >= num3) {
            System.out.println(num1 + " is the largest number.");
        } 
                else if (num2 >= num1 && num2 >= num3) {
            System.out.println(num2 + " is the largest number.");
        } 
                else {
            System.out.println(num3 + " is the largest number.");
        }
                }
}

    

