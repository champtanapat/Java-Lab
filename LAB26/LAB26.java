package LAB26;

import java.util.Scanner;

public class LAB26 {
    public static void main(String[] args) {
        int select;
        double value1, value2;
        boolean invalid;
        Scanner input = new Scanner(System.in);
        Calculator cal = new Calculator();
        do {
            invalid = false;
            System.out.println("========================================================");
            System.out.println("Sum 2 value choice 1");
            System.out.println("Minus 2 value choice 2");
            System.out.println("Multiple 2 value choice 3");
            System.out.println("Division 2 value choice 4");
            System.out.print("Plese selecte choice : ");
            select = input.nextInt();
            System.out.println("========================================================");
            System.out.print("value 1: ");
            value1 = input.nextDouble();
            System.out.print("value 2: ");
            value2 = input.nextDouble();
            
            switch (select) {
                case 1:
                    System.out.println("Sum: " +cal.sum(value1, value2));
                    break;
                case 2:
                    System.out.println("Minus: " +cal.minus(value1, value2));
                    break;
                case 3:
                    System.out.println("Multiple: " +cal.product(value1, value2));
                    break;
                case 4:
                    if(value2 ==0)
                    {
                        System.out.println("******************INVALID value 2******************");
                        invalid = true;
                    }else{
                        System.out.println("Division: " +cal.divide(value1, value2));
                    }
                    
                    break;
                default:
                    invalid = true;
                    System.out.println("******************INVALID******************");
            }
        } while (invalid);

    }

}
