package enumeration.test1;

public class EnumMain {
    public static void main(String[] args) {
        Enum[] values = Enum.values();
        for (Enum value : values) {
            System.out.println("grade="+value.name()+", level="+value.getLevel()+", 설명="+value.getDescription());
        }
    }
}
