package Task2;

public class Main {
    public static void main(String[] args) {
        ChairFactory factory = new ChairFactory();
        Client client = new Client();
        client.setChair(factory.createMagicChair());
        client.setChair(factory.createFunctionalChair());
        client.setChair(factory.createVictorianChair());
    }
}
