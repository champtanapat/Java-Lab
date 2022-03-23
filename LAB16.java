import java.util.Scanner;

public class LAB16 {
    public static void main(String[] args) {
        char text;
        int width, length;
        boolean invalid = true;
        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter Charter: ");
        text = input.next().charAt(0);

        do {
            invalid = true;
            System.out.print("Please Width greater than 0 and not greater than 15): ");
            width = input.nextInt();
            if (width < 0 || width >= 15) {
                System.out.println("INVALID NUMBER");
                invalid = false;
            }
        } while (!invalid);
        do {
            invalid = true;
            System.out.print("Please Length greater than 0 and not greater than 15): ");
            length = input.nextInt();
            if (length < 0 || length >= 15) {
                System.out.println("INVALID NUMBER");
                invalid = false;
            }
        } while (!invalid);

        for (int i = 1; i <= length; i++) {
            System.out.print("" + text);
        }
        System.out.println();
        for (int i = 1; i <= width; i++) {
            System.out.print("" + text);
            for (int j = 1; j < length; j++) {
                System.out.print(" ");
            }
            System.out.print("" + text);
            System.out.println();
        }
        for (int i = 1; i <= length; i++) {
            System.out.print("" + text);
        }
    }
}
