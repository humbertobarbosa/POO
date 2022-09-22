package lista01.ex02;

public class Rectangle {
    private double width, height;

    public Rectangle() {
        this.width = 0;
        this.height = 0;
    }
    
    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double area() {
        return getWidth() * getHeight();
    }

    public double perimeter() {
        return (getWidth() + getHeight()) * 2;
    }

    public double diagonal() {
        return Math.sqrt(Math.pow(getWidth(), 2) + Math.pow(getHeight(), 2));
    }
}
