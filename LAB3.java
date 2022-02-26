import java.util.Scanner;

public class LAB3 {
    public static void main(String[] args) {
        double electricUnit = 10 , waterUnit = 15; 
        double room,qty_electric,qty_water,wifi ; 
        Scanner input = new Scanner(System.in); 

        System.out.print("room rent : "); 
        room = input.nextDouble(); 

        System.out.print("Quantity Electric : "); 
        qty_electric = input.nextDouble(); 

        System.out.print("Quantity Water : "); 
        qty_water = input.nextDouble(); 

        System.out.print("Price Wifi : ");  
        wifi = input.nextDouble(); 

        System.out.print("Quantity Electric : " + qty_electric); 
        System.out.print("\t Unit Price Electric : " + electricUnit); 
        System.out.println("\t Amount : " + electricUnit * qty_electric); 

        System.out.print("Quantity Water : " + qty_water); 
        System.out.print("\t Unit Price Water : " + waterUnit); 
        System.out.println("\t Amount : " + waterUnit * qty_water); 




    }
}
