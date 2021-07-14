package JAVA.객체지향프로그래밍.다형성;

public class ZooKeeper {
    // 인터페이스 적용 전
//    public void feed(Tiger tiger){
//        System.out.println("feed apple");
//    }
//
//    public void feed(Lion lion){    // 메소드 오버로딩
//        System.out.println("feed banana");
//    }

    // 인터페이스 적용 후
    public void feed(Predator predator){ // feed 메소드의 입력으로 Predator라는 인터페이스로 대체되었다.
        System.out.println("feed " + predator.getFood());   // 문제점: 하지만 사자가 오면 바나나를 줘야 하는데?!
    }
}
