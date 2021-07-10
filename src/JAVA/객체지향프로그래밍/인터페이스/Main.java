package JAVA.객체지향프로그래밍.인터페이스;

// 문제점: 사자와 호랑이만 있으면 메소드 오버로딩을 이용해서 feed 메소드를 만들면 되지만 계속해서 악어, 하마, 기린 등등
// 동물이 많아지면 매번 같은 feed 메소드를 오버로딩 해야하는 비효율이 발생한다. 이 문제를 인터페이스가 해결해준다.
// 인터페이스를 만든 후 메소드 오버로딩이되는 메소드의 입력에 인터페이스를 넣어준다.
// 인터페이스의 핵심: ZooKeeper 클래스가 동물의 종류에 의존적인 클래스에서 동물의 종류에 독립적인 클래스가 되었다는 점.
// tiger - Tiger 클래스의 객체이자 Predator 인터페이스의 객체입니다.
// lion - Lion 클래스의 객체이자 Predator 인터페이스의 객체입니다.
// 이와같이 객체가 한 개 이상의 자료형 타입을 갖게되는 특성을 다형성(Polymorphism)이라고 합니다.

public class Main {
    public static void main(String[] args) {
        ZooKeeper zooKeeper = new ZooKeeper();
        Tiger tiger = new Tiger();
        Lion lion = new Lion();

        zooKeeper.feed(tiger);
        zooKeeper.feed(lion);
    }
}
