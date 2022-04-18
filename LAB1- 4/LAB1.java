import java.util.Scanner;

public class LAB1 {
    public static void main(String[] args) {
        int inputCelcius; 
        double celcius, convertC_F; 
        Scanner input =new Scanner(System.in);
        System.out.print("Input Celcius: ");
        celcius = input.nextDouble();
        convertC_F = ( celcius *9.0/5.0 ) + 32.0 ; 
        System.out.println("result convert Celcius to Fahrenheit: " + convertC_F);
    } 
}
