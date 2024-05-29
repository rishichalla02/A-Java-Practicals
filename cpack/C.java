package cpack;
import apack.A;

public class C {
    public void display() {
        A objA = new A();
        System.out.println("Protected Variable (from class C): " + objA.protectedVar);
        System.out.println("Private Variable (from class C): " + objA.privateVar); 
  // Cannot access private member of A
        System.out.println("Public Variable (from class C): " + objA.publicVar);
    }
}
