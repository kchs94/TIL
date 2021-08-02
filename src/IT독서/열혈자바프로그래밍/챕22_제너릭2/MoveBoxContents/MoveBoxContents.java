package IT독서.열혈자바프로그래밍.챕22_제너릭2.MoveBoxContents;

class Box<T> {  // 상자 제네릭 클래스
    private T ob;
    public void set(T o){   // 무슨 전용 상자인지 정하기
        ob = o;
    }
    public T get(){ // 무슨 전용인지 알려주기
        return ob;
    }
}

class Toy { // 장난감 클래스
    @Override
    public String toString(){
        return "장난감 입니다.";
    }
}

class BoxContentsMover {
    // from에 저장된 내용물을 to로 이동
    public static void moveBox(Box<? super Toy> to, Box<? extends Toy> from){   // 와일드 카드 제한하기
        to.set(from.get());
    }
}

public class MoveBoxContents {
    public static void main(String[] args) {
        Box<Toy> box1 = new Box<>();    // 장난감 전용 박스 box1 만들기
        box1. set(new Toy());           // box1 박스에 장난감 넣기

        Box<Toy> box2 = new Box<>();    // 장난감 전용 박스 box2 만들기

        // box1에 저장된 내용물 box2로 이동시키기
        BoxContentsMover.moveBox(box2, box1);
        System.out.println(box2.get());
    }
}
