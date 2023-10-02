package Task3;

public class ProcessString implements Processable {
    @Override
    public int countLength(String str) {
        return str.length();
    }

    @Override
    public String getOdds(String str) {
        StringBuilder builder = new StringBuilder();
        for (int i = 1; i < str.length(); i += 2) {
            builder.append(str.charAt(i));
        }
        return builder.toString();
    }

    @Override
    public String invert(String str) {
        StringBuilder builder = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; --i) {
            builder.append(str.charAt(i));
        }
        return builder.toString();
    }
}
