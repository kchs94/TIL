package IT도서.열혈자바프로그래밍.챕터28_메소드참조와Optional.src.NoObjectMethodRef;

import java.util.function.ToIntBiFunction;

class IBox{
    private int num;
    public IBox(int num){
        this.num = num;
    }
    public int larger(IBox box){
        if(box.num < num)
            return num;
        else
            return box.num;
    }
}

public class NoObjectMethodRef {
    public static void main(String[] args) {
        IBox iBox1 = new IBox(5);
        IBox iBox2 = new IBox(7);

        // 두 상자에 저장된 값 비교해서 더 큰 값 반환
        ToIntBiFunction<IBox, IBox> biFunction = (box1, box2) -> box1.larger(box2);
        int bigNum = biFunction.applyAsInt(iBox1, iBox2);

        System.out.println(bigNum);
    }
}
