package Task4;

public class Shirt {
    private String code;
    private String name;
    private String color;
    private String size;

    public Shirt() {
        code = "";
        name = "";
        color = "";
        size = "";
    }

    public void readFromString(String str) {
        String[] params = str.split(",");
        code = params[0];
        name = params[1];
        color = params[2];
        size = params[3];
    }

    @Override
    public String toString() {
        return String.format("Код:  %-8s Название:  %-22s Цвет:  %-12s Размер: %s",
                code, name, color, size);
    }
}
