import java.util.Scanner;

public class LAB30 {
    public static int findMax(int[] anArray) {
        int n = anArray.length;
        int index = 0;
        for (int i = 1; i < n; i++)
            if (anArray[index] < anArray[i]) {
                index = i;
            }
        return index;
    }

    public static int findMin(int[] anArray) {
        int n = anArray.length;
        int index = 0;
        for (int i = 1; i < n; i++)
            if (anArray[index] > anArray[i]) {
                index = i;
            }
        return index;
    }

    public static double findAverage(int[] anArray) {
        double sum = 0.0;
        int n = anArray.length;
        for (int i = 0; i < anArray.length; i++) {
            sum = sum + anArray[i];
        }
        return sum / n;
    }

    public static void printArray(int[] anArray) {
        System.out.println("==============Array=========================");
        for (int i = 0; i < anArray.length; i++) {
            System.out.print("" + anArray[i] + " ");
        }
        System.out.println();
        System.out.println("============================================");
    }

    public static int[] inputArray() {
        int[] anArray = new int[10];
        boolean testData = true; // true สำหรับเทส,false สำหรับ data จริง
        if (testData) {
            int[] anTemp = { 64, 34, 25, 100, 22, 11, 90, 199, 5, 10 };
            return anTemp;
        } else {
            for (int i = 0; i < anArray.length; i++) {
                System.out.print("data: ");
            }
            return anArray;
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] data = new int[10];
        data = inputArray();
        printArray(data);
        System.out.println("Number Max ::\t" + data[findMax(data)] + "\t,Index ::\t" + findMax(data));
        System.out.println("Number Min ::\t" + data[findMin(data)] + "\t,Index ::\t" + findMin(data));
        System.out.println("Average index :: " + findAverage(data));
        System.out.println("============================================");
    }
}
