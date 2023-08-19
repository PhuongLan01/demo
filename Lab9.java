package lab9;

public class Lab9 {

    public static void main(String[] args) {
        Shape s1 = new Circle(5.5, "red", false);
        System.out.println("Shape s1");
        System.out.println("S: " + s1.getArea());          // which version?
        System.out.println("P:" + s1.getPerimeter());     // which version?
        System.out.println("Color:" + s1.getColor());
        System.out.println("Filled:"+s1.isFilled());
        System.out.println("Radius:"+ ((Circle) s1).getRadius());

        System.out.println("\n------------------------------------------\n");

        Circle c1 = (Circle)s1;
        System.out.println("Circle c1");
        System.out.println("S: " +c1.getArea());
        System.out.println("P:" +c1.getPerimeter());
        System.out.println("Color:" +c1.getColor());
        System.out.println("Filled:"+c1.isFilled());
        System.out.println("Radius:" + c1.getRadius());

        System.out.println("\n------------------------------------------\n");
        Shape s3 = new Rectangle(4.5, 7.5,"RED", false);
        System.out.println("Shape s3");
        System.out.println("S: " +s3.getArea());
        System.out.println("P:" +s3.getPerimeter());
        System.out.println("Color:"+ s3.getColor());
        System.out.println("Length:" + ((Rectangle) s3).getLength());

        System.out.println("\n------------------------------------------\n");
        Rectangle r1 = (Rectangle)s3;
        System.out.println("Rectangle r1");
        System.out.println("S: " +r1.getArea());
        System.out.println("Color:"+ r1.getColor());
        System.out.println("Length:" + r1.getLength());

        System.out.println("\n------------------------------------------\n");
        Shape s4 = new Square(6.6);
        System.out.println("Shape s4");
        System.out.println("S: " +s4.getArea());
        System.out.println("Color:"+ s4.getColor());
        System.out.println("Width:" +((Square) s4).getWidth());

        System.out.println("\n------------------------------------------\n");
        Rectangle r2 = (Rectangle)s4;
        System.out.println("Rectangle r2");
        System.out.println("S: " +r2.getArea());
        System.out.println("Color:"+ r2.getColor());
        System.out.println("Width:" + r2.getWidth());
        System.out.println("Length:" +r2.getLength());

        System.out.println("\n------------------------------------------\n");
        Square sq1 = (Square)r2;
        System.out.println("Square sq1");
        System.out.println("S: " +sq1.getArea());
        System.out.println("Color:"+ sq1.getColor());
        System.out.println("Width:" + sq1.getWidth());
        System.out.println("Length:" + sq1.getLength());
    }
}
