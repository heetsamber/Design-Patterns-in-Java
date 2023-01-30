package bridge;

public class Main {
    public static void main(String[] args) {
        // 익명객체 생성
        testDevice(new Tv());
        testDevice(new Radio());
    }

    public static void testDevice(Device device){
        System.out.println("기본 리모컨 테스트");
        BasicRemote basicRemote = new BasicRemote(device);
        basicRemote.power();
        device.printStatus();

        System.out.println("고급 리모컨 테스트");
        AdvancedRemote advancedRemote = new AdvancedRemote(device);
        advancedRemote.power();
        advancedRemote.mute();
        device.printStatus();
    }
}