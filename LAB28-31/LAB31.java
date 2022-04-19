import java.util.Scanner;

public class LAB31 {
    public static int[] random() {
        int[] arrayRandom = new int[10];
        for (int i = 0; i < arrayRandom.length; i++) {
            arrayRandom[i] = (int) (Math.random() * 100);
        }
        return arrayRandom;
    }

    public static int inputNubmer() {
        int data;
        Scanner input = new Scanner(System.in);
        System.out.print("Input Number: ");
        data = input.nextInt();
        return data;
    }

    public static int binarySearch(int arr[], int l, int r, int x) {
        if (r >= l) {
            int mid = l + (r - l) / 2;
            if (arr[mid] == x) {
                return mid;
            }
            if (arr[mid] > x) {
                return binarySearch(arr, l, mid - 1, x);
            }
            return binarySearch(arr, mid + 1, r, x);
        }
        return -1;
    }

    public static void bubbleSort(int arr[], int n) {
        int i, j, temp;
        boolean swapped;
        for (i = 0; i < n - 1; i++) {
            swapped = false;
            for (j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // swap arr[j] and arr[j+1]
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            // IF no two elements were
            // swapped by inner loop, then break
            if (swapped == false)
                break;
        }
    }

    public static void printArray(int[] anArray) {
        System.out.println("==============Array=========================");
        for (int i = 0; i < anArray.length; i++) {
            System.out.print("" + anArray[i] + " ");
        }
        System.out.println();
        System.out.println("============================================");
    }

    public static int playAgin() {
        Scanner input = new Scanner(System.in);
        System.out.print("play again? (press 1 for yes , others for no ): ");
        int choice = input.nextInt();
        if (choice == 1) {
            return 1;
        } else {
            return -1;
        }
    }

    public static void playGame() {
        int[] arrayRandom = new int[10];
        int data;
        int result = -1, n = arrayRandom.length;
        arrayRandom = random();
        bubbleSort(arrayRandom, arrayRandom.length);
        printArray(arrayRandom);
        for (int i = 1; i <= 5; i++) {
            data = inputNubmer();
            result = binarySearch(arrayRandom, 0, n - 1, data);
            if (result == -1) {
                System.out.println("missing " + i);
                if (i == 5) {
                    System.out.println("==========================");
                    System.out.println("\tGAME OVER\t");
                    System.out.println("==========================");
                }
            } else {
                System.out.println("**************************");
                System.out.println("\tCONGRATULATION\t");
                System.out.println("**************************");
                break;
            }
        }
        if (playAgin() == 1) {
            playGame();
        }
    }

    public static void main(String[] args) {
        playGame();
    }
}
