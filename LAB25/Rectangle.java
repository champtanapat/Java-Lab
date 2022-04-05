package LAB25;
public class Rectangle{
    private double width,length;
    Rectangle()
    {
        this.width = 5.0;
        this.length = 5.0;
    }
    Rectangle(double width,double length)
    {
        this.width = width;
        this.length = length;
    }
    public double calArea(){
        return (width * length); 
    }
    public double calPerimeter(){
        return ((width + length) * 2);
    }
    public void showRectangle(){
        System.out.println("===========================================");
        System.out.println("Width: "+width);
        System.out.println("Length: "+length);
        System.out.println("Area Rectangle: "+calArea());
        System.out.println("Long Rectangle: "+calPerimeter());
        System.out.println("===========================================");
    }
    public void changeSize(){
        this.width = width * 2; 
        this.length = length * 2; 
    }
    public void changeSize(int amount){
        this.width = width + amount;
    }
    public void changeSize(int amount1,int amount2){
        this.width = width + amount1;
        this.length = length + amount2;
    }
}
