import java.util.Scanner;

public class LAB11 {
    public static void main(String[] args) {
        int room, qty_electric, qty_water, wifi, roomNo, moor_room ;
        int amountElectric = 0, amountWater = 0, total = 0;
        Scanner input = new Scanner(System.in);

        do {
            amountElectric = 0; 
            amountWater = 0;
            total = 0;
            
            System.out.print("Room Number : ");
            roomNo = input.nextInt();
            // ค่าห้อง
            System.out.print("Room Rent : ");
            room = input.nextInt();
            // รับค่าไฟ
            System.out.print("Quantity Electric : ");
            qty_electric = input.nextInt();
            // รับค่าไฟ
            System.out.print("Quantity Water : ");
            qty_water = input.nextInt();
            // WIFI
            System.out.print("Price Wifi : ");
            wifi = input.nextInt();

            // คำนวณค่าไฟ
            if (qty_electric >= 301) {
                amountElectric = (100 * 10) + (200 * 15) + ((qty_electric - 300) * 20);
            } else if (qty_electric >= 101) {
                amountElectric = (100 * 10) + ((qty_electric - 100) * 15);
            } else {
                amountElectric = amountElectric + (qty_electric * 10);
            }

            // คำนวณค่าน้ำ
            if (qty_water >= 7) {
                amountWater = (2 * 20) + (4 * 30) + ((qty_water - 6) * 40);
            } else if (qty_water >= 3) {
                amountWater = (2 * 20) + +((qty_water - 2) * 30);
            } else {
                amountWater = amountWater + (qty_water * 20);
            }

            total = room + amountElectric + amountWater + wifi;
            System.out.println("====================================");
            System.out.println("Room Number : " + roomNo);
            System.out.print("Quantity Electric : " + qty_electric);
            System.out.println("\t\tAmount Electric : " + amountElectric);
            System.out.print("Quantity Water : " + qty_water);
            System.out.println("\t\tAmount Water : " + amountWater);
            System.out.println("\t\tAmount Room : " + room);
            System.out.println("\t\tAmount Wifi : " + wifi);
            System.out.println("\t\tGrand Total : " + total);
            System.out.println("====================================");
            System.out.println("more room? (9 for more OR others for end ) enter digit only");
            moor_room = input.nextInt();
        } while (moor_room == 9);

    }
}
