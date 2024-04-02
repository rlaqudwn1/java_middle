package lang_.wrapper;

public class MyInteger {
    private final int value;

    public MyInteger(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public int getValue() {
        return value;
    }
    public int compareTo(int target) {
        if (value < target) {
            return -1;
        } else if (value > target) {
            return 1;
        } else {
            return 0;

        }
    }
}