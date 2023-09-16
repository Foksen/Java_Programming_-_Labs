package Task2;

public class Atelier {
    private static WomenClothing[] womenClothes = new WomenClothing[]{
            new TShirt(SIZE.XS, 4990, "Белый"),
            new Skirt(SIZE.S, 2990, "Серый"),
            new Pants(SIZE.M, 790, "Жёлтый")
    };
    private static MenClothing[] menClothes = new MenClothing[]{
            new TShirt(SIZE.L, 1990, "Зелёный"),
            new Pants(SIZE.XXS, 1290, "Коричневый"),
            new Tie(SIZE.XS, 1390, "Синий")
    };

    public static void dressWomen() {
        for (WomenClothing clothe : womenClothes) {
            clothe.dressWomen();
        }
    }

    public static void dressMen() {
        for (MenClothing clothe : menClothes) {
            clothe.dressMen();
        }
    }
}
