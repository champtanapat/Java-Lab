import java.util.Scanner;

public class LAB2 {
    public static void main(String[] args) {
        double width , length , high , areaBase = 0.0 , areaSide = 0.0 ,result; 
        Scanner input = new Scanner(System.in); 
        System.out.print("input Width (unit meter) : "); 
        width = input.nextDouble(); 
        System.out.print("input Length (unit meter) : "); 
        length = input.nextDouble(); 
        System.out.print("input High (unit meter)  : "); 
        high =  input.nextDouble(); 

        areaSide =  (2* (high * length ))  + ( 2 * (width * length) ) ; 
        areaBase = 2 * (width * high) ; 
        //พื้นที่ผิว = พื้นที่ผิวด้านข้าง 4 ด้าน + พื้นที่หน้าตัด|ฐาน 
        result = areaSide + areaBase ; 
        System.out.print("Result: "+ result+" m^2"); 

    }
}
