package Task5;

public class StringBuilder {
    private String string;

    public StringBuilder() {
        string = "";
    }

    public StringBuilder(String string) {
        this.string = string;
    }

    public void append(String string) {
        this.string = this.string + string;
    }

    public void setString(String string) {
        this.string = string;
    }

    public String getString() {
        return string;
    }
}
