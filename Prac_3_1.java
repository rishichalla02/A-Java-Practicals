public class Prac_3_1 {
    public static void main(String[] args) {
       int numArgs =  args.length;
        System.out.println("Number of argument = "+numArgs);

        String[] Numerics_Names = {"First", "Second", "Third", "Fourth", "Fifth"};

        for(int i=0; i<numArgs; i++){
            System.out.println((i+1)+ ":"+Numerics_Names[i]+"Student Names are : "+args[i]);
        }
    }
}