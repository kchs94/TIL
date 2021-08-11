package IT독서.열혈자바프로그래밍.챕25_열거형가변인자어노테이션.src;

interface Viewable{ // 인터페이스
    public void showIt(String str); // 추상메소드
}

class Viewer implements Viewable{   // 구현클래스
    @Override   // 1. 상위 클래스의 메소드 오버라이딩 2. 인터페이스에 선언된 추상 메소드의 구현
    public void showIt(String str){
        System.out.println(str);
    }
}

public class AtOverride {
    public static void main(String[] args) {
        Viewable view = new Viewer();
        view.showIt("Hello Annotations");
    }
}
