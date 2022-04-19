import java.util.Scanner;

public class LAB28 {
    public static boolean hwScore(int assignScore) {
        if (assignScore < 0 || assignScore > 20) {
            System.out.println("==============================================");
            System.out.println("INVALID assignScore");
            System.out.println("==============================================");
            return true;
        }
        return false;
    }

    public static boolean reportScore(int reportScore) {
        if (reportScore < 0 || reportScore > 10) {
            System.out.println("==============================================");
            System.out.println("INVALID reportScore");
            System.out.println("==============================================");
            return true;
        }
        return false;
    }

    public static boolean quiz(int midScore) {
        if (midScore < 0 || midScore > 30) {
            System.out.println("==============================================");
            System.out.println("INVALID midScore");
            System.out.println("==============================================");
            return true;
        }
        return false;
    }

    public static boolean finalScore(int finalScore) {
        if (finalScore < 0 || finalScore > 40) {
            System.out.println("==============================================");
            System.out.println("INVALID finalScore");
            System.out.println("==============================================");
            return true;
        }
        return false;
    }

    public static void findGrade(int sumScore, int grade[]) {
        if (sumScore >= 90) {
            System.out.println("A");
            grade[0]++;
        } else if (sumScore >= 80) {
            System.out.println("B");
            grade[1]++;
        } else if (sumScore >= 70) {
            System.out.println("C");
            grade[2]++;
        } else if (sumScore >= 50) {
            System.out.println("D");
            grade[3]++;
        } else {
            System.out.println("F");
            grade[4]++;
        }
    }

    public static void printStu(int[][] arr_stu, String[] str_score, int stulen, int findGrade[]) {
        System.out.print("\t");
        for (int i = 0; i < str_score.length; i++) {
            System.out.print("\t" + str_score[i] + "|");
        }
        System.out.println();
        for (int i = 0; i < stulen; i++) {
            System.out.print("Student no:" + (i + 1) + "\t");
            for (int j = 0; j < str_score.length - 1; j++) {
                System.out.print("" + arr_stu[i][j] + "\t");
            }
            findGrade(arr_stu[i][4], findGrade);
            System.out.println("");
        }
        System.out.println();
    }

    public static void printAvg(float[] avg) {
        System.out.print("Average\t");
        for (int i = 0; i < avg.length; i++) {
            System.out.print("\t" + avg[i]);
        }
        System.out.println();
    }

    public static void printSum(float[] sum) {
        System.out.print("Sum\t");
        for (int i = 0; i < sum.length; i++) {
            System.out.print("\t" + sum[i]);
        }
        System.out.println();
    }

    public static void printCoutGrade(int grade[]) {
        System.out.println("Number of A student = " + grade[0]);
        System.out.println("Number of B student = " + grade[1]);
        System.out.println("Number of C student = " + grade[2]);
        System.out.println("Number of D student = " + grade[3]);
        System.out.println("Number of F student = " + grade[4]);
    }

    public static void main(String[] args) {
        int hw, reportScore, midScore, finalScore, totalScore;
        boolean invalid;
        int stu[][] = new int[20][5];
        String str_score[] = { "HW", "RE", "QU", "FI", "TOT", "GRADE" };
        int stulen = 20, scorelen = 5;
        float sum[] = { 0.0f, 0.0f, 0.0f, 0.0f, 0.0f };
        float avg[] = { 0.0f, 0.0f, 0.0f, 0.0f, 0.0f };
        int grade[] = { 0, 0, 0, 0, 0 };
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < stulen; i++) {
            hw = 0;
            reportScore = 0;
            midScore = 0;
            finalScore = 0;
            totalScore = 0;
            System.out.println("Student no: " + (i + 1));
            for (int j = 0; j < scorelen; j++) {
                invalid = false;
                switch (j) {
                    case 0:// คะแนนการบ้าน
                        do {
                            System.out.print("Input Score Assignment : ");
                            hw = input.nextInt();
                            invalid = hwScore(hw);
                            j = 0;
                        } while (invalid);
                        stu[i][j] = hw;
                        sum[0] = sum[0] + hw;
                        break;

                    case 1:// คะแนนรายงาน
                        do {
                            System.out.print("Input Score Report: ");
                            reportScore = input.nextInt();
                            invalid = reportScore(reportScore);
                            j = 1;
                        } while (invalid);
                        stu[i][j] = reportScore;
                        sum[1] = sum[1] + reportScore;
                        break;

                    case 2:// คะแนนสอบย่อย
                        do {
                            System.out.print("Input Score Midterm: ");
                            midScore = input.nextInt();
                            invalid = quiz(midScore);
                            j = 2;
                        } while (invalid);
                        stu[i][j] = midScore;
                        sum[2] = sum[2] + midScore;
                        break;

                    case 3:// คะแนนสอบไล่
                        do {
                            System.out.print("Input Score Final: ");
                            finalScore = input.nextInt();
                            invalid = finalScore(finalScore);
                            j = 3;
                        } while (invalid);
                        stu[i][j] = finalScore;
                        sum[3] = sum[3] + finalScore;
                        break;

                    case 4:// คะแนนรวม
                        totalScore = hw + reportScore + midScore + finalScore;
                        stu[i][j] = totalScore;
                        sum[4] = sum[4] + totalScore;
                        break;

                }
            }
        }
        avg[0] = sum[0] / stulen;
        avg[1] = sum[1] / stulen;
        avg[2] = sum[2] / stulen;
        avg[3] = sum[3] / stulen;
        avg[4] = sum[4] / stulen;
        System.out.print("\033[H\033[2J");
        printStu(stu, str_score, stulen, grade);
        printSum(sum);
        printAvg(avg);
        printCoutGrade(grade);

    }
}