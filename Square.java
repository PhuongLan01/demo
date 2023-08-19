package lab9;

public class Square extends Rectangle{

    private double side;
    public Square(){
        
    }
    public Square(double side){
        super(side, side);
    }
    public Square(double side, String color, boolean filled){
        super(side, side, color, filled);
    }
    public double getSide(){
        return side;
    }
    public void setSide(double side){
        this.side = side;
    }
    @Override
    public void setWidth(double side){
        super.setWidth(side);
        super.setLength(side);
    }
    public void setLength(double side){
        super.setWidth(side);
        super.setLength(side);
    }
    public String toString(){
        return "Square["+super.toString()+"]";
    }
}
