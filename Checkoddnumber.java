package firstquestion.checkoddnumber;
import java.util.Scanner;

public class Checkoddnumber {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        
        System.out.print("Enter a number to check whether is even or odd: ");
        int number = inp.nextInt();
        
        if (number % 2 == 0) {
            System.out.println(" The entered number is Even");
        } else {
            System.out.println("The entered number is Odd");
        }

      
    }
}