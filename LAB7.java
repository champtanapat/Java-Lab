import java.util.Scanner;

public class LAB7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); 
        int select ; 
        double width,length,high,base,radius; 
        double area = 0.0 ;

        System.out.println("calculate rectangle area enter 1 "); 
        System.out.println("calculate triangle area enter 2 "); 
        System.out.println("calculate circle area enter 3 "); 
        System.out.print("CHOICE: "); 
        select = input.nextInt();
        switch(select)
            {
                case 1:  
                    System.out.print("width: ");
                    width = input.nextDouble();
                    System.out.print("length: ");
                    length = input.nextDouble();
                    area = width * length ; 
                    System.out.println("Area rectangle =  " + area); 
                break; 

                case 2: 
                    System.out.print("high: ");
                    high = input.nextDouble();
                    System.out.print("base: ");
                    base = input.nextDouble();
                    area = (base * high)/2 ; 
                    System.out.println("Area triangle =  " + area);
                break;  
                case 3: 
                    System.out.print("radius: ");
                    radius = input.nextDouble();
                    area = 3.14 * (radius * radius); 
                    System.out.println("Area circle =  " + area);
                break; 

                default:  System.out.println("INVALID CHOICE"); 
            }
       
        
    }
}
