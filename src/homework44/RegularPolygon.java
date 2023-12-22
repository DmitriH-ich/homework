package homework44;

public class RegularPolygon extends Shape {
    protected double length;

    protected int amountSide;

    protected RegularPolygon(double length, int amountSide) {
        super("Многоугольник");
        this.length = length;
        this.amountSide = amountSide;
    }

    @Override
    public double getPerimetr() {
        return amountSide * length;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public int getAmountSide() {
        return amountSide;
    }

    public void setAmountSide(int amountSide) {
        this.amountSide = amountSide;
    }

    @Override
    public String toString() {
        return "Многоугольник\n" +
                "длина стороны: " + length + "m\n" +
                "количество сторон: " + amountSide + "\n" +
                "Периметр: ";
    }
}
