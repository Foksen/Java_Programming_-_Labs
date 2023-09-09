package Program4;

import java.util.Scanner;

public class Interface {
    static final Scanner scanner = new Scanner(System.in);
    private static Shop shop;

    public static void main(String[] args) {
        shop = new Shop();

        int operator = 0;
        do {
            System.out.println("\n1 - add computer");
            System.out.println("2 - remove computer");
            System.out.println("3 - find computer");
            System.out.println("4 - show all computers");
            System.out.println("0 - exit");
            System.out.print("\nEnter number: ");
            operator = scanner.nextInt();
            System.out.println();

            switch (operator) {
                case 1: {
                    String name;
                    System.out.print("Enter computer name: ");
                    name = scanner.next();

                    double price;
                    System.out.print("Enter computer price: ");
                    price = scanner.nextDouble();

                    if (shop.addComputer(name, price)) {
                        System.out.println("Computer was added!");
                    } else {
                        System.out.println("Computer with same name already exists!");
                    }
                    break;
                }

                case 2: {
                    String name;
                    System.out.print("Enter computer name: ");
                    name = scanner.next();

                    if (shop.removeComputer(name)) {
                        System.out.println("Computer was removed!");
                    } else {
                        System.out.println("Computer was not founded!");
                    }
                    break;
                }

                case 3: {
                    String name;
                    System.out.print("Enter computer name: ");
                    name = scanner.next();

                    Computer computer = shop.findComputer(name);
                    if (computer != null) {
                        System.out.println(computer.toString());
                    } else {
                        System.out.println("Computer was not founded!");
                    }
                    break;
                }

                case 4: {
                    System.out.println(shop.toString());
                    break;
                }
            }

        } while (operator != 0);
    }
}
