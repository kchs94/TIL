package IT도서.열혈자바프로그래밍.챕20_기본클래스.Arrays클래스;

import java.util.Arrays;

class INum2{
    private int num;
    public INum2(int num) {  // 생성자
        this.num = num;
    }

    @Override
    public boolean equals(Object obj){
        if(this.num == ((INum2)obj).num) // 두 인스턴스 내용 비교
            return true;
        else
            return false;
    }
}

public class ArrayObjEquals2 {
    public static void main(String[] args) {
        INum2[] ar1 = new INum2[3];
        INum2[] ar2 = new INum2[3];

        ar1[0] = new INum2(1); ar2[0] = new INum2(1);
        ar1[1] = new INum2(2); ar2[1] = new INum2(2);
        ar1[2] = new INum2(3); ar2[2] = new INum2(3);
        System.out.println(Arrays.equals(ar1, ar2));
    }
}
