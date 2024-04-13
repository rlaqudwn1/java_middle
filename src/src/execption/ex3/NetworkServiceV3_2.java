package execption.ex3;


import execption.ex3.exception.ConnectExceptionV3;
import execption.ex3.exception.NetworkClientEceptionV3;
import execption.ex3.exception.SendExceptionV3;

public class NetworkServiceV3_2 {

    public void sendMessage(String data) {
        String address = "http://example.com";
        NetworkClientV3 client = new NetworkClientV3(address);
        client.initError(data); //추가

        //하나의 try 안에 정상 흐름을 모두 담는다.
        //그리고 예외 부분은 catch 블럭에서 해결한다.
        //이렇게 하면 정상 흐름은 try 블럭에 들어가고, 예외 흐름은 catch 블럭으로 명확하게 분리가 가능하다.

        try {
            client.connect();
            client.send(data); //throw new RuntimeException("ex");

        } catch (ConnectExceptionV3 e) {
            System.out.println("[연결 오류] 주소: " + e.getAddress() + ",메시지 " + e.getMessage());
        } catch (NetworkClientEceptionV3 e) {
            System.out.println("[네트워크 오류] 메시지" + e.getMessage());
        } catch (Exception e) {
            System.out.println("[알수없는 오류]메시지" + e.getMessage());

        }finally{
            client.disconnect();


        }
        }

    }
