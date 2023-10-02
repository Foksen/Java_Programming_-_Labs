import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) throws ParseException {
        Scanner scanner = new Scanner(System.in);

        SimpleDateFormat dateFormat = new SimpleDateFormat("d.M.y");

        Calendar todayCalendar = Calendar.getInstance();
        todayCalendar.setTime(dateFormat.parse(
                Integer.toString(todayCalendar.get(Calendar.DAY_OF_MONTH)) +
                    "." + Integer.toString(todayCalendar.get(Calendar.MONTH) + 1) +
                    "." + Integer.toString(todayCalendar.get(Calendar.YEAR))));
        Calendar testCalendar = Calendar.getInstance();

        while (true) {
            try {
                System.out.print("Введите дату в формате \"ДД.ММ.ГГГГ\" : ");
                String dateString = scanner.nextLine();
                testCalendar.setTime(dateFormat.parse(dateString));
            } catch (Exception e) {
                System.out.println("Неправильно введённая дата!");
                continue;
            }
            break;
        }

        if (testCalendar.after(todayCalendar)) {
            System.out.println("Этот день ещё не наступил");
        }
        else if (testCalendar.before(todayCalendar)) {
            System.out.println("Этот день уже прошёл");
        }
        else {
            System.out.println("Этот день сегодня");
        }
    }
}
