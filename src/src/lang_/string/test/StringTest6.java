package lang_.string.test;
// str에서 key로 주어지는 문자를 찾고, 찾은 문자의 수를 출력해라
// indexOf() 를 반복문과 함께 풀면 된다.
public class StringTest6 {
    public static void main(String[] args) {
        String str = "start hello java, hello spring, hello jpa";
        String key = "hello";
        int index =str.indexOf(key);                //처음 hello를 찾은 배열의 위치를 index에 저장
        int count=0;
        while(index>=0){
            index=str.indexOf(key,index+1);// index+1= 처음hello 다음의 hello를 찾는 경우
            count++;                                // count에 1추가
        }
        System.out.println("count = " + count);


    }

}
