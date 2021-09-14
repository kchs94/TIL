package IT독서.열혈자바프로그래밍.챕21_제네릭1.이_제네릭기본문법.문제1;

public class DBox<L, R> {   // 제네릭 클래스
    private L left;
    private R right;
    public void set(L o, R r){
        left = o;
        right = r;
    }

    @Override
    public String toString(){
        return left + " & " + right;
    }
}
