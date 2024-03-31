package lang_.immutable.change;


public class ImmuableMyDate {
    private final int year;
    private final int month;
    private final int day;

    @Override
    public String toString() {
        return "MyDate{" +
                "year=" + year +
                ", month=" + month +
                ", day=" + day +
                '}';
    }

    public ImmuableMyDate setYear(int newyear) {
         return new ImmuableMyDate(newyear,month,day);
    }

    public ImmuableMyDate setMonth(int newmonth) {
        return new ImmuableMyDate(year,newmonth,day);
    }

    public ImmuableMyDate setDay(int newday){
        return new ImmuableMyDate(year,month,newday);
    }

    public ImmuableMyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }
}
