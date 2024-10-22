/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author Bryan
 */
package firstquestion.checkoddnumber;
public class reverseofanarray {
       public static void main(String[] args) {
        int[] allnumbers = {3, 4, 6, 1, 9, 7, 5, 8};
        int length = allnumbers.length;
        int[] reversed = new int[length];

        for (int i = 0; i < length; i++) {
            reversed[i] = allnumbers[length - 1 - i];
        }

        System.out.print("Reversed array of all numbers: ");
        for (int i = 0; i < length; i++) {
            System.out.print(reversed[i] + " ");
        }
    }
    
}
