package nested.nested.inner.ex2;


public class Car {
    private String model;
    private int chargeLevel;
    private Engine engine;

    public Car(String model, int chargeLevel) {
        this.model = model;
        this.chargeLevel = chargeLevel;
        this.engine=new Engine();

    }
    public void start() {
        engine.start();
        System.out.println(model + "시작 완료");
    }
    private class Engine {
        public void start() {
            System.out.println("충전 레벨 확인:"+ chargeLevel);   //내부 클래스는 외부 인스턴스변수에 직접 접근할 수  있다.
            System.out.println(model + "의 엔진을 구동합니다");
        }
    }
    //중첩 클래스는 언제 사용해야 하나
    // 중첩 클래스는 특정 클래스가 다른 하나의 클래스 안에서만 사용되거나, 둘이 아주 긴밀하게
    // 연결되어 있는 특별한 경우에만 사용해야 한다. 외부 여러곳에서 특정 클래스를 사용한다면 중첩 클래스를 사용하면 안된다.

    //논리적 그룹화: 특정 클래스가 다른 하나의 클래스 안에서만 사용되는 경우 해당 클래스 안에
    // 포함하는 것이 논리적으로 더 그룹화가 된다.
    // 캡슐화: 중첩 클래스는 바깥 클래스의 private에 접근할 수 있다

}
