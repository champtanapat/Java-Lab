import java.util.Scanner;

public class LAB12 {
    public static void main(String[] args) {
        int scoreAssign, scoreReport, scoreMid, scoreFinal;
        int sumScore = 0;
        String  idStu ;
        Scanner input ;
        int select = 9;

        do {
            sumScore = 0;
            do {
                input = new Scanner(System.in);
                // รหัส
                System.out.print("Input ID Student : ");
                idStu = input.nextLine();
                // คะแนนการบ้าน
                System.out.print("Input Score Assignment : ");
                scoreAssign = input.nextInt();
                // คะแนนรายงาน
                System.out.print("Input Score Report: ");
                scoreReport = input.nextInt();
                // คะแนนสอบย่อย
                System.out.print("Input Score Midterm: ");
                scoreMid = input.nextInt();
                // คะแนนสอบไล่
                System.out.print("Input Score Final: ");
                scoreFinal = input.nextInt();
                sumScore = scoreAssign + scoreReport + scoreMid + scoreFinal;
                if (sumScore > 100) {
                    System.out.println("==============================================");
                    System.out.println("INVALID SCORE");
                    System.out.println("==============================================");
                }
            } while (sumScore > 100);
            System.out.println("==============================================");
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
            System.out.println("==============================================");
            System.out.println("next student 9 or exit 0 (input digit only) enter: ");
            select = input.nextInt();

        } while (select == 9);

    }
}
