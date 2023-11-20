import java.util.Scanner;

public class ThrowsDemo {
    public void getKey() {
        Scanner scanner = new Scanner(System.in);
        String key = scanner.next();
        printMessage(key);
    }

    public void printMessage(String key) {
        try {
            String message = getMessage(key);
            System.out.println("Message: " + message);
        }
        catch (NullPointerException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    // throws нужен только для общего класса Exception, для конкретных (nullPointerException) - нет
    private String getMessage(String key) throws Exception {
        if (key == null) {
            throw new NullPointerException("Key is null");
        }
        else if (key.isEmpty()) {
            throw new Exception("Key is empty string");
        }
        return key + "12345";
    }
}
