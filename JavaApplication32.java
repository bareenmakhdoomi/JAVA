/* program to count instances of class*/
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication32;
class test {
    int objNo;
    static int objCnt;
  
public test()
    {
    objNo = ++objCnt;
    }

    void printObjNumber()
    {
        System.out.println("object number :" + objNo );
    }
    static void printObjCount()
    {
       System.out.println("count:" +objCnt  );
    }
};
public class JavaApplication32 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    test t1=new test();
    test t2=new test();
    test.printObjCount();
    
   
    t1.printObjNumber(); 
    test t3=new test();
    t1.printObjCount();
    t2.printObjNumber(); 
    t3.printObjNumber();
    test.printObjCount();
   
    }
    
}
