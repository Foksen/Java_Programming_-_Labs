import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SimpleDateFormat dateFormat = new SimpleDateFormat("d.M.y H:m");

        Calendar calendar = Calendar.getInstance();
        Date date;

        while (true) {
            try {
                System.out.print("Введите дату в формате: \"ДД.ММ.ГГГГ ЧЧ:ММ\" : ");
                String stringDate = scanner.nextLine();
                calendar.setTime(dateFormat.parse(stringDate));
                date = dateFormat.parse(stringDate);
            } catch (Exception e) {
                System.out.println("Вы неправильно ввели дату!");
                continue;
            }
            break;
        }

        SimpleDateFormat fmt1 = new SimpleDateFormat("EEEE, MMMM, d, yyyy H:m");
        System.out.println("Calendar: " + fmt1.format(calendar.getTime()));

        SimpleDateFormat fmt2 = new SimpleDateFormat("d MM y H:m");
        System.out.println("Date: " + fmt2.format(date));
    }
}
