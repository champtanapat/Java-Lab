import java.util.Scanner;

public class LAB9 {
    public static void main(String[] args) {
        int total_purchase = 0 , delivery=0; 
        double total_pay = 0.0 ; 
        Scanner input = new Scanner(System.in);

        System.out.print("Input Purchase:"); 
        total_purchase = input.nextInt();
        if(total_purchase>=10000)
        {
            total_pay = total_purchase * 0.80 ; 
        }else if(total_purchase>=5000){
            total_pay = total_purchase * 0.85 ; 
        }else if(total_purchase>=1000){
            total_pay = total_purchase * 0.90 ; 
        }else{
            total_pay = total_purchase * 0.95 ;
        }

        if(total_pay<1000)
        {
            delivery = 30 ;
            total_pay = total_pay + delivery; 
        }
        System.out.println("==========================================="); 
        System.out.println("Total Purchase: "+ total_purchase); 
        System.out.println("Delivery: "+ delivery); 
        System.out.println("Total Pay: "+total_pay); 
        System.out.println("==========================================="); 
    }
}
