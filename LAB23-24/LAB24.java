public class LAB24 {
    public static void drawTriangle(int base) {
        System.out.println("=================================");
        for (int row = 1; row <= base; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print("$");
            }
            System.out.println("");
        }
        System.out.println("=================================");
    }

    public static void drawTriangle(int base, char achar) {
        System.out.println("=================================");
        for (int row = 1; row <= base; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print("" + achar);
            }
            System.out.println("");
        }
        System.out.println("=================================");
    }

    public static void drawTriangle(int base, char achar, int number) {
        System.out.println("=================================");
        for (int index = 1; index <= number; index++) {
            for (int row = 1; row <= base; row++) {
                for (int col = 1; col <= row; col++) {
                    System.out.print("" + achar);
                }
                System.out.println("");
            }
        }
        System.out.println("=================================");
    }

    public static double computeArea(double base, double height) {
        return ((0.5)*(base*height));
    }

    public static double computeArea(double side1, double side2, double side3) {
        return (side1 + side2 + side3)/2;
    }

    public static void main(String[] args) {
        int var1 = 5;
        char letter = 'M';
        drawTriangle(var1);
        drawTriangle(var1, letter);
        drawTriangle(var1, letter, 2);
        double area1 = computeArea(5.0 , 8.0) ;
        System.out.println("Triangle (base=5.0 , height=8.0) has area = " + area1) ;
        area1 = computeArea(5.0 , 8.0 , 7.0) ;
        System.out.println("Triangle (side1=5.0 , side2=8.0 , side3=7.0) has area ="+ area1) ;
    }
}
