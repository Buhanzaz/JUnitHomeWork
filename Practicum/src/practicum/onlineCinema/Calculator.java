package practicum.onlineCinema;

import java.util.List;

public class Calculator {

    private Calculator() {}

    public static double calculate(List<MediaItem> mediaItems) {
        // Напишите реализацию метода, который будет возвращать общее количество дней,
        // потраченных на просмотр фильмов и сериалов
        int minutes = 0;
        int dayInMinutes = 24 * 60;

        for (MediaItem mediaItem : mediaItems) {
            if (mediaItem instanceof Movie) {
                minutes += mediaItem.getRuntime();
            }
            if (mediaItem instanceof Series) {
                minutes += mediaItem.getRuntime() * ((Series) mediaItem).getSeriesCount();
            }
        }
        return (double) minutes / dayInMinutes;
    }
}