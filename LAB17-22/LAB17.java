import java.util.Scanner;

public class LAB17 {
    public static double computeElectric(int electricUnit){
        // คำนวณค่าไฟ
        if (electricUnit >= 301) {
            return (100 * 10) + (200 * 15) + ((electricUnit - 300) * 20);
        } else if (electricUnit >= 101) {
            return (100 * 10) + ((electricUnit - 100) * 15);
        } else {
            return  electricUnit * 10; 
        }
    }
    public static double computeWater(int waterUnit){
        if (waterUnit >= 7) {
            return (2 * 20) + (4 * 30) + ((waterUnit - 6) * 40);
        } else if (waterUnit >= 3) {
            return(2 * 20) + +((waterUnit - 2) * 30);
        } else {
            return (waterUnit * 20);
        }
    }

    public static void main(String[] args) {
        int roomRent, qty_electric,qty_water,wifi ; 
        double total = 0.0, totalElectric = 0.0 ,totalWater = 0.0; 
        Scanner input = new Scanner(System.in);

        // ค่าเช่าห้อง 
        System.out.print("Room Rent : ");
        roomRent = input.nextInt();

        // รับค่าไฟ
        System.out.print("Quantity Electric : ");
        qty_electric = input.nextInt();

        // รับค่าไฟ
        System.out.print("Quantity Water : ");
        qty_water = input.nextInt();
        // WIFI
        System.out.print("Price Wifi : ");
        wifi = input.nextInt();

        totalElectric = computeElectric(qty_electric);
        totalWater = computeWater(qty_water); 
        total = roomRent + totalElectric + totalWater + wifi; 
        System.out.println("====================================");
        System.out.println("\t\tRoom Rent : " + roomRent);
        System.out.print("Quantity Electric : " + qty_electric);
        System.out.println("\t\tAmount Electric : " + computeElectric(qty_electric));
        System.out.print("Quantity Water : " + qty_water);
        System.out.println("\t\tAmount Water : " + computeWater(qty_water));
        System.out.println("\t\tAmount Wifi : " + wifi);
        System.out.println("\t\tGrand Total : " + total);
        System.out.println("====================================");
    }
}
