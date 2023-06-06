package practicum.AD_HOC;

public class ColorPoint extends Point {
    private final String color;

    public ColorPoint(int x, int y, String color) {
        super(x, y);
        this.color = color;
        // Какой из методов makeName() здесь будет вызван - родительского класса или класса-наследника?
        setName(makeName());
    }

    @Override
    protected String makeName() {
        // Какое значение цвета будет у объекта в момент вызова этого метода?
        return "координаты " + super.makeName() + ", цвет " + color;
    }

}
