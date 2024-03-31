package lang_.immutable.address;

public class ImmutableAddress {
    private final String value;

    @Override
    public String toString() {
        return "Address{" +
                "value='" + value + '\'' +
                '}';
    }

    public String getValue() {
        return value;
    }


    public ImmutableAddress(String value) {
        this.value = value;
    }
}
