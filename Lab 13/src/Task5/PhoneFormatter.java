package Task5;

public class PhoneFormatter {
    public static String transformPhone(String phone) {
        String code, p1, p2, p3;

        int r = phone.length();
        int l = r - 4;
        p3 = phone.substring(l, r);

        r = l;
        l = r - 3;
        p2 = phone.substring(l, r);

        r = l;
        l = r - 3;
        p1 = phone.substring(l, r);

        r = l;
        l = 0;
        code = phone.substring(l, r);
        return String.format("%s%s-%s-%s", code, p1, p2, p3);
    }
}
