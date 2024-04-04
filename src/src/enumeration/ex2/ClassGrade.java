package enumeration.ex2;

//타입 안전 열거형 패턴 enum을 사용하면 나열한 항목만 사용할 수 있게 제한을 걸 수있다
public class ClassGrade {
    public static final ClassGrade BASIC = new ClassGrade();
    public static final ClassGrade GOLD = new ClassGrade();
    public static final ClassGrade DIAMOND = new ClassGrade();

    //private 생성자 추가
    private ClassGrade() {
    }
}
