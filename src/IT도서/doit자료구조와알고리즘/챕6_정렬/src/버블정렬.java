package IT도서.doit자료구조와알고리즘.챕6_정렬.src;

import java.util.Scanner;

public class 버블정렬 {

    // a[index1]과 a[index2]의 값을 교환
    public static void swap(int[] a, int index1, int index2){
        int t = a[index1];
        a[index1] = a[index2];
        a[index2] = t;
    }

    // 버블 정렬
    public static void bubbleSort(int[] a, int n){
        for(int i=0; i<n-1; i++){   // 패스 횟수: n-1
            boolean isThereChange = false;
            for(int j = n-1; j>i; j--) // 패스 별 비교 횟수
                if(a[j-1] > a[j]){ // 비교
                    swap(a, j-1, j); // 교환
                    isThereChange = true;
                }
            if(!isThereChange)  // 교환이 없으면 종료합니다.
               break;
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("버블정렬(버전1)");
        System.out.print("요소 갯수: ");
        int numberOfX = in.nextInt();
        int[] x = new int[numberOfX];

        // 데이터 삽입 완료
        for(int i=0; i<numberOfX; i++){
            System.out.print("x[" + i + "]: ");
            x[i] = in.nextInt();
        }

        // 버블 정렬
        bubbleSort(x, numberOfX);

        System.out.println("오름차순으로 정렬했습니다.");
        for(int i=0; i<numberOfX; i++)
            System.out.println("x[" + i + "]= " + x[i]);

    }
}
