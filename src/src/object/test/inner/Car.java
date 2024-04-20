package object.test.inner;

public class Car {
    private String model;
    private int chargeLevel;
    private Engine engine;
    public Car(String model, int chargeLevel) {
        this.model = model;
        this.chargeLevel = chargeLevel;
        this.engine = new Engine();
    }

    /**
     * 중첩 클래스는 특정 클래스가 다른 하나의 클래스 안에서만 사용되거나, 둘이 아주 긴밀하게 연결되어 있는 특별
     * 한 경우에만 사용해야 한다. 외부 여러곳에서 특정 클래스를 사용한다면 중첩 클래스로 사용하면 안된다
     */

    private class Engine {
        public void start() {
            System.out.println("충전 레벨 확인"+chargeLevel);
            System.out.println(model+"의 엔진을 구동합니다");
        }
    }

    public String getModel() {
        return model;
    }

    public int getChargeLevel() {
        return chargeLevel;
    }
    public void start() {
        System.out.println(model+ "시작 완료");
    }
}
