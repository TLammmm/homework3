package oop6_1;
public class Square extends Rectangle {
    public Square() {
    }

    public Square(double side) {
        super(side, side);
    }    

    public Square(double side, String color, boolean filled) {
        super( color, filled,side, side);
    }

    public double getSide() {
        return super.getWidth();
    }

    public void setSide(double side) {
        super.setWidth(side);
        super.setLength(side);
    }

    public void setWidth(double side) {
        super.setWidth(side);
        super.setLength(side);
    }

    public void setLength(double side) {
        super.setLength(side);
        super.setWidth(side);
    }

    @Override
    public String toString() {
        return "Square["+ super.toString() + "]";
    }
}
