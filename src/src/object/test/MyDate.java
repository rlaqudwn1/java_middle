package object.test;

public class MyDate {
    private final int year;
    private final int month;
    private final int day;
    public MyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    @Override
    public String toString() {
        return year + "-" + month + "-" + day;
    }

//    public MyDate withYear(int year) {
//    }
}


