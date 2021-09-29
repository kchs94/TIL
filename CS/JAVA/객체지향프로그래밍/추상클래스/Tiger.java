package JAVA.객체지향프로그래밍.추상클래스;


public class Tiger extends Predator implements Barkable {
    public String getFood(){
        return "apple";
    }

    public void bark(){
        System.out.println("어흥");
    }
}
