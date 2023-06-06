import java.util.Comparator;

public class SortByModel implements Comparator<Car> {
    @Override
    public int compare(Car car1, Car car2) {
        return String.CASE_INSENSITIVE_ORDER.compare(car1.getModel(), car2.getModel());
    }
}
