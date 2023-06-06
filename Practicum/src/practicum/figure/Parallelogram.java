package practicum.figure;

public abstract class Parallelogram implements Figure{
    private final double a;
    private final double b;

    protected Parallelogram(double a, double b) {
        this.a = a;
        this.b = b;
    }


    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }
}
