
package javaapplication9;

import java.util.Scanner;

public class JavaApplication9 {

 
    public static void main(String[] args) {
       float time;
	System.out.println("enter the time of the workers");
         Scanner sc = new Scanner(System.in);
	time = sc.nextFloat();
	if(time>=2&&time<3)
	{
		System.out.println("The worker is highly efficient");
	}
	if(time>=3&&time<4)
	{
		System.out.println("The worker need to be improved");
	}
	if(time>=4&&time<5)
	{
		System.out.println("The worker need to attend training to improve his speed ");
	}	 
	if(time>=5)
	{
		System.out.println("The worker is terminated");
	}
    }
    
}
