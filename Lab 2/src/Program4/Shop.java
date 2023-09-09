package Program4;

import java.util.Stack;

public class Shop {
    private Stack<Computer> computers;

    public Shop() {
        computers = new Stack<>();
    }

    public Boolean addComputer(String name, double price) {
        for (Computer computer : computers) {
            if (computer.getName().equals(name)) {
                return false;
            }
        }
        computers.add(new Computer(name, price));
        return true;
    }

    public Boolean removeComputer(String name) {
        for (int i = 0; i < computers.size(); ++i) {
            if (computers.get(i).getName().equals(name)) {
                computers.remove(i);
                return true;
            }
        }
        return false;
    }

    public Computer findComputer(String name) {
        for (Computer computer : computers) {
            if (computer.getName().equals(name)) {
                return computer;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < computers.size(); ++i) {
            builder.append("Computer ").append(i + 1).append(": ").append(computers.get(i).toString()).append("\n");
        }
        return builder.toString();
    }
}
