import java.util.Scanner;

public class LAB13 {
    public static void main(String[] args) {
        int scoreAssign, scoreReport, scoreMid, scoreFinal;
        int sumScore, select;
        Scanner input = new Scanner(System.in);
        boolean invalid = true;

        do {
            sumScore = 0;
            select = 1;
            do {
                invalid = true;
                // คะแนนการบ้าน
                System.out.print("Input Score Assignment : ");
                scoreAssign = input.nextInt();
                if (scoreAssign < 0 || scoreAssign > 20) {
                    System.out.println("==============================================");
                    System.out.println("INVALID SCORE");
                    System.out.println("==============================================");
                    invalid = false;
                }
            } while (!invalid);
            do {
                invalid = true;
                // คะแนนรายงาน
                System.out.print("Input Score Report: ");
                scoreReport = input.nextInt();
                if (scoreReport < 0 || scoreReport > 10) {
                    System.out.println("==============================================");
                    System.out.println("INVALID SCORE");
                    System.out.println("==============================================");
                    invalid = false;
                }
            } while (!invalid);
            do {
                invalid = true;
                // คะแนนสอบย่อย
                System.out.print("Input Score Midterm: ");
                scoreMid = input.nextInt();
                if (scoreMid < 0 || scoreMid > 30) {
                    System.out.println("==============================================");
                    System.out.println("INVALID SCORE");
                    System.out.println("==============================================");
                    invalid = false;
                }
            } while (!invalid);
            do {
                invalid = true;
                // คะแนนสอบไล่
                System.out.print("Input Score Final: ");
                scoreFinal = input.nextInt();
                if (scoreFinal < 0 || scoreFinal > 40) {
                    System.out.println("==============================================");
                    System.out.println("INVALID SCORE");
                    System.out.println("==============================================");
                    invalid = false;
                }
            } while (!invalid);
            System.out.println("==============================================");
            sumScore = scoreAssign + scoreReport + scoreMid + scoreFinal;
            System.out.println("Total Score: " + sumScore);
            if (sumScore >= 90) {
                System.out.println("Grade  A");
            } else if (sumScore >= 80) {
                System.out.println("Grade  B");
            } else if (sumScore >= 60) {
                System.out.println("Grade  C");
            } else if (sumScore >= 50) {
                System.out.println("Grade  D");
            } else {
                System.out.println("Grade  F");
            }
            System.out.println("more student ? ( key 1 for more / other for end )");
            System.out.println("==============================================");
            select = input.nextInt();
        } while (select == 1);
    }
}
