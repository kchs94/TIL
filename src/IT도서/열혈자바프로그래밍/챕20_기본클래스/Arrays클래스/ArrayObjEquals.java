package IT도서.열혈자바프로그래밍.챕20_기본클래스.Arrays클래스;

import java.util.Arrays;

class INum{
    private int num;
    public INum(int num){
        this.num = num;
    }
}

public class ArrayObjEquals {
    public static void main(String[] args) {
        INum[] ar1 = new INum[3];
        INum[] ar2 = new INum[3];

        ar1[0] = new INum(1); ar2[0] = new INum(1);
        ar1[1] = new INum(2); ar2[0] = new INum(2);
        ar1[2] = new INum(3); ar2[0] = new INum(3);

        System.out.println(Arrays.equals(ar1, ar2));
    }
}
