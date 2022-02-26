import java.util.Scanner;

public class LAB4 {

    public static void bankNoteCoin(int [] banknote_coin,String[] banknoteStr, int value){
        int x , y , j = 0; 
        for (int i : banknote_coin) {
            x = value / i; 
            y = value % i ;
            value = y; 
            System.out.println(banknoteStr[j] +" :\t " + x ); 
            j++; 
        }
    }
    public static void main(String[] args) {

        int value; 
        int[] banknote_coin  =  { 1000,500,100,50,20,10,5,2,1}; 
        String[] banknoteStr  =  
        { "1000 thousand banknote","500 five_hundred banknote ","100 one_hundred banknote","50 fifty banknote"
        ,"20 twenty banknote","10 ten coin","5 five coin","2 two coin","1 one coin"}; 


        Scanner input = new Scanner(System.in); 
        System.out.print("Input Amount : "); 
        value = input.nextInt();
        bankNoteCoin(banknote_coin,banknoteStr,value);
        System.out.println("=================================================");    

    }
}
