package day9.Task2;

public class Rectangle extends Figure {
    private int width;
    private int length;


    public Rectangle(int width, int length, String color) {
        super(color);
        this.width = width;
        this.length = length;
    }

    @Override
    public double area() {
        return width * length;
    }

    @Override
    public double perimeter() {
        return (width + width) + (length + length);
    }
}
