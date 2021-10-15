package IT도서.JAVA객체지향과디자인패턴.챕터5_스트래티지패턴.src.코드5_3;

public class WalkingStrategy implements MovingStrategy {

    @Override
    public void move() {
        System.out.println("걷기!!!");
    }
}
