package IT독서.열혈자바프로그래밍.챕20_기본클래스.Arrays클래스;

import java.util.Arrays;

public class ArrayEquals {
    public static void main(String[] args) {
        int[] ar1 = {1,2,3,4,5};
        int[] ar2 = Arrays.copyOf(ar1, ar1.length); // 배열 복사하기

        System.out.println(Arrays.equals(ar1, ar2));    // 배열 비교하기
    }
}
