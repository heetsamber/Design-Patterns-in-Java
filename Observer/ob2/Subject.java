package ob2;

// 주체 인터페이스 실제 주체 객체는 이 인터페이스를 상속받음
public interface Subject {
    public void registerObserver(Observer o);
    public void removeObserver(Observer o);
    public void notifyObserver();
}
