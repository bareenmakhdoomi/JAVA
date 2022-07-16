
package javaapplication2;

import java.util.Scanner;

public class JavaApplication2 {

    public static void main(String[] args) {
       int x,y;
          System.out.println("Enter values of x&y : ");
      Scanner sc = new Scanner(System.in);
       x = sc.nextInt();
       y = sc.nextInt();
       if (x > 0 && y > 0)
            System.out.println("point is in First quadrant");
 
        else if (x < 0 && y > 0)
            System.out.println("point is in Second quadrant");
 
        else if (x < 0 && y < 0)
            System.out.println("point is in Third quadrant");
 
        else if (x > 0 && y < 0)
            System.out.println("point is in Fourth quadrant");
 
        else if (x == 0 && y > 0)
            System.out.println("point is at positive y axis");
 
        else if (x == 0 && y < 0)
            System.out.println("point is at negative y axis");
 
        else if (y == 0 && x < 0)
            System.out.println("point is at negative x axis");
 
        else if (y == 0 && x > 0)
            System.out.println("point is at positive x axis");
 
        else
            System.out.println("point is at origin");
    }
    
}
