package IT도서.JAVA객체지향과디자인패턴.챕터5_스트래티지패턴.src.코드5_3;

public class PunchStrategy implements AttackStrategy {

    @Override
    public void attack() {
        System.out.println("펀치 공격!!!");
    }
}
