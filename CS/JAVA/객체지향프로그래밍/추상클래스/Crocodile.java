package JAVA.객체지향프로그래밍.추상클래스;

import JAVA.객체지향프로그래밍.다형성.Predator;

public class Crocodile extends Animal implements Predator {
    public String getFood(){
        return "rabbit";
    }
}
