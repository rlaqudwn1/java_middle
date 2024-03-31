package lang_.immutable.change;

public class ImmuableMyDateMain {
    public static void main(String[] args) {
        ImmuableMyDate date = new ImmuableMyDate(2024, 1, 1);
        ImmuableMyDate date2 = date;
        System.out.println("date = " + date);
        System.out.println("date2 = " + date2);
        date2=date.setYear(2025);
        System.out.println("2025-> date2");
        System.out.println("date = " + date);
        System.out.println("date2 = " + date2);
    }
}
