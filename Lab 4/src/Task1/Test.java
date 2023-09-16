package Task1;

public class Test {
    public static void main(String[] args) {
        System.out.println("Задание 1\n");

        SEASON myFavoriteSeason = SEASON.FALL;
        printLove(myFavoriteSeason);
        System.out.println("Это " + myFavoriteSeason.getDescription());
        System.out.println("Средняя температура: " + myFavoriteSeason.getMidTemp() + "\n");

        for (SEASON season : SEASON.values()) {
            System.out.println("Время года: " + season.translate());
            System.out.println("Описание: " + season.getDescription());
            System.out.println("Средняя температура: " + season.getMidTemp() + "\n");
        }
    }

    public static void printLove(SEASON season) {
        System.out.println("Я люблю " + season.translate());
    }
}
