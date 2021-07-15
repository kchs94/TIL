package JAVA.객체지향프로그래밍.추상클래스;

public abstract class Predator extends Animal { // 추상클래스
    public abstract String getFood();

    public boolean isPredator(){    // 추상클래스에서 실제 메소드도 추가할 수 있습니다.
        return true;
    }
}
