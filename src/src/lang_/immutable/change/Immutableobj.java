package lang_.immutable.change;

public class Immutableobj {
    private final int value;

    public int getValue() {
        return value;
    }
    public Immutableobj add(int addValue){
        return new Immutableobj(value+addValue);
    }
    public Immutableobj(int value) {
        this.value = value;
    }
}
