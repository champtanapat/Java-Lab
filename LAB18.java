import java.util.Scanner;

public class LAB18 {
    public static double rectangleArea (double width, double length) {
        return width * length ; 
    }public static double triangleArea (double base,double high) {
        return (base * high)/2 ;
    }public static double circleArea (double radius) {
        return 3.14 * (radius * radius); 
    }

    public static void main(String[] args) {
        int select;
        double width,length,area;
        double high,base;
        double radius;
        boolean invalid = true;
        Scanner input = new Scanner(System.in);
        do{
            System.out.println("calculate rectangle area enter 1 "); 
            System.out.println("calculate triangle area enter 2 "); 
            System.out.println("calculate circle area enter 3 "); 
            select = input.nextInt();
            area = 0.0;
            switch(select)
            {
                case 1:
                        System.out.print("width: ");
                        width = input.nextDouble();
                        System.out.print("length: ");
                        length = input.nextDouble();
                        area = rectangleArea(width,length);
                        System.out.println("Area rectangle =  " + area);
                        invalid = false; 
                break;
                case 2:
                        System.out.print("high: ");
                        high = input.nextDouble();
                        System.out.print("base: ");
                        base = input.nextDouble();
                        area = triangleArea(base,high);
                        System.out.println("Area triangle =  " + area);
                        invalid = false; 
                break;
                case 3:
                        System.out.print("radius: ");
                        radius = input.nextDouble();
                        area = circleArea(radius);
                        System.out.println("Area circle =  " + area);
                        invalid = false; 
                break;
                default:  System.out.println("INVALID CHOICE"); 
                invalid  = true; 
            }
        }while(invalid);
    }
}
