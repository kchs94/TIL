package IT독서.열혈자바프로그래밍.챕21_제네릭1.이_제네릭기본문법.문제1;

public class DDBox<U, D>{
    private U u;
    private D d;
    public void set(U u, D d){
        this.u = u;
        this.d = d;
    }

    @Override
    public String toString(){
        return u + "\n" + d;
    }
    
}
