
package javaapplication8;

import java.util.Scanner;

public class JavaApplication8 {
     public static void main(String[] args) {

   double x , y , z ;
   Scanner sc = new Scanner(System.in);	
   System.out.println("Please Enter Three sides of Triangle ");
   x = sc.nextDouble();
    y = sc.nextDouble();
    z = sc.nextDouble();
    if((x+ y  >  z) && (y + z> x) &&(x + z > y))
    {
        if (x == y && y == z )
        System.out.println("Equilateral Triangle");
 
    else if (x == y || y == z || z == x )
        System.out.println("Isosceles Triangle");
 
    else
        System.out.println("Scalene Triangle");
    }
    else
      System.out.println("It is Not a Valid Triangle");
     }
    
}
