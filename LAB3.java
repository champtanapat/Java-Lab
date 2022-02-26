import java.io.IOException;
import java.util.Scanner;

public class LAB3 {
    public static void main(String[] args) throws IOException {
        double electricUnit = 10 , waterUnit = 15 , total = 0.0; 
        double room,qty_electric,qty_water,wifi ; 

        Scanner input = new Scanner(System.in); 

        
        System.out.print("Room Rent : "); 
        room = input.nextDouble(); 

        System.out.print("Quantity Electric : "); 
        qty_electric = input.nextDouble(); 

        System.out.print("Quantity Water : "); 
        qty_water = input.nextDouble(); 

        System.out.print("Price Wifi : ");  
        wifi = input.nextDouble(); 

        total = room + (electricUnit * qty_electric) + (waterUnit * qty_water) + wifi ; 
        System.out.print("\033[H\033[2J");

        System.out.print("Quantity Electric : " + qty_electric); 
        System.out.print("\t Unit Price Electric : " + electricUnit); 
        System.out.println("\t Amount : " + electricUnit * qty_electric); 

        System.out.print("Quantity Water : " + qty_water); 
        System.out.print("\t\t Unit Price Water : " + waterUnit); 
        System.out.println("\t\t Amount : " + waterUnit * qty_water); 

        System.out.println("\t\tAmount Room: " + room); 
        System.out.println("\t\tAmount Wifi: " + wifi); 

         System.out.println("\t\tGrand Total: " + total); 

        

    }
}
