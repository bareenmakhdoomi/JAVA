
package javaapplication6;

import java.util.Scanner;

public class JavaApplication6 {

  
    public static void main(String[] args) {
    int days;
    float fine = 0;

    System.out.println("Enter the number of days: ");
    Scanner sc = new Scanner(System.in);
     days = sc.nextInt();

    if (days > 0 && days <= 5)
        fine = (float) (0.50 * days);

    else if (days >= 6 && days <= 10)
        fine = 1 * days;

    else if (days > 10)
        fine = 5 * days;

    else if (days > 30)
        {
            System.out.println("Your membership will be canceled.\n");
        }
   

    System.out.println("You have to pay Rs."+fine+" fine");

    }
    
}
