package bridge;

// 더 많은 기능을 가진 고급 리모콘
public class AdvancedRemote extends BasicRemote{
    public AdvancedRemote(Device device){
        super.device = device;
    }
    // AdvancedRomote에 추가된 기능
    public void mute(){
        System.out.println("Remote: mute");
        device.setVolume(0);
    }
}
