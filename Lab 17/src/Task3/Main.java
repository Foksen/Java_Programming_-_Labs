package Task3;

public class Main {
    public static void main(String[] args) {
        Model model = new Model();
        model.setUsername("Igor");
        model.setPassword("qwerty");
        View view = new View("Program");

        Controller controller = new Controller(model, view);
    }
}
