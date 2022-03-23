import java.util.Scanner;

public class LAB5 {
    public static void main(String[] args) {
        int scoreAssign,scoreReport, scoreMid,scoreFinal; 
        int sumScore = 0 ; 
        Scanner input =new Scanner(System.in);
        
        System.out.print("Input Score Assignment : ");
        scoreAssign = input.nextInt();
        System.out.print("Input Score Report: ");
        scoreReport = input.nextInt();

        System.out.print("Input Score Midterm: ");
        scoreMid = input.nextInt();

        System.out.print("Input Score Final: ");
        scoreFinal = input.nextInt();
        sumScore = scoreAssign + scoreReport + scoreMid + scoreFinal; 
        if(sumScore<=100)
        {
           if(sumScore>=90){
            System.out.print("Grade  A");
           }
           else if(sumScore>=80){
            System.out.print("Grade  B");
           }
           else if(sumScore>=60){
            System.out.print("Grade  C");
           }
           else if(sumScore>=50){
            System.out.print("Grade  D");
           }
           else{
            System.out.print("Grade  F");
           }
        }
        else
        {
            System.out.print("INVALID SCORE");
        }
        
    }
}
