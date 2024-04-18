package enumeration.test1;

public enum Enum {
    GUSET(1,"손님"),
    LOGIN(2,"로그인 회원"),
    ADMIN(3,"관리자"),;
    int level;
    String description;
    Enum(int level, String description) {
        this.level=level;
        this.description=description;
    }

    public int getLevel() {
        return level;
    }

    public String getDescription() {
        return description;
    }

}
