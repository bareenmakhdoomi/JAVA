/*prgm to calculate square of a number in java using static member function*/
package javaapplication33;
class Calculatesqroot 
{  
//defining a static method   
static void sqroot()  
{  
double t,num=10;  
double sqrtroot=num/2;  
do   
{  
t=sqrtroot;  
sqrtroot=(t+(num/t))/2;  
}   
while((t-sqrtroot)!= 0);   
System.out.println("square root of 10 is: "+sqrtroot);    
}  
}
public class JavaApplication33 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
       Calculatesqroot.sqroot(); 
    }
    
}
