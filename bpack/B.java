package bpack;
import apack.A;

public class B extends A {
    public void display() {
        System.out.println("Protected Variable (from class B): " + protectedVar);
        System.out.println("Private Variable (from class B): " + privateVar); 
// Cannot access private member of A
        System.out.println("Public Variable (from class B): " + publicVar);
    }
}
