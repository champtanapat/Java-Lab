import java.util.Scanner;

public class LAB20 {
    public static boolean AssignScore(int assignScore)
    {
        if (assignScore < 0 || assignScore > 20) {
            System.out.println("==============================================");
            System.out.println("INVALID assignScore");
            System.out.println("==============================================");
            return true;
        }
        return false;
    }
    public static boolean reportScore(int reportScore)
    {
        if (reportScore < 0 || reportScore > 10) {
            System.out.println("==============================================");
            System.out.println("INVALID reportScore");
            System.out.println("==============================================");
            return true;
        }
        return false;
    }
    public static boolean quiz(int midScore)
    {
        if (midScore < 0 || midScore > 30) {
            System.out.println("==============================================");
            System.out.println("INVALID midScore");
            System.out.println("==============================================");
            return true;
        }
        return false;
    }
    public static boolean finalScore(int finalScore)
    {
        if (finalScore < 0 || finalScore > 40) {
            System.out.println("==============================================");
            System.out.println("INVALID finalScore");
            System.out.println("==============================================");
            return true;
        }
        return false;
    }
    public static void compareGrade(int sumScore)
    {
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
    }
    public static void main(String[] args) {
        int assignScore, reportScore, midScore, finalScore;
        int sumScore, select;
        Scanner input = new Scanner(System.in);
        boolean invalid = false;
        do {
            sumScore = 0;
            select = 1;
            do {
                // คะแนนการบ้าน
                System.out.print("Input Score Assignment : ");
                assignScore = input.nextInt();
                invalid = AssignScore(assignScore);
            } while (invalid);

            do {
                // คะแนนรายงาน
                System.out.print("Input Score Report: ");
                reportScore = input.nextInt();
                invalid = reportScore(reportScore);
            } while (invalid);

            do {
                // คะแนนสอบย่อย
                System.out.print("Input Score Midterm: ");
                midScore = input.nextInt();
                invalid = quiz(midScore);
            } while (invalid);

            do {
                // คะแนนสอบไล่
                System.out.print("Input Score Final: ");
                finalScore = input.nextInt();
                invalid = finalScore(finalScore);
            } while (invalid);

            System.out.println("==============================================");
            sumScore = assignScore + reportScore + midScore + finalScore;
            System.out.println("Total Score: " + sumScore);
            compareGrade(sumScore);
            System.out.println("more student ? ( key 1 for more / other for end )");
            System.out.println("==============================================");
            select = input.nextInt();
        } while (select == 1);
    }
}
