import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BoboPizza {
    private final Scanner scanner = new Scanner(System.in);
    public static List<BikeTimeCalculator> bikes;
    public static List<CarTimeCalculator> cars;
    public static List<HumanTimeCalculator> humans;


    public static void main(String[] args) {
        bikes = new ArrayList<>() {{
            add(new BikeTimeCalculator("Иван"));
            add(new BikeTimeCalculator("Василий"));
            add(new BikeTimeCalculator("Инга"));
        }};
        cars = new ArrayList<>() {{
            add(new CarTimeCalculator("Ольга"));
            add(new CarTimeCalculator("Пётр"));
        }};
        humans = new ArrayList<>() {{
            add(new HumanTimeCalculator("Анна"));
            add(new HumanTimeCalculator("Дмитрий"));
            add(new HumanTimeCalculator("Алексей"));
        }};
        new BoboPizza().loop();
    }

    private void loop() {
        CourierSelector selector = new CourierSelector(bikes, cars, humans);

        DeliveryInfo delivery;

        do {
            System.out.println("Введите расстояние в метрах => ");
            int distance = scanner.nextInt();
            delivery = selector.selectDelivery(distance);
            if (delivery != null) {
                System.out.println(
                        "Пицца будет доставлена через " + delivery.getTime() + " минут(у,ы)."
                );
                System.out.println("Ваш курьер - " + delivery.getName() + ".");
            } else {
                System.out.println("Доступных курьеров не найдено");
            }
        } while (delivery != null);
    }
}
