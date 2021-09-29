package JAVA.객체지향프로그래밍.다형성;

public class Lion extends Animal implements BarkablePredator {
    public String getFood(){
        return "banana";
    }

    public void bark(){
        System.out.println("으르렁");
    }
}
