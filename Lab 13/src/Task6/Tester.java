package Task6;

import java.awt.print.Printable;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class Tester {
    public static void main(String[] args) throws FileNotFoundException {
        String path = args[0];
        Scanner scanner = new Scanner(new FileReader(path));

        ArrayList<String> words = new ArrayList<>();
        while (scanner.hasNext()) {
            words.add(scanner.next());
        }
        words = (ArrayList<String>) words.stream().map(String::toLowerCase).collect(Collectors.toList());
        printArray(words);

/*
        int i = 0;
        while (true) {
            for (int j = i + 1; i < words.size() - 1; ++i) {
                if (words.get(i).charAt(words.get(i).length() - 1)
                        == words.get(j).charAt(0)) {
                    String temp = words.get(j);
                    words.set(j, words.get(i));
                    words.set()

                }
            }
        }*/
    }

    public static void printArray(ArrayList<?> arr) {
        arr.forEach(elem -> {
            System.out.print(elem);
            System.out.print(' ');
        });
        System.out.println();
    }
}
