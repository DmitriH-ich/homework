package homework44;

public class Circle extends Shape {

    protected double radius;

    protected Circle(double radius) {
        super("Окружность");
        this.radius = radius;
    }

    @Override
    public double getPerimetr() {
        return Math.PI * 2 * radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Окружность:\n" +
                "радиус " + radius + "m\n" +
                "Периметр: ";
    }
}
