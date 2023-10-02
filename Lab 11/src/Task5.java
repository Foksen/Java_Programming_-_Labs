import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;

public class Task5 {
    private final static int TESTS_COUNT = 10000;

    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();

        int testTime = 0;
        for (int i = 0; i < TESTS_COUNT; ++i) {
            Date start = new Date();
            arrayList.add(arrayList.size() / 2, i + 1);
            Date end = new Date();
            testTime += end.getTime() - start.getTime();
        }
        System.out.println("Среднее время добавления в ArrayList: " + (double) testTime / TESTS_COUNT);

        testTime = 0;
        for (int i = 0; i < TESTS_COUNT; ++i) {
            Date start = new Date();
            linkedList.add(linkedList.size() / 2, i + 1);
            Date end = new Date();
            testTime += end.getTime() - start.getTime();
        }
        System.out.println("Среднее время добавления в LinkedList: " + (double) testTime / TESTS_COUNT);

        testTime = 0;
        for (int i = 0; i < TESTS_COUNT; ++i) {
            Date start = new Date();
            arrayList.remove(arrayList.size() / 2);
            Date end = new Date();
            testTime += end.getTime() - start.getTime();
        }
        System.out.println("Среднее время удаления из ArrayList: " + (double) testTime / TESTS_COUNT);

        testTime = 0;
        for (int i = 0; i < TESTS_COUNT; ++i) {
            Date start = new Date();
            linkedList.remove(linkedList.size() / 2);
            Date end = new Date();
            testTime += end.getTime() - start.getTime();
        }
        System.out.println("Среднее время удаления из LinkedList: " + (double) testTime / TESTS_COUNT);

        testTime = 0;
        for (int i = 0; i < TESTS_COUNT; ++i) {
            arrayList.add(i + 1);
            linkedList.add(i + 1);
        }

        testTime = 0;
        for (int i = 0; i < TESTS_COUNT; ++i) {
            Date start = new Date();
            arrayList.contains(i + 1);
            Date end = new Date();
            testTime += end.getTime() - start.getTime();
        }
        System.out.println("Среднее время поиска в ArrayList: " + (double) testTime / TESTS_COUNT);

        testTime = 0;
        for (int i = 0; i < TESTS_COUNT; ++i) {
            Date start = new Date();
            linkedList.contains(linkedList.size() / 2);
            Date end = new Date();
            testTime += end.getTime() - start.getTime();
        }
        System.out.println("Среднее время поиска в LinkedList: " + (double) testTime / TESTS_COUNT);
    }
}
