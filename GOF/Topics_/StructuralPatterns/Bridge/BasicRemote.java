package bridge;

public class BasicRemote implements Remote{
    // 디바이스 최상위 클래스
    protected Device device;
    // 생성자
    public BasicRemote() { }

    public BasicRemote(Device device){
        this.device = device;
    }

    @Override
    public void power() {
        System.out.println("Remote: power toggle");
        if (device.isEnabled()){
            device.disable();
        }else{
            device.enable();
        }
    }

    @Override
    public void volumeDown() {
        System.out.println("Remote: volume down");
        // 현재 실제로 가지고 있는 디바이스의 볼륨을 줄임
        device.setVolume(device.getVolume() - 10);
    }

    @Override
    public void volumeUp(){
        System.out.println("Remote: volume up");
        // 현재 실제로 가지고 있는 디바이스의 볼륨을 올림
        device.setVolume(device.getVolume() + 10);
    }

    @Override
    public void channelDown() {
        System.out.println("Remote: channel down");
        device.setChannel(device.getChannel() - 1);
    }

    @Override
    public void channelUp() {
        System.out.println("Remote: channel up");
        device.setChannel(device.getChannel() + 1);
    }
}
