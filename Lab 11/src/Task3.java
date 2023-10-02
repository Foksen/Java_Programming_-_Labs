import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Task3 {
    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("d.M.y");

    public static void main(String[] args) throws ParseException {
        Student student1 = new Student("Igor", "07.02.2004");
        Student student2 = new Student("Anton", "16.12.2003");
        Student student3 = new Student("Pavel", "19.05.2007");

        System.out.println(student1);
        System.out.println(student2);
        System.out.println(student3);
    }

    static class Student {
        String name;
        Calendar birth;

        Student(String name, String birthString) throws ParseException {
            this.name = name;
            this.birth = Calendar.getInstance();
            birth.setTime(dateFormat.parse(birthString));
        }

        @Override
        public String toString() {
            return name + " (" + birth.get(Calendar.DAY_OF_MONTH)
                    + "." + (birth.get(Calendar.MONTH) + 1)
                    + "." + birth.get(Calendar.YEAR) + ")";
        }
    }
}
