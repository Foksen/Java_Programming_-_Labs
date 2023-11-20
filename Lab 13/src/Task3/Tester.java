package Task3;

public class Tester {
    public static void main(String[] args) {
        Adress a1 = new Adress();
        a1.readFromString("Россия, Ниж. обл., Саров, Пионерская, 21, -, 21");

        Adress a2 = new Adress();
        a2.readFromString("Россия, Мос. обл., Химки, Советская, 15, 3, 4");

        Adress a3 = new Adress();
        a3.readFromString("Россия, Твер. обл., Тверь, Победы, 61, -, 17");

        Adress a4 = new Adress();
        a4.readFromString("Россия; Перм. обл.; Пермь; Гагарина; 43; -; 87", ';');

        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a3);
        System.out.println(a4);
    }
}
