// Declare interfaces
interface I1 {}
interface I2 {}
interface I3 extends I1, I2 {}
interface I4 {}

// Class X implements interface I3
class X implements I3 {}

// Class W extends X and implements interface I4
class W extends X implements I4 {}

public class Prac_5_2 {
    public static void main(String[] args) {
        // Create an object of class W
        W w = new W();

        // Check if the object implements each interface and is of type X
        if (w instanceof I1) {
            System.out.println("Object of class W implements interface I1");
        }
        if (w instanceof I2) {
            System.out.println("Object of class W implements interface I2");
        }
        if (w instanceof I3) {
            System.out.println("Object of class W implements interface I3");
        }
        if (w instanceof I4) {
            System.out.println("Object of class W implements interface I4");
        }
        if (w instanceof X) {
            System.out.println("Object of class W is of type X");
        }
    }
}
