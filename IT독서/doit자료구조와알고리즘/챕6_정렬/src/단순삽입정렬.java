package IT독서.doit자료구조와알고리즘.챕6_정렬.src;

import java.util.Scanner;

public class 단순삽입정렬 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("요솟수: ");

        int N = in.nextInt();
        int[] arr = new int[N];

        for(int i=0; i<N; i++){
            System.out.print("x[" + i + "]: ");
            arr[i] = in.nextInt();
        }

        insertionSort(arr,N);

        System.out.println("오름차순으로 정렬했습니다.");
        for(int i=0; i<N; i++)
            System.out.println("x[" + i + "]: " + arr[i]);

    }

    public static void insertionSort(int[] a, int n){
        for(int i=1; i<n; i++){
            int j;
            int tmp = a[i];
            for(j = i; 0<j && tmp<a[j-1]; j--)
                a[j] = a[j-1];
            a[j] = tmp;
        }
    }
}
