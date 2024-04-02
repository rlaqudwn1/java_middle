package lang_.string.builder;

public class StringBuilderMain_2 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder(); //가변 스트링 스트링 빌더 sb인스턴스 생성
        String string = sb.append("A").append("B").append("C").append("D")
                .insert(4, "JAva").delete(4,8)
                .reverse().toString();
        //메서드 체이닝으로 코드를 간결하게 바꿀 수 있다.
        // 자바의 라이브러리 오픈 소스들은 메서드 체이닝을 자주쓴다.
        System.out.println("string = " + string);

    }
}
