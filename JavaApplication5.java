
package javaapplication5;

import java.util.Scanner;

public class JavaApplication5 {

    public static void main(String[] args) {
       
               Scanner sc = new Scanner(System.in);
               float h, cc, ts;  
    int grade = 0;
    System.out.println("Enter the value of Hardness: ");
     h = sc.nextFloat();

    System.out.println("Enter the value of Carbon Content: ");
     cc = sc.nextFloat();

    System.out.println("Enter the value of Tensile Strength: ");
    ts = sc.nextFloat();


    if(h<50 && cc>0.7 && ts<5600)
        grade = 5;
    if(h>50 || cc<.7 || ts>5600)
        grade = 6;
    if(h>50 && cc>0.7 && ts>5600)
        grade = 7;

    if(h<50 &&cc<0.7 && ts>5600)
        grade = 8;
    if( h>50&& cc<0.7 &&ts<5600 )
        grade = 9;

    if( h>50&& cc<0.7 && ts>5600 )
        grade = 10;

    System.out.println("The grade of steel is: "+ grade);
}
}
    
