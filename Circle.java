package lab9;

public class Circle extends Shape{
    private double radius;
    
    public Circle(){}
    public Circle(double radius){
        this.radius = radius;
    }
    public Circle(double radius, String color, boolean filled){
        super(color, filled);
        this.radius = radius;
    }
    public double getRadius(){
        return radius;
    }
    public void setRadius(double radius){
        this.radius = radius;
    }
    
    @Override
    public double getArea() {
        return this.radius*this.radius*Math.PI;
    }
    public double getPerimeter() {
        return this.radius*2*Math.PI;
    }
    public String toString() {
        return this.radius + " - " + this.color + " - " + this.filled; 
    }
}
