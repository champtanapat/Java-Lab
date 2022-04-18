import java.util.Scanner;

public class LAB10 {
    public static void main(String[] args) {
        double salary = 0.0,ex_income =0.0,insurance=0.0,net_income =0.0,tax=0.0, sum_tax = 0.0; 
        int children = 0 ; 
        Scanner input = new Scanner(System.in);
        System.out.print("Input Salary:"); 
        salary = input.nextDouble();
        System.out.print("Input Income:"); 
        ex_income = input.nextDouble();
        System.out.print("Input Insurance:"); 
        insurance = input.nextDouble();
        System.out.print("Input Children:"); 
        children = input.nextInt();
        if(insurance>=100000)
        {
            insurance = 99999;
        }
        //ค่าลดหย่อน 60,000 
        net_income = (salary*12) + ex_income - 60000 - insurance - (children*17000);
        if(net_income>10000000)
        {
            sum_tax = sum_tax + ((200000/100)*5); 
            sum_tax = sum_tax + ((200000/100)*10);  
            sum_tax = sum_tax + ((250000/100)*15);  
            sum_tax = sum_tax + ((net_income/100)*20); 
        }else if(net_income>500001.00){
            sum_tax = sum_tax + ((200000/100)*5); 
            sum_tax = sum_tax + ((200000/100)*10);  
            sum_tax = sum_tax + ((250000/100)*15);  
        }else if(net_income>300001.00){
            sum_tax = sum_tax + ((200000/100)*5); 
            sum_tax = sum_tax + ((200000/100)*10);  
        }else if(net_income>100001.00){
            sum_tax = sum_tax + ((200000/100)*5);  
        }
        tax = sum_tax; 
        System.out.println("==========================================="); 
        System.out.println("Net Income: "+net_income); 
        System.out.println("Tax: "+tax); 
        System.out.println("==========================================="); 
    }
}
