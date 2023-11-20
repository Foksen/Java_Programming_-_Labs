import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Double[] arr = new Double[] {1., 2., 3.};
        ArrayList<Double> arrList = arrayToArrayList(arr);
        for (Double d : arrList) {
            System.out.print(d + " ");
        }
        System.out.println();

        MyContainer<Integer> container = new MyContainer<>(new Integer[] {1, 2, 3});
        container.getContainer()[1] = 51;
        for (Integer i : container.getContainer()) {
            System.out.print(i + " ");
        }
        System.out.println();

        System.out.println(getFromArray(arr, 2));

        ArrayList<String> catalog = readCatalog("C:\\Users\\Igor\\University\\S3\\Java programming\\Projects\\Lab 21\\src");
        catalog.forEach(System.out::println);
    }

    public static <T> ArrayList<T> arrayToArrayList(T[] array) {
        return new ArrayList<>(Arrays.asList(array));
    }

    public static <T> T getFromArray(T[] array, int index) {
        return array[index];
    }

    public static ArrayList<String> readCatalog(String path) {
        ArrayList<String> result = new ArrayList<>();
        try (Stream<Path> paths = Files.walk(Paths.get(path))) {
            paths.filter(Files::isRegularFile).forEach(e -> {
                result.add(e.toString());
            });
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return result;
    }
}