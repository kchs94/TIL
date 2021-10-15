package IT도서.JAVA객체지향과디자인패턴.챕터5_스트래티지패턴.src.코드5_3;
/*
* 전략 패턴 적용 후 구체적인 전략들을 캡슐화 한다.
* */
public class Robot {

    private String name;
    private MovingStrategy movingStrategy;
    private AttackStrategy attackStrategy;

    public Robot(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void move() {
        movingStrategy.move();
    }
    public void attack() {
        attackStrategy.attack();
    }

    public void setMovingStrategy(MovingStrategy movingStrategy) {
        this.movingStrategy = movingStrategy;
    }

    public void setAttackStrategy(AttackStrategy attackStrategy) {
        this.attackStrategy = attackStrategy;
    }
}
