package Task5;

public abstract class Command {
    public StringBuilder builder;
    private String backup;

    public Command(StringBuilder builder) {
        this.builder = builder;
    }

    public void backup() {
        backup = builder.getString();
    }

    public void undo() {
        builder.setString(backup);
    }

    public abstract boolean execute();
}
