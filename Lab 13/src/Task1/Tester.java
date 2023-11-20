package Task1;

public class Tester {
    public static void main(String[] args) {
        String myStr = "I like Java!!!";
        printString(myStr);

        System.out.println(myStr.charAt(myStr.length() - 1));

        if (myStr.endsWith("!!!"))
            System.out.println("Ur string ends with !!!");

        if (myStr.startsWith("!!!"))
            System.out.println("Ur string starts with \"I like\"");

        if (myStr.contains("Java")) {
            System.out.println("Ur string contains \"Java\"");
            System.out.println(myStr.indexOf("Java"));
        }

        System.out.println(myStr.replaceAll("a", "o"));

        System.out.println(myStr.toUpperCase());

        System.out.println(myStr.toLowerCase());

        if (myStr.contains("Java")) {
            int l = myStr.indexOf("Java"), r = l + "Java".length();
            System.out.println(myStr.substring(l, r));
        }
    }

    private static void printString(String str) {
        System.out.println(str);
    }
}
