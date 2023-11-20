package Task3;

import java.util.StringTokenizer;

public class Adress {
    private String country;
    private String region;
    private String city;
    private String street;
    private String house;
    private String corpus;
    private String flat;
    private final char defaultDel = ',';

    public Adress() {}

    public void readFromString(String addressString, char del) {
        StringTokenizer st = new StringTokenizer(addressString, Character.toString(del));
        country = st.nextToken();
        region = st.nextToken();
        city = st.nextToken();
        street = st.nextToken();
        house = st.nextToken();
        corpus = st.nextToken();
        flat = st.nextToken();
    }

    public void readFromString(String addressString) {
        String[] fields = addressString.split(Character.toString(defaultDel) + " ");
        country = fields[0];
        region = fields[1];
        city = fields[2];
        street = fields[3];
        house = fields[4];
        corpus = fields[5];
        flat = fields[0];
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder()
                .append(country).append(' ')
                .append(region).append(' ')
                .append(city).append(' ')
                .append(street).append(' ')
                .append(house).append(' ')
                .append(corpus).append(' ')
                .append(flat);
        return builder.toString();
    }
}
