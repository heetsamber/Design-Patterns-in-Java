package bridge;

// 모든 리모컨에 대한 공통 인터페이스
public interface Remote {
    void power();
    void volumeDown();
    void volumeUp();
    void channelDown();
    void channelUp();
}
