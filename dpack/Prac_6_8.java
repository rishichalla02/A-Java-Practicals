package dpack;
import bpack.B;
import cpack.C;

public class Prac_6_8 {
    public static void main(String[] args) {
        B objB = new B();
        objB.display(); // Accessing variables of class A from class B

        C objC = new C();
        objC.display(); // Accessing variables of class A from class C
    }
}
