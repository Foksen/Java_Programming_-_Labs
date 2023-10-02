package Task5;

public class CommandAppend extends Command {
    public CommandAppend(StringBuilder builder) {
        super(builder);
    }

    @Override
    public boolean execute() {
        backup();
        builder.append(Tester.input);
        return false;
    }
}
