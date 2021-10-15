package IT도서.JAVA객체지향과디자인패턴.챕터5_스트래티지패턴.src.코드5_3;

public class Client {
    public static void main(String[] args) {
        Robot taekwon = new Taekwon("Taekwon");
        Robot atom = new Atom("atom");

        taekwon.setMovingStrategy(new WalkingStrategy());
        taekwon.setAttackStrategy(new MissileStrategy());

        atom.setMovingStrategy(new FlyingStrategy());
        atom.setAttackStrategy(new PunchStrategy());

        System.out.println("내 이름은 " + taekwon.getName());
        taekwon.move();
        taekwon.attack();

        System.out.println();

        System.out.println("내 이름은 " + atom.getName());
        atom.move();
        atom.attack();
    }
}
