/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package firstquestion.checkoddnumber;

/**
 *
 * @author Bryan
 */
import java.util.Scanner;
public class leapyear {
     public static void main(String[] args) {
        Scanner inp= new Scanner(System.in);
        
        System.out.print("Enter a year you want to check: ");
        int year = inp.nextInt();
        
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println("The entered year is a leap year.");
        } else {
            System.out.println(" The entered yearis not a leap year.");
        }

       
    }
}
