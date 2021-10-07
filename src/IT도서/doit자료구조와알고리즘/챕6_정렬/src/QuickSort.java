package IT도서.doit자료구조와알고리즘.챕6_정렬.src;
import java.util.Scanner;

public class QuickSort {
    // 배열 요소 a[idx1]과 a[idx2]의 값을 바꿉니다.
    static void swap(int[] a, int idx1, int idx2){
        int t = a[idx1];
        a[idx1] = a[idx2];
        a[idx2] = t;
    }

    // 배열을 나눕니다.
    static void partition(int[] a, int n){
        int pl = 0; // 왼쪽 커서
        int pr = n-1;   // 오른쪽 커서
        int x = a[n/2]; //피벗 (가운데 위치의 값)

        do{ // 배열 a를 피벗 x를 기준으로 나눈다.
            while(a[pl] < x) pl++;
            while(a[pr] > x) pr--;
            if(pl <=pr)
                swap(a, pl++, pr--);
        } while(pl <=pr);

        System.out.println("피벗의 값은 " + x + "입니다.");

        System.out.println("피벗 이하의 그룹");
        for(int i=0; i<=pl-1 ; i++){
            System.out.print(a[i] + " ");
            System.out.println();
        }


    }
}
