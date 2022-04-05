package LAB25;
public class RectTest {
    public static void main(String[] args) {
        Rectangle rec1 = new Rectangle();
        Rectangle rec2 = new Rectangle();
        Rectangle rec3 = new Rectangle();
        rec1.calArea();
        rec1.calPerimeter();
        rec1.showRectangle();
        rec1.changeSize();
        rec1.changeSize(5);
        rec1.changeSize(5,5);
        rec1.showRectangle();
        
        rec2.calArea();
        rec2.calPerimeter();
        rec2.showRectangle();
        rec2.changeSize();
        rec2.changeSize(10);
        rec2.changeSize(10,10);
        rec2.showRectangle();
        
        rec3.calArea();
        rec3.calPerimeter();
        rec3.showRectangle();
        rec3.changeSize();
        rec3.changeSize(10);
        rec3.changeSize(10,10);
        rec3.showRectangle();

    }
}




