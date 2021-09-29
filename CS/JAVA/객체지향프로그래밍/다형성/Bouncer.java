package JAVA.객체지향프로그래밍.다형성;


// 경비원 클래스: 동물을 짖게 하여 건물을 지킨다.
public class Bouncer {
    public void barkAnimal(Barkable animal){
        /*if(animal instanceof Tiger){      // 다형성을 이용하면 이처럼 복잡한 if-else문을 깔끔히 할 수 있다.
            System.out.println("어흥");
        } else if(animal instanceof Lion){
            System.out.println("으르렁");
        }*/

        animal.bark();
    }
}
