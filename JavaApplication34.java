// A Java program to illustrate Dynamic Method Dispatch using hierarchical inheritance
package javaapplication34;


class A
{
    void m1()
    {
        System.out.println("Inside A's m1 method");
    }
}
  
class B extends A
{
    // overriding m1()
    void m1()
    {
        System.out.println("Inside B's m1 method");
    }
}
  
class C extends A
{
    // overriding m1()
    void m1()
    {
        System.out.println("Inside C's m1 method");
    }
}
  

public class JavaApplication34 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         
        A a = new A();
        B b = new B();
        C c = new C();
        a.m1();
        b.m1();
        c.m1();
    }
    
}
