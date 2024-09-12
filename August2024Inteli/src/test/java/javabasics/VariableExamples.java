package javabasics;

public class VariableExamples {
    int b= 200;// something at Class level calledGlobal Variable
    int c ;


    public void m1(){
        int a = 10; //something at method level called local variable
        System.out.println(a);
        System.out.println(b);
        c= 400;

    }

    public void m2() {
       System.out.println(b);
        System.out.println(c);
    }
}
