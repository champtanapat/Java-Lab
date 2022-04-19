import java.util.Scanner;

public class LAB29 {
    public static void printData(int[][][] employee, int len_type, int len_employee, int len_month) {
        System.out.println("========================DATA====================");
        for (int i = 0; i < len_type; i++) {
            // type print Product Type
            System.out.println("| Product Type " + (i + 1) + " |");
            System.out.print("\t");
            for (int j = 0; j < len_month; j++) {
                // print Month
                System.out.print("\t| Month " + (j + 1) + " |");
            }
            System.out.println();

            for (int j = 0; j < len_employee; j++) {
                System.out.print("Employee no: " + (j + 1) + "|");
                for (int z = 0; z < len_month; z++) {
                    System.out.print("\t\t " + employee[i][j][z]);
                }
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("========================END DATA===================");
    }

    public static void printSumMonthly(int[][] sum, int len_month, int len_type) {
        // print Month (column)
        System.out.print("\t\t\t\t");
        for (int j = 0; j < len_month; j++) {
            System.out.print("\t|Month " + (j + 1) + "|");
        }
        System.out.println();

        for (int i = 0; i < len_type; i++) {
            System.out.print("Summary Product Type " + (i + 1) + ":\t");
            for (int j = 0; j < len_month; j++) {
                System.out.print("\t\t" + sum[i][j]);
            }
            System.out.println();
        }
    }

    public static void printSumType(int[][] employee_sum, int len_type, int len_employee) {
        System.out.println("============= SUMMARY PRODUCT TYPE =================");
        System.out.print("\t");
        for (int i = 0; i < len_employee; i++) {
            System.out.print("Employee " + (i + 1) + "\t ");
        }
        System.out.println();

        for (int i = 0; i < len_type; i++) {
            System.out.print("Type " + (i + 1) + "\t\t ");
            for (int j = 0; j < len_employee; j++) {
                System.out.print(employee_sum[i][j] + "\t\t");
            }
            System.out.println();
        }
        System.out.println("=================================================");
    }

    public static void printMax(int[] max, int len_type) {
        System.out.println("============= Maximum Employee 6 Month =================");
        for (int i = 0; i < len_type; i++) {
            System.out.println("Maximum Employee Total 6 Month Product Type " + (i + 1));
            System.out.println("Employee :  " + (max[i] + 1));
        }
        System.out.println("=================================================");
    }

    public static void find_SumMonthly(int[][][] employee, int[][] sum, int len_type, int len_employee, int len_month) {
        for (int i = 0; i < len_type; i++) {
            for (int j = 0; j < len_month; j++) {
                for (int z = 0; z < len_employee; z++) {
                    sum[i][j] = sum[i][j] + employee[i][z][j];
                }
            }
        }
    }

    public static void find_SumMonthlyPrint(int[][][] employee, int[][] sum, int len_type, int len_employee,
            int len_month) {
        for (int i = 0; i < len_type; i++) {
            System.out.println("==============================");
            System.out.println("Type  " + (i + 1));
            for (int j = 0; j < len_month; j++) {
                System.out.println();
                System.out.print("Month " + (j + 1));
                for (int z = 0; z < len_employee; z++) {
                    sum[i][j] = sum[i][j] + employee[i][z][j];
                }
                System.out.print(" sum: " + sum[i][j]);
            }
            System.out.println();
            System.out.println("==============================");
        }
    }

    public static void find_SumType(int[][][] arr, int[][] sumType, int len_type, int len_employee, int len_month) {
        // employee 1,2,3,4
        // type 1 x,x,x,x
        // type 2 x,x,x,x
        // type 3 x,x,x,x
        // type 4 x,x,x,x
        // type 5 x,x,x,x
        for (int i = 0; i < len_type; i++) {
            for (int j = 0; j < len_employee; j++) {
                for (int z = 0; z < len_month; z++) {
                    sumType[i][j] = sumType[i][j] + arr[i][j][z];
                }
            }
        }
    }

    public static void find_Max(int[][] arr, int[] max, int len_type, int len_employee) {
        int index;
        for (int i = 0; i < len_type; i++) {
            index = 0;
            for (int j = 0; j < len_employee - 1; j++) {
                if (arr[i][index] < arr[i][j + 1]) {
                    index = j + 1;
                    max[i] = index;
                }
            }
        }
    }

    public static void input_Data(int[][][] data, int len_type, int len_month, int len_employee) {
        Scanner input = new Scanner(System.in);
        // type | emp | month
        for (int i = 0; i < len_type; i++) {
            System.out.println("==============================");
            System.out.println("Type  " + (i + 1));
            for (int j = 0; j < len_month; j++) {
                System.out.println("\t\tMonth " + (j + 1));
                for (int z = 0; z < len_employee; z++) {
                    System.out.print("Employee: " + (z + 1) + "\t ");
                    data[i][z][j] = input.nextInt();
                }
                System.out.println();
            }
        }
        System.out.println();
    }

    public static int[][][] dataTest(int[][][] data) {
        int[][][] temp_data = {
                { // type 1
                  // month
                  // 1 2 3 4 5 6
                        { 10, 10, 10, 10, 10, 10 }, // employee 1 = 60
                        { 40, 7, 8, 9, 10, 11 }, // employee 2 = 85
                        { 20, 12, 13, 14, 16, 16 }, // employee 3 = 90
                        { 30, 12, 13, 14, 15, 17 } // employee 4 = 100
                },
                { // type 2
                        { 1, 2, 3, 4, 5, 6 }, // employee 1
                        { 6, 7, 18, 19, 10, 11 }, // employee 2
                        { 11, 12, 99, 1, 16, 16 }, // employee 3
                        { 11, 12, 13, 14, 15, 17 } // employee 4
                },
                { // type 3
                        { 1, 2, 3, 4, 5, 6 }, // employee 1
                        { 6, 7, 8, 9, 10, 11 }, // employee 2
                        { 11, 55, 13, 14, 15, 16 }, // employee 3
                        { 11, 12, 13, 14, 15, 17 } // employee 4
                },
                { // type 4
                        { 1, 66, 3, 4, 5, 6 }, // employee 1
                        { 6, 7, 8, 9, 19, 11 }, // employee 2
                        { 11, 12, 13, 14, 15, 16 }, // employee 3
                        { 11, 12, 13, 14, 15, 17 } // employee 4
                },
                { // type 5
                        { 1, 2, 3, 4, 5, 6 }, // employee 1
                        { 6, 7, 8, 9, 10, 11 }, // employee 2
                        { 11, 12, 13, 14, 15, 16 }, // employee 3
                        { 11, 12, 13, 14, 15, 17 } // employee 4
                },
        };
        return temp_data;
    }

    public static void main(String[] args) {
        boolean testData = false;// true ดาต้าไว้เทส , false ดาต้าจริง
        int len_type = 5, len_employee = 4, len_month = 6;
        int[][] sumMonthly = new int[5][6];
        int[][] sumType = new int[5][4];
        int[] max = new int[5];
        int[][][] data = new int[len_type][len_employee][len_month];
        if (testData) {
            data = dataTest(data);
        } else {
            input_Data(data, len_type, len_month, len_employee);
        }
        // printData(data, len_type, len_employee, len_month);
        find_SumType(data, sumType, len_type, len_employee, len_month);
        printSumType(sumType, len_type, len_employee);
        find_Max(sumType, max, len_type, len_employee);
        printMax(max, len_type);
        find_SumMonthly(data, sumMonthly, len_type, len_employee, len_month);
        printSumMonthly(sumMonthly, len_month, len_type);
    }
}
