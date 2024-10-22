/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Bryan
 */
package firstquestion.checkoddnumber;
public class averageofanarray {
   public static void main(String[] args) {
       
        int[] numbers = {10, 12, 34, 23, 56, 78};
        
        int sum = 0;
        
       for (int i = 0; i < numbers.length; i++) {
            sum = sum+numbers[i];
        }
        
        double average = (double)sum / numbers.length;
        System.out.println("The average of the array elements is: " + average);
    }
    
}
