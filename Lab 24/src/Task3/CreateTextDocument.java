package Task3;

public class CreateTextDocument implements ICreateDocument {
    @Override
    public TextDocument createNew() {
        return new TextDocument();
    }

    @Override
    public TextDocument createOpen(String fileName) {
        return new TextDocument(fileName);
    }
}
