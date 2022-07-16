
package javaapplication4;

import java.util.Scanner;


public class JavaApplication4 {

  
    public static void main(String[] args) {
  
char h,l,g;
int a;
System.out.println("Enter Heath e For Excellent And p For Poor ");
 Scanner sc = new Scanner(System.in);
 h = sc.next().charAt(0);
System.out.println("Enter Location c For City And v For Village ");
 l = sc.next().charAt(0);
System.out.println("Enter Gender m For Male And f For Female ");
 g = sc.next().charAt(0);
System.out.println("Enter Age ");
 a = sc.nextInt();
if((h=='e')&&(l=='c')&&(g=='m')&&(a>=25||a<=35))
System.out.println("The Premium Is Rs.4 Per Thousand And His Policy Cannot Exceed Rs.2 Lakhs");
else if((h=='e')&&(l=='c')&&(g=='f')&&(a>=25||a<=35))
System.out.println("The Premium Is Rs.3 Per Thousand And Her Policy Cannot Exceed Rs.1 Lakhs");
else if((h=='p')&&(l=='v')&&(g=='m')&&(a>=25||a<=35))
System.out.println("The Premium Is Rs.6 Per Thousand And Cannot Exceed Rs. 10,000");
else
System.out.println(" not Insured");


    }
    
}
