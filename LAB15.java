import java.util.Scanner;

public class LAB15 {
    public static void main(String[] args) {
        int number;
        Scanner input = new Scanner(System.in);
        do {
            System.out.print("enter number (greater than 10 and not greater than 30) : ");
            number = input.nextInt();
        } while (number <= 10 || number > 30);
        for (int i = 1; i <= 12; i++) {
            System.out.println(number + " x " + i + "\t=\t"+(number * i));
        }
    }
}
