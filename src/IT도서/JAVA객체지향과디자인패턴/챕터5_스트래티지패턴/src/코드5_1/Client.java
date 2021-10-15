package IT도서.JAVA객체지향과디자인패턴.챕터5_스트래티지패턴.src.코드5_1;
/*
* 전략 패턴 적용 전
* */
abstract class Robot {

    private String name;

    public Robot(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    abstract void attack();

    abstract void move();
}

class TaekwonV extends Robot {

    public TaekwonV(String name){
        super(name);
    }

    public void attack() {
        System.out.println("미사일 공격!!!");
    }

    public void move() {
        System.out.println("걷기!!!");
    }
}

class Atom extends Robot {

    public Atom(String name){
        super(name);
    }

    public void attack() {
        System.out.println("펀치 공격!!!");
    }

    public void move() {
        System.out.println("하늘 날기!!!");
    }
}

public class Client {
    public static void main(String[] args) {
        Robot taekwonV = new TaekwonV("TaekwonV");
        Robot atom = new Atom("Atom");

        System.out.println("내 이름은 " + taekwonV.getName());
        taekwonV.move();
        taekwonV.attack();

        System.out.println();

        System.out.println("내 이름은 " + atom.getName());
        atom.move();
        atom.attack();
    }
}
