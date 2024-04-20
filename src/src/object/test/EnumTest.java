package object.test;

public enum EnumTest {
    GUEST(1, "손님"),
    LOGIN(2, "로그인 회원"),
    ADMIN(3, "관리자");
    private int level;
    String description;

    public int getLevel() {
        return level;
    }

    public String getDescription() {
        return description;
    }

    EnumTest(int level, String description) {
        this.level = level;
        this.description = description;
    }
}
