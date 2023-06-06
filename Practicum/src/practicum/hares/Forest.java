package practicum.hares;

import java.util.List;

public class Forest {
    private final List<MountainHare> hares;
    static String summer = "лето";
    static String winter = "зима";

    Forest(List<MountainHare> hares, String season) {
        this.hares = hares;
        setSeason(season);
    }

    // объявите недостающие переменные и добавьте конструктор

    static void setSeason(String newSeason) {
        if (newSeason.equals(summer)) {
            MountainHare.color = "серо-рыжий";
        }
        if (newSeason.equals(winter)) {
            MountainHare.color = "белый";
        }
    }// добавьте метод setSeason(String newSeason)
    // в этом методе реализуйте логику смены цвета шубок зайцев-беляков

    void printHares() {
        for (MountainHare hare : hares) {
            System.out.println(hare.toString());
        }
    }// добавьте метод printHares()

}