package IT독서.열혈자바프로그래밍.챕21_제네릭1.이_제네릭기본문법;

class DBox<L, R>{   // 다중 매개변수를 지닌 제네릭 클래스
    private L left; // 왼쪽 수납 공간
    private R right;    // 오른쪽 수납 공간

    public void set(L o, R r){
        left = o;
        right = r;
    }

    @Override
    public String toString(){
        return left + " & " + right;
    }
}

public class MultiTypeRaram {
    public static void main(String[] args) {
        DBox<String, Integer> box = new DBox<String, Integer>();
        box.set("Apple", 25);
        System.out.println(box);
    }
}
