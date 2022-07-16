
package javaapplication3;

import java.util.Scanner;

public class JavaApplication3 {

    
    public static void main(String[] args) {
        char ch;
       System.out.println("Enter values of x&y : ");
      Scanner sc = new Scanner(System.in);
       ch =sc.next().charAt(0);
        if (ch >= 'A' && ch <= 'Z')
            System.out.println("\n" + ch +
                    " is an UpperCase character");
     
        else if (ch >= 'a' && ch <= 'z')
            System.out.println("\n" + ch +
                    " is an LowerCase character" );
       else if (ch >= '0' && ch <= '9')
            System.out.println("\n" + ch +
                    " is an number" );
        else
            System.out.println("\n" + ch +
                    " is not a special character" );
    }
    
}
