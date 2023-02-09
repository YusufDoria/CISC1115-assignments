/*
Declare 2 double variables, use division and print the answer with the formula
Declare 2 integers and show integer division and modulus on these integer variables.
*/

public class Lab2b {
    public static void main(String [] args) {
        double num1 = 5.0;
        double num2 = 2.5;
        System.out.printf("%f / %f = %f \n" , num1, num2, num1/num2);
        int num3  = 4;
        int num4 = 2;
        System.out.printf("%d / %d = %d \n", num3, num4, num3/num4);
        System.out.printf("%d %% %d = %d", num3, num4, num3%num4);
    }
}
