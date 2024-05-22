       public class Prac_1_3 {
            public static void main(String[] args) {
               
                double a1 = 3.4, b1 = 50.2, c1 = 44.5;
                double a2 = 2.1, b2 = 0.55, c2 = 5.9;
        
                double equation = a1 * b2 - a2 * b1;
                double xequation = c1 * b2 - c2 * b1;
                double yequation = a1 * c2 - a2 * c1;
        
                if (equation != 0) {
                   
                    double x = xequation / equation;
                    double y = yequation / equation;
        
                    System.out.println("Solution for x: " + x);
                    System.out.println("Solution for y: " + y);
                } else {
                    System.out.println("The system of equations has no unique solution.");
                }
            }
        }