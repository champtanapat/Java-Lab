import java.util.Scanner;

public class LAB14 {
    public static void main(String[] args) {
        int input_fac = 1,fac = 1 ;
        boolean invalid = true;
        Scanner input = new Scanner(System.in);

        do {
            invalid = true;
            System.out.print("Input Score Assignment : ");
            input_fac = input.nextInt();
            if (fac >= 0 || fac <= 10) {
                System.out.println("==============================================");
                System.out.println("INVALID SCORE");
                System.out.println("==============================================");
            }
        } while (!invalid);
        for(int i = 1 ; i<=input_fac;i++)
        {
            fac = fac * i; 
        }
        System.out.println("=====================Result===================");
        System.out.println("Factorial: \t" + fac);
        System.out.println("==============================================");
    }
}
