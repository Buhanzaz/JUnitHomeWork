package practicum.figure;

public class Rectangle extends Parallelogram {
    // Длины сторон прямоугольника

    public Rectangle(double a, double b) {
        super(a, b);
    }


    @Override
    public double getArea() {
        return getA() * getB();
    }
}