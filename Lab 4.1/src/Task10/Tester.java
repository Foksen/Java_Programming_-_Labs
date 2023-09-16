package Task10;

public class Tester {
    public static void main(String[] args) {
        System.out.println("Task 10:\n");

        Car car = new Car(800);
        Plane plane = new Plane(900);
        Train train = new Train(20);
        System.out.println("Стоимость перевозки автомобилем: " + car.calculatePrice(1200, 700));
        System.out.println("Время перевозки автомобилем: " + car.calculateTime(1200, 700));
        System.out.println("\nСтоимость перевозки самолётом: " + plane.calculatePrice(1200, 700));
        System.out.println("Время перевозки самолётом: " + plane.calculateTime(1200, 700));
        System.out.println("\nСтоимость перевозки поездом: " + train.calculatePrice(1200, 700));
        System.out.println("Время перевозки поездом: " + train.calculateTime(1200, 700));
    }
}
