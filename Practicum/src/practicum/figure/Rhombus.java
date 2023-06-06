package practicum.figure;

public class Rhombus extends Parallelogram{
    // Длина стороны ромба

    public Rhombus(double a, double b) {
        super(a, b);

    }

    @Override
    public double getArea() {
        return getA() * getB();
    }
}