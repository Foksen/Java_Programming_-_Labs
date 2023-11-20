package Task2;

public class Person {
    private String surname;
    private String name;
    private String fathersName;

    public Person(String surname) {
        this.surname = surname;
    }

    public Person(String surname, String name) {
        this.surname = surname;
        this.name = name;
    }

    public Person(String surname, String name, String fathersName) {
        this.surname = surname;
        this.name = name;
        this.fathersName = fathersName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getFathersName() {
        return fathersName;
    }

    public void setFathersName(String fathersName) {
        this.fathersName = fathersName;
    }

    public String getInitials() {
        StringBuilder builder = new StringBuilder().append(surname);
        if (name != null && name.length() > 0) {
            builder.append(' ')
                    .append(name.charAt(0))
                    .append('.');
            if (fathersName != null && fathersName.length() > 0) {
                builder.append(' ')
                        .append(fathersName.charAt(0))
                        .append('.');
            }
        }
        return builder.toString();
    }
}
