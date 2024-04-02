package lang_.string.builder;

public class StringBuilderMain_1 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder(); //가변 스트링 스트링 빌더 sb인스턴스 생성
        sb.append("A");                         //sb에 ABCDE를 추가한다
        sb.append("B");
        sb.append("C");
        sb.append("D");
        sb.append("E");
        System.out.println("sb = " + sb);       //추가된 sb를 출력
        sb.insert(4, "Java");        //정해진 자리에 값을 추가할 수 있고
        System.out.println("sb = " + sb);
        sb.delete(4,8);                         //구역을 정해 값을 지울 수 있다
        System.out.println("sb = " + sb);
        sb.reverse();                           //문자열 뒤집기
        System.out.println("sb = " + sb);
        String string = sb.toString();          //StringBuilder-> String
        
    }
}
