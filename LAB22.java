import java.util.Scanner;

import javax.swing.Popup;

public class LAB22 {

    public static int factorial(int n)
    {
        if (n >=1){
            return n* factorial(n-1);
        }
        else{
            return 1;
        }
    }
    public static void main(String[] args) {
        int input_n;
        boolean invalid = true;
        Scanner input = new Scanner(System.in);
        do {
            System.out.print("Input Number Factorial : ");
            input_n = input.nextInt();
            if (input_n < 0 || input_n > 10) {
                System.out.println("==============================================");
                System.out.println("wrong number");
                System.out.println("==============================================");
                invalid = true;
            }else{
                invalid = false;
            }
        } while (invalid);
        System.out.println("=====================Result===================");
        System.out.println("Factorial: \t" +  factorial(input_n));
        System.out.println("==============================================");
    }
}
