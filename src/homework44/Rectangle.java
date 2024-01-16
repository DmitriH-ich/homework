package homework44;

public class Rectangle extends Shape {
    protected double length;
    protected double heigth;

    protected Rectangle(double length, double heigth) {
        super("Прямоугольник");
        this.length = length;
        this.heigth = heigth;
    }

    @Override
    public double getPerimetr() {
        return 2 * (length + heigth);
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getHeigth() {
        return heigth;
    }

    public void setHeigth(double heigth) {
        this.heigth = heigth;
    }

    @Override
    public String toString() {
        return "Прямоугольник:\n" +
                "длина " + length + "m\n" +
                "высота " + heigth + "m\n" +
                "Периметр: ";
    }
}
