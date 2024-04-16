package execption.ex4;

public class NetworkServiceV5 {

    public void sendMessage(String data) {
        String address = "http://example.com";

        //하나의 try 안에 정상 흐름을 모두 담는다.
        //그리고 예외 부분은 catch 블럭에서 해결한다.
        //이렇게 하면 정상 흐름은 try 블럭에 들어가고, 예외 흐름은 catch 블럭으로 명확하게 분리가 가능하다.

        try (NetworkClientV5 client = new NetworkClientV5(address)) {
            client.initError(data); // 추가
            client.connect();
            client.send(data); //throw new RuntimeException("ex");


        } catch (Exception e) {
            System.out.println("[예외 확인]: " + e.getMessage());
            throw e;
        }
    }
}

