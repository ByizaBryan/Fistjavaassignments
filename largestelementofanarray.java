/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author Bryan
 */
package firstquestion.checkoddnumber;
public class largestelementofanarray {
       public static void main(String[] args) {
        int[] elements = {34, 23, 12, 45, 67, 89, 234, 26, 10, 30, 43};
        int largest = elements[0];

        for (int i = 1; i < elements.length; i++) {
            if (elements[i] > largest) {
                largest = elements[i];
            }
        }

        System.out.println("The largest entered element is: " + largest);
    }
    
}
