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

public class Grade {
    public static void main(String[] args){
    Scanner inp = new Scanner(System.in);
        
        System.out.print("Enter your grade (A, B, C, D, F): ");
        char grade = inp.next().charAt(0);
        
        switch (grade) {
            case 'A':
                System.out.println("Excellent!");
                break;
            case 'B':
                System.out.println("Good job congratulation to you!");
                break;
            case 'C':
                System.out.println("You passed but work hard.");
                break;
            case 'D':
                System.out.println("You can do better, work hard.");
                break;
            case 'F':
                System.out.println("Fail. Please try again to increase.");
                break;
            default:
                System.out.println("Invalid grade. Please enter A, B, C, D, or F.");
        }

      
    }
}
    
 