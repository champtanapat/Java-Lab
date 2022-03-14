import java.util.Scanner;

public class LAB6 {
    public static void main(String[] args) {
        int electricUnit = 10 , waterUnit = 20 , total = 0; 
        int room,qty_electric,qty_water,wifi ; 
        int amountElectric = 0 , amountWater = 0 ; 
        Scanner input = new Scanner(System.in); 

        //ค่าห้อง
        System.out.print("Room Rent : "); 
        room = input.nextInt();

        //หน่วยไฟ
        System.out.print("Quantity Electric : "); 
        qty_electric = input.nextInt(); 
        if(qty_electric>=301){
            amountElectric = amountElectric + (100 * electricUnit)  ; 
            electricUnit = 15 ;
            amountElectric = amountElectric + (200 * electricUnit)  ; 
            electricUnit = 20 ;
            //qty_electric =  qty_electric - 300; 
            amountElectric = amountElectric + ((qty_electric - 300) * electricUnit)  ; 
        }
        else if(qty_electric>=101){
            amountElectric = amountElectric + (100 * electricUnit)  ; 
            electricUnit = 15 ;
            //qty_electric =  qty_electric - 100; 
            amountElectric = amountElectric + ((qty_electric - 100) * electricUnit)  ; 
        }
        else{
            qty_electric = qty_electric* electricUnit ; 
            amountElectric = amountElectric + qty_electric ; 
        }

        //หน่วยน้ำ
        System.out.print("Quantity Water : "); 
        qty_water = input.nextInt(); 
        if(qty_water>=7){
            amountWater = amountWater + (2 * waterUnit); 
            waterUnit = 30 ;
            amountWater = amountWater + (4 * waterUnit); 
            waterUnit = 40 ;
            amountWater = amountWater + ((qty_water-6) * waterUnit); 

        }
        else if(qty_water>=3){
            amountWater = amountWater + (2 * waterUnit); 
            waterUnit = 30 ;
            amountWater = amountWater + ((qty_water - 2) * waterUnit); 
        }
        else {
            qty_water = qty_water * electricUnit ; 
            amountWater = amountWater + qty_water ; 
        }
        System.out.print("Price Wifi : ");  
        wifi = input.nextInt(); 
        total = room + amountElectric + amountWater + wifi ; 
        System.out.println("====================================");

        System.out.print("Quantity Electric : " + qty_electric); 
        System.out.println("\t\tAmount Electric : " + amountElectric); 

        System.out.print("Quantity Water : " + qty_water); 
        System.out.println("\t\tAmount Water : " + amountWater); 

        System.out.println("\t\tAmount Room : " + room); 
        System.out.println("\t\tAmount Wifi : " + wifi); 
        System.out.println("\t\tGrand Total : " + total); 
    }
}
