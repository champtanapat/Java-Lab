public class LAB23 {
    public static void drawSquare (int width){
        System.out.println("=====================================");
        for (int i = 1; i <= width; i++) {
            System.out.print("M");
        }
        System.out.println();
        for (int i = 1; i <= width; i++) {
            System.out.print("M");
            for (int j = 1; j < width - 1; j++) {
                System.out.print(" ");
            }
            System.out.print("M");
            System.out.println();
        }
        for (int i = 1; i <= width; i++) {
            System.out.print("M");
        }
        System.out.println();
        System.out.println("=====================================");
    }
    public static void drawSquare (int width, char achar){
        System.out.println("=====================================");
        for (int i = 1; i <= width; i++) {
            System.out.print(""+achar);
        }
        System.out.println();
        for (int i = 1; i <= width; i++) {
            System.out.print(""+achar);
            for (int j = 1; j < width - 1; j++) {
                System.out.print(" ");
            }
            System.out.print(""+achar);
            System.out.println();
        }
        for (int i = 1; i <= width; i++) {
            System.out.print(""+achar);
        }
        System.out.println();
        System.out.println("=====================================");
    }
    public static void drawSquare (int width, char achar, int number){
        System.out.println("=====================================");
        for(int index = 0 ; index < number ; index++)
        {
            for (int i = 1; i <= width; i++) {
                System.out.print(""+achar);
            }
            System.out.println();
            for (int i = 1; i <= width; i++) {
                System.out.print(""+achar);
                for (int j = 1; j < width - 1; j++) {
                    System.out.print(" ");
                }
                System.out.print(""+achar);
                System.out.println();
            }
            for (int i = 1; i <= width; i++) {
                System.out.print(""+achar);
            }
            System.out.println();
        }
        System.out.println("=====================================");
    }
    public static double calAreaRectangle(double width ){
        return width * width ; 
    }
    public static double calAreaRectangle(double width, double length){
        return width * length ; 
    }
    public static void main(String[] args) {
        int var1 = 7;
        char letter = 'M' ;
        drawSquare(var1) ;
        drawSquare(var1,letter);
        drawSquare(var1,letter,2);
        double area1 = calAreaRectangle(5.0,7.0) ;
        double area2 = calAreaRectangle(5.0) ;
        System.out.println("Rectangle (base=5.0 , height=7.0) has area = " + area1) ;
        System.out.println("Rectangle (base=5.0 , height=5.0) has area = " + area2) ;
    }
}
