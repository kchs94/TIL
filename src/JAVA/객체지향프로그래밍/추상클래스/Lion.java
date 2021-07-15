package JAVA.객체지향프로그래밍.추상클래스;

public class Lion extends Predator implements BarkablePredator {
    public String getFood(){
        return "banana";
    }

    public void bark(){
        System.out.println("으르렁");
    }
}
