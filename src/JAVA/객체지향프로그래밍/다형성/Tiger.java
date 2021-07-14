package JAVA.객체지향프로그래밍.다형성;

public class Tiger extends Animal implements Predator, Barkable {
    public String getFood(){
        return "apple";
    }

    public void bark(){
        System.out.println("어흥");
    }
}
