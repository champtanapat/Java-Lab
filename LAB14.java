import java.util.Scanner;

public class LAB14 {
    public static void main(String[] args) {
        int input_fac = 1, fac = 1;
        boolean invalid = true;
        Scanner input = new Scanner(System.in);
        do {
            invalid = true;
            System.out.print("Input Number Factorial : ");
            input_fac = input.nextInt();
            if (input_fac < 0 || input_fac > 10) {
                System.out.println("==============================================");
                System.out.println("wrong number");
                System.out.println("==============================================");
                invalid = false;
            }
        } while (!invalid);
        for (int i = 1; i <= input_fac; i++) {
            fac = fac * i;
        }
        System.out.println("=====================Result===================");
        System.out.println("Factorial: \t" + fac);
        System.out.println("==============================================");
    }
}
